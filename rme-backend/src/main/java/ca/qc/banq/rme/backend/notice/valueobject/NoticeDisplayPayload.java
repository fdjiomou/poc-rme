/**
 * 
 */
package ca.qc.banq.rme.backend.notice.valueobject;

import java.io.Serializable;
import java.util.List;

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
public class NoticeDisplayPayload implements Serializable {
	private Long id;
	List<NDValue> value;
}
