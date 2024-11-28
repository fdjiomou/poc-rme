/**
 * 
 */
package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;

import org.marc4j.marc.Leader;
import org.marc4j.marc.MarcFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class LeaderPayload implements Serializable {
	
	private int recordLenght;
	private String recordStatus;
	private String typeOfRecord;
	private String implDefined1;
	private String charCodingScheme;
	private int indicatorCount;
	private int subFieldCodeLength;
	private int baseAdressOfData;
	private String implDefined2;
	private String entryMap;
	
	@Override
	public String toString() {
		return String.valueOf(recordLenght) + recordStatus + typeOfRecord + implDefined1 + charCodingScheme + String.valueOf(indicatorCount) + String.valueOf(subFieldCodeLength) + String.valueOf(baseAdressOfData) + implDefined2 + entryMap;
	}
	
	public static LeaderPayload getFromRecord(Leader leader) {
		return new LeaderPayload(leader.getRecordLength(), String.valueOf(leader.getRecordStatus()), String.valueOf(leader.getTypeOfRecord()), String.valueOf(leader.getImplDefined1()), String.valueOf(leader.getCharCodingScheme()), leader.getIndicatorCount(), leader.getSubfieldCodeLength(), leader.getBaseAddressOfData(), String.valueOf(leader.getImplDefined2()), String.valueOf(leader.getEntryMap()) );
	}
	
	public Leader convertToLeader() {
		MarcFactory mf = MarcFactory.newInstance();
		Leader leader = mf.newLeader();
		leader.setBaseAddressOfData(baseAdressOfData);
		leader.setRecordLength(recordLenght);
		leader.setSubfieldCodeLength(subFieldCodeLength);
		leader.setCharCodingScheme(charCodingScheme.charAt(0));
		leader.setRecordStatus(recordStatus.charAt(0));
		leader.setTypeOfRecord(typeOfRecord.charAt(0));
		leader.setEntryMap(entryMap.toCharArray());
		leader.setImplDefined1(implDefined1.toCharArray());
		leader.setImplDefined2(implDefined2.toCharArray());
		return leader;
	}

}
