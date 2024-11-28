/**
 * 
 */
package ca.qc.banq.rme.backend.notice.rest;

import java.nio.charset.Charset;
import java.util.List;

import org.marc4j.marc.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import ca.qc.banq.rme.backend.notice.service.INoticeService;
import ca.qc.banq.rme.backend.notice.valueobject.NoticeDisplayPayload;
import ca.qc.banq.rme.backend.notice.valueobject.NoticePayload;
import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Services web de gestion des notices
 */
@RestController
@RequestMapping("/notice")
@Tag(name = "Gestion des notices", description = "")
public class NoticeController {

	@Autowired
	INoticeService business;

	/**
	 * Importation de fichiers de notices
	 * @param files
	 * @return
	 */
	@PostMapping(value="/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	@Operation(description = "Importation de fichiers de notices")
	public String importer(@Parameter(description = "Fichiers de notices a uploader")  @RequestParam("files") MultipartFile[] files) {
		business.importer(files);
	    return "OK";
	}

	/**
	 * Sauvegarder une notice
	 * @param request
	 */
	@PutMapping("/save")
	@Operation(description = "Operation de sauvegarde d'une notice")
	public void sauvegarder(@Parameter(description = "Notice") @RequestBody NoticePayload request) {
		business.enregistrer(request);
	}
	
	/**
	 * Supprimer une notice
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	@Operation(description = "Operation de suppresion d'une notice")
	public void supprimer(@Parameter(description = "Identifiant (BD) de la notice") @PathVariable("id") Long id) {
		business.supprimer(id);
	}
	
	/**
	 * Obtenir la liste des notices
	 * @return
	 */
	@GetMapping("/list")
	@Operation(description = "Afficher la liste des notices de la BD")
	public List<NoticeDisplayPayload> lister() {
		return business.lister();
	}

	@GetMapping("/editMarc/{id}")
	@Operation(description = "Obtenir une notice")
	public NoticePayload editer(@Parameter(description = "Identifiant (BD) de la notice") @PathVariable("id") Long id) {
		return business.editer(id);
	}
	
	@GetMapping("/getLibelle/{id}")
	@Operation(description = "Obtenir la vue libelle d'une notice")
	public NoticeDisplayPayload obtenirLibelle(@Parameter(description = "Identifiant (BD) de la notice") @PathVariable("id") Long id) {
		return business.getLibelle(id);
	}
	
	@GetMapping("/getMarc/{id}")
	@Operation(description = "Obtenir la vue marc d'une notice")
	public Record obtenirMarc(@Parameter(description = "Identifiant (BD) de la notice") @PathVariable("id") Long id) {
		return business.getMarc(id);
	}

	@GetMapping("/export/{id}")
	@Operation(description = "Exporter la notice au format MARC")
	public byte[] exporter(@Parameter(description = "Identifiant (BD) de la notice") @PathVariable("id") Long id) {
		String content = business.exporter(id);
		return content.getBytes(Charset.forName("UTF-8"));
	}
	
	@PostMapping("/etiquette/sauvegarder")
	@Operation(description = "Sauvegarder la liste des etiquettes personnalisees")
	public void saveCustomEtiquettes(List<TagFieldTypeData> payload) throws Exception {
		business.saveCustomEtiquettes(payload);
	}

	@GetMapping("/etiquette/lister")
	@Operation(description = "Lister les etiquettes personnalisees")
	public List<TagFieldTypeData> getCustomEtiquettes() {
		return business.getCustomEtiquettes();
	}

	@DeleteMapping("/etiquette/supprimer/{id}")
	@Operation(description = "Supprimer une etiquette personnalisee")
	public void deleteCustomEtiquette(String id) {
		business.deleteCustomEtiquette(id);
	}
}
