/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.marc4j.marc.DataField;

import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
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
	private List<TagFieldTypeData> subfields;
	
	public static DataFieldPayload getFromRecord(DataField df, ResourceManagementService translator) {
		if(df == null) return null;
		DataFieldPayload dfp = new DataFieldPayload();
		DataFieldType dft = DataFieldType.getOf(df.getTag());
		if(dft != null) {
			dfp = new DataFieldPayload(dft.getClasse(), String.valueOf(df.getIndicator1()), String.valueOf(df.getIndicator2()), dft.getDisplayCode(), translator.getMessage(dft.getDisplayLabel(), null) , dft.isRequired(), dft.isRepeatable(), dft, new ArrayList<TagFieldTypePayload>(), dft.getSubFields());
		} else {
			dfp = new DataFieldPayload( Integer.valueOf(df.getTag().charAt(0)), String.valueOf(df.getIndicator1()), String.valueOf(df.getIndicator2()), df.getTag(), "Unknown field $" + df.getTag(), false, false, null, new ArrayList<TagFieldTypePayload>(), new ArrayList<TagFieldTypeData>());
		}
		if(df.getSubfields() != null && !df.getSubfields().isEmpty()) {
			dfp.setValues( df.getSubfields().stream().map(f -> TagFieldTypePayload.getFromRecord(df, f, translator) ).filter(Objects::nonNull).toList() );
		}
		return dfp;
		
	}
}
