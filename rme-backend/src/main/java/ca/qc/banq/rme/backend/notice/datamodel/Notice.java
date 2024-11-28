/**
 * 
 */
package ca.qc.banq.rme.backend.notice.datamodel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.marc4j.marc.Record;

import ca.qc.banq.rme.backend.constants.DefaultValues;
import ca.qc.banq.rme.backend.notice.helpers.NoticeUtils;
import ca.qc.banq.rme.backend.notice.valueobject.NoticeDisplayPayload;
import ca.qc.banq.rme.backend.notice.valueobject.NoticePayload;
import ca.qc.banq.rme.shared.datamodel.MonitoredData;
import ca.qc.banq.rme.shared.marcfactory.data.CustomDataField;
import ca.qc.banq.rme.shared.marcfactory.data.MarcRecordStringData;
import ca.qc.banq.rme.shared.marcfactory.helpers.MarcServiceHelper;
import ca.qc.banq.rme.shared.service.ResourceManagementService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "Notice")
@SuppressWarnings("serial")
public class Notice extends MonitoredData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @NotNull(message = "Notice.numero.NotNull")
    @Column(name="identifiant")
    private String identifiant;

    @Column(name="titre")
    private String titre;

    /**
     * Contenu de la notice au format XML
     */
    @Lob
    @NotNull(message = "Notice.contenu.NotNull")
    @Column(name="contenu", nullable = false)
    private String contenu;
    
    
    /**
     * 
     * @param data
     */
    public Notice (MarcRecordStringData data) {
    	this.identifiant = MarcServiceHelper.getValueIntoNotice(data.getRecord(), DefaultValues.ID_MARCFIELD_TAG_CODE, DefaultValues.ID_MARCFIELD_SUBFIELD_TAG_CODE);
    	this.titre = MarcServiceHelper.getValueIntoNotice(data.getRecord(), DefaultValues.TITLE_MARCFIELD_TAG_CODE, DefaultValues.TITLE_MARCFIELD_SUBFIELD_TAG_CODE);
    	this.contenu = data.getStringContent() != null && !data.getStringContent().isEmpty() ? data.getStringContent() : MarcServiceHelper.getRecordAsString(data.getRecord(), DefaultValues.STRING_MARC_CONTENT_FORMAT);
    	setDdc(new Date());
    }

    public void updateFromPayload (NoticePayload data) {
    	//this.id = data.getId();
    	Record rec = data.toRecord();
    	if(rec != null) {
	    	this.identifiant = MarcServiceHelper.getValueIntoNotice(rec, DefaultValues.ID_MARCFIELD_TAG_CODE, DefaultValues.ID_MARCFIELD_SUBFIELD_TAG_CODE);
	    	this.titre = MarcServiceHelper.getValueIntoNotice(rec, DefaultValues.TITLE_MARCFIELD_TAG_CODE, DefaultValues.TITLE_MARCFIELD_SUBFIELD_TAG_CODE);
	    	this.contenu = MarcServiceHelper.getRecordAsString(rec, DefaultValues.STRING_MARC_CONTENT_FORMAT);
    	}
    }
    
    public NoticePayload toDTO(ResourceManagementService translator, List<CustomDataField> fields) {
    	Record rec = MarcServiceHelper.getMarcRecordFromStringData(contenu, DefaultValues.STRING_MARC_CONTENT_FORMAT);
    	return new NoticePayload(id, identifiant, titre, MarcServiceHelper.getFromRecord(rec, translator, fields));
    }

    public NoticeDisplayPayload toLibelle(List<NoticeDisplayConfig> cfg) {
    	return NoticeUtils.buildDisplayNotice(this, cfg);
    }

    public Record toMarc() {
    	return MarcServiceHelper.getMarcRecordFromStringData(contenu, DefaultValues.STRING_MARC_CONTENT_FORMAT);
    }
    
}
