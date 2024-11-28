/**
 * 
 */
package ca.qc.banq.rme.backend.notice.helpers;

import java.util.List;

import org.marc4j.marc.Record;

import ca.qc.banq.rme.backend.constants.DefaultValues;
import ca.qc.banq.rme.backend.notice.datamodel.Notice;
import ca.qc.banq.rme.backend.notice.datamodel.NoticeDisplayConfig;
import ca.qc.banq.rme.backend.notice.valueobject.NDValue;
import ca.qc.banq.rme.backend.notice.valueobject.NoticeDisplayPayload;
import ca.qc.banq.rme.shared.marcfactory.helpers.MarcServiceHelper;

/**
 * 
 * francis.djiomou since Nov 14, 2024
 */
public class NoticeUtils {

	public static NoticeDisplayPayload buildDisplayNotice(Notice n, List<NoticeDisplayConfig> cfg) {
		if(n == null || cfg == null || cfg.isEmpty()) return null;
		NoticeDisplayPayload result = new NoticeDisplayPayload();
		Record rec = MarcServiceHelper.getMarcRecordFromStringData(n.getContenu(), DefaultValues.STRING_MARC_CONTENT_FORMAT);
		result.setId(n.getId());
		if(rec != null) result.setValue( cfg.stream().map(c -> new NDValue(c.getOrdre(), c.getCssStyle(), MarcServiceHelper.getValueIntoNotice(rec, c.getTag().getDisplayCode(), c.getSubfield().getDisplayCode().charAt(0)), c.getTitle()  )).toList() );
		return result;
	}
}
