/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;

import org.marc4j.marc.ControlField;

import ca.qc.banq.rme.shared.marcfactory.enums.ControlFieldType;
import ca.qc.banq.rme.shared.service.ResourceManagementService;
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
	
	public static ControlFieldPayload getFromRecord(ControlField cf, ResourceManagementService translator) {
		ControlFieldType cft = ControlFieldType.valueOf(cf.getTag());
		return new ControlFieldPayload(cft, cft.getClasse(), cft.getDisplayCode(), translator.getMessage(cft.getDisplayLabel(), null) , cft.isRequired(), cft.isRepeatable(), cft.isFixedLength(), cft.getLength(), cft.isValueStructured(), cf.getData());
	}
}
