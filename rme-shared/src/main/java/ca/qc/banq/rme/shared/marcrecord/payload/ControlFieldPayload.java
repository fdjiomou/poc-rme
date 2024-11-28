/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

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
public class ControlFieldPayload implements Serializable {

	private ControlFieldType fieldType;
	private int classe;
	private String displayCode;
	private String displayLabel;
	private boolean required;
	private boolean repeatable;
	private boolean fixedLength;
	private int length;
	private boolean valueStructured;
	private String value;
	
}
