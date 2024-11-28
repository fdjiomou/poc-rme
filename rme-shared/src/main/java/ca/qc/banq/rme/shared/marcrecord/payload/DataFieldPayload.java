/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;
import java.util.List;

import ca.qc.banq.rme.shared.marcfactory.data.SubFieldDTO;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
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
public class DataFieldPayload implements Serializable {

	private int classe;
	private String indicator1;
	private String indicator2;
	private String displayCode;
	private String displayLabel;
	private boolean required;
	private boolean repeatable;
	private DataFieldType fieldType;
	private List<TagFieldTypePayload> values;
	private List<SubFieldDTO> subfields;
	
}
