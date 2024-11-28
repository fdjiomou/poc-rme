/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;
import java.util.List;

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
public class DataFieldValue implements Serializable {

	private String indicator1;
	private String indicator2;
	private DataFieldType fieldType;
	private List<TagFieldValue> subfields;
}
