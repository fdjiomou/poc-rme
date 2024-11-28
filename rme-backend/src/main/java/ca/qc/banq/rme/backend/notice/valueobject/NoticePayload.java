/**
 * 
 */
package ca.qc.banq.rme.backend.notice.valueobject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.marc4j.marc.DataField;
import org.marc4j.marc.MarcFactory;
import org.marc4j.marc.Record;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.qc.banq.rme.shared.marcrecord.payload.DataFieldPayload;
import ca.qc.banq.rme.shared.marcrecord.payload.MarcRecordPayload;
import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * francis.djiomou since Nov 13, 2024
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class NoticePayload implements Serializable {
	private Long id;
	private String identifiant;
	private String titre;
	private MarcRecordPayload payload;
	

	public Record toRecord() {
		MarcFactory mf = MarcFactory.newInstance();
		Record rec = mf.newRecord(payload.getLeader().convertToLeader());
		rec.getControlFields().addAll( payload.getControlFields().stream().filter(f -> !StringUtils.isEmpty(f.getValue()) ).map(f -> mf.newControlField(f.getDisplayCode(), f.getValue()) ).toList()  );
		for(DataFieldPayload cfp : payload.getDataFields()) {
			List<String> sfCodeAndData = new ArrayList<String>();
			cfp.getValues().stream().filter(f -> !StringUtils.isEmpty(f.getValue()) ).forEach(tfp -> {
				sfCodeAndData.add(tfp.getCode()); sfCodeAndData.add(tfp.getValue()); 
			});

			if( StringUtils.isNotEmpty(cfp.getIndicator1()) || StringUtils.isNotEmpty(cfp.getIndicator2()) ){
				
				rec.getDataFields().add( mf.newDataField(cfp.getDisplayCode(), StringUtils.isNotEmpty(cfp.getIndicator1()) ? cfp.getIndicator1().charAt(0) : '#', StringUtils.isNotEmpty(cfp.getIndicator2()) ? cfp.getIndicator2().charAt(0) : '#' , sfCodeAndData.toArray(new String[] {} )) );
				
			} else if(!sfCodeAndData.isEmpty()) {
				rec.getDataFields().add( mf.newDataField(cfp.getDisplayCode(), '#', '#', sfCodeAndData.toArray(new String[] {} ) ) );
			}
		}
		
		try { System.err.println(new ObjectMapper().writeValueAsString(rec)); } catch(Exception e) {e.printStackTrace();}
		return rec;
	}
}
