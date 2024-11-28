/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;

import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
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
@Table(name = "custom_etiquettes")
@SuppressWarnings("serial")
public class TagFieldTypeData implements Serializable {

	/**
	 * Identifiant de l'etiquette (${field}_{tag})
	 */
	@Id
	@Column(name = "id")
	private String id;
	
	/**
	 * Numero de l'etiquette customisee (000..999)
	 */
	@NotNull(message = "TagFieldTypeData.field.NotNull")
	//@Enumerated(EnumType.STRING)
	@Column(name = "field")
	private String field;
	
	/**
	 * Sous-Zone $(a..z,0..9)
	 */
	@NotNull(message = "TagFieldTypeData.tag.NotNull")
	@Enumerated(EnumType.STRING)
	@Column(name = "tag")
	private TagField tag;

	/**
	 * Libelle/Titre de l'etiquette
	 */
	@NotNull(message = "TagFieldTypeData.fieldLabel.NotNull")
	@Column(name = "field_label")
	private String fieldLabel;
	
	/**
	 * Libelle/Titre de la sous-zone
	 */
	@NotNull(message = "TagFieldTypeData.label.NotNull")
	@Column(name = "tag_label")
	private String displayLabel;
	
	/**
	 * Duplicable ?
	 */
	@NotNull(message = "TagFieldTypeData.repeatable.NotNull")
	@Column(name = "repeatable", columnDefinition = "boolean default true")
	private Boolean repeatable;
	
	@PrePersist
	public void init() {
		this.id = "$".concat(this.field).concat("_").concat(this.tag.getDisplayCode());
	}

	public TagFieldTypeData(String field,TagField tag,String fieldLabel,String displayLabel,Boolean repeatable) {
		super();
		this.field = field;
		this.tag = tag;
		this.fieldLabel = fieldLabel;
		this.displayLabel = displayLabel;
		this.repeatable = repeatable;
		init();
	}
	
	public void update(TagFieldTypeData obj) {
		this.field = obj.field;
		this.tag = obj.tag;
		this.fieldLabel = obj.fieldLabel;
		this.displayLabel = obj.displayLabel;
		this.repeatable = obj.repeatable;
	}
	
}

