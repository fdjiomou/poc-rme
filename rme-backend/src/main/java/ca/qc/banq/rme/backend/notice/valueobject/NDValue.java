/**
 * 
 */
package ca.qc.banq.rme.backend.notice.valueobject;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * francis.djiomou since Nov 14, 2024
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class NDValue implements Serializable {

	private int ordre;
	private String css;
	private String data;
	private String title;
}
