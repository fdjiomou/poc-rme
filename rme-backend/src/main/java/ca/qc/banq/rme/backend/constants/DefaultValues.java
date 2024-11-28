package ca.qc.banq.rme.backend.constants;

import java.util.Arrays;
import java.util.List;

import ca.qc.banq.rme.backend.notice.datamodel.NoticeDisplayConfig;
import ca.qc.banq.rme.shared.marcfactory.enums.DataFieldType;
import ca.qc.banq.rme.shared.marcfactory.enums.TagField;
import ca.qc.banq.rme.shared.marcfactory.helpers.MarcServiceHelper.marc_string_representation_format;

public class DefaultValues {
	

	public final static String ID_MARCFIELD_TAG_CODE = "020";
	public final static String TITLE_MARCFIELD_TAG_CODE = "245";
	public final static char ID_MARCFIELD_SUBFIELD_TAG_CODE = 'a';
	public final static char TITLE_MARCFIELD_SUBFIELD_TAG_CODE = 'a';
	
	public static marc_string_representation_format STRING_MARC_CONTENT_FORMAT = marc_string_representation_format.xml;
	
	public static List<NoticeDisplayConfig> DEFAULT_NOTICE_DISPLAY_CONFIG = Arrays.asList(new NoticeDisplayConfig[] {
			new NoticeDisplayConfig(1L, 1, DataFieldType.$245, TagField.$a, "font-weight:bold;margin:.5em 0;font-size:161.6%", ""),
			new NoticeDisplayConfig(2L, 1, DataFieldType.$246, TagField.$a, "font-weight:bold;margin:.5em 0;font-size:161.6%", ""),
			new NoticeDisplayConfig(3L, 2, DataFieldType.$245, TagField.$c, "color:#006100;font-weight:bold;font-size:100%", "Summary"),
			new NoticeDisplayConfig(4L, 3, DataFieldType.$520, TagField.$a, "font-size: 13px;line-height: 1.22;padding: 0 0 4em;text-align: left;", "Description"),
			new NoticeDisplayConfig(5L, 4, DataFieldType.$020, TagField.$a, "font-size: 13px;line-height: 1.22;padding: 0 0 4em;text-align: left;", "ISBN")
	} );

}
