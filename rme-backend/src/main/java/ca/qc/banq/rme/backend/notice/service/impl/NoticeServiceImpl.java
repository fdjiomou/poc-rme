/**
 * 
 */
package ca.qc.banq.rme.backend.notice.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.marc4j.marc.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ca.qc.banq.rme.backend.constants.DefaultValues;
import ca.qc.banq.rme.backend.notice.datamodel.Notice;
import ca.qc.banq.rme.backend.notice.datamodel.NoticeDisplayConfig;
import ca.qc.banq.rme.backend.notice.repository.INoticeDisplayConfigRepository;
import ca.qc.banq.rme.backend.notice.repository.INoticeRepository;
import ca.qc.banq.rme.backend.notice.service.INoticeService;
import ca.qc.banq.rme.backend.notice.valueobject.NoticeDisplayPayload;
import ca.qc.banq.rme.backend.notice.valueobject.NoticePayload;
import ca.qc.banq.rme.shared.marcfactory.data.MarcRecordStringData;
import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.helpers.MarcServiceHelper;
import ca.qc.banq.rme.shared.marcfactory.helpers.MarcServiceHelper.marc_string_representation_format;
import ca.qc.banq.rme.shared.repository.ITagFieldTypeData;
import ca.qc.banq.rme.shared.service.ResourceManagementService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

/**
 * Services business de gestion  des notices
 */
@Slf4j
@Service
public class NoticeServiceImpl implements INoticeService {

	@Autowired
	INoticeRepository noticeRepo;
	
	@Autowired
	INoticeDisplayConfigRepository ndcRepo;
	
	@Autowired
	ResourceManagementService translator;
	
	@Autowired
	ITagFieldTypeData fieldRepo;
	
	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#enregistrer(ca.qc.banq.rme.shared.marcrecord.payload.MarcRecordPayload)
	 */
	@Override
	public void enregistrer(NoticePayload request) {
		Notice n = noticeRepo.findById(request.getId()).orElse(null);
		if(n == null) n = new Notice();
		n.updateFromPayload(request);
		noticeRepo.save(n);
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#supprimer(java.lang.Long)
	 */
	@Override
	public void supprimer(Long idNotice) {
		noticeRepo.deleteById(idNotice);
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#editer(java.lang.Long)
	 */
	@Override
	public NoticePayload editer(Long idNotice) {
		Notice n = noticeRepo.findById(idNotice).orElse(null);
		return n != null ? n.toDTO(translator) : null;
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#lister()
	 */
	@Override
	public List<NoticeDisplayPayload> lister() {
		List<NoticeDisplayConfig> cfg = ndcRepo.findAll();
		return noticeRepo.findAll().stream().map(r -> r.toLibelle(cfg) ).filter(Objects::nonNull).toList();
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#importer(org.springframework.web.multipart.MultipartFile[])
	 */
	@Override
	public void importer( MultipartFile[] files) {
		List<MarcRecordStringData> data = new ArrayList<MarcRecordStringData>();
		for(MultipartFile file: files) {
			try {
				data.addAll( MarcServiceHelper.getMarcRecordsFromFile(file.getInputStream(), DefaultValues.STRING_MARC_CONTENT_FORMAT) );
			} catch(Exception ex) {
				log.error("Erreur lors de l'importation du fichier {}. il ne s'agit pas d'un fichier Marc", file.getOriginalFilename());
				log.error("_", ex);
			}
		}
		if(!data.isEmpty()) noticeRepo.saveAll( data.stream().map(d -> new Notice(d)).toList() );
		
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#getMarc(java.lang.Long)
	 */
	@Override
	public Record getMarc(Long idNotice) {
		Notice n = noticeRepo.findById(idNotice).orElse(null);
		return n != null ? n.toMarc() : null;
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#getLibelle(java.lang.Long)
	 */
	@Override
	public NoticeDisplayPayload getLibelle(Long idNotice) {
		Notice n = noticeRepo.findById(idNotice).orElse(null);
		return n != null ? n.toLibelle(ndcRepo.findAll()) : null;
	}

	@Override
	public void initNoticeDisplayConfig() {
		if(ndcRepo.count() == 0) ndcRepo.saveAll(DefaultValues.DEFAULT_NOTICE_DISPLAY_CONFIG);
	}
	
	@PostConstruct
	public void init() {
		rafraichirCustomEtiquettes();
	}
	
	private void rafraichirCustomEtiquettes() {
		List<TagFieldTypeData> customs = fieldRepo.findAll();
		Map<String, List<TagFieldTypeData>> tmp = customs.stream().collect(Collectors.toMap(TagFieldTypeData::getField, c -> new ArrayList<TagFieldTypeData>() ));
		customs.forEach(c -> tmp.get(c.getField()).add(c) );
		DataFieldType.customEtiquettes = tmp;
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#exporter(java.lang.Long)
	 */
	@Override
	public String exporter(Long idNotice) {
		Record rec = getMarc(idNotice);
		return rec != null ? MarcServiceHelper.getRecordAsString(rec, marc_string_representation_format.marc) : null;
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#saveCustomEtiquettes(java.util.List)
	 */
	@Override
	public void saveCustomEtiquettes(List<TagFieldTypeData> payload) throws Exception {
		for(TagFieldTypeData e: payload) {
			if(DataFieldType.getOf(e.getField()) != null) throw new Exception("L'etiquette $"+e.getField()+" existe deja");
		}
		List<TagFieldTypeData> toSave = new ArrayList<TagFieldTypeData>();
		payload.forEach(e -> {
			TagFieldTypeData n = fieldRepo.findById(e.getId()).orElse(null);
			if(n == null) n = new TagFieldTypeData(); else n.update(e);
			toSave.add(n);
		});
		fieldRepo.saveAll(toSave);
		rafraichirCustomEtiquettes();
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#getCustomEtiquettes()
	 */
	@Override
	public List<TagFieldTypeData> getCustomEtiquettes() {
		return fieldRepo.findAll();
	}

	/*
	 * @see ca.qc.banq.rme.backend.notice.service.INoticeService#deleteCustomEtiquette(java.lang.String)
	 */
	@Override
	public void deleteCustomEtiquette(String id) {
		fieldRepo.deleteById(id);
		rafraichirCustomEtiquettes();
	}
	
	
	
}
