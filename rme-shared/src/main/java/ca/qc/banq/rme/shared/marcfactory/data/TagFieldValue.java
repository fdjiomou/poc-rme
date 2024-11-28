/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.data;

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
public class TagFieldValue implements Serializable {

	private String value;
}
