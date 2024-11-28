/**
 * 
 */
package ca.qc.banq.rme.shared.payload;

import java.io.Serializable;

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
public class CodeValuePayload implements Serializable {
	private String code;
	private String value;
}
