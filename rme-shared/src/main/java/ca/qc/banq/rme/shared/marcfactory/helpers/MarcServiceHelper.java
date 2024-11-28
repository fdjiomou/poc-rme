/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.helpers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.marc4j.MarcJsonWriter;
import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.MarcStreamWriter;
import org.marc4j.MarcTxtWriter;
import org.marc4j.MarcXmlReader;
import org.marc4j.MarcXmlWriter;
import org.marc4j.marc.ControlField;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;

import ca.qc.banq.rme.shared.marcfactory.data.CustomDataField;
import ca.qc.banq.rme.shared.marcfactory.data.MarcRecordStringData;
import ca.qc.banq.rme.shared.marcfactory.data.SubFieldDTO;
import ca.qc.banq.rme.shared.marcfactory.enums.ControlFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import ca.qc.banq.rme.shared.marcrecord.payload.ControlFieldPayload;
import ca.qc.banq.rme.shared.marcrecord.payload.DataFieldPayload;
import ca.qc.banq.rme.shared.marcrecord.payload.LeaderPayload;
import ca.qc.banq.rme.shared.marcrecord.payload.MarcRecordPayload;
import ca.qc.banq.rme.shared.marcrecord.payload.TagFieldTypePayload;
import ca.qc.banq.rme.shared.service.ResourceManagementService;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@Slf4j
public class MarcServiceHelper {
	
	
	public static enum marc_string_representation_format {xml, json, text, marc}
	
	/**
	 * Recupere la liste des notices contenues dans le fichier passe en parametre
	 * @param in Fichier de notices
	 * @return Liste d'objets notices
	 * @throws Exception
	 */
	public static List<MarcRecordStringData> getMarcRecordsFromFile(InputStream in, marc_string_representation_format format) throws Exception {
		List<MarcRecordStringData> records = new ArrayList<MarcRecordStringData>();
    
		MarcReader reader;
		try {
			reader = new MarcStreamReader(in);
		}catch(Exception ex) {
			log.error("Il ne s'agit pas d'un fichier marc. on verifie si c'est marcx");
			try {
				reader = new MarcXmlReader(in);
			}catch(Exception ex2) {
				log.error("Il ne s'agit pas d'un fichier marcx.");
				throw ex2;
			}
		}
		
	      try {
	    	  
				while (reader.hasNext()) {
				    Record record = reader.next();
			        records.add( new MarcRecordStringData(record, getRecordAsString(record, format) ) );
				}
				
	      } catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	         if(in!=null) in.close();
	      }
		
