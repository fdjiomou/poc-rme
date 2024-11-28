/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;

import ca.qc.banq.rme.shared.marcfactory.enums.ControlFieldType;
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
public class ControlFieldValue implements Serializable {

	private ControlFieldType fieldType;
	private String value;
}
