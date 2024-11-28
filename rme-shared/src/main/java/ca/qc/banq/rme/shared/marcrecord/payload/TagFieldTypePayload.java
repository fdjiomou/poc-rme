package ca.qc.banq.rme.shared.marcrecord.payload;

import java.io.Serializable;

import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
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
	
}