		 return records;
    }
	
	public static Record getMarcRecordFromStringData(String content, marc_string_representation_format format) {
		Record record = null;
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes(Charset.forName("UTF-8")));
			MarcReader reader = format != null && format.equals(marc_string_representation_format.xml) ? new MarcXmlReader(bais) : new MarcStreamReader(bais) ;
			if (reader.hasNext()) record = reader.next();
			bais.close();
		} catch(Exception e) {e.printStackTrace(); log.error(content);} 
		return record;
	}
	
	public static String getValueIntoNotice(Record record, String field, char... tag) {
		String value = record.getLeader().marshal();
		if(tag == null || tag.length == 0) {
			ControlField c = record.getControlFields().stream().filter(cf -> cf.getTag().equals(field)).findFirst().orElse(null);
			if (c != null) value = c.getData();
		} else {
			DataField d = record.getDataFields().stream().filter(df -> df.getTag().equals(field)).findFirst().orElse(null);
			if(d != null) {
				Subfield s = d.getSubfield(tag[0]);
				if(s != null) value = s.getData();
			}
		}
		return value;
	}
	
	public static String getRecordAsString(Record record, marc_string_representation_format format) {
		String stringData = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			switch(format) {
				case xml: MarcXmlWriter.writeSingleRecord(record, baos, true); break;
				case json: new MarcJsonWriter(baos).write(record); break;
				case text: new MarcTxtWriter(baos).write(record); break;
				default: new MarcStreamWriter(baos).write(record); break;
			}
	        stringData = new String(baos.toByteArray());
	        baos.close();
		} catch(Exception e ) {e.printStackTrace();}
        return stringData;
	}


	public static MarcRecordPayload getFromRecord(Record rec, ResourceManagementService translator, List<CustomDataField> customFields) {
		
		// Initialisation de la liste des champs de controle (000..009)
		List<ControlFieldPayload> fields = Arrays.asList(ControlFieldType.values()).stream().map(cft -> new ControlFieldPayload(cft, cft.getClasse(), cft.getDisplayCode(), translator.getMessage(cft.getDisplayLabel(), null) , cft.isRequired(), cft.isRepeatable(), cft.isFixedLength(), cft.getLength(), cft.isValueStructured(), "") ).toList();
		rec.getControlFields().forEach(cf -> {
			ControlFieldPayload cfp = fields.stream().filter(f -> f.getDisplayCode().equals(cf.getTag()) && f.getValue().isEmpty() ).findFirst().orElse(null);
			if(cfp != null) {
				cfp.setValue(cf.getData());
			}
		});
		
		// Initialisation du Leader (champ 000)
		fields.stream().filter(f -> f.getFieldType().equals(ControlFieldType.$000)).findFirst().get().setValue(rec.getLeader().marshal());
		
		// Initialisation de la liste de toutes les etiquettes de la norme Marc21
		List<DataFieldPayload> data = Arrays.asList(DataFieldType.values()).stream().map(dft -> new DataFieldPayload(dft.getClasse(), "", "", dft.getDisplayCode(), translator.getMessage(dft.getDisplayLabel(), null) , dft.isRequired(), dft.isRepeatable(), dft, ( dft.getSubFields().stream().map(v -> new TagFieldTypePayload(v.getField(), v.getTag(), v.getTag().getDisplayCode(), translator.getMessage(v.getDisplayLabel(),null), v.getRepeatable(), "") ).collect(Collectors.toList()) ) , dft.getSubFields() ) ).collect(Collectors.toList());
		
		// On ajoute la liste des etiquettes personnalisees
		customFields.forEach(cf -> {
			data.add( new DataFieldPayload(Integer.valueOf(cf.getCode().substring(0,1)), "", "", cf.getCode(), cf.getDisplayLabel(), cf.getRequired(), cf.getRepeatable(), null, cf.getSubfields().stream().map(v -> new TagFieldTypePayload(v.getField().getCode(), v.getTag(), v.getTag().getDisplayCode(), translator.getMessage(v.getDisplayLabel(),null), v.getRepeatable(), "") ).collect(Collectors.toList()), cf.getSubfields().stream().map(c -> c.toDTO()).toList() ) );
		});
		
		rec.getDataFields().forEach(df -> {
			DataFieldPayload dfp = data.stream().filter(f -> f.getDisplayCode().equals(df.getTag()) ).findFirst().orElse( null );
			if(dfp == null) data.add( new DataFieldPayload(Integer.valueOf(df.getTag().substring(0,1)), String.valueOf(df.getIndicator1()), String.valueOf(df.getIndicator2()), df.getTag(), "marc.df"+df.getTag()+".label.key", false, false, null, df.getSubfields().stream().map(sf -> new TagFieldTypePayload(df.getTag(), TagField.valueOf("$".concat(String.valueOf(sf.getCode()))), String.valueOf(sf.getCode()),"marc.tf"+df.getTag()+"."+sf.getCode()+".label.key",false, sf.getData())).toList(), new ArrayList<SubFieldDTO>()) );
			else {
				dfp.setIndicator1(String.valueOf(df.getIndicator1()));
				dfp.setIndicator2(String.valueOf(df.getIndicator2()));
				for(Subfield sf: df.getSubfields()) {
					TagFieldTypePayload tagValue = dfp.getValues().stream().filter(c -> c.getCode().equals(String.valueOf(sf.getCode()))).findFirst().orElse(null);
					if(tagValue != null && StringUtils.isEmpty(tagValue.getValue()) ) tagValue.setValue(sf.getData()); 
					else {
						dfp.getValues().add(new TagFieldTypePayload(df.getTag(), TagField.valueOf("$".concat(String.valueOf(sf.getCode()))), String.valueOf(sf.getCode()), translator.getMessage(tagValue != null ? tagValue.getDisplayLabel() : "marc.tf"+df.getTag()+"."+sf.getCode()+".label.key", null), tagValue != null ? tagValue.isRepeatable() : false, sf.getData()));
					}
				}
			}
		});
		
		return new MarcRecordPayload(LeaderPayload.getFromRecord(rec.getLeader()), fields, data);
	}


	public static ControlFieldPayload getControlFieldsFromRecord(ControlField cf, ResourceManagementService translator) {
		ControlFieldType cft = ControlFieldType.valueOf(cf.getTag());
		return new ControlFieldPayload(cft, cft.getClasse(), cft.getDisplayCode(), translator.getMessage(cft.getDisplayLabel(), null) , cft.isRequired(), cft.isRepeatable(), cft.isFixedLength(), cft.getLength(), cft.isValueStructured(), cf.getData());
	}
}
