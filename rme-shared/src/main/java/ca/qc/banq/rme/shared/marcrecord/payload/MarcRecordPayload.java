/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;
import java.util.List;

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
	
}
