package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;

import org.marc4j.marc.DataField;
import org.marc4j.marc.Subfield;

import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import ca.qc.banq.rme.shared.service.ResourceManagementService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class TagFieldTypePayload implements Serializable {

	private String field;
	private TagField tag;
	private String code;
	private String displayLabel;
	private boolean repeatable;
	private String value;
	
	public static TagFieldTypePayload getFromRecord(DataField df, Subfield sf, ResourceManagementService translator) {
		if(df == null || sf == null) return null;
		DataFieldType dft = DataFieldType.getOf(df.getTag());
		// On recherche la sous-zone dans notre dictionnaire
		TagFieldTypeData tft = dft != null ? dft.getSubFields().stream().filter(s -> s.getTag().getDisplayCode().equals(sf.getCode())).findFirst().orElse(null) : (DataFieldType.customEtiquettes.get(df.getTag()) != null ? DataFieldType.customEtiquettes.get(df.getTag()).stream().filter( t -> t.getTag().getDisplayCode().equals( String.valueOf(sf.getCode()) ) ).findFirst().orElse(null) : null);
		return new TagFieldTypePayload(df.getTag(), TagField.valueOf("$".concat( String.valueOf(sf.getCode()) )), String.valueOf(sf.getCode()), tft != null ? translator.getMessage(tft.getDisplayLabel(), null) : "marc.tf"+df.getTag()+"."+sf.getCode()+".label.key", tft != null ? tft.getRepeatable() : true, sf.getData());
	}
}
