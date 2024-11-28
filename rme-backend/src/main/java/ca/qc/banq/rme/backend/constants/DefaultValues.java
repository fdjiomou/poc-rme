package ca.qc.banq.rme.backend.constants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import ca.qc.banq.rme.backend.notice.datamodel.NoticeDisplayConfig;
import ca.qc.banq.rme.shared.marcfactory.data.CustomDataField;
import ca.qc.banq.rme.shared.marcfactory.data.CustomSubField;
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

	public static List<CustomDataField> DEFAULT_CUSTOM_DATAFIELDS = Arrays.asList(new CustomDataField[] {
			new CustomDataField("590", "Public SDM", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$590$a", TagField.$a, null, "Notes", false),
			} ) )),
			new CustomDataField("591", "Valeur SDM", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$591$a", TagField.$a, null, "Notes", false),
			} ) )),
			new CustomDataField("690", "LOCAL SUBJECT ADDED ENTRY--TOPICAL TERM (OCLC, RLIN)", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$690$a", TagField.$a, null, "Topical term or geographic name as entry element", false),
					new CustomSubField("$690$v", TagField.$v, null, "Form subdivision", false),
					new CustomSubField("$690$x", TagField.$x, null, "General subdivision", false),
					new CustomSubField("$690$y", TagField.$y, null, "Chronological subdivision", false),
					new CustomSubField("$690$z", TagField.$z, null, "Geographic subdivision", false),
					new CustomSubField("$690$2", TagField.$2, null, "Source of heading or term", false),
			} ) )),
			new CustomDataField("691", "Geographic Name", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$691$9", TagField.$9, null, "RLIN", false),
			} ) )),
			new CustomDataField("696", "Personal Name", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$696$9", TagField.$9, null, "RLIN", false),
			} ) )),
			new CustomDataField("697", "Corporate Name", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$697$9", TagField.$9, null, "RLIN", false),
			} ) )),
			new CustomDataField("799", "LOCAL ADDED ENTRY--PERSONAL NAME", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$799$9", TagField.$9, null, "RLIN", false),
			} ) )),
			new CustomDataField("942", "Elements specifiques a Koha", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$942$2", TagField.$2, null, "Source de la classification ou du systeme de rangement", false),
					new CustomSubField("$942$c", TagField.$c, null, "Type de document par defaut", false),
					new CustomSubField("$942$e", TagField.$e, null, "Edition", false),
					new CustomSubField("$942$h", TagField.$h, null, "Partie de classification", false),
					new CustomSubField("$942$i", TagField.$i, null, "Partie de document", true),
					new CustomSubField("$942$k", TagField.$k, null, "Prefixe de la cote", false),
					new CustomSubField("$942$m", TagField.$m, null, "Suffixe de la cote", false),
					new CustomSubField("$942$n", TagField.$n, null, "Cacher à l'OPAC", false),
			} ) )),
			new CustomDataField("996", "Informations du SQTD", false, false, new HashSet<CustomSubField>( Arrays.asList(new CustomSubField[] {
					new CustomSubField("$996$a", TagField.$a, null, "Ajout au SQTD", false),
					new CustomSubField("$996$d", TagField.$d, null, "Nombre de telechargements", false),
					new CustomSubField("$996$m", TagField.$m, null, "Date de modification", false),
					new CustomSubField("$996$n", TagField.$n, null, "Date pour nouveautes", false),
					new CustomSubField("$996$p", TagField.$p, null, "Niveau de traitement precedent", true),
			} ) )),
	} );
}
