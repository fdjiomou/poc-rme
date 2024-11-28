/**
 * 
 */
package ca.qc.banq.rme.backend.notice.service;

import java.util.List;

import org.marc4j.marc.Record;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ca.qc.banq.rme.backend.notice.valueobject.NoticeDisplayPayload;
import ca.qc.banq.rme.backend.notice.valueobject.NoticePayload;
import ca.qc.banq.rme.shared.marcfactory.data.CustomDataField;

/**
 * 
 */
@Service
public interface INoticeService {
	
	/**
	 * Importer des fichiers de notices
	 * @param files
	 */
	public void importer( MultipartFile[] files);
	/**
	 * Sauvegarder les infos d'une notice
	 * @param request
	 */
	public void enregistrer(NoticePayload request);
	/**
	 * Obtenir les infos d'une notice
	 * @param idNotice
	 * @return
	 */
	public NoticePayload editer(Long idNotice);
	/**
	 * Supprimer une notice
	 * @param idNotice
	 */
	public void supprimer(Long idNotice);
	/**
	 * Afficher la liste des notices
	 * @return
	 */
	public List<NoticeDisplayPayload> lister();
	
	/**
	 * Obtenir la vue Marc d'une notice
	 * @param idNotice
	 * @return
	 */
	public Record getMarc(Long idNotice);

	/**
	 * Obtenir la vue Marc d'une notice
	 * @param idNotice
	 * @return
	 */
	public NoticeDisplayPayload getLibelle(Long idNotice);
	
	/**
	 * Initialise la config d'affichage par defaut de la vue libelle des notices
	 */
	public void initNoticeDisplayConfig();
	
	public String exporter(Long idNotice);
	
	/**
	 * Enregistrer des etiquettes personnalisees
	 * @param payload
	 */
	public void saveCustomEtiquettes(List<CustomDataField> payload) throws Exception;
	
	/**
	 * Lister les etiquettes personnalisees
	 * @return
	 */
	public List<CustomDataField> getCustomEtiquettes();
	
	/**
	 * Supprimer une etiquette personnalisee
	 * @param id
	 */
	public void deleteCustomEtiquette(String id);
}
