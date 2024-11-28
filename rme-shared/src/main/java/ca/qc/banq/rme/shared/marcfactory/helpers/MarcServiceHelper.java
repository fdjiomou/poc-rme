/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.helpers;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.Charsets;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.marc4j.MarcJsonWriter;
import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.MarcStreamWriter;
import org.marc4j.MarcTxtWriter;
import org.marc4j.MarcWriter;
import org.marc4j.MarcXmlReader;
import org.marc4j.MarcXmlWriter;
import org.marc4j.marc.ControlField;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;

import ca.qc.banq.rme.shared.marcfactory.data.MarcRecordStringData;
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

}
