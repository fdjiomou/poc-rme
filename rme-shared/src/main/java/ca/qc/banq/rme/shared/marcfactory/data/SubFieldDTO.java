/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;

import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import ca.qc.banq.rme.shared.marcrecord.payload.TagFieldTypePayload;
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
@SuppressWarnings("serial")
public class SubFieldDTO implements Serializable {

	private String id;
	/**
	 * Numero de l'etiquette customisee (000..999)
	 */
	private String field;
	
	/**
	 * Sous-Zone $(a..z,0..9)
	 */
	private TagField tag;
	private String displayCode;
	/**
	 * Libelle/Titre de la sous-zone
	 */
	private String displayLabel;
	
	/**
	 * Duplicable ?
	 */
	private Boolean repeatable;

	public TagFieldTypePayload toTagFieldTypePayload() {
		return new TagFieldTypePayload(this.field, this.tag, this.tag.getDisplayCode(), this.displayLabel, this.repeatable, "");
	}
}

