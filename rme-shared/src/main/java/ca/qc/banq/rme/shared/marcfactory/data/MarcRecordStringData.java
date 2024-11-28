/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

import java.io.Serializable;

import org.marc4j.marc.Record;

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
public class MarcRecordStringData implements Serializable {
	private Record record;
	private String stringContent;
	
	/*public MarcRecordPayload toEditPayload(ResourceManagementService translator) {
		return MarcRecordPayload.getFromRecord(record, translator);
	}*/
}
