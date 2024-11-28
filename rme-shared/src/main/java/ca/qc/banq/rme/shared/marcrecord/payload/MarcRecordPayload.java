/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;

import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;
import ca.qc.banq.rme.shared.marcfactory.enums.ControlFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
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
public class MarcRecordPayload implements Serializable {
	private LeaderPayload leader;
	private List<ControlFieldPayload> controlFields;
	private List<DataFieldPayload> dataFields;
	
	public static MarcRecordPayload getFromRecord(Record rec, ResourceManagementService translator) {
		
		List<ControlFieldPayload> fields = Arrays.asList(ControlFieldType.values()).stream().map(cft -> new ControlFieldPayload(cft, cft.getClasse(), cft.getDisplayCode(), translator.getMessage(cft.getDisplayLabel(), null) , cft.isRequired(), cft.isRepeatable(), cft.isFixedLength(), cft.getLength(), cft.isValueStructured(), "") ).toList();
		rec.getControlFields().forEach(cf -> {
			ControlFieldPayload cfp = fields.stream().filter(f -> f.getDisplayCode().equals(cf.getTag()) && f.getValue().isEmpty() ).findFirst().orElse(null);
			if(cfp != null) {
				cfp.setValue(cf.getData());
			}
		});
		fields.stream().filter(f -> f.getFieldType().equals(ControlFieldType.$000)).findFirst().get().setValue(rec.getLeader().marshal());
		
		// Initialisation de la liste de toutes les etiquettes de la norme Marc21
		List<DataFieldPayload> data = Arrays.asList(DataFieldType.values()).stream().map(dft -> new DataFieldPayload(dft.getClasse(), "", "", dft.getDisplayCode(), translator.getMessage(dft.getDisplayLabel(), null) , dft.isRequired(), dft.isRepeatable(), dft, ( dft.getSubFields().stream().map(v -> new TagFieldTypePayload(v.getField(), v.getTag(), v.getTag().getDisplayCode(), translator.getMessage(v.getDisplayLabel(),null), v.getRepeatable(), "") ).collect(Collectors.toList()) ) , dft.getSubFields() ) ).collect(Collectors.toList());
		// On ajoute la liste des etiquettes personnalisees
		DataFieldType.customEtiquettes.forEach( (field, values) -> {
			data.add( new DataFieldPayload(Integer.valueOf(field.substring(0)), "", "", field, values.get(0).getFieldLabel(), false, false, null, values.stream().map(v -> new TagFieldTypePayload(v.getField(), v.getTag(), v.getTag().getDisplayCode(), translator.getMessage(v.getDisplayLabel(),null), v.getRepeatable(), "") ).collect(Collectors.toList()), values ) );
		});
		
		rec.getDataFields().forEach(df -> {
			DataFieldType dft = DataFieldType.getOf(df.getTag());
			DataFieldPayload dfp = data.stream().filter(f -> f.getDisplayCode().equals(df.getTag()) ).findFirst().orElse(null);
			if(dfp != null) {
				dfp.setIndicator1(String.valueOf(df.getIndicator1()) );
				dfp.setIndicator2(String.valueOf(df.getIndicator2()) );
				for(Subfield tf: df.getSubfields() ) {
					TagFieldTypeData tft = dft != null ? dft.getSubFields().stream().filter(s -> s.getTag().getDisplayCode().equals(tf.getCode())).findFirst().orElse(null) : (DataFieldType.customEtiquettes.get(df.getTag()) != null ? DataFieldType.customEtiquettes.get(df.getTag()).stream().filter( t -> t.getTag().getDisplayCode().equals( String.valueOf(tf.getCode()) ) ).findFirst().orElse(null) : null);
					TagFieldTypePayload dftValue = dfp.getValues().stream().filter(d -> d.getCode().equals(String.valueOf(tf.getCode()) ) ).findFirst().orElse(null);
					if(dftValue != null ) {
						if(StringUtils.isEmpty(dftValue.getValue()) ) dftValue.setValue(tf.getData());
						else dfp.getValues().add( new TagFieldTypePayload(df.getTag(), TagField.valueOf("$".concat(String.valueOf(tf.getCode()))), String.valueOf(tf.getCode()), tft != null && translator != null ? translator.getMessage(tft.getDisplayLabel(), null) : "marc.tf"+df.getTag()+"."+tf.getCode()+".label.key", true, tf.getData() ) );
					} else {
						dfp.getValues().add( new TagFieldTypePayload(df.getTag(), TagField.valueOf("$".concat(String.valueOf(tf.getCode()))), String.valueOf(tf.getCode()), tft != null && translator != null ? translator.getMessage(tft.getDisplayLabel(), null) : "marc.tf"+df.getTag()+"."+tf.getCode()+".label.key", false, tf.getData() ) );
					}
				}
			} else {
				dfp = new DataFieldPayload( Integer.parseInt(df.getTag().substring(0)), String.valueOf(df.getIndicator1()), String.valueOf(df.getIndicator2()), df.getTag(), "marc.df"+df.getTag()+".label.key", false, false, dft, new ArrayList<TagFieldTypePayload>(), new ArrayList<TagFieldTypeData>() );
				dfp.setValues( df.getSubfields().stream().map(d -> new TagFieldTypePayload(df.getTag(), TagField.valueOf("$".concat(String.valueOf(d.getCode()))), String.valueOf(d.getCode()), "marc.tf"+df.getTag()+"."+d.getCode()+".label.key", false, d.getData() ) ).toList() );
				data.add(dfp);
			}
		});
		
		return new MarcRecordPayload(LeaderPayload.getFromRecord(rec.getLeader()), fields, data);
	}
	
}
