/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.qc.banq.rme.shared.marcfactory.data.TagFieldTypeData;

/**
 * 
 */
public enum DataFieldType {

	$010( 0, "010", "marc.df.010.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 010 - Library of Congress Control Number (NR)  Full | Concise
	$013( 0, "013", "marc.df.013.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 013 - Patent Control Information (R)  Full | Concise
	$015( 0, "015", "marc.df.015.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 015 - National Bibliography Number (R)  Full | Concise
	$016( 0, "016", "marc.df.016.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 016 - National Bibliographic Agency Control Number (R)  Full | Concise
	$017( 0, "017", "marc.df.017.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 017 - Copyright or Legal Deposit Number (R)  Full | Concise
	$018( 0, "018", "marc.df.018.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 018 - Copyright Article-Fee Code (NR)  Full | Concise
	$020( 0, "020", "marc.df.020.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 020 - International Standard Book Number (R)  Full | Concise
	$022( 0, "022", "marc.df.022.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 022 - International Standard Serial Number (R)  Full | Concise
	$023( 0, "023", "marc.df.023.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 023 - Cluster ISSN (R)  Full | Concise
	$024( 0, "024", "marc.df.024.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 024 - Other Standard Identifier (R)  Full | Concise
	$025( 0, "025", "marc.df.025.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 025 - Overseas Acquisition Number (R)  Full | Concise
	$026( 0, "026", "marc.df.026.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 026 - Fingerprint Identifier (R)  Full | Concise
	$027( 0, "027", "marc.df.027.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 027 - Standard Technical Report Number (R)  Full | Concise
	$028( 0, "028", "marc.df.028.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 028 - Publisher or Distributor Number (R)  Full | Concise
	$030( 0, "030", "marc.df.030.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 030 - CODEN Designation (R)  Full | Concise
	$031( 0, "031", "marc.df.031.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 031 - Musical Incipits Information (R)  Full | Concise
	$032( 0, "032", "marc.df.032.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 032 - Postal Registration Number (R)  Full | Concise
	$033( 0, "033", "marc.df.033.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 033 - Date/Time and Place of an Event (R)  Full | Concise
	$034( 0, "034", "marc.df.034.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 034 - Coded Cartographic Mathematical Data (R)  Full | Concise
	$035( 0, "035", "marc.df.035.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 035 - System Control Number (R)  Full | Concise
	$036( 0, "036", "marc.df.036.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 036 - Original Study Number for Computer Data Files (NR)  Full | Concise
	$037( 0, "037", "marc.df.037.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 037 - Source of Acquisition (R)  Full | Concise
	$038( 0, "038", "marc.df.038.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 038 - Record Content Licensor (NR)  Full | Concise
	$040( 0, "040", "marc.df.040.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 040 - Cataloging Source (NR)  Full | Concise
	$041( 0, "041", "marc.df.041.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 041 - Language Code (R)  Full | Concise
	$042( 0, "042", "marc.df.042.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 042 - Authentication Code (NR)  Full | Concise
	$043( 0, "043", "marc.df.043.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 043 - Geographic Area Code (R)  Full | Concise
	$044( 0, "044", "marc.df.044.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 044 - Country of Publishing/Producing Entity Code (NR)  Full | Concise
	$045( 0, "045", "marc.df.045.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 045 - Time Period of Content (NR)  Full | Concise
	$046( 0, "046", "marc.df.046.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 046 - Special Coded Dates (R)  Full | Concise
	$047( 0, "047", "marc.df.047.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 047 - Form of Musical Composition Code (R)  Full | Concise
	$048( 0, "048", "marc.df.048.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 048 - Number of Musical Instruments or Voices Codes (R)  Full | Concise
	$050( 0, "050", "marc.df.050.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 050 - Library of Congress Call Number (R)  Full | Concise
	$051( 0, "051", "marc.df.051.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 051 - Library of Congress Copy, Issue, Offprint Statement (R)  Full | Concise
	$052( 0, "052", "marc.df.052.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 052 - Geographic Classification (R)  Full | Concise
	$055( 0, "055", "marc.df.055.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 055 - Classification Numbers Assigned in Canada (R)  Full | Concise
	$060( 0, "060", "marc.df.060.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 060 - National Library of Medicine Call Number (R)  Full | Concise
	$061( 0, "061", "marc.df.061.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 061 - National Library of Medicine Copy Statement (R)  Full | Concise
	$066( 0, "066", "marc.df.066.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 066 - Character Sets Present (NR)  Full | Concise
	$070( 0, "070", "marc.df.070.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 070 - National Agricultural Library Call Number (R)  Full | Concise
	$071( 0, "071", "marc.df.071.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 071 - National Agricultural Library Copy Statement (R)  Full | Concise
	$072( 0, "072", "marc.df.072.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 072 - Subject Category Code (R)  Full | Concise
	$074( 0, "074", "marc.df.074.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 074 - GPO Item Number (R)  Full | Concise
	$080( 0, "080", "marc.df.080.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 080 - Universal Decimal Classification Number (R)  Full | Concise
	$082( 0, "082", "marc.df.082.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 082 - Dewey Decimal Classification Number (R)  Full | Concise
	$083( 0, "083", "marc.df.083.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 083 - Additional Dewey Decimal Classification Number (R)  Full | Concise
	$084( 0, "084", "marc.df.084.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 084 - Other Classification Number (R)  Full | Concise
	$085( 0, "085", "marc.df.085.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 085 - Synthesized Classification Number Components (R)  Full | Concise
	$086( 0, "086", "marc.df.086.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 086 - Government Document Classification Number (R)  Full | Concise
	$088( 0, "088", "marc.df.088.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 088 - Report Number (R)  Full | Concise
	//$09X( 0, "09X", "marc.df.09X.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 09x - Local Call Numbers  Full | Concise
	
	$100( 1, "100", "marc.df.100.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 100 - Main Entry - Personal Name (NR) Full | Concise
	$110( 1, "110", "marc.df.110.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 110 - Main Entry - Corporate Name (NR) Full | Concise
	$111( 1, "111", "marc.df.111.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 111 - Main Entry - Meeting Name (NR) Full | Concise
	$130( 1, "130", "marc.df.130.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 130 - Main Entry - Uniform Title (NR) Full | Concise
	
	$210( 2, "210", "marc.df.210.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} )), // 210 - Abbreviated Title (R) Full | Concise
	$222( 2, "222", "marc.df.222.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 222 - Key Title (R) Full | Concise
	$240( 2, "240", "marc.df.240.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 240 - Uniform Title (NR) Full | Concise
	$242( 2, "242", "marc.df.242.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 242 - Translation of Title by Cataloging Agency (R) Full | Concise
	$243( 2, "243", "marc.df.243.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 243 - Collective Uniform Title (NR) Full | Concise
	$245( 2, "245", "marc.df.245.label.key", true, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 245 - Title Statement (NR) Full | Concise
	$246( 2, "246", "marc.df.246.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 246 - Varying Form of Title (R) Full | Concise
	$247( 2, "247", "marc.df.247.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 247 - Former Title (R) Full | Concise
	$250( 2, "250", "marc.df.250.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 250 - Edition Statement (R)  Full | Concise
	$251( 2, "251", "marc.df.251.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 251 - Version Information (R)  Full | Concise
	$254( 2, "254", "marc.df.254.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 254 - Musical Presentation Statement (NR)  Full | Concise
	$255( 2, "255", "marc.df.255.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 255 - Cartographic Mathematical Data (R)  Full | Concise
	$256( 2, "256", "marc.df.256.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 256 - Computer File Characteristics (NR)  Full | Concise
	$257( 2, "257", "marc.df.257.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 257 - Country of Producing Entity (R)  Full | Concise
	$258( 2, "258", "marc.df.258.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 258 - Philatelic Issue Data (R)  Full | Concise
	$260( 2, "260", "marc.df.260.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 260 - Publication, Distribution, etc. (Imprint) (R)  Full | Concise
	$263( 2, "263", "marc.df.263.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 263 - Projected Publication Date (NR)  Full | Concise
	$264( 2, "264", "marc.df.264.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 264 - Production, Publication, Distribution, Manufacture, and Copyright Notice (R)  Full | Concise
	$270( 2, "270", "marc.df.270.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 270 - Address (R)  Full | Concise
		
	$300( 3, "300", "marc.df.300.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 300 - Physical Description (R)  Full | Concise
	$306( 3, "306", "marc.df.306.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 306 - Playing Time (NR)  Full | Concise
	$307( 3, "307", "marc.df.307.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 307 - Hours, etc. (R)  Full | Concise
	$310( 3, "310", "marc.df.310.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 310 - Current Publication Frequency (R)  Full | Concise
	$321( 3, "321", "marc.df.321.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 321 - Former Publication Frequency (R)  Full | Concise
	$334( 3, "334", "marc.df.334.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 334 - Mode of Issuance (R)  Full | Concise
	$335( 3, "335", "marc.df.335.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 335 - Extension Plan (R)  Full | Concise
	$336( 3, "336", "marc.df.336.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 336 - Content Type (R)  Full | Concise
	$337( 3, "337", "marc.df.337.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 337 - Media Type (R)  Full | Concise
	$338( 3, "338", "marc.df.338.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 338 - Carrier Type (R)  Full | Concise
	$340( 3, "340", "marc.df.340.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 340 - Physical Medium (R)  Full | Concise
	$341( 3, "341", "marc.df.341.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 341 - Accessibility Content (R)  Full | Concise
	$342( 3, "342", "marc.df.342.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 342 - Geospatial Reference Data (R)  Full | Concise
	$343( 3, "343", "marc.df.343.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 343 - Planar Coordinate Data (R)  Full | Concise
	$344( 3, "345", "marc.df.344.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 344 - Sound Characteristics (R)  Full | Concise
	$345( 3, "345", "marc.df.345.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 345 - Moving Image Characteristics (R)  Full | Concise
	$346( 3, "346", "marc.df.346.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 346 - Video Characteristics (R)  Full | Concise
	$347( 3, "347", "marc.df.347.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 347 - Digital File Characteristics (R)  Full | Concise
	$348( 3, "348", "marc.df.348.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 348 - Notated Music Characteristics (R)  Full | Concise
	$351( 3, "351", "marc.df.351.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 351 - Organization and Arrangement of Materials (R)  Full | Concise
	$352( 3, "352", "marc.df.352.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 352 - Digital Graphic Representation (R)  Full | Concise
	$353( 3, "353", "marc.df.353.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 353 - Supplementary Content Characteristics (R)  Full | Concise
	$355( 3, "355", "marc.df.355.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 355 - Security Classification Control (R)  Full | Concise
	$357( 3, "357", "marc.df.357.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 357 - Originator Dissemination Control (NR)  Full | Concise
	$361( 3, "361", "marc.df.361.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 361 - Structured Ownership and Custodial History (R)  Full | Concise
	$362( 3, "362", "marc.df.362.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 362 - Dates of Publication and/or Sequential Designation (R)  Full | Concise
	$363( 3, "363", "marc.df.363.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 363 - Normalized Date and Sequential Designation (R)  Full | Concise
	$365( 3, "365", "marc.df.365.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 365 - Trade Price (R)  Full | Concise
	$366( 3, "366", "marc.df.366.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 366 - Trade Availability Information (R)  Full | Concise
	$370( 3, "370", "marc.df.370.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 370 - Associated Place (R)  Full | Concise
	$377( 3, "377", "marc.df.377.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 377 - Associated Language (R)  Full | Concise
	$380( 3, "380", "marc.df.380.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 380 - Form of Work (R)  Full | Concise
	$381( 3, "381", "marc.df.381.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 381 - Other Distinguishing Characteristics of Work or Expression (R)  Full | Concise
	$382( 3, "382", "marc.df.382.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 382 - Medium of Performance (R)  Full | Concise
	$383( 3, "383", "marc.df.383.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 383 - Numeric Designation of Musical Work or Expression (R)  Full | Concise
	$384( 3, "384", "marc.df.384.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 384 - Key (R)  Full | Concise
	$385( 3, "385", "marc.df.385.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 385 - Audience Characteristics (R)  Full | Concise
	$386( 3, "386", "marc.df.386.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 386 - Creator/Contributor Characteristics (R)  Full | Concise
	$387( 3, "387", "marc.df.387.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 387 - Representative Expression Characteristics (R)  Full | Concise
	$388( 3, "388", "marc.df.388.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 388 - Time Period of Creation (R)  Full | Concise
	
	$490( 4, "490", "marc.df.490.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 490 - Series Statement (R) Full | Concise
	$400( 4, "400", "marc.df.400.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // Field 400 - Series Statement/Added Entry-Personal Name
	$410( 4, "410", "marc.df.410.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // Field 410 - Series Statement/Added Entry-Corporate Name
	$411( 4, "411", "marc.df.411.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // Field 411 - Series Statement/Added Entry−Meeting Name
	//These fields became local to the United States in 1999 since they were obsolete in the CAN/MARC format. They are described in Appendix H.
	$440( 4, "440", "marc.df.440.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // Field 440 - Series Statement/Added Entry-Title [OBSOLETE, 2008]
	
	$500( 5, "500", "marc.df.500.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 500 - General Note (R)  Full | Concise
	$501( 5, "501", "marc.df.501.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 501 - With Note (R)  Full | Concise
	$502( 5, "502", "marc.df.502.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 502 - Dissertation Note (R)  Full | Concise
	$504( 5, "504", "marc.df.504.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 504 - Bibliography, etc. Note (R)  Full | Concise
	$505( 5, "505", "marc.df.505.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 505 - Formatted Contents Note (R)  Full | Concise
	$506( 5, "506", "marc.df.506.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 506 - Restrictions on Access Note (R)  Full | Concise
	$507( 5, "507", "marc.df.507.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 507 - Scale Note for Visual Materials (NR)  Full | Concise
	$508( 5, "508", "marc.df.508.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 508 - Creation/Production Credits Note (R)  Full | Concise
	$510( 5, "510", "marc.df.510.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 510 - Citation/References Note (R)  Full | Concise
	$511( 5, "511", "marc.df.511.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 511 - Participant or Performer Note (R)  Full | Concise
	$513( 5, "513", "marc.df.513.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 513 - Type of Report and Period Covered Note (R)  Full | Concise
	$514( 5, "514", "marc.df.514.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 514 - Data Quality Note (NR)  Full | Concise
	$515( 5, "515", "marc.df.515.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 515 - Numbering Peculiarities Note (R)  Full | Concise
	$516( 5, "516", "marc.df.516.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 516 - Type of Computer File or Data Note (R)  Full | Concise
	$518( 5, "518", "marc.df.518.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 518 - Date/Time and Place of an Event Note (R)  Full | Concise
	$520( 5, "520", "marc.df.520.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 520 - Summary, etc. (R)  Full | Concise
	$521( 5, "521", "marc.df.521.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 521 - Target Audience Note (R)  Full | Concise
	$522( 5, "522", "marc.df.522.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 522 - Geographic Coverage Note (R)  Full | Concise
	$524( 5, "524", "marc.df.524.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 524 - Preferred Citation of Described Materials Note (R)  Full | Concise
	$525( 5, "525", "marc.df.525.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 525 - Supplement Note (R)  Full | Concise
	$526( 5, "526", "marc.df.526.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 526 - Study Program Information Note (R)  Full | Concise
	$530( 5, "530", "marc.df.530.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 530 - Additional Physical Form available Note (R)  Full | Concise
	$532( 5, "532", "marc.df.532.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 532 - Accessibility Note (R)  Full | Concise
	$533( 5, "533", "marc.df.533.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 533 - Reproduction Note (R)  Full | Concise
	$534( 5, "534", "marc.df.534.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 534 - Original Version Note (R)  Full | Concise
	$535( 5, "535", "marc.df.535.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 535 - Location of Originals/Duplicates Note (R)  Full | Concise
	$536( 5, "536", "marc.df.536.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 536 - Funding Information Note (R)  Full | Concise
	$538( 5, "538", "marc.df.538.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 538 - System Details Note (R)  Full | Concise
	$540( 5, "540", "marc.df.540.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 540 - Terms Governing Use and Reproduction Note (R)  Full | Concise
	$541( 5, "541", "marc.df.541.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 541 - Immediate Source of Acquisition Note (R)  Full | Concise
	$542( 5, "542", "marc.df.542.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 542 - Information Relating to Copyright Status (R)  Full | Concise
	$544( 5, "544", "marc.df.544.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 544 - Location of Other Archival Materials Note (R)  Full | Concise
	$545( 5, "545", "marc.df.545.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 545 - Biographical or Historical Data (R)  Full | Concise
	$546( 5, "546", "marc.df.546.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 546 - Language Note (R)  Full | Concise
	$547( 5, "547", "marc.df.547.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 547 - Former Title Complexity Note (R)  Full | Concise
	$550( 5, "550", "marc.df.550.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 550 - Issuing Body Note (R)  Full | Concise
	$552( 5, "552", "marc.df.552.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 552 - Entity and Attribute Information Note (R)  Full | Concise
	$555( 5, "555", "marc.df.555.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 555 - Cumulative Index/Finding Aids Note (R)  Full | Concise
	$556( 5, "556", "marc.df.556.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 556 - Information About Documentation Note (R)  Full | Concise
	$561( 5, "561", "marc.df.561.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 561 - Ownership and Custodial History (R)  Full | Concise
	$562( 5, "562", "marc.df.562.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 562 - Copy and Version Identification Note (R)  Full | Concise
	$563( 5, "563", "marc.df.563.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 563 - Binding Information (R)  Full | Concise
	$565( 5, "565", "marc.df.565.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 565 - Case File Characteristics Note (R)  Full | Concise
	$567( 5, "567", "marc.df.567.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 567 - Methodology Note (R)  Full | Concise
	$580( 5, "580", "marc.df.580.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 580 - Linking Entry Complexity Note (R)  Full | Concise
	$581( 5, "581", "marc.df.581.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 581 - Publications About Described Materials Note (R)  Full | Concise
	$583( 5, "583", "marc.df.583.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 583 - Action Note (R)  Full | Concise
	$584( 5, "584", "marc.df.584.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 584 - Accumulation and Frequency of Use Note (R)  Full | Concise
	$585( 5, "585", "marc.df.585.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 585 - Exhibitions Note (R)  Full | Concise
	$586( 5, "586", "marc.df.586.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 586 - Awards Note (R)  Full | Concise
	$588( 5, "586", "marc.df.588.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 588 - Source of Description, Etc. Note (R)  Full | Concise
	//$59X( 5, "59X", "marc.df.59X.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 59X - Local Notes  Full | Concise
	
	
	$600( 6, "600", "marc.df.600.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 600 - Subject Added Entry - Personal Name (R)  Full | Concise
	$610( 6, "610", "marc.df.610.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 610 - Subject Added Entry - Corporate Name (R)  Full | Concise
	$611( 6, "611", "marc.df.611.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 611 - Subject Added Entry - Meeting Name (R)  Full | Concise
	$630( 6, "630", "marc.df.630.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 630 - Subject Added Entry - Uniform Title (R)  Full | Concise
	$647( 6, "647", "marc.df.647.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 647 - Subject Added Entry - Named Event (R)  Full | Concise
	$648( 6, "648", "marc.df.648.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 648 - Subject Added Entry - Chronological Term (R)  Full | Concise
	$650( 6, "650", "marc.df.650.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 650 - Subject Added Entry - Topical Term (R)  Full | Concise
	$651( 6, "651", "marc.df.651.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 651 - Subject Added Entry - Geographic Name (R)  Full | Concise
	$653( 6, "653", "marc.df.653.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 653 - Index Term - Uncontrolled (R)  Full | Concise
	$654( 6, "654", "marc.df.654.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 654 - Subject Added Entry - Faceted Topical Terms (R)  Full | Concise
	$655( 6, "655", "marc.df.655.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 655 - Index Term - Genre/Form (R)  Full | Concise
	$656( 6, "656", "marc.df.656.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 656 - Index Term - Occupation (R)  Full | Concise
	$657( 6, "657", "marc.df.657.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 657 - Index Term - Function (R)  Full | Concise
	$658( 6, "658", "marc.df.658.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 658 - Index Term - Curriculum Objective (R)  Full | Concise
	$662( 6, "662", "marc.df.662.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 662 - Subject Added Entry - Hierarchical Place Name (R)  Full | Concise
	$688( 6, "688", "marc.df.688.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 688 - Subject Added Entry - Type of Entity Unspecified (R)  Full | Concise
	//$69X( 6, "69X", "marc.df.69X.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 69X - Local Subject Access Fields (R)  Full | Concise
	
	$700( 7, "700", "marc.df.700.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 700 - Added Entry - Personal Name (R)  Full | Concise
	$710( 7, "710", "marc.df.710.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 710 - Added Entry - Corporate Name (R)  Full | Concise
	$711( 7, "711", "marc.df.711.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 711 - Added Entry - Meeting Name (R)  Full | Concise
	$720( 7, "720", "marc.df.720.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 720 - Added Entry - Uncontrolled Name (R)  Full | Concise
	$730( 7, "730", "marc.df.730.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 730 - Added Entry - Uniform Title (R)  Full | Concise
	$740( 7, "740", "marc.df.740.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 740 - Added Entry - Uncontrolled Related/Analytical Title (R)  Full | Concise
	$751( 7, "751", "marc.df.751.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 751 - Added Entry - Geographic Name (R)  Full | Concise
	$752( 7, "752", "marc.df.752.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 752 - Added Entry - Hierarchical Place Name (R)  Full | Concise
	$753( 7, "753", "marc.df.753.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 753 - System Details Access to Computer Files (R)  Full | Concise
	$754( 7, "754", "marc.df.754.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 754 - Added Entry - Taxonomic Identification (R)  Full | Concise
	$758( 7, "758", "marc.df.758.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 758 - Resource Identifier (R)  Full | Concise
	//$760_787( 7, "760-787", "marc.df.760-787.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 760-787 - Linking Entry Fields - General Information
	$760( 7, "760", "marc.df.760.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$762( 7, "762", "marc.df.762.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$765( 7, "765", "marc.df.765.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$767( 7, "767", "marc.df.767.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$770( 7, "770", "marc.df.770.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$772( 7, "772", "marc.df.772.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$773( 7, "773", "marc.df.773.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$774( 7, "774", "marc.df.774.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$775( 7, "775", "marc.df.775.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$776( 7, "776", "marc.df.776.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$777( 7, "777", "marc.df.777.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$780( 7, "780", "marc.df.780.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$785( 7, "788", "marc.df.785.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$786( 7, "786", "marc.df.786.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	$787( 7, "787", "marc.df.787.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ),
	/*760 - Main Series Entry (R)  Full | Concise
	762 - Subseries Entry (R)  Full | Concise
	765 - Original Language Entry (R)  Full | Concise
	767 - Translation Entry (R)  Full | Concise
	770 - Supplement/Special Issue Entry (R)  Full | Concise
	772 - Supplement Parent Entry (R)  Full | Concise
	773 - Host Item Entry (R)  Full | Concise
	774 - Constituent Unit Entry (R)  Full | Concise
	775 - Other Edition Entry (R)  Full | Concise
	776 - Additional Physical Form Entry (R)  Full | Concise
	777 - Issued With Entry (R)  Full | Concise
	780 - Preceding Entry (R)  Full | Concise
	785 - Succeeding Entry (R)  Full | Concise
	786 - Data Source Entry (R)  Full | Concise
	787 - Other Relationship Entry (R)  Full | Concise*/
	$788( 7, "788", "marc.df.788.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 788 - Parallel Description in Another Language of Cataloging (R)  Full | Concise
	
	$800( 8, "800", "marc.df.800.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 800 - Series Added Entry - Personal Name (R) Full | Concise
	$810( 8, "810", "marc.df.810.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 810 - Series Added Entry - Corporate Name (R) Full | Concise
	$811( 8, "811", "marc.df.811.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 811 - Series Added Entry - Meeting Name (R) Full | Concise
	$830( 8, "830", "marc.df.830.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 830 - Series Added Entry - Uniform Title (R) Full | Concise
	$841( 8, "841", "marc.df.841.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 841 - Holdings Coded Data Values (NR)
	$842( 8, "842", "marc.df.842.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 842 - Textual Physical Form Designator (NR)
	$843( 8, "843", "marc.df.843.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 843 - Reproduction Note (R)
	$844( 8, "844", "marc.df.844.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 844 - Name of Unit (NR)
	$845( 8, "845", "marc.df.845.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 845 - Terms Governing Use and Reproduction (R)
	$850( 8, "850", "marc.df.850.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 850 - Holding Institution (R)  Full | Concise
	$852( 8, "852", "marc.df.852.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 852 - Location (R)  Full | Concise
	$853( 8, "853", "marc.df.853.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 853 - Captions and Pattern - Basic Bibliographic Unit (R)
	$854( 8, "854", "marc.df.854.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 854 - Captions and Pattern - Supplementary Material (R)
	$855( 8, "855", "marc.df.855.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 855 - Captions and Pattern - Indexes (R)
	$856( 8, "856", "marc.df.856.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 856 - Electronic Location and Access (R)  Full | Concise
	$857( 8, "857", "marc.df.857.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 857 - Electronic Archive Location and Access (R)  Full | Concise
	$863( 8, "863", "marc.df.863.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 863 - Enumeration and Chronology - Basic Bibliographic Unit (R)
	$864( 8, "864", "marc.df.864.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 864 - Enumeration and Chronology - Supplementary Material (R)
	$865( 8, "865", "marc.df.865.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 865 - Enumeration and Chronology - Indexes (R)
	$866( 8, "866", "marc.df.866.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 866 - Textual Holdings - Basic Bibliographic Unit (R)
	$867( 8, "867", "marc.df.867.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 867 - Textual Holdings - Supplementary Material (R)
	$868( 8, "868", "marc.df.868.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 868 - Textual Holdings - Indexes (R)
	$876( 8, "876", "marc.df.876.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 876 - Item Information - Basic Bibliographic Unit (R)
	$877( 8, "877", "marc.df.877.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 877 - Item Information - Supplementary Material (R)
	$878( 8, "878", "marc.df.878.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 878 - Item Information - Indexes (R)
	$880( 8, "880", "marc.df.880.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 880 - Alternate Graphic Representation (R)  Full | Concise
	$881( 8, "881", "marc.df.881.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 881 - Manifestation Statements (R) Full | Concise
	$882( 8, "882", "marc.df.882.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) ), // 882 - Replacement Record Information (NR)  Full | Concise
	$883( 8, "883", "marc.df.883.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 883 - Metadata Provenance (R)  Full | Concise
	$884( 8, "884", "marc.df.884.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 884 - Description Conversion Information (R)  Full | Concise
	$885( 8, "885", "marc.df.885.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 885 - Matching Information (R)  Full | Concise
	$886( 8, "886", "marc.df.886.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 886 - Foreign MARC Information Field (R)  Full | Concise
	$887( 8, "887", "marc.df.887.label.key", false, true, Arrays.asList( new TagFieldTypeData[] {} ) ), // 887 - Non-MARC Information Field (R)  Full | Concise
	
	//$9X( 9, "9X", "marc.df.9X.label.key", false, false, Arrays.asList( new TagFieldTypeData[] {} ) );
	;		
			
			
			
			
	
	/** Classe du champ (numero de 0 a 9) */
	private int classe;
	/** Valeur affichee pour identifier le field/subfield */
	private String displayCode;
	/** Description du champ */
	private String displayLabel;
	/** Est-ce-que le champ est obligatoire */
	private boolean required;
	/** Le champ peut-il etre duplique ? */
	private boolean repeatable;
	/** Liste des valeurs possibles de sous-champs */
	private List<TagFieldTypeData> values;
	/*private List<String> ind1Values;
	private List<String> ind2Values;*/
	public static Map<String, List<TagFieldTypeData>> customEtiquettes = new HashMap<String, List<TagFieldTypeData>>();
	
	
	/*public static DataFieldType getOf(int number) {
		if(number>=900 && number <= 999) return $9X;
		else if(number>=690 && number <= 699) return $69X;
		else if(number>=590 && number <= 599) return $59X;
		else if(number>=90 && number <= 99) return $09X;
		else if (number >= 10 && number <1000)  return DataFieldType.valueOf( "$".concat( (number < 100 ? "0" : "") +  String.valueOf(number)) );
		else return null;
	}*/
	
	public static DataFieldType getOf(String code) {
		try {
			return DataFieldType.valueOf( "$".concat(code) );
		} catch(Exception e) {
			return null;
		}
	}
	
	private DataFieldType() {}

	private DataFieldType(int classe, String displayCode, String displayLabel, boolean required, boolean canDuplicate, List<TagFieldTypeData> values/*, List<String>i1v, List<String>i2v*/) {
		this.classe = classe;
		this.displayCode = displayCode;
		this.displayLabel = displayLabel;
		this.required = required;
		this.repeatable = canDuplicate;
		this.values = values;
		/*this.ind1Values = i1v;
		this.ind2Values = i2v;*/
	}

	/**
	 * @return the classe
	 */
	public int getClasse() {
		return classe;
	}

	/**
	 * @param classe the classe to set
	 */
	public void setClasse(int classe) {
		this.classe = classe;
	}

	/**
	 * @return the displayCode
	 */
	public String getDisplayCode() {
		return displayCode;
	}

	/**
	 * @param displayCode the displayCode to set
	 */
	public void setDisplayCode(String displayCode) {
		this.displayCode = displayCode;
	}

	/**
	 * @return the displayLabel
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * @param displayLabel the displayLabel to set
	 */
	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}

	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * @return the repeatable
	 */
	public boolean isRepeatable() {
		return repeatable;
	}
	/**
	 * @param repeatable the repeatable to set
	 */
	public void setRepeatable(boolean repeatable) {
		this.repeatable = repeatable;
	}

	/**
	 * @return the values
	 */
	public List<TagFieldTypeData> getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(List<TagFieldTypeData> values) {
		this.values = values;
	}

	public List<TagFieldTypeData> getSubFields() {
		switch (this) {

		case $010: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$010_a", DataFieldType.$010.getDisplayCode(), TagField.$a, "a", "marc.tf010.a.label.key", false),
				new TagFieldTypeData("$010_b", DataFieldType.$010.getDisplayCode(), TagField.$b, "b", "marc.tf010.b.label.key", true),
				new TagFieldTypeData("$010_z", DataFieldType.$010.getDisplayCode(), TagField.$z, "z", "marc.tf010.z.label.key", true),
				new TagFieldTypeData("$010_8", DataFieldType.$010.getDisplayCode(), TagField.$8, "8", "marc.tf010.8.label.key", true),} );
		
		case $013: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$013_a", DataFieldType.$013.getDisplayCode(), TagField.$a, "a", "marc.tf013.a.label.key", false),
				new TagFieldTypeData("$013_b", DataFieldType.$013.getDisplayCode(), TagField.$b, "b", "marc.tf013.b.label.key", false),
				new TagFieldTypeData("$013_c", DataFieldType.$013.getDisplayCode(), TagField.$c, "c", "marc.tf013.c.label.key", false),
				new TagFieldTypeData("$013_d", DataFieldType.$013.getDisplayCode(), TagField.$d, "d", "marc.tf013.d.label.key", true),
				new TagFieldTypeData("$013_e", DataFieldType.$013.getDisplayCode(), TagField.$e, "e", "marc.tf013.e.label.key", true),
				new TagFieldTypeData("$013_f", DataFieldType.$013.getDisplayCode(), TagField.$f, "f", "marc.tf013.f.label.key", true),
				new TagFieldTypeData("$013_6", DataFieldType.$013.getDisplayCode(), TagField.$6, "6", "marc.tf013.6.label.key", false),
				new TagFieldTypeData("$013_8", DataFieldType.$013.getDisplayCode(), TagField.$8, "8", "marc.tf013.8.label.key", true),} );
		
		case $015: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$015_a", DataFieldType.$015.getDisplayCode(), TagField.$a, "a", "marc.tf015.a.label.key", true),
				new TagFieldTypeData("$015_q", DataFieldType.$015.getDisplayCode(), TagField.$q, "q", "marc.tf015.q.label.key", true),
				new TagFieldTypeData("$015_z", DataFieldType.$015.getDisplayCode(), TagField.$z, "z", "marc.tf015.z.label.key", true),
				new TagFieldTypeData("$015_2", DataFieldType.$015.getDisplayCode(), TagField.$2, "2", "marc.tf015.2.label.key", false),
				new TagFieldTypeData("$015_6", DataFieldType.$015.getDisplayCode(), TagField.$6, "6", "marc.tf015.6.label.key", false),
				new TagFieldTypeData("$015_8", DataFieldType.$015.getDisplayCode(), TagField.$8, "8", "marc.tf015.8.label.key", true),} );
		
		case $016: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$016_a", DataFieldType.$016.getDisplayCode(), TagField.$a, "a", "marc.tf016.a.label.key", false),
				new TagFieldTypeData("$016_z", DataFieldType.$016.getDisplayCode(), TagField.$z, "z", "marc.tf016.z.label.key", true),
				new TagFieldTypeData("$016_2", DataFieldType.$016.getDisplayCode(), TagField.$2, "2", "marc.tf016.2.label.key", false),
				new TagFieldTypeData("$016_8", DataFieldType.$016.getDisplayCode(), TagField.$8, "8", "marc.tf016.8.label.key", true),} );
		
		case $017: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$017_a", DataFieldType.$017.getDisplayCode(), TagField.$a, "a", "marc.tf017.a.label.key", true ),
				new TagFieldTypeData("$017_b", DataFieldType.$017.getDisplayCode(), TagField.$b, "b", "marc.tf017.b.label.key", false ),
				new TagFieldTypeData("$017_d", DataFieldType.$017.getDisplayCode(), TagField.$d, "d", "marc.tf017.d.label.key", false ),
				new TagFieldTypeData("$017_i", DataFieldType.$017.getDisplayCode(), TagField.$i, "i", "marc.tf017.i.label.key", false ),
				new TagFieldTypeData("$017_z", DataFieldType.$017.getDisplayCode(), TagField.$z, "z", "marc.tf017.z.label.key", true ),
				new TagFieldTypeData("$017_2", DataFieldType.$017.getDisplayCode(), TagField.$2, "2", "marc.tf017.2.label.key", false ),
				new TagFieldTypeData("$017_6", DataFieldType.$017.getDisplayCode(), TagField.$6, "6", "marc.tf017.6.label.key", false ),
				new TagFieldTypeData("$017_8", DataFieldType.$017.getDisplayCode(), TagField.$8, "8", "marc.tf017.8.label.key", true ),} );
		
		case $018: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$018_a", DataFieldType.$018.getDisplayCode(), TagField.$a, "a", "marc.tf018.a.label.key", false ),
				new TagFieldTypeData("$018_6", DataFieldType.$018.getDisplayCode(), TagField.$6, "6", "marc.tf018.6.label.key", false ),
				new TagFieldTypeData("$018_8", DataFieldType.$018.getDisplayCode(), TagField.$8, "8", "marc.tf018.8.label.key", true ),} );
		
		case $020: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$020_a", DataFieldType.$020.getDisplayCode(), TagField.$a, "a", "marc.tf020.a.label.key", false ),
				new TagFieldTypeData("$020_c", DataFieldType.$020.getDisplayCode(), TagField.$c, "c", "marc.tf020.c.label.key", false ),
				new TagFieldTypeData("$020_q", DataFieldType.$020.getDisplayCode(), TagField.$q, "q", "marc.tf020.q.label.key", true ),
				new TagFieldTypeData("$020_z", DataFieldType.$020.getDisplayCode(), TagField.$z, "z", "marc.tf020.z.label.key", true ),
				new TagFieldTypeData("$020_6", DataFieldType.$020.getDisplayCode(), TagField.$6, "6", "marc.tf020.6.label.key", false ),
				new TagFieldTypeData("$020_8", DataFieldType.$020.getDisplayCode(), TagField.$8, "8", "marc.tf020.8.label.key", true ),} );
		
		case $022: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$022_a", DataFieldType.$022.getDisplayCode(), TagField.$a, "a", "marc.tf022.a.label.key", false ),
				new TagFieldTypeData("$022_y", DataFieldType.$022.getDisplayCode(), TagField.$y, "y", "marc.tf022.y.label.key", true ),
				new TagFieldTypeData("$022_z", DataFieldType.$022.getDisplayCode(), TagField.$z, "z", "marc.tf022.z.label.key", true ),
				new TagFieldTypeData("$022_0", DataFieldType.$022.getDisplayCode(), TagField.$0, "0", "marc.tf022.0.label.key", false ),
				new TagFieldTypeData("$022_1", DataFieldType.$022.getDisplayCode(), TagField.$1, "1", "marc.tf022.1.label.key", true ),
				new TagFieldTypeData("$022_2", DataFieldType.$022.getDisplayCode(), TagField.$2, "2", "marc.tf022.2.label.key", false ),
				new TagFieldTypeData("$022_6", DataFieldType.$022.getDisplayCode(), TagField.$6, "6", "marc.tf022.6.label.key", false ),
				new TagFieldTypeData("$022_8", DataFieldType.$022.getDisplayCode(), TagField.$8, "8", "marc.tf022.8.label.key", true ),} );
		
		case $023: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$023_a", DataFieldType.$023.getDisplayCode(), TagField.$a, "a", "marc.tf023.a.label.key", false ),
				new TagFieldTypeData("$023_y", DataFieldType.$023.getDisplayCode(), TagField.$y, "y", "marc.tf023.y.label.key", true ),
				new TagFieldTypeData("$023_z", DataFieldType.$023.getDisplayCode(), TagField.$z, "z", "marc.tf023.z.label.key", true ),
				new TagFieldTypeData("$023_0", DataFieldType.$023.getDisplayCode(), TagField.$0, "0", "marc.tf023.0.label.key", false ),
				new TagFieldTypeData("$023_1", DataFieldType.$023.getDisplayCode(), TagField.$1, "1", "marc.tf023.1.label.key", true ),
				new TagFieldTypeData("$023_2", DataFieldType.$023.getDisplayCode(), TagField.$2, "2", "marc.tf023.2.label.key", false ),
				new TagFieldTypeData("$023_6", DataFieldType.$023.getDisplayCode(), TagField.$6, "6", "marc.tf023.6.label.key", false ),
				new TagFieldTypeData("$023_8", DataFieldType.$023.getDisplayCode(), TagField.$8, "8", "marc.tf023.8.label.key", true ),} );
		
		case $024: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$024_a", DataFieldType.$024.getDisplayCode(), TagField.$a, "a", "marc.tf024.a.label.key", false ),
				new TagFieldTypeData("$024_c", DataFieldType.$024.getDisplayCode(), TagField.$c, "c", "marc.tf024.c.label.key", false ),
				new TagFieldTypeData("$024_d", DataFieldType.$024.getDisplayCode(), TagField.$d, "d", "marc.tf024.d.label.key", false ),
				new TagFieldTypeData("$024_q", DataFieldType.$024.getDisplayCode(), TagField.$q, "q", "marc.tf024.q.label.key", true ),
				new TagFieldTypeData("$024_z", DataFieldType.$024.getDisplayCode(), TagField.$z, "z", "marc.tf024.z.label.key", true ),
				new TagFieldTypeData("$024_2", DataFieldType.$024.getDisplayCode(), TagField.$2, "2", "marc.tf024.2.label.key", false ),
				new TagFieldTypeData("$024_6", DataFieldType.$024.getDisplayCode(), TagField.$6, "6", "marc.tf024.6.label.key", false ),
				new TagFieldTypeData("$024_8", DataFieldType.$024.getDisplayCode(), TagField.$8, "8", "marc.tf024.8.label.key", true ),} );
		
		case $025: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$025_a", DataFieldType.$025.getDisplayCode(), TagField.$a, "a", "marc.tf025.a.label.key", true ),
				new TagFieldTypeData("$025_8", DataFieldType.$025.getDisplayCode(), TagField.$8, "8", "marc.tf025.8.label.key", true ),} );
		
		case $026: return Arrays.asList( new TagFieldTypeData[] {} );
		
		case $027: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$027_a", DataFieldType.$027.getDisplayCode(), TagField.$a, "a", "marc.tf027.a.label.key", false ),
				new TagFieldTypeData("$027_q", DataFieldType.$027.getDisplayCode(), TagField.$q, "q", "marc.tf027.q.label.key", true ),
				new TagFieldTypeData("$027_z", DataFieldType.$027.getDisplayCode(), TagField.$z, "z", "marc.tf027.z.label.key", true ),
				new TagFieldTypeData("$027_6", DataFieldType.$027.getDisplayCode(), TagField.$6, "6", "marc.tf027.6.label.key", false ),
				new TagFieldTypeData("$027_8", DataFieldType.$027.getDisplayCode(), TagField.$8, "8", "marc.tf027.8.label.key", true ),} );
		
		case $028: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$028_a", DataFieldType.$028.getDisplayCode(), TagField.$a, "a", "marc.tf028.a.label.key", false ),
				new TagFieldTypeData("$028_b", DataFieldType.$028.getDisplayCode(), TagField.$b, "b", "marc.tf028.b.label.key", false ),
				new TagFieldTypeData("$028_q", DataFieldType.$028.getDisplayCode(), TagField.$q, "q", "marc.tf028.q.label.key", true ),
				new TagFieldTypeData("$028_6", DataFieldType.$028.getDisplayCode(), TagField.$6, "6", "marc.tf028.6.label.key", false ),
				new TagFieldTypeData("$028_8", DataFieldType.$028.getDisplayCode(), TagField.$8, "8", "marc.tf028.8.label.key", true ),} );
		
		case $030: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$030_a", DataFieldType.$030.getDisplayCode(), TagField.$a, "a", "marc.tf030.a.label.key", false ),
				new TagFieldTypeData("$030_z", DataFieldType.$030.getDisplayCode(), TagField.$z, "z", "marc.tf030.z.label.key", true ),
				new TagFieldTypeData("$030_6", DataFieldType.$030.getDisplayCode(), TagField.$6, "6", "marc.tf030.6.label.key", false ),
				new TagFieldTypeData("$030_8", DataFieldType.$030.getDisplayCode(), TagField.$8, "8", "marc.tf030.8.label.key", true ),} );
		
		case $031: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$031_a", DataFieldType.$031.getDisplayCode(), TagField.$a, "a", "marc.tf031.a.label.key", false ),
				new TagFieldTypeData("$031_b", DataFieldType.$031.getDisplayCode(), TagField.$b, "b", "marc.tf031.b.label.key", false ),
				new TagFieldTypeData("$031_c", DataFieldType.$031.getDisplayCode(), TagField.$c, "c", "marc.tf031.c.label.key", false ),
				new TagFieldTypeData("$031_d", DataFieldType.$031.getDisplayCode(), TagField.$d, "d", "marc.tf031.d.label.key", true ),
				new TagFieldTypeData("$031_e", DataFieldType.$031.getDisplayCode(), TagField.$e, "e", "marc.tf031.e.label.key", false ),
				new TagFieldTypeData("$031_g", DataFieldType.$031.getDisplayCode(), TagField.$g, "g", "marc.tf031.g.label.key", false ),
				new TagFieldTypeData("$031_m", DataFieldType.$031.getDisplayCode(), TagField.$m, "m", "marc.tf031.m.label.key", false ),
				new TagFieldTypeData("$031_n", DataFieldType.$031.getDisplayCode(), TagField.$n, "n", "marc.tf031.n.label.key", false ),
				new TagFieldTypeData("$031_o", DataFieldType.$031.getDisplayCode(), TagField.$o, "o", "marc.tf031.o.label.key", false ),
				new TagFieldTypeData("$031_p", DataFieldType.$031.getDisplayCode(), TagField.$p, "p", "marc.tf031.p.label.key", false ),
				new TagFieldTypeData("$031_q", DataFieldType.$031.getDisplayCode(), TagField.$q, "q", "marc.tf031.q.label.key", true ),
				new TagFieldTypeData("$031_r", DataFieldType.$031.getDisplayCode(), TagField.$r, "r", "marc.tf031.r.label.key", false ),
				new TagFieldTypeData("$031_s", DataFieldType.$031.getDisplayCode(), TagField.$s, "s", "marc.tf031.s.label.key", true ),
				new TagFieldTypeData("$031_t", DataFieldType.$031.getDisplayCode(), TagField.$t, "t", "marc.tf031.t.label.key", true ),
				new TagFieldTypeData("$031_u", DataFieldType.$031.getDisplayCode(), TagField.$u, "u", "marc.tf031.u.label.key", true ),
				new TagFieldTypeData("$031_y", DataFieldType.$031.getDisplayCode(), TagField.$y, "y", "marc.tf031.y.label.key", true ),
				new TagFieldTypeData("$031_z", DataFieldType.$031.getDisplayCode(), TagField.$z, "z", "marc.tf031.z.label.key", true ),
				new TagFieldTypeData("$031_2", DataFieldType.$031.getDisplayCode(), TagField.$2, "2", "marc.tf031.2.label.key", false ),
				new TagFieldTypeData("$031_6", DataFieldType.$031.getDisplayCode(), TagField.$6, "6", "marc.tf031.6.label.key", false ),
				new TagFieldTypeData("$031_8", DataFieldType.$031.getDisplayCode(), TagField.$8, "8", "marc.tf031.8.label.key", true ),} );
		
		case $032: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$032_a", DataFieldType.$032.getDisplayCode(), TagField.$a, "a", "marc.tf032.a.label.key", false ),
				new TagFieldTypeData("$032_b", DataFieldType.$032.getDisplayCode(), TagField.$b, "b", "marc.tf032.b.label.key", false ),
				new TagFieldTypeData("$032_6", DataFieldType.$032.getDisplayCode(), TagField.$6, "6", "marc.tf032.6.label.key", false ),
				new TagFieldTypeData("$032_8", DataFieldType.$032.getDisplayCode(), TagField.$8, "8", "marc.tf032.8.label.key", true ),} );
		
		case $033: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$033_a", DataFieldType.$033.getDisplayCode(), TagField.$a, "a", "marc.tf033.a.label.key", true ),
				new TagFieldTypeData("$033_b", DataFieldType.$033.getDisplayCode(), TagField.$b, "b", "marc.tf033.b.label.key", true ),
				new TagFieldTypeData("$033_c", DataFieldType.$033.getDisplayCode(), TagField.$c, "c", "marc.tf033.c.label.key", true ),
				new TagFieldTypeData("$033_p", DataFieldType.$033.getDisplayCode(), TagField.$p, "p", "marc.tf033.p.label.key", true ),
				new TagFieldTypeData("$033_0", DataFieldType.$033.getDisplayCode(), TagField.$0, "0", "marc.tf033.0.label.key", true ),
				new TagFieldTypeData("$033_1", DataFieldType.$033.getDisplayCode(), TagField.$1, "1", "marc.tf033.1.label.key", true ),
				new TagFieldTypeData("$033_2", DataFieldType.$033.getDisplayCode(), TagField.$2, "2", "marc.tf033.2.label.key", true ),
				new TagFieldTypeData("$033_3", DataFieldType.$033.getDisplayCode(), TagField.$3, "3", "marc.tf033.3.label.key", false ),
				new TagFieldTypeData("$033_6", DataFieldType.$033.getDisplayCode(), TagField.$6, "6", "marc.tf033.6.label.key", false ),
				new TagFieldTypeData("$033_8", DataFieldType.$033.getDisplayCode(), TagField.$8, "8", "marc.tf033.8.label.key", true ),} );
		
		case $034: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$034_a", DataFieldType.$034.getDisplayCode(), TagField.$a, "a", "marc.tf034.a.label.key", false ),
				new TagFieldTypeData("$034_b", DataFieldType.$034.getDisplayCode(), TagField.$b, "b", "marc.tf034.b.label.key", true ),
				new TagFieldTypeData("$034_c", DataFieldType.$034.getDisplayCode(), TagField.$c, "c", "marc.tf034.c.label.key", true ),
				new TagFieldTypeData("$034_d", DataFieldType.$034.getDisplayCode(), TagField.$d, "d", "marc.tf034.d.label.key", false ),
				new TagFieldTypeData("$034_e", DataFieldType.$034.getDisplayCode(), TagField.$e, "e", "marc.tf034.e.label.key", false ),
				new TagFieldTypeData("$034_f", DataFieldType.$034.getDisplayCode(), TagField.$f, "f", "marc.tf034.f.label.key", false ),
				new TagFieldTypeData("$034_g", DataFieldType.$034.getDisplayCode(), TagField.$g, "g", "marc.tf034.g.label.key", false ),
				new TagFieldTypeData("$034_h", DataFieldType.$034.getDisplayCode(), TagField.$h, "h", "marc.tf034.h.label.key", true ),
				new TagFieldTypeData("$034_j", DataFieldType.$034.getDisplayCode(), TagField.$j, "j", "marc.tf034.j.label.key", false ),
				new TagFieldTypeData("$034_k", DataFieldType.$034.getDisplayCode(), TagField.$k, "k", "marc.tf034.k.label.key", false ),
				new TagFieldTypeData("$034_m", DataFieldType.$034.getDisplayCode(), TagField.$m, "m", "marc.tf034.m.label.key", false ),
				new TagFieldTypeData("$034_n", DataFieldType.$034.getDisplayCode(), TagField.$n, "n", "marc.tf034.n.label.key", false ),
				new TagFieldTypeData("$034_p", DataFieldType.$034.getDisplayCode(), TagField.$p, "p", "marc.tf034.p.label.key", false ),
				new TagFieldTypeData("$034_r", DataFieldType.$034.getDisplayCode(), TagField.$r, "r", "marc.tf034.r.label.key", false ),
				new TagFieldTypeData("$034_s", DataFieldType.$034.getDisplayCode(), TagField.$s, "s", "marc.tf034.s.label.key", true ),
				new TagFieldTypeData("$034_t", DataFieldType.$034.getDisplayCode(), TagField.$t, "t", "marc.tf034.t.label.key", true ),
				new TagFieldTypeData("$034_x", DataFieldType.$034.getDisplayCode(), TagField.$x, "x", "marc.tf034.x.label.key", false ),
				new TagFieldTypeData("$034_y", DataFieldType.$034.getDisplayCode(), TagField.$y, "y", "marc.tf034.y.label.key", false ),
				new TagFieldTypeData("$034_z", DataFieldType.$034.getDisplayCode(), TagField.$z, "z", "marc.tf034.z.label.key", false ),
				new TagFieldTypeData("$034_0", DataFieldType.$034.getDisplayCode(), TagField.$0, "0", "marc.tf034.0.label.key", true ),
				new TagFieldTypeData("$034_1", DataFieldType.$034.getDisplayCode(), TagField.$1, "1", "marc.tf034.1.label.key", true ),
				new TagFieldTypeData("$034_2", DataFieldType.$034.getDisplayCode(), TagField.$2, "2", "marc.tf034.2.label.key", false ),
				new TagFieldTypeData("$034_3", DataFieldType.$034.getDisplayCode(), TagField.$3, "3", "marc.tf034.3.label.key", false ),
				new TagFieldTypeData("$034_6", DataFieldType.$034.getDisplayCode(), TagField.$6, "6", "marc.tf034.6.label.key", false ),
				new TagFieldTypeData("$034_8", DataFieldType.$034.getDisplayCode(), TagField.$8, "8", "marc.tf034.8.label.key", true ),} );
		
		case $035: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$035_a", DataFieldType.$035.getDisplayCode(), TagField.$a, "a", "marc.tf035.a.label.key", false ),
				new TagFieldTypeData("$035_z", DataFieldType.$035.getDisplayCode(), TagField.$z, "z", "marc.tf035.z.label.key", true ),
				new TagFieldTypeData("$035_6", DataFieldType.$035.getDisplayCode(), TagField.$6, "6", "marc.tf035.6.label.key", false ),
				new TagFieldTypeData("$035_8", DataFieldType.$035.getDisplayCode(), TagField.$8, "8", "marc.tf035.8.label.key", true ),} );
		
		case $036: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$036_a", DataFieldType.$036.getDisplayCode(), TagField.$a, "a", "marc.tf036.a.label.key", false ),
				new TagFieldTypeData("$036_b", DataFieldType.$036.getDisplayCode(), TagField.$b, "b", "marc.tf036.b.label.key", false ),
				new TagFieldTypeData("$036_6", DataFieldType.$036.getDisplayCode(), TagField.$6, "6", "marc.tf036.6.label.key", false ),
				new TagFieldTypeData("$036_8", DataFieldType.$036.getDisplayCode(), TagField.$8, "8", "marc.tf036.8.label.key", true ),} );
		
		case $037: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$037_a", DataFieldType.$037.getDisplayCode(), TagField.$a, "a", "marc.tf037.a.label.key", false ),
				new TagFieldTypeData("$037_b", DataFieldType.$037.getDisplayCode(), TagField.$b, "b", "marc.tf037.b.label.key", false ),
				new TagFieldTypeData("$037_c", DataFieldType.$037.getDisplayCode(), TagField.$c, "c", "marc.tf037.c.label.key", true ),
				new TagFieldTypeData("$037_f", DataFieldType.$037.getDisplayCode(), TagField.$f, "f", "marc.tf037.f.label.key", true ),
				new TagFieldTypeData("$037_g", DataFieldType.$037.getDisplayCode(), TagField.$g, "g", "marc.tf037.g.label.key", true ),
				new TagFieldTypeData("$037_n", DataFieldType.$037.getDisplayCode(), TagField.$n, "n", "marc.tf037.n.label.key", true ),
				new TagFieldTypeData("$037_3", DataFieldType.$037.getDisplayCode(), TagField.$3, "3", "marc.tf037.3.label.key", false ),
				new TagFieldTypeData("$037_5", DataFieldType.$037.getDisplayCode(), TagField.$5, "5", "marc.tf037.5.label.key", true ),
				new TagFieldTypeData("$037_6", DataFieldType.$037.getDisplayCode(), TagField.$6, "6", "marc.tf037.6.label.key", false ),
				new TagFieldTypeData("$037_8", DataFieldType.$037.getDisplayCode(), TagField.$8, "8", "marc.tf037.8.label.key", true ),} );
		
		case $038: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$038_a", DataFieldType.$038.getDisplayCode(), TagField.$a, "a", "marc.tf038.a.label.key", false ),
				new TagFieldTypeData("$038_6", DataFieldType.$038.getDisplayCode(), TagField.$6, "6", "marc.tf038.6.label.key", false ),
				new TagFieldTypeData("$038_8", DataFieldType.$038.getDisplayCode(), TagField.$8, "8", "marc.tf038.8.label.key", true ),} );
		
		case $040: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$040_a", DataFieldType.$040.getDisplayCode(), TagField.$a, "a", "marc.tf040.a.label.key", false ),
				new TagFieldTypeData("$040_b", DataFieldType.$040.getDisplayCode(), TagField.$b, "b", "marc.tf040.b.label.key", false ),
				new TagFieldTypeData("$040_c", DataFieldType.$040.getDisplayCode(), TagField.$c, "c", "marc.tf040.c.label.key", false ),
				new TagFieldTypeData("$040_d", DataFieldType.$040.getDisplayCode(), TagField.$d, "d", "marc.tf040.d.label.key", true ),
				new TagFieldTypeData("$040_e", DataFieldType.$040.getDisplayCode(), TagField.$e, "e", "marc.tf040.e.label.key", true ),
				new TagFieldTypeData("$040_6", DataFieldType.$040.getDisplayCode(), TagField.$6, "6", "marc.tf040.6.label.key", false ),
				new TagFieldTypeData("$040_8", DataFieldType.$040.getDisplayCode(), TagField.$8, "8", "marc.tf040.8.label.key", true ),} );
		
		case $041: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$041_a", DataFieldType.$041.getDisplayCode(), TagField.$a, "a", "marc.tf041.a.label.key", true ),
				new TagFieldTypeData("$041_b", DataFieldType.$041.getDisplayCode(), TagField.$b, "b", "marc.tf041.b.label.key", true ),
				new TagFieldTypeData("$041_d", DataFieldType.$041.getDisplayCode(), TagField.$d, "d", "marc.tf041.d.label.key", true ),
				new TagFieldTypeData("$041_e", DataFieldType.$041.getDisplayCode(), TagField.$e, "e", "marc.tf041.e.label.key", true ),
				new TagFieldTypeData("$041_f", DataFieldType.$041.getDisplayCode(), TagField.$f, "f", "marc.tf041.f.label.key", true ),
				new TagFieldTypeData("$041_g", DataFieldType.$041.getDisplayCode(), TagField.$g, "g", "marc.tf041.g.label.key", true ),
				new TagFieldTypeData("$041_h", DataFieldType.$041.getDisplayCode(), TagField.$h, "h", "marc.tf041.h.label.key", true ),
				new TagFieldTypeData("$041_i", DataFieldType.$041.getDisplayCode(), TagField.$i, "i", "marc.tf041.i.label.key", true ),
				new TagFieldTypeData("$041_j", DataFieldType.$041.getDisplayCode(), TagField.$j, "j", "marc.tf041.j.label.key", true ),
				new TagFieldTypeData("$041_k", DataFieldType.$041.getDisplayCode(), TagField.$k, "k", "marc.tf041.k.label.key", true ),
				new TagFieldTypeData("$041_m", DataFieldType.$041.getDisplayCode(), TagField.$m, "m", "marc.tf041.m.label.key", true ),
				new TagFieldTypeData("$041_n", DataFieldType.$041.getDisplayCode(), TagField.$n, "n", "marc.tf041.n.label.key", true ),
				new TagFieldTypeData("$041_p", DataFieldType.$041.getDisplayCode(), TagField.$p, "p", "marc.tf041.p.label.key", true ),
				new TagFieldTypeData("$041_q", DataFieldType.$041.getDisplayCode(), TagField.$q, "q", "marc.tf041.q.label.key", true ),
				new TagFieldTypeData("$041_r", DataFieldType.$041.getDisplayCode(), TagField.$r, "r", "marc.tf041.r.label.key", true ),
				new TagFieldTypeData("$041_t", DataFieldType.$041.getDisplayCode(), TagField.$t, "t", "marc.tf041.t.label.key", true ),
				new TagFieldTypeData("$041_2", DataFieldType.$041.getDisplayCode(), TagField.$2, "2", "marc.tf041.2.label.key", false ),
				new TagFieldTypeData("$041_3", DataFieldType.$041.getDisplayCode(), TagField.$3, "3", "marc.tf041.3.label.key", false ),
				new TagFieldTypeData("$041_6", DataFieldType.$041.getDisplayCode(), TagField.$6, "6", "marc.tf041.6.label.key", false ),
				new TagFieldTypeData("$041_7", DataFieldType.$041.getDisplayCode(), TagField.$7, "7", "marc.tf041.7.label.key", true ),
				new TagFieldTypeData("$041_8", DataFieldType.$041.getDisplayCode(), TagField.$8, "8", "marc.tf041.8.label.key", true ),} );
		
		case $042: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$042_a", DataFieldType.$042.getDisplayCode(), TagField.$a, "a", "marc.tf042.a.label.key", true ),} );
		
		case $043: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$043_a", DataFieldType.$043.getDisplayCode(), TagField.$a, "a", "marc.tf043.a.label.key", true ),
				new TagFieldTypeData("$043_b", DataFieldType.$043.getDisplayCode(), TagField.$b, "b", "marc.tf043.b.label.key", true ),
				new TagFieldTypeData("$043_c", DataFieldType.$043.getDisplayCode(), TagField.$c, "c", "marc.tf043.c.label.key", true ),
				new TagFieldTypeData("$043_0", DataFieldType.$043.getDisplayCode(), TagField.$0, "0", "marc.tf043.0.label.key", true ),
				new TagFieldTypeData("$043_1", DataFieldType.$043.getDisplayCode(), TagField.$1, "1", "marc.tf043.1.label.key", true ),
				new TagFieldTypeData("$043_2", DataFieldType.$043.getDisplayCode(), TagField.$2, "2", "marc.tf043.2.label.key", true ),
				new TagFieldTypeData("$043_6", DataFieldType.$043.getDisplayCode(), TagField.$6, "6", "marc.tf043.6.label.key", false ),
				new TagFieldTypeData("$043_8", DataFieldType.$043.getDisplayCode(), TagField.$8, "8", "marc.tf043.8.label.key", true ),} );
		
		case $044: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$044_a", DataFieldType.$044.getDisplayCode(), TagField.$a, "a", "marc.tf044.a.label.key", true ),
				new TagFieldTypeData("$044_b", DataFieldType.$044.getDisplayCode(), TagField.$b, "b", "marc.tf044.b.label.key", true ),
				new TagFieldTypeData("$044_c", DataFieldType.$044.getDisplayCode(), TagField.$c, "c", "marc.tf044.c.label.key", true ),
				new TagFieldTypeData("$044_2", DataFieldType.$044.getDisplayCode(), TagField.$2, "2", "marc.tf044.2.label.key", true ),
				new TagFieldTypeData("$044_6", DataFieldType.$044.getDisplayCode(), TagField.$6, "6", "marc.tf044.6.label.key", false ),
				new TagFieldTypeData("$044_8", DataFieldType.$044.getDisplayCode(), TagField.$8, "8", "marc.tf044.8.label.key", true ),} );
		
		case $045: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$045_a", DataFieldType.$045.getDisplayCode(), TagField.$a, "a", "marc.tf045.a.label.key", true ),
				new TagFieldTypeData("$045_b", DataFieldType.$045.getDisplayCode(), TagField.$b, "b", "marc.tf045.b.label.key", true ),
				new TagFieldTypeData("$045_c", DataFieldType.$045.getDisplayCode(), TagField.$c, "c", "marc.tf045.c.label.key", true ),
				new TagFieldTypeData("$045_6", DataFieldType.$045.getDisplayCode(), TagField.$6, "6", "marc.tf045.6.label.key", false ),
				new TagFieldTypeData("$045_8", DataFieldType.$045.getDisplayCode(), TagField.$8, "8", "marc.tf045.8.label.key", true ),} );
		
		case $046: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$046_a", DataFieldType.$046.getDisplayCode(), TagField.$a, "a", "marc.tf046.a.label.key", false ),
				new TagFieldTypeData("$046_b", DataFieldType.$046.getDisplayCode(), TagField.$b, "b", "marc.tf046.b.label.key", false ),
				new TagFieldTypeData("$046_c", DataFieldType.$046.getDisplayCode(), TagField.$c, "c", "marc.tf046.c.label.key", false ),
				new TagFieldTypeData("$046_d", DataFieldType.$046.getDisplayCode(), TagField.$d, "d", "marc.tf046.d.label.key", false ),
				new TagFieldTypeData("$046_e", DataFieldType.$046.getDisplayCode(), TagField.$e, "e", "marc.tf046.e.label.key", false ),
				new TagFieldTypeData("$046_j", DataFieldType.$046.getDisplayCode(), TagField.$j, "j", "marc.tf046.j.label.key", false ),
				new TagFieldTypeData("$046_k", DataFieldType.$046.getDisplayCode(), TagField.$k, "k", "marc.tf046.k.label.key", false ),
				new TagFieldTypeData("$046_l", DataFieldType.$046.getDisplayCode(), TagField.$l, "l", "marc.tf046.l.label.key", false ),
				new TagFieldTypeData("$046_m", DataFieldType.$046.getDisplayCode(), TagField.$m, "m", "marc.tf046.m.label.key", false ),
				new TagFieldTypeData("$046_n", DataFieldType.$046.getDisplayCode(), TagField.$n, "n", "marc.tf046.n.label.key", false ),
				new TagFieldTypeData("$046_o", DataFieldType.$046.getDisplayCode(), TagField.$o, "o", "marc.tf046.o.label.key", false ),
				new TagFieldTypeData("$046_p", DataFieldType.$046.getDisplayCode(), TagField.$p, "p", "marc.tf046.p.label.key", false ),
				new TagFieldTypeData("$046_x", DataFieldType.$046.getDisplayCode(), TagField.$x, "x", "marc.tf046.x.label.key", true ),
				new TagFieldTypeData("$046_z", DataFieldType.$046.getDisplayCode(), TagField.$z, "z", "marc.tf046.z.label.key", true ),
				new TagFieldTypeData("$046_2", DataFieldType.$046.getDisplayCode(), TagField.$2, "2", "marc.tf046.2.label.key", false ),
				new TagFieldTypeData("$046_3", DataFieldType.$046.getDisplayCode(), TagField.$3, "3", "marc.tf046.3.label.key", false ),
				new TagFieldTypeData("$046_6", DataFieldType.$046.getDisplayCode(), TagField.$6, "6", "marc.tf046.6.label.key", false ),
				new TagFieldTypeData("$046_8", DataFieldType.$046.getDisplayCode(), TagField.$8, "8", "marc.tf046.8.label.key", true ),} );
		
		case $047: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$047_a", DataFieldType.$047.getDisplayCode(), TagField.$a, "a", "marc.tf047.a.label.key", true ),
				new TagFieldTypeData("$047_2", DataFieldType.$047.getDisplayCode(), TagField.$2, "2", "marc.tf047.2.label.key", false ),
				new TagFieldTypeData("$047_8", DataFieldType.$047.getDisplayCode(), TagField.$8, "8", "marc.tf047.8.label.key", true ),} );
		
		case $048: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$048_a", DataFieldType.$048.getDisplayCode(), TagField.$a, "a", "marc.tf048.a.label.key", true ),
				new TagFieldTypeData("$048_b", DataFieldType.$048.getDisplayCode(), TagField.$b, "b", "marc.tf048.b.label.key", true ),
				new TagFieldTypeData("$048_2", DataFieldType.$048.getDisplayCode(), TagField.$2, "2", "marc.tf048.2.label.key", false ),
				new TagFieldTypeData("$048_8", DataFieldType.$048.getDisplayCode(), TagField.$8, "8", "marc.tf048.8.label.key", true ),} );
		
		case $050: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$050_a", DataFieldType.$050.getDisplayCode(), TagField.$a, "a", "marc.tf050.a.label.key", true ),
				new TagFieldTypeData("$050_b", DataFieldType.$050.getDisplayCode(), TagField.$b, "b", "marc.tf050.b.label.key", false ),
				new TagFieldTypeData("$050_0", DataFieldType.$050.getDisplayCode(), TagField.$0, "0", "marc.tf050.0.label.key", true ),
				new TagFieldTypeData("$050_1", DataFieldType.$050.getDisplayCode(), TagField.$1, "1", "marc.tf050.1.label.key", true ),
				new TagFieldTypeData("$050_3", DataFieldType.$050.getDisplayCode(), TagField.$3, "3", "marc.tf050.3.label.key", false ),
				new TagFieldTypeData("$050_6", DataFieldType.$050.getDisplayCode(), TagField.$6, "6", "marc.tf050.6.label.key", false ),
				new TagFieldTypeData("$050_8", DataFieldType.$050.getDisplayCode(), TagField.$8, "8", "marc.tf050.8.label.key", true ),} );
		
		case $051: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$051_a", DataFieldType.$051.getDisplayCode(), TagField.$a, "a", "marc.tf051.a.label.key", false ),
				new TagFieldTypeData("$051_b", DataFieldType.$051.getDisplayCode(), TagField.$b, "b", "marc.tf051.b.label.key", false ),
				new TagFieldTypeData("$051_c", DataFieldType.$051.getDisplayCode(), TagField.$c, "c", "marc.tf051.c.label.key", false ),
				new TagFieldTypeData("$051_8", DataFieldType.$051.getDisplayCode(), TagField.$8, "8", "marc.tf051.8.label.key", true ),} );
		
		case $052: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$052_a", DataFieldType.$052.getDisplayCode(), TagField.$a, "a", "marc.tf052.a.label.key", false ),
				new TagFieldTypeData("$052_b", DataFieldType.$052.getDisplayCode(), TagField.$b, "b", "marc.tf052.b.label.key", true ),
				new TagFieldTypeData("$052_d", DataFieldType.$052.getDisplayCode(), TagField.$d, "d", "marc.tf052.d.label.key", true ),
				new TagFieldTypeData("$052_0", DataFieldType.$052.getDisplayCode(), TagField.$0, "0", "marc.tf052.0.label.key", true ),
				new TagFieldTypeData("$052_1", DataFieldType.$052.getDisplayCode(), TagField.$1, "1", "marc.tf052.1.label.key", true ),
				new TagFieldTypeData("$052_2", DataFieldType.$052.getDisplayCode(), TagField.$2, "2", "marc.tf052.2.label.key", false ),
				new TagFieldTypeData("$052_6", DataFieldType.$052.getDisplayCode(), TagField.$6, "6", "marc.tf052.6.label.key", false ),
				new TagFieldTypeData("$052_8", DataFieldType.$052.getDisplayCode(), TagField.$8, "8", "marc.tf052.8.label.key", true ),} );
		
		case $055: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$055_a", DataFieldType.$055.getDisplayCode(), TagField.$a, "a", "marc.tf055.a.label.key", false ),
				new TagFieldTypeData("$055_b", DataFieldType.$055.getDisplayCode(), TagField.$b, "b", "marc.tf055.b.label.key", false ),
				new TagFieldTypeData("$055_0", DataFieldType.$055.getDisplayCode(), TagField.$0, "0", "marc.tf055.0.label.key", true ),
				new TagFieldTypeData("$055_1", DataFieldType.$055.getDisplayCode(), TagField.$1, "1", "marc.tf055.1.label.key", true ),
				new TagFieldTypeData("$055_2", DataFieldType.$055.getDisplayCode(), TagField.$2, "2", "marc.tf055.2.label.key", false ),
				new TagFieldTypeData("$055_6", DataFieldType.$055.getDisplayCode(), TagField.$6, "6", "marc.tf055.6.label.key", false ),
				new TagFieldTypeData("$055_8", DataFieldType.$055.getDisplayCode(), TagField.$8, "8", "marc.tf055.8.label.key", true ),} );
		
		case $060: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$060_a", DataFieldType.$060.getDisplayCode(), TagField.$a, "a", "marc.tf060.a.label.key", true ),
				new TagFieldTypeData("$060_b", DataFieldType.$060.getDisplayCode(), TagField.$b, "b", "marc.tf060.b.label.key", false ),
				new TagFieldTypeData("$060_0", DataFieldType.$060.getDisplayCode(), TagField.$0, "0", "marc.tf060.0.label.key", true ),
				new TagFieldTypeData("$060_1", DataFieldType.$060.getDisplayCode(), TagField.$1, "1", "marc.tf060.1.label.key", true ),
				new TagFieldTypeData("$060_8", DataFieldType.$060.getDisplayCode(), TagField.$8, "8", "marc.tf060.8.label.key", true ),} );
		
		case $061: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$061_a", DataFieldType.$061.getDisplayCode(), TagField.$a, "a", "marc.tf061.a.label.key", true ),
				new TagFieldTypeData("$061_b", DataFieldType.$061.getDisplayCode(), TagField.$b, "b", "marc.tf061.b.label.key", false ),
				new TagFieldTypeData("$061_c", DataFieldType.$061.getDisplayCode(), TagField.$c, "c", "marc.tf061.c.label.key", false ),
				new TagFieldTypeData("$061_8", DataFieldType.$061.getDisplayCode(), TagField.$8, "8", "marc.tf061.8.label.key", true ),} );
		
		case $066: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$066_a", DataFieldType.$066.getDisplayCode(), TagField.$a, "a", "marc.tf066.a.label.key", false ),
				new TagFieldTypeData("$066_b", DataFieldType.$066.getDisplayCode(), TagField.$b, "b", "marc.tf066.b.label.key", false ),
				new TagFieldTypeData("$066_c", DataFieldType.$066.getDisplayCode(), TagField.$c, "c", "marc.tf066.c.label.key", true ),} );
		
		case $070: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$070_a", DataFieldType.$070.getDisplayCode(), TagField.$a, "a", "marc.tf070.a.label.key", true ),
				new TagFieldTypeData("$070_b", DataFieldType.$070.getDisplayCode(), TagField.$b, "b", "marc.tf070.b.label.key", false ),
				new TagFieldTypeData("$070_0", DataFieldType.$070.getDisplayCode(), TagField.$0, "0", "marc.tf070.0.label.key", true ),
				new TagFieldTypeData("$070_1", DataFieldType.$070.getDisplayCode(), TagField.$1, "1", "marc.tf070.1.label.key", true ),
				new TagFieldTypeData("$070_8", DataFieldType.$070.getDisplayCode(), TagField.$8, "8", "marc.tf070.8.label.key", true ),} );
		
		case $071: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$071_a", DataFieldType.$071.getDisplayCode(), TagField.$a, "a", "marc.tf071.a.label.key", true ),
				new TagFieldTypeData("$071_b", DataFieldType.$071.getDisplayCode(), TagField.$b, "b", "marc.tf071.b.label.key", false ),
				new TagFieldTypeData("$071_c", DataFieldType.$071.getDisplayCode(), TagField.$c, "c", "marc.tf071.c.label.key", true ),
				new TagFieldTypeData("$071_8", DataFieldType.$071.getDisplayCode(), TagField.$8, "8", "marc.tf071.8.label.key", true ),} );
		
		case $072: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$072_a", DataFieldType.$072.getDisplayCode(), TagField.$a, "a", "marc.tf072.a.label.key", false ),
				new TagFieldTypeData("$072_x", DataFieldType.$072.getDisplayCode(), TagField.$x, "x", "marc.tf072.x.label.key", true ),
				new TagFieldTypeData("$072_2", DataFieldType.$072.getDisplayCode(), TagField.$2, "2", "marc.tf072.2.label.key", false ),
				new TagFieldTypeData("$072_6", DataFieldType.$072.getDisplayCode(), TagField.$6, "6", "marc.tf072.6.label.key", false ),
				new TagFieldTypeData("$072_8", DataFieldType.$072.getDisplayCode(), TagField.$8, "8", "marc.tf072.8.label.key", true ),} );
		
		case $074: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$074_a", DataFieldType.$074.getDisplayCode(), TagField.$a, "a", "marc.tf074.a.label.key", false ),
				new TagFieldTypeData("$074_z", DataFieldType.$074.getDisplayCode(), TagField.$z, "z", "marc.tf074.z.label.key", true ),
				new TagFieldTypeData("$074_8", DataFieldType.$074.getDisplayCode(), TagField.$8, "8", "marc.tf074.8.label.key", true ),} );
		
		case $080: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$080_a", DataFieldType.$080.getDisplayCode(), TagField.$a, "a", "marc.tf080.a.label.key", false ),
				new TagFieldTypeData("$080_b", DataFieldType.$080.getDisplayCode(), TagField.$b, "b", "marc.tf080.b.label.key", false ),
				new TagFieldTypeData("$080_x", DataFieldType.$080.getDisplayCode(), TagField.$x, "x", "marc.tf080.x.label.key", true ),
				new TagFieldTypeData("$080_0", DataFieldType.$080.getDisplayCode(), TagField.$0, "0", "marc.tf080.0.label.key", true ),
				new TagFieldTypeData("$080_1", DataFieldType.$080.getDisplayCode(), TagField.$1, "1", "marc.tf080.1.label.key", true ),
				new TagFieldTypeData("$080_2", DataFieldType.$080.getDisplayCode(), TagField.$2, "2", "marc.tf080.2.label.key", false ),
				new TagFieldTypeData("$080_6", DataFieldType.$080.getDisplayCode(), TagField.$6, "6", "marc.tf080.6.label.key", false ),
				new TagFieldTypeData("$080_8", DataFieldType.$080.getDisplayCode(), TagField.$8, "8", "marc.tf080.8.label.key", true ),} );
		
		case $082: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$082_a", DataFieldType.$082.getDisplayCode(), TagField.$a, "a", "marc.tf082.a.label.key", true ),
				new TagFieldTypeData("$082_b", DataFieldType.$082.getDisplayCode(), TagField.$b, "b", "marc.tf082.b.label.key", false ),
				new TagFieldTypeData("$082_m", DataFieldType.$082.getDisplayCode(), TagField.$m, "m", "marc.tf082.m.label.key", false ),
				new TagFieldTypeData("$082_q", DataFieldType.$082.getDisplayCode(), TagField.$q, "q", "marc.tf082.q.label.key", false ),
				new TagFieldTypeData("$082_0", DataFieldType.$082.getDisplayCode(), TagField.$0, "0", "marc.tf082.0.label.key", true ),
				new TagFieldTypeData("$082_1", DataFieldType.$082.getDisplayCode(), TagField.$1, "1", "marc.tf082.1.label.key", true ),
				new TagFieldTypeData("$082_2", DataFieldType.$082.getDisplayCode(), TagField.$2, "2", "marc.tf082.2.label.key", false ),
				new TagFieldTypeData("$082_6", DataFieldType.$082.getDisplayCode(), TagField.$6, "6", "marc.tf082.6.label.key", false ),
				new TagFieldTypeData("$082_7", DataFieldType.$082.getDisplayCode(), TagField.$7, "7", "marc.tf082.7.label.key", true ),
				new TagFieldTypeData("$082_8", DataFieldType.$082.getDisplayCode(), TagField.$8, "8", "marc.tf082.8.label.key", true ),} );
		
		case $083: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$083_a", DataFieldType.$083.getDisplayCode(), TagField.$a, "a", "marc.tf083.a.label.key", true ),
				new TagFieldTypeData("$083_c", DataFieldType.$083.getDisplayCode(), TagField.$c, "c", "marc.tf083.c.label.key", true ),
				new TagFieldTypeData("$083_m", DataFieldType.$083.getDisplayCode(), TagField.$m, "m", "marc.tf083.m.label.key", false ),
				new TagFieldTypeData("$083_q", DataFieldType.$083.getDisplayCode(), TagField.$q, "q", "marc.tf083.q.label.key", false ),
				new TagFieldTypeData("$083_y", DataFieldType.$083.getDisplayCode(), TagField.$y, "y", "marc.tf083.y.label.key", true ),
				new TagFieldTypeData("$083_z", DataFieldType.$083.getDisplayCode(), TagField.$z, "z", "marc.tf083.z.label.key", true ),
				new TagFieldTypeData("$083_0", DataFieldType.$083.getDisplayCode(), TagField.$0, "0", "marc.tf083.0.label.key", true ),
				new TagFieldTypeData("$083_1", DataFieldType.$083.getDisplayCode(), TagField.$1, "1", "marc.tf083.1.label.key", true ),
				new TagFieldTypeData("$083_2", DataFieldType.$083.getDisplayCode(), TagField.$2, "2", "marc.tf083.2.label.key", false ),
				new TagFieldTypeData("$083_6", DataFieldType.$083.getDisplayCode(), TagField.$6, "6", "marc.tf083.6.label.key", false ),
				new TagFieldTypeData("$083_7", DataFieldType.$083.getDisplayCode(), TagField.$7, "7", "marc.tf083.7.label.key", true ),
				new TagFieldTypeData("$083_8", DataFieldType.$083.getDisplayCode(), TagField.$8, "8", "marc.tf083.8.label.key", true ),} );
		
		case $084: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$084_a", DataFieldType.$084.getDisplayCode(), TagField.$a, "a", "marc.tf084.a.label.key", true ),
				new TagFieldTypeData("$084_b", DataFieldType.$084.getDisplayCode(), TagField.$b, "b", "marc.tf084.b.label.key", false ),
				new TagFieldTypeData("$084_q", DataFieldType.$084.getDisplayCode(), TagField.$q, "q", "marc.tf084.q.label.key", false ),
				new TagFieldTypeData("$084_0", DataFieldType.$084.getDisplayCode(), TagField.$0, "0", "marc.tf084.0.label.key", true ),
				new TagFieldTypeData("$084_1", DataFieldType.$084.getDisplayCode(), TagField.$1, "1", "marc.tf084.1.label.key", true ),
				new TagFieldTypeData("$084_2", DataFieldType.$084.getDisplayCode(), TagField.$2, "2", "marc.tf084.2.label.key", false ),
				new TagFieldTypeData("$084_6", DataFieldType.$084.getDisplayCode(), TagField.$6, "6", "marc.tf084.6.label.key", false ),
				new TagFieldTypeData("$084_7", DataFieldType.$084.getDisplayCode(), TagField.$7, "7", "marc.tf084.7.label.key", true ),
				new TagFieldTypeData("$084_8", DataFieldType.$084.getDisplayCode(), TagField.$8, "8", "marc.tf084.8.label.key", true ),} );
		
		case $085: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$085_a", DataFieldType.$085.getDisplayCode(), TagField.$a, "a", "marc.tf085.a.label.key", true ),
				new TagFieldTypeData("$085_b", DataFieldType.$085.getDisplayCode(), TagField.$b, "b", "marc.tf085.b.label.key", true ),
				new TagFieldTypeData("$085_c", DataFieldType.$085.getDisplayCode(), TagField.$c, "c", "marc.tf085.c.label.key", true ),
				new TagFieldTypeData("$085_f", DataFieldType.$085.getDisplayCode(), TagField.$f, "f", "marc.tf085.f.label.key", true ),
				new TagFieldTypeData("$085_r", DataFieldType.$085.getDisplayCode(), TagField.$r, "r", "marc.tf085.r.label.key", true ),
				new TagFieldTypeData("$085_s", DataFieldType.$085.getDisplayCode(), TagField.$s, "s", "marc.tf085.s.label.key", true ),
				new TagFieldTypeData("$085_t", DataFieldType.$085.getDisplayCode(), TagField.$t, "t", "marc.tf085.t.label.key", true ),
				new TagFieldTypeData("$085_u", DataFieldType.$085.getDisplayCode(), TagField.$u, "u", "marc.tf085.u.label.key", true ),
				new TagFieldTypeData("$085_v", DataFieldType.$085.getDisplayCode(), TagField.$v, "v", "marc.tf085.v.label.key", true ),
				new TagFieldTypeData("$085_w", DataFieldType.$085.getDisplayCode(), TagField.$w, "w", "marc.tf085.w.label.key", true ),
				new TagFieldTypeData("$085_y", DataFieldType.$085.getDisplayCode(), TagField.$y, "y", "marc.tf085.y.label.key", true ),
				new TagFieldTypeData("$085_z", DataFieldType.$085.getDisplayCode(), TagField.$z, "z", "marc.tf085.z.label.key", true ),
				new TagFieldTypeData("$085_0", DataFieldType.$085.getDisplayCode(), TagField.$0, "0", "marc.tf085.0.label.key", true ),
				new TagFieldTypeData("$085_1", DataFieldType.$085.getDisplayCode(), TagField.$1, "1", "marc.tf085.1.label.key", true ),
				new TagFieldTypeData("$085_6", DataFieldType.$085.getDisplayCode(), TagField.$6, "6", "marc.tf085.6.label.key", false ),
				new TagFieldTypeData("$085_8", DataFieldType.$085.getDisplayCode(), TagField.$8, "8", "marc.tf085.8.label.key", true ),} );
		
		case $086: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$086_a", DataFieldType.$086.getDisplayCode(), TagField.$a, "a", "marc.tf086.a.label.key", false ),
				new TagFieldTypeData("$086_z", DataFieldType.$086.getDisplayCode(), TagField.$z, "z", "marc.tf086.z.label.key", true ),
				new TagFieldTypeData("$086_0", DataFieldType.$086.getDisplayCode(), TagField.$0, "0", "marc.tf086.0.label.key", true ),
				new TagFieldTypeData("$086_1", DataFieldType.$086.getDisplayCode(), TagField.$1, "1", "marc.tf086.1.label.key", true ),
				new TagFieldTypeData("$086_2", DataFieldType.$086.getDisplayCode(), TagField.$2, "2", "marc.tf086.2.label.key", false ),
				new TagFieldTypeData("$086_6", DataFieldType.$086.getDisplayCode(), TagField.$6, "6", "marc.tf086.6.label.key", false ),
				new TagFieldTypeData("$086_8", DataFieldType.$086.getDisplayCode(), TagField.$8, "8", "marc.tf086.8.label.key", true ),} );
		
		case $088: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$088_a", DataFieldType.$088.getDisplayCode(), TagField.$a, "a", "marc.tf088.a.label.key", false ),
				new TagFieldTypeData("$088_z", DataFieldType.$088.getDisplayCode(), TagField.$z, "z", "marc.tf088.z.label.key", true ),
				new TagFieldTypeData("$088_6", DataFieldType.$088.getDisplayCode(), TagField.$6, "6", "marc.tf088.6.label.key", false ),
				new TagFieldTypeData("$088_8", DataFieldType.$088.getDisplayCode(), TagField.$8, "8", "marc.tf088.8.label.key", true ),} );
		
		//case $09X: return Arrays.asList( new TagFieldTypeData[] {} );
		
		case $100: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$100_a", DataFieldType.$100.getDisplayCode(), TagField.$a, "a", "marc.tf100.a.label.key", false ),
				new TagFieldTypeData("$100_b", DataFieldType.$100.getDisplayCode(), TagField.$b, "b", "marc.tf100.b.label.key", false ),
				new TagFieldTypeData("$100_c", DataFieldType.$100.getDisplayCode(), TagField.$c, "c", "marc.tf100.c.label.key", true ),
				new TagFieldTypeData("$100_d", DataFieldType.$100.getDisplayCode(), TagField.$d, "d", "marc.tf100.d.label.key", false ),
				new TagFieldTypeData("$100_e", DataFieldType.$100.getDisplayCode(), TagField.$e, "e", "marc.tf100.e.label.key", true ),
				new TagFieldTypeData("$100_f", DataFieldType.$100.getDisplayCode(), TagField.$f, "f", "marc.tf100.f.label.key", false ),
				new TagFieldTypeData("$100_g", DataFieldType.$100.getDisplayCode(), TagField.$g, "g", "marc.tf100.g.label.key", true ),
				new TagFieldTypeData("$100_j", DataFieldType.$100.getDisplayCode(), TagField.$j, "j", "marc.tf100.j.label.key", true ),
				new TagFieldTypeData("$100_k", DataFieldType.$100.getDisplayCode(), TagField.$k, "k", "marc.tf100.k.label.key", true ),
				new TagFieldTypeData("$100_l", DataFieldType.$100.getDisplayCode(), TagField.$l, "l", "marc.tf100.l.label.key", false ),
				new TagFieldTypeData("$100_n", DataFieldType.$100.getDisplayCode(), TagField.$n, "n", "marc.tf100.n.label.key", true ),
				new TagFieldTypeData("$100_p", DataFieldType.$100.getDisplayCode(), TagField.$p, "p", "marc.tf100.p.label.key", true ),
				new TagFieldTypeData("$100_q", DataFieldType.$100.getDisplayCode(), TagField.$q, "q", "marc.tf100.q.label.key", false ),
				new TagFieldTypeData("$100_t", DataFieldType.$100.getDisplayCode(), TagField.$t, "t", "marc.tf100.t.label.key", false ),
				new TagFieldTypeData("$100_u", DataFieldType.$100.getDisplayCode(), TagField.$u, "u", "marc.tf100.u.label.key", false ),
				new TagFieldTypeData("$100_0", DataFieldType.$100.getDisplayCode(), TagField.$0, "0", "marc.tf100.0.label.key", true ),
				new TagFieldTypeData("$100_1", DataFieldType.$100.getDisplayCode(), TagField.$1, "1", "marc.tf100.1.label.key", true ),
				new TagFieldTypeData("$100_2", DataFieldType.$100.getDisplayCode(), TagField.$2, "2", "marc.tf100.2.label.key", false ),
				new TagFieldTypeData("$100_4", DataFieldType.$100.getDisplayCode(), TagField.$4, "4", "marc.tf100.4.label.key", true ),
				new TagFieldTypeData("$100_6", DataFieldType.$100.getDisplayCode(), TagField.$6, "6", "marc.tf100.6.label.key", false ),
				new TagFieldTypeData("$100_7", DataFieldType.$100.getDisplayCode(), TagField.$7, "7", "marc.tf100.7.label.key", true ),
				new TagFieldTypeData("$100_8", DataFieldType.$100.getDisplayCode(), TagField.$8, "8", "marc.tf100.8.label.key", true ),} );
		
		case $110: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$110_a", DataFieldType.$110.getDisplayCode(), TagField.$a, "a", "marc.tf110.a.label.key", false ),
				new TagFieldTypeData("$110_b", DataFieldType.$110.getDisplayCode(), TagField.$b, "b", "marc.tf110.b.label.key", true ),
				new TagFieldTypeData("$110_c", DataFieldType.$110.getDisplayCode(), TagField.$c, "c", "marc.tf110.c.label.key", true ),
				new TagFieldTypeData("$110_d", DataFieldType.$110.getDisplayCode(), TagField.$d, "d", "marc.tf110.d.label.key", true ),
				new TagFieldTypeData("$110_e", DataFieldType.$110.getDisplayCode(), TagField.$e, "e", "marc.tf110.e.label.key", true ),
				new TagFieldTypeData("$110_f", DataFieldType.$110.getDisplayCode(), TagField.$f, "f", "marc.tf110.f.label.key", false ),
				new TagFieldTypeData("$110_g", DataFieldType.$110.getDisplayCode(), TagField.$g, "g", "marc.tf110.g.label.key", true ),
				new TagFieldTypeData("$110_k", DataFieldType.$110.getDisplayCode(), TagField.$k, "k", "marc.tf110.k.label.key", true ),
				new TagFieldTypeData("$110_l", DataFieldType.$110.getDisplayCode(), TagField.$l, "l", "marc.tf110.l.label.key", false ),
				new TagFieldTypeData("$110_n", DataFieldType.$110.getDisplayCode(), TagField.$n, "n", "marc.tf110.n.label.key", true ),
				new TagFieldTypeData("$110_p", DataFieldType.$110.getDisplayCode(), TagField.$p, "p", "marc.tf110.p.label.key", true ),
				new TagFieldTypeData("$110_t", DataFieldType.$110.getDisplayCode(), TagField.$t, "t", "marc.tf110.t.label.key", false ),
				new TagFieldTypeData("$110_u", DataFieldType.$110.getDisplayCode(), TagField.$u, "u", "marc.tf110.u.label.key", false ),
				new TagFieldTypeData("$110_0", DataFieldType.$110.getDisplayCode(), TagField.$0, "0", "marc.tf110.0.label.key", true ),
				new TagFieldTypeData("$110_1", DataFieldType.$110.getDisplayCode(), TagField.$1, "1", "marc.tf110.1.label.key", true ),
				new TagFieldTypeData("$110_2", DataFieldType.$110.getDisplayCode(), TagField.$2, "2", "marc.tf110.2.label.key", false ),
				new TagFieldTypeData("$110_4", DataFieldType.$110.getDisplayCode(), TagField.$4, "4", "marc.tf110.4.label.key", true ),
				new TagFieldTypeData("$110_6", DataFieldType.$110.getDisplayCode(), TagField.$6, "6", "marc.tf110.6.label.key", false ),
				new TagFieldTypeData("$110_7", DataFieldType.$110.getDisplayCode(), TagField.$7, "7", "marc.tf110.7.label.key", true ),
				new TagFieldTypeData("$110_8", DataFieldType.$110.getDisplayCode(), TagField.$8, "8", "marc.tf110.8.label.key", true ),} );
		
		case $111: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$111_a", DataFieldType.$111.getDisplayCode(), TagField.$a, "a", "marc.tf111.a.label.key", false ),
				new TagFieldTypeData("$111_c", DataFieldType.$111.getDisplayCode(), TagField.$c, "c", "marc.tf111.c.label.key", true ),
				new TagFieldTypeData("$111_d", DataFieldType.$111.getDisplayCode(), TagField.$d, "d", "marc.tf111.d.label.key", true ),
				new TagFieldTypeData("$111_e", DataFieldType.$111.getDisplayCode(), TagField.$e, "e", "marc.tf111.e.label.key", true ),
				new TagFieldTypeData("$111_f", DataFieldType.$111.getDisplayCode(), TagField.$f, "f", "marc.tf111.f.label.key", false ),
				new TagFieldTypeData("$111_g", DataFieldType.$111.getDisplayCode(), TagField.$g, "g", "marc.tf111.g.label.key", true ),
				new TagFieldTypeData("$111_j", DataFieldType.$111.getDisplayCode(), TagField.$j, "j", "marc.tf111.j.label.key", true ),
				new TagFieldTypeData("$111_k", DataFieldType.$111.getDisplayCode(), TagField.$k, "k", "marc.tf111.k.label.key", true ),
				new TagFieldTypeData("$111_l", DataFieldType.$111.getDisplayCode(), TagField.$l, "l", "marc.tf111.l.label.key", false ),
				new TagFieldTypeData("$111_n", DataFieldType.$111.getDisplayCode(), TagField.$n, "n", "marc.tf111.n.label.key", true ),
				new TagFieldTypeData("$111_p", DataFieldType.$111.getDisplayCode(), TagField.$p, "p", "marc.tf111.p.label.key", true ),
				new TagFieldTypeData("$111_q", DataFieldType.$111.getDisplayCode(), TagField.$q, "q", "marc.tf111.q.label.key", false ),
				new TagFieldTypeData("$111_t", DataFieldType.$111.getDisplayCode(), TagField.$t, "t", "marc.tf111.t.label.key", false ),
				new TagFieldTypeData("$111_u", DataFieldType.$111.getDisplayCode(), TagField.$u, "u", "marc.tf111.u.label.key", false ),
				new TagFieldTypeData("$111_0", DataFieldType.$111.getDisplayCode(), TagField.$0, "0", "marc.tf111.0.label.key", true ),
				new TagFieldTypeData("$111_1", DataFieldType.$111.getDisplayCode(), TagField.$1, "1", "marc.tf111.1.label.key", true ),
				new TagFieldTypeData("$111_2", DataFieldType.$111.getDisplayCode(), TagField.$2, "2", "marc.tf111.2.label.key", false ),
				new TagFieldTypeData("$111_4", DataFieldType.$111.getDisplayCode(), TagField.$4, "4", "marc.tf111.4.label.key", true ),
				new TagFieldTypeData("$111_6", DataFieldType.$111.getDisplayCode(), TagField.$6, "6", "marc.tf111.6.label.key", false ),
				new TagFieldTypeData("$111_7", DataFieldType.$111.getDisplayCode(), TagField.$7, "7", "marc.tf111.7.label.key", true ),
				new TagFieldTypeData("$111_8", DataFieldType.$111.getDisplayCode(), TagField.$8, "8", "marc.tf111.8.label.key", true ),} );
		
		case $130: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$130_a", DataFieldType.$130.getDisplayCode(), TagField.$a, "a", "marc.tf130.a.label.key", false ),
				new TagFieldTypeData("$130_d", DataFieldType.$130.getDisplayCode(), TagField.$d, "d", "marc.tf130.d.label.key", true ),
				new TagFieldTypeData("$130_f", DataFieldType.$130.getDisplayCode(), TagField.$f, "f", "marc.tf130.f.label.key", false ),
				new TagFieldTypeData("$130_g", DataFieldType.$130.getDisplayCode(), TagField.$g, "g", "marc.tf130.g.label.key", true ),
				new TagFieldTypeData("$130_h", DataFieldType.$130.getDisplayCode(), TagField.$h, "h", "marc.tf130.h.label.key", false ),
				new TagFieldTypeData("$130_k", DataFieldType.$130.getDisplayCode(), TagField.$k, "k", "marc.tf130.k.label.key", true ),
				new TagFieldTypeData("$130_l", DataFieldType.$130.getDisplayCode(), TagField.$l, "l", "marc.tf130.l.label.key", false ),
				new TagFieldTypeData("$130_m", DataFieldType.$130.getDisplayCode(), TagField.$m, "m", "marc.tf130.m.label.key", true ),
				new TagFieldTypeData("$130_n", DataFieldType.$130.getDisplayCode(), TagField.$n, "n", "marc.tf130.n.label.key", true ),
				new TagFieldTypeData("$130_o", DataFieldType.$130.getDisplayCode(), TagField.$o, "o", "marc.tf130.o.label.key", false ),
				new TagFieldTypeData("$130_p", DataFieldType.$130.getDisplayCode(), TagField.$p, "p", "marc.tf130.p.label.key", true ),
				new TagFieldTypeData("$130_r", DataFieldType.$130.getDisplayCode(), TagField.$r, "r", "marc.tf130.r.label.key", false ),
				new TagFieldTypeData("$130_s", DataFieldType.$130.getDisplayCode(), TagField.$s, "s", "marc.tf130.s.label.key", true ),
				new TagFieldTypeData("$130_t", DataFieldType.$130.getDisplayCode(), TagField.$t, "t", "marc.tf130.t.label.key", false ),
				new TagFieldTypeData("$130_0", DataFieldType.$130.getDisplayCode(), TagField.$0, "0", "marc.tf130.0.label.key", true ),
				new TagFieldTypeData("$130_1", DataFieldType.$130.getDisplayCode(), TagField.$1, "1", "marc.tf130.1.label.key", true ),
				new TagFieldTypeData("$130_2", DataFieldType.$130.getDisplayCode(), TagField.$2, "2", "marc.tf130.2.label.key", false ),
				new TagFieldTypeData("$130_6", DataFieldType.$130.getDisplayCode(), TagField.$6, "6", "marc.tf130.6.label.key", false ),
				new TagFieldTypeData("$130_7", DataFieldType.$130.getDisplayCode(), TagField.$7, "7", "marc.tf130.7.label.key", true ),
				new TagFieldTypeData("$130_8", DataFieldType.$130.getDisplayCode(), TagField.$8, "8", "marc.tf130.8.label.key", true ),} );
		
		case $210: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$210_a", DataFieldType.$210.getDisplayCode(), TagField.$a, "a", "marc.tf210.a.label.key", false ),
				new TagFieldTypeData("$210_b", DataFieldType.$210.getDisplayCode(), TagField.$b, "b", "marc.tf210.b.label.key", false ),
				new TagFieldTypeData("$210_2", DataFieldType.$210.getDisplayCode(), TagField.$2, "2", "marc.tf210.2.label.key", true ),
				new TagFieldTypeData("$210_6", DataFieldType.$210.getDisplayCode(), TagField.$6, "6", "marc.tf210.6.label.key", false ),
				new TagFieldTypeData("$210_7", DataFieldType.$210.getDisplayCode(), TagField.$7, "7", "marc.tf210.7.label.key", true ),
				new TagFieldTypeData("$210_8", DataFieldType.$210.getDisplayCode(), TagField.$8, "8", "marc.tf210.8.label.key", true ),} );
		
		case $222: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$222_a", DataFieldType.$222.getDisplayCode(), TagField.$a, "a", "marc.tf222.a.label.key", false ),
				new TagFieldTypeData("$222_b", DataFieldType.$222.getDisplayCode(), TagField.$b, "b", "marc.tf222.b.label.key", false ),
				new TagFieldTypeData("$222_6", DataFieldType.$222.getDisplayCode(), TagField.$6, "6", "marc.tf222.6.label.key", false ),
				new TagFieldTypeData("$222_8", DataFieldType.$222.getDisplayCode(), TagField.$8, "8", "marc.tf222.8.label.key", true ),} );
		
		case $240: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$240_a", DataFieldType.$240.getDisplayCode(), TagField.$a, "a", "marc.tf240.a.label.key", false ),
				new TagFieldTypeData("$240_d", DataFieldType.$240.getDisplayCode(), TagField.$d, "d", "marc.tf240.d.label.key", true ),
				new TagFieldTypeData("$240_f", DataFieldType.$240.getDisplayCode(), TagField.$f, "f", "marc.tf240.f.label.key", false ),
				new TagFieldTypeData("$240_g", DataFieldType.$240.getDisplayCode(), TagField.$g, "g", "marc.tf240.g.label.key", true ),
				new TagFieldTypeData("$240_h", DataFieldType.$240.getDisplayCode(), TagField.$h, "h", "marc.tf240.h.label.key", false ),
				new TagFieldTypeData("$240_k", DataFieldType.$240.getDisplayCode(), TagField.$k, "k", "marc.tf240.k.label.key", true ),
				new TagFieldTypeData("$240_l", DataFieldType.$240.getDisplayCode(), TagField.$l, "l", "marc.tf240.l.label.key", false ),
				new TagFieldTypeData("$240_m", DataFieldType.$240.getDisplayCode(), TagField.$m, "m", "marc.tf240.m.label.key", true ),
				new TagFieldTypeData("$240_n", DataFieldType.$240.getDisplayCode(), TagField.$n, "n", "marc.tf240.n.label.key", true ),
				new TagFieldTypeData("$240_o", DataFieldType.$240.getDisplayCode(), TagField.$o, "o", "marc.tf240.o.label.key", false ),
				new TagFieldTypeData("$240_p", DataFieldType.$240.getDisplayCode(), TagField.$p, "p", "marc.tf240.p.label.key", true ),
				new TagFieldTypeData("$240_r", DataFieldType.$240.getDisplayCode(), TagField.$r, "r", "marc.tf240.r.label.key", false ),
				new TagFieldTypeData("$240_s", DataFieldType.$240.getDisplayCode(), TagField.$s, "s", "marc.tf240.s.label.key", true ),
				new TagFieldTypeData("$240_0", DataFieldType.$240.getDisplayCode(), TagField.$0, "0", "marc.tf240.0.label.key", true ),
				new TagFieldTypeData("$240_1", DataFieldType.$240.getDisplayCode(), TagField.$1, "1", "marc.tf240.1.label.key", true ),
				new TagFieldTypeData("$240_2", DataFieldType.$240.getDisplayCode(), TagField.$2, "2", "marc.tf240.2.label.key", false ),
				new TagFieldTypeData("$240_6", DataFieldType.$240.getDisplayCode(), TagField.$6, "6", "marc.tf240.6.label.key", false ),
				new TagFieldTypeData("$240_7", DataFieldType.$240.getDisplayCode(), TagField.$7, "7", "marc.tf240.7.label.key", true ),
				new TagFieldTypeData("$240_8", DataFieldType.$240.getDisplayCode(), TagField.$8, "8", "marc.tf240.8.label.key", true ),} );
		
		case $242: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$242_a", DataFieldType.$242.getDisplayCode(), TagField.$a, "a", "marc.tf242.a.label.key", false ),
				new TagFieldTypeData("$242_b", DataFieldType.$242.getDisplayCode(), TagField.$b, "b", "marc.tf242.b.label.key", false ),
				new TagFieldTypeData("$242_c", DataFieldType.$242.getDisplayCode(), TagField.$c, "c", "marc.tf242.c.label.key", false ),
				new TagFieldTypeData("$242_h", DataFieldType.$242.getDisplayCode(), TagField.$h, "h", "marc.tf242.h.label.key", false ),
				new TagFieldTypeData("$242_n", DataFieldType.$242.getDisplayCode(), TagField.$n, "n", "marc.tf242.n.label.key", true ),
				new TagFieldTypeData("$242_p", DataFieldType.$242.getDisplayCode(), TagField.$p, "p", "marc.tf242.p.label.key", true ),
				new TagFieldTypeData("$242_y", DataFieldType.$242.getDisplayCode(), TagField.$y, "y", "marc.tf242.y.label.key", false ),
				new TagFieldTypeData("$242_6", DataFieldType.$242.getDisplayCode(), TagField.$6, "6", "marc.tf242.6.label.key", false ),
				new TagFieldTypeData("$242_8", DataFieldType.$242.getDisplayCode(), TagField.$8, "8", "marc.tf242.8.label.key", true ),} );
		
		case $243: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$243_a", DataFieldType.$243.getDisplayCode(), TagField.$a, "a", "marc.tf243.a.label.key", false ),
				new TagFieldTypeData("$243_d", DataFieldType.$243.getDisplayCode(), TagField.$d, "d", "marc.tf243.d.label.key", true ),
				new TagFieldTypeData("$243_f", DataFieldType.$243.getDisplayCode(), TagField.$f, "f", "marc.tf243.f.label.key", false ),
				new TagFieldTypeData("$243_g", DataFieldType.$243.getDisplayCode(), TagField.$g, "g", "marc.tf243.g.label.key", true ),
				new TagFieldTypeData("$243_h", DataFieldType.$243.getDisplayCode(), TagField.$h, "h", "marc.tf243.h.label.key", false ),
				new TagFieldTypeData("$243_k", DataFieldType.$243.getDisplayCode(), TagField.$k, "k", "marc.tf243.k.label.key", true ),
				new TagFieldTypeData("$243_l", DataFieldType.$243.getDisplayCode(), TagField.$l, "l", "marc.tf243.l.label.key", false ),
				new TagFieldTypeData("$243_m", DataFieldType.$243.getDisplayCode(), TagField.$m, "m", "marc.tf243.m.label.key", true ),
				new TagFieldTypeData("$243_n", DataFieldType.$243.getDisplayCode(), TagField.$n, "n", "marc.tf243.n.label.key", true ),
				new TagFieldTypeData("$243_o", DataFieldType.$243.getDisplayCode(), TagField.$o, "o", "marc.tf243.o.label.key", false ),
				new TagFieldTypeData("$243_p", DataFieldType.$243.getDisplayCode(), TagField.$p, "p", "marc.tf243.p.label.key", true ),
				new TagFieldTypeData("$243_r", DataFieldType.$243.getDisplayCode(), TagField.$r, "r", "marc.tf243.r.label.key", false ),
				new TagFieldTypeData("$243_s", DataFieldType.$243.getDisplayCode(), TagField.$s, "s", "marc.tf243.s.label.key", true ),
				new TagFieldTypeData("$243_6", DataFieldType.$243.getDisplayCode(), TagField.$6, "6", "marc.tf243.6.label.key", false ),
				new TagFieldTypeData("$243_8", DataFieldType.$243.getDisplayCode(), TagField.$8, "8", "marc.tf243.8.label.key", true ),} );
		
		case $245: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$245_a", DataFieldType.$245.getDisplayCode(), TagField.$a, "a", "marc.tf245.a.label.key", false ),
				new TagFieldTypeData("$245_b", DataFieldType.$245.getDisplayCode(), TagField.$b, "b", "marc.tf245.b.label.key", false ),
				new TagFieldTypeData("$245_c", DataFieldType.$245.getDisplayCode(), TagField.$c, "c", "marc.tf245.c.label.key", false ),
				new TagFieldTypeData("$245_f", DataFieldType.$245.getDisplayCode(), TagField.$f, "f", "marc.tf245.f.label.key", false ),
				new TagFieldTypeData("$245_g", DataFieldType.$245.getDisplayCode(), TagField.$g, "g", "marc.tf245.g.label.key", false ),
				new TagFieldTypeData("$245_h", DataFieldType.$245.getDisplayCode(), TagField.$h, "h", "marc.tf245.h.label.key", false ),
				new TagFieldTypeData("$245_k", DataFieldType.$245.getDisplayCode(), TagField.$k, "k", "marc.tf245.k.label.key", true ),
				new TagFieldTypeData("$245_n", DataFieldType.$245.getDisplayCode(), TagField.$n, "n", "marc.tf245.n.label.key", true ),
				new TagFieldTypeData("$245_p", DataFieldType.$245.getDisplayCode(), TagField.$p, "p", "marc.tf245.p.label.key", true ),
				new TagFieldTypeData("$245_s", DataFieldType.$245.getDisplayCode(), TagField.$s, "s", "marc.tf245.s.label.key", false ),
				new TagFieldTypeData("$245_6", DataFieldType.$245.getDisplayCode(), TagField.$6, "6", "marc.tf245.6.label.key", false ),
				new TagFieldTypeData("$245_7", DataFieldType.$245.getDisplayCode(), TagField.$7, "7", "marc.tf245.7.label.key", true ),
				new TagFieldTypeData("$245_8", DataFieldType.$245.getDisplayCode(), TagField.$8, "8", "marc.tf245.8.label.key", true ),} );
		
		case $246: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$246_a", DataFieldType.$246.getDisplayCode(), TagField.$a, "a", "marc.tf246.a.label.key", false ),
				new TagFieldTypeData("$246_b", DataFieldType.$246.getDisplayCode(), TagField.$b, "b", "marc.tf246.b.label.key", false ),
				new TagFieldTypeData("$246_f", DataFieldType.$246.getDisplayCode(), TagField.$f, "f", "marc.tf246.f.label.key", false ),
				new TagFieldTypeData("$246_g", DataFieldType.$246.getDisplayCode(), TagField.$g, "g", "marc.tf246.g.label.key", true ),
				new TagFieldTypeData("$246_h", DataFieldType.$246.getDisplayCode(), TagField.$h, "h", "marc.tf246.h.label.key", false ),
				new TagFieldTypeData("$246_i", DataFieldType.$246.getDisplayCode(), TagField.$i, "i", "marc.tf246.i.label.key", false ),
				new TagFieldTypeData("$246_n", DataFieldType.$246.getDisplayCode(), TagField.$n, "n", "marc.tf246.n.label.key", true ),
				new TagFieldTypeData("$246_p", DataFieldType.$246.getDisplayCode(), TagField.$p, "p", "marc.tf246.p.label.key", true ),
				new TagFieldTypeData("$246_5", DataFieldType.$246.getDisplayCode(), TagField.$5, "5", "marc.tf246.5.label.key", false ),
				new TagFieldTypeData("$246_6", DataFieldType.$246.getDisplayCode(), TagField.$6, "6", "marc.tf246.6.label.key", false ),
				new TagFieldTypeData("$246_7", DataFieldType.$246.getDisplayCode(), TagField.$7, "7", "marc.tf246.7.label.key", true ),
				new TagFieldTypeData("$246_8", DataFieldType.$246.getDisplayCode(), TagField.$8, "8", "marc.tf246.8.label.key", true ),} );
		
		case $247: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$247_a", DataFieldType.$247.getDisplayCode(), TagField.$a, "a", "marc.tf247.a.label.key", false ),
				new TagFieldTypeData("$247_b", DataFieldType.$247.getDisplayCode(), TagField.$b, "b", "marc.tf247.b.label.key", false ),
				new TagFieldTypeData("$247_f", DataFieldType.$247.getDisplayCode(), TagField.$f, "f", "marc.tf247.f.label.key", false ),
				new TagFieldTypeData("$247_g", DataFieldType.$247.getDisplayCode(), TagField.$g, "g", "marc.tf247.g.label.key", true ),
				new TagFieldTypeData("$247_h", DataFieldType.$247.getDisplayCode(), TagField.$h, "h", "marc.tf247.h.label.key", false ),
				new TagFieldTypeData("$247_n", DataFieldType.$247.getDisplayCode(), TagField.$n, "n", "marc.tf247.n.label.key", true ),
				new TagFieldTypeData("$247_p", DataFieldType.$247.getDisplayCode(), TagField.$p, "p", "marc.tf247.p.label.key", true ),
				new TagFieldTypeData("$247_x", DataFieldType.$247.getDisplayCode(), TagField.$x, "x", "marc.tf247.x.label.key", false ),
				new TagFieldTypeData("$247_6", DataFieldType.$247.getDisplayCode(), TagField.$6, "6", "marc.tf247.6.label.key", false ),
				new TagFieldTypeData("$247_7", DataFieldType.$247.getDisplayCode(), TagField.$7, "7", "marc.tf247.7.label.key", true ),
				new TagFieldTypeData("$247_8", DataFieldType.$247.getDisplayCode(), TagField.$8, "8", "marc.tf247.8.label.key", true ),} );
		
		case $250: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$250_a", DataFieldType.$250.getDisplayCode(), TagField.$a, "a", "marc.tf250.a.label.key", false ),
				new TagFieldTypeData("$250_b", DataFieldType.$250.getDisplayCode(), TagField.$b, "b", "marc.tf250.b.label.key", false ),
				new TagFieldTypeData("$250_3", DataFieldType.$250.getDisplayCode(), TagField.$3, "3", "marc.tf250.3.label.key", false ),
				new TagFieldTypeData("$250_6", DataFieldType.$250.getDisplayCode(), TagField.$6, "6", "marc.tf250.6.label.key", false ),
				new TagFieldTypeData("$250_7", DataFieldType.$250.getDisplayCode(), TagField.$7, "7", "marc.tf250.7.label.key", true ),
				new TagFieldTypeData("$250_8", DataFieldType.$250.getDisplayCode(), TagField.$8, "8", "marc.tf250.8.label.key", true ),} );
		
		case $251: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$251_a", DataFieldType.$251.getDisplayCode(), TagField.$a, "a", "marc.tf251.a.label.key", true ),
				new TagFieldTypeData("$251_0", DataFieldType.$251.getDisplayCode(), TagField.$0, "0", "marc.tf251.0.label.key", true ),
				new TagFieldTypeData("$251_1", DataFieldType.$251.getDisplayCode(), TagField.$1, "1", "marc.tf251.1.label.key", true ),
				new TagFieldTypeData("$251_2", DataFieldType.$251.getDisplayCode(), TagField.$2, "2", "marc.tf251.2.label.key", false ),
				new TagFieldTypeData("$251_3", DataFieldType.$251.getDisplayCode(), TagField.$3, "3", "marc.tf251.3.label.key", false ),
				new TagFieldTypeData("$251_6", DataFieldType.$251.getDisplayCode(), TagField.$6, "6", "marc.tf251.6.label.key", false ),
				new TagFieldTypeData("$251_8", DataFieldType.$251.getDisplayCode(), TagField.$8, "8", "marc.tf251.8.label.key", true ),} );
		
		case $254: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$254_a", DataFieldType.$254.getDisplayCode(), TagField.$a, "a", "marc.tf254.a.label.key", false ),
				new TagFieldTypeData("$254_6", DataFieldType.$254.getDisplayCode(), TagField.$6, "6", "marc.tf254.6.label.key", false ),
				new TagFieldTypeData("$254_8", DataFieldType.$254.getDisplayCode(), TagField.$8, "8", "marc.tf254.8.label.key", true ),} );
		
		case $255: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$255_a", DataFieldType.$255.getDisplayCode(), TagField.$a, "a", "marc.tf255.a.label.key", false ),
				new TagFieldTypeData("$255_b", DataFieldType.$255.getDisplayCode(), TagField.$b, "b", "marc.tf255.b.label.key", false ),
				new TagFieldTypeData("$255_c", DataFieldType.$255.getDisplayCode(), TagField.$c, "c", "marc.tf255.c.label.key", false ),
				new TagFieldTypeData("$255_d", DataFieldType.$255.getDisplayCode(), TagField.$d, "d", "marc.tf255.d.label.key", false ),
				new TagFieldTypeData("$255_e", DataFieldType.$255.getDisplayCode(), TagField.$e, "e", "marc.tf255.e.label.key", false ),
				new TagFieldTypeData("$255_f", DataFieldType.$255.getDisplayCode(), TagField.$f, "f", "marc.tf255.f.label.key", false ),
				new TagFieldTypeData("$255_g", DataFieldType.$255.getDisplayCode(), TagField.$g, "g", "marc.tf255.g.label.key", false ),
				new TagFieldTypeData("$255_6", DataFieldType.$255.getDisplayCode(), TagField.$6, "6", "marc.tf255.6.label.key", false ),
				new TagFieldTypeData("$255_7", DataFieldType.$255.getDisplayCode(), TagField.$7, "7", "marc.tf255.7.label.key", true ),
				new TagFieldTypeData("$255_8", DataFieldType.$255.getDisplayCode(), TagField.$8, "8", "marc.tf255.8.label.key", true ),} );
		
		case $256: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$256_a", DataFieldType.$256.getDisplayCode(), TagField.$a, "a", "marc.tf256.a.label.key", false ),
				new TagFieldTypeData("$256_6", DataFieldType.$256.getDisplayCode(), TagField.$6, "6", "marc.tf256.6.label.key", false ),
				new TagFieldTypeData("$256_7", DataFieldType.$256.getDisplayCode(), TagField.$7, "7", "marc.tf256.7.label.key", true ),
				new TagFieldTypeData("$256_8", DataFieldType.$256.getDisplayCode(), TagField.$8, "8", "marc.tf256.8.label.key", true ),} );
		
		case $257: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$257_a", DataFieldType.$257.getDisplayCode(), TagField.$a, "a", "marc.tf257.a.label.key", true ),
				new TagFieldTypeData("$257_0", DataFieldType.$257.getDisplayCode(), TagField.$0, "0", "marc.tf257.0.label.key", true ),
				new TagFieldTypeData("$257_1", DataFieldType.$257.getDisplayCode(), TagField.$1, "1", "marc.tf257.1.label.key", true ),
				new TagFieldTypeData("$257_2", DataFieldType.$257.getDisplayCode(), TagField.$2, "2", "marc.tf257.2.label.key", false ),
				new TagFieldTypeData("$257_6", DataFieldType.$257.getDisplayCode(), TagField.$6, "6", "marc.tf257.6.label.key", false ),
				new TagFieldTypeData("$257_8", DataFieldType.$257.getDisplayCode(), TagField.$8, "8", "marc.tf257.8.label.key", true ),} );
		
		case $258: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$258_a", DataFieldType.$258.getDisplayCode(), TagField.$a, "a", "marc.tf258.a.label.key", false ),
				new TagFieldTypeData("$258_b", DataFieldType.$258.getDisplayCode(), TagField.$b, "b", "marc.tf258.b.label.key", false ),
				new TagFieldTypeData("$258_6", DataFieldType.$258.getDisplayCode(), TagField.$6, "6", "marc.tf258.6.label.key", false ),
				new TagFieldTypeData("$258_8", DataFieldType.$258.getDisplayCode(), TagField.$8, "8", "marc.tf258.8.label.key", true ),} );
		
		case $260: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$260_a", DataFieldType.$260.getDisplayCode(), TagField.$a, "a", "marc.tf260.a.label.key", true ),
				new TagFieldTypeData("$260_b", DataFieldType.$260.getDisplayCode(), TagField.$b, "b", "marc.tf260.b.label.key", true ),
				new TagFieldTypeData("$260_c", DataFieldType.$260.getDisplayCode(), TagField.$c, "c", "marc.tf260.c.label.key", true ),
				new TagFieldTypeData("$260_e", DataFieldType.$260.getDisplayCode(), TagField.$e, "e", "marc.tf260.e.label.key", true ),
				new TagFieldTypeData("$260_f", DataFieldType.$260.getDisplayCode(), TagField.$f, "f", "marc.tf260.f.label.key", true ),
				new TagFieldTypeData("$260_g", DataFieldType.$260.getDisplayCode(), TagField.$g, "g", "marc.tf260.g.label.key", true ),
				new TagFieldTypeData("$260_3", DataFieldType.$260.getDisplayCode(), TagField.$3, "3", "marc.tf260.3.label.key", false ),
				new TagFieldTypeData("$260_6", DataFieldType.$260.getDisplayCode(), TagField.$6, "6", "marc.tf260.6.label.key", false ),
				new TagFieldTypeData("$260_8", DataFieldType.$260.getDisplayCode(), TagField.$8, "8", "marc.tf260.8.label.key", true ),} );
		
		case $263: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$263_a", DataFieldType.$263.getDisplayCode(), TagField.$a, "a", "marc.tf263.a.label.key", false ),
				new TagFieldTypeData("$263_6", DataFieldType.$263.getDisplayCode(), TagField.$6, "6", "marc.tf263.6.label.key", false ),
				new TagFieldTypeData("$263_8", DataFieldType.$263.getDisplayCode(), TagField.$8, "8", "marc.tf263.8.label.key", true ),} );
		
		case $264: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$264_a", DataFieldType.$264.getDisplayCode(), TagField.$a, "a", "marc.tf264.a.label.key", true ),
				new TagFieldTypeData("$264_b", DataFieldType.$264.getDisplayCode(), TagField.$b, "b", "marc.tf264.b.label.key", true ),
				new TagFieldTypeData("$264_c", DataFieldType.$264.getDisplayCode(), TagField.$c, "c", "marc.tf264.c.label.key", true ),
				new TagFieldTypeData("$264_3", DataFieldType.$264.getDisplayCode(), TagField.$3, "3", "marc.tf264.3.label.key", false ),
				new TagFieldTypeData("$264_6", DataFieldType.$264.getDisplayCode(), TagField.$6, "6", "marc.tf264.6.label.key", false ),
				new TagFieldTypeData("$264_7", DataFieldType.$264.getDisplayCode(), TagField.$7, "7", "marc.tf264.7.label.key", true ),
				new TagFieldTypeData("$264_8", DataFieldType.$264.getDisplayCode(), TagField.$8, "8", "marc.tf264.8.label.key", true ),} );
		
		case $270: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$270_a", DataFieldType.$270.getDisplayCode(), TagField.$a, "a", "marc.tf270.a.label.key", true ),
				new TagFieldTypeData("$270_b", DataFieldType.$270.getDisplayCode(), TagField.$b, "b", "marc.tf270.b.label.key", false ),
				new TagFieldTypeData("$270_c", DataFieldType.$270.getDisplayCode(), TagField.$c, "c", "marc.tf270.c.label.key", false ),
				new TagFieldTypeData("$270_d", DataFieldType.$270.getDisplayCode(), TagField.$d, "d", "marc.tf270.d.label.key", false ),
				new TagFieldTypeData("$270_e", DataFieldType.$270.getDisplayCode(), TagField.$e, "e", "marc.tf270.e.label.key", false ),
				new TagFieldTypeData("$270_f", DataFieldType.$270.getDisplayCode(), TagField.$f, "f", "marc.tf270.f.label.key", false ),
				new TagFieldTypeData("$270_g", DataFieldType.$270.getDisplayCode(), TagField.$g, "g", "marc.tf270.g.label.key", false ),
				new TagFieldTypeData("$270_h", DataFieldType.$270.getDisplayCode(), TagField.$h, "h", "marc.tf270.h.label.key", false ),
				new TagFieldTypeData("$270_i", DataFieldType.$270.getDisplayCode(), TagField.$i, "i", "marc.tf270.i.label.key", false ),
				new TagFieldTypeData("$270_j", DataFieldType.$270.getDisplayCode(), TagField.$j, "j", "marc.tf270.j.label.key", true ),
				new TagFieldTypeData("$270_k", DataFieldType.$270.getDisplayCode(), TagField.$k, "k", "marc.tf270.k.label.key", true ),
				new TagFieldTypeData("$270_l", DataFieldType.$270.getDisplayCode(), TagField.$l, "l", "marc.tf270.l.label.key", true ),
				new TagFieldTypeData("$270_m", DataFieldType.$270.getDisplayCode(), TagField.$m, "m", "marc.tf270.m.label.key", true ),
				new TagFieldTypeData("$270_n", DataFieldType.$270.getDisplayCode(), TagField.$n, "n", "marc.tf270.n.label.key", true ),
				new TagFieldTypeData("$270_p", DataFieldType.$270.getDisplayCode(), TagField.$p, "p", "marc.tf270.p.label.key", true ),
				new TagFieldTypeData("$270_q", DataFieldType.$270.getDisplayCode(), TagField.$q, "q", "marc.tf270.q.label.key", true ),
				new TagFieldTypeData("$270_r", DataFieldType.$270.getDisplayCode(), TagField.$r, "r", "marc.tf270.r.label.key", true ),
				new TagFieldTypeData("$270_z", DataFieldType.$270.getDisplayCode(), TagField.$z, "z", "marc.tf270.z.label.key", true ),
				new TagFieldTypeData("$270_4", DataFieldType.$270.getDisplayCode(), TagField.$4, "4", "marc.tf270.4.label.key", true ),
				new TagFieldTypeData("$270_6", DataFieldType.$270.getDisplayCode(), TagField.$6, "6", "marc.tf270.6.label.key", false ),
				new TagFieldTypeData("$270_8", DataFieldType.$270.getDisplayCode(), TagField.$8, "8", "marc.tf270.8.label.key", true ),} );
			
		case $300: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$300_a", DataFieldType.$300.getDisplayCode(), TagField.$a, "a", "marc.tf300.a.label.key", true ),
				new TagFieldTypeData("$300_b", DataFieldType.$300.getDisplayCode(), TagField.$b, "b", "marc.tf300.b.label.key", false ),
				new TagFieldTypeData("$300_c", DataFieldType.$300.getDisplayCode(), TagField.$c, "c", "marc.tf300.c.label.key", true ),
				new TagFieldTypeData("$300_e", DataFieldType.$300.getDisplayCode(), TagField.$e, "e", "marc.tf300.e.label.key", false ),
				new TagFieldTypeData("$300_f", DataFieldType.$300.getDisplayCode(), TagField.$f, "f", "marc.tf300.f.label.key", true ),
				new TagFieldTypeData("$300_g", DataFieldType.$300.getDisplayCode(), TagField.$g, "g", "marc.tf300.g.label.key", true ),
				new TagFieldTypeData("$300_3", DataFieldType.$300.getDisplayCode(), TagField.$3, "3", "marc.tf300.3.label.key", false ),
				new TagFieldTypeData("$300_6", DataFieldType.$300.getDisplayCode(), TagField.$6, "6", "marc.tf300.6.label.key", false ),
				new TagFieldTypeData("$300_7", DataFieldType.$300.getDisplayCode(), TagField.$7, "7", "marc.tf300.7.label.key", true ),
				new TagFieldTypeData("$300_8", DataFieldType.$300.getDisplayCode(), TagField.$8, "8", "marc.tf300.8.label.key", true ),} );
		
		case $306: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$306_a", DataFieldType.$306.getDisplayCode(), TagField.$a, "a", "marc.tf306.a.label.key", true ),
				new TagFieldTypeData("$306_6", DataFieldType.$306.getDisplayCode(), TagField.$6, "6", "marc.tf306.6.label.key", false ),
				new TagFieldTypeData("$306_8", DataFieldType.$306.getDisplayCode(), TagField.$8, "8", "marc.tf306.8.label.key", true ),} );
		
		case $307: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$307_a", DataFieldType.$307.getDisplayCode(), TagField.$a, "a", "marc.tf307.a.label.key", false ),
				new TagFieldTypeData("$307_b", DataFieldType.$307.getDisplayCode(), TagField.$b, "b", "marc.tf307.b.label.key", false ),
				new TagFieldTypeData("$307_6", DataFieldType.$307.getDisplayCode(), TagField.$6, "6", "marc.tf307.6.label.key", false ),
				new TagFieldTypeData("$307_8", DataFieldType.$307.getDisplayCode(), TagField.$8, "8", "marc.tf307.8.label.key", true ),} );
		
		case $310: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$310_a", DataFieldType.$310.getDisplayCode(), TagField.$a, "a", "marc.tf310.a.label.key", false ),
				new TagFieldTypeData("$310_b", DataFieldType.$310.getDisplayCode(), TagField.$b, "b", "marc.tf310.b.label.key", false ),
				new TagFieldTypeData("$310_0", DataFieldType.$310.getDisplayCode(), TagField.$0, "0", "marc.tf310.0.label.key", false ),
				new TagFieldTypeData("$310_1", DataFieldType.$310.getDisplayCode(), TagField.$1, "1", "marc.tf310.1.label.key", true ),
				new TagFieldTypeData("$310_2", DataFieldType.$310.getDisplayCode(), TagField.$2, "2", "marc.tf310.2.label.key", false ),
				new TagFieldTypeData("$310_6", DataFieldType.$310.getDisplayCode(), TagField.$6, "6", "marc.tf310.6.label.key", false ),
				new TagFieldTypeData("$310_8", DataFieldType.$310.getDisplayCode(), TagField.$8, "8", "marc.tf310.8.label.key", true ),} );
		
		case $321: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$321_a", DataFieldType.$321.getDisplayCode(), TagField.$a, "a", "marc.tf321.a.label.key", false ),
				new TagFieldTypeData("$321_b", DataFieldType.$321.getDisplayCode(), TagField.$b, "b", "marc.tf321.b.label.key", false ),
				new TagFieldTypeData("$321_0", DataFieldType.$321.getDisplayCode(), TagField.$0, "0", "marc.tf321.0.label.key", false ),
				new TagFieldTypeData("$321_1", DataFieldType.$321.getDisplayCode(), TagField.$1, "1", "marc.tf321.1.label.key", true ),
				new TagFieldTypeData("$321_2", DataFieldType.$321.getDisplayCode(), TagField.$2, "2", "marc.tf321.2.label.key", false ),
				new TagFieldTypeData("$321_6", DataFieldType.$321.getDisplayCode(), TagField.$6, "6", "marc.tf321.6.label.key", false ),
				new TagFieldTypeData("$321_8", DataFieldType.$321.getDisplayCode(), TagField.$8, "8", "marc.tf321.8.label.key", true ),} );
		
		case $334: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$334_a", DataFieldType.$334.getDisplayCode(), TagField.$a, "a", "marc.tf334.a.label.key", false ),
				new TagFieldTypeData("$334_b", DataFieldType.$334.getDisplayCode(), TagField.$b, "b", "marc.tf334.b.label.key", false ),
				new TagFieldTypeData("$334_0", DataFieldType.$334.getDisplayCode(), TagField.$0, "0", "marc.tf334.0.label.key", true ),
				new TagFieldTypeData("$334_1", DataFieldType.$334.getDisplayCode(), TagField.$1, "1", "marc.tf334.1.label.key", true ),
				new TagFieldTypeData("$334_2", DataFieldType.$334.getDisplayCode(), TagField.$2, "2", "marc.tf334.2.label.key", false ),
				new TagFieldTypeData("$334_6", DataFieldType.$334.getDisplayCode(), TagField.$6, "6", "marc.tf334.6.label.key", false ),
				new TagFieldTypeData("$334_8", DataFieldType.$334.getDisplayCode(), TagField.$8, "8", "marc.tf334.8.label.key", true ),} );
		
		case $335: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$335_a", DataFieldType.$335.getDisplayCode(), TagField.$a, "a", "marc.tf335.a.label.key", false ),
				new TagFieldTypeData("$335_b", DataFieldType.$335.getDisplayCode(), TagField.$b, "b", "marc.tf335.b.label.key", false ),
				new TagFieldTypeData("$335_0", DataFieldType.$335.getDisplayCode(), TagField.$0, "0", "marc.tf335.0.label.key", true ),
				new TagFieldTypeData("$335_1", DataFieldType.$335.getDisplayCode(), TagField.$1, "1", "marc.tf335.1.label.key", true ),
				new TagFieldTypeData("$335_2", DataFieldType.$335.getDisplayCode(), TagField.$2, "2", "marc.tf335.2.label.key", false ),
				new TagFieldTypeData("$335_3", DataFieldType.$335.getDisplayCode(), TagField.$3, "3", "marc.tf335.3.label.key", false ),
				new TagFieldTypeData("$335_6", DataFieldType.$335.getDisplayCode(), TagField.$6, "6", "marc.tf335.6.label.key", false ),
				new TagFieldTypeData("$335_7", DataFieldType.$335.getDisplayCode(), TagField.$7, "7", "marc.tf335.7.label.key", true ),
				new TagFieldTypeData("$335_8", DataFieldType.$335.getDisplayCode(), TagField.$8, "8", "marc.tf335.8.label.key", true ),} );
		
		case $336: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$336_a", DataFieldType.$336.getDisplayCode(), TagField.$a, "a", "marc.tf336.a.label.key", true ),
				new TagFieldTypeData("$336_b", DataFieldType.$336.getDisplayCode(), TagField.$b, "b", "marc.tf336.b.label.key", true ),
				new TagFieldTypeData("$336_0", DataFieldType.$336.getDisplayCode(), TagField.$0, "0", "marc.tf336.0.label.key", true ),
				new TagFieldTypeData("$336_1", DataFieldType.$336.getDisplayCode(), TagField.$1, "1", "marc.tf336.1.label.key", true ),
				new TagFieldTypeData("$336_2", DataFieldType.$336.getDisplayCode(), TagField.$2, "2", "marc.tf336.2.label.key", false ),
				new TagFieldTypeData("$336_3", DataFieldType.$336.getDisplayCode(), TagField.$3, "3", "marc.tf336.3.label.key", false ),
				new TagFieldTypeData("$336_6", DataFieldType.$336.getDisplayCode(), TagField.$6, "6", "marc.tf336.6.label.key", false ),
				new TagFieldTypeData("$336_7", DataFieldType.$336.getDisplayCode(), TagField.$7, "7", "marc.tf336.7.label.key", true ),
				new TagFieldTypeData("$336_8", DataFieldType.$336.getDisplayCode(), TagField.$8, "8", "marc.tf336.8.label.key", true ),} );
		
		case $337: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$337_a", DataFieldType.$337.getDisplayCode(), TagField.$a, "a", "marc.tf337.a.label.key", true ),
				new TagFieldTypeData("$337_b", DataFieldType.$337.getDisplayCode(), TagField.$b, "b", "marc.tf337.b.label.key", true ),
				new TagFieldTypeData("$337_0", DataFieldType.$337.getDisplayCode(), TagField.$0, "0", "marc.tf337.0.label.key", true ),
				new TagFieldTypeData("$337_1", DataFieldType.$337.getDisplayCode(), TagField.$1, "1", "marc.tf337.1.label.key", true ),
				new TagFieldTypeData("$337_2", DataFieldType.$337.getDisplayCode(), TagField.$2, "2", "marc.tf337.2.label.key", false ),
				new TagFieldTypeData("$337_3", DataFieldType.$337.getDisplayCode(), TagField.$3, "3", "marc.tf337.3.label.key", false ),
				new TagFieldTypeData("$337_6", DataFieldType.$337.getDisplayCode(), TagField.$6, "6", "marc.tf337.6.label.key", false ),
				new TagFieldTypeData("$337_8", DataFieldType.$337.getDisplayCode(), TagField.$8, "8", "marc.tf337.8.label.key", true ),} );
		
		case $338: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$338_a", DataFieldType.$338.getDisplayCode(), TagField.$a, "a", "marc.tf338.a.label.key", true ),
				new TagFieldTypeData("$338_b", DataFieldType.$338.getDisplayCode(), TagField.$b, "b", "marc.tf338.b.label.key", true ),
				new TagFieldTypeData("$338_0", DataFieldType.$338.getDisplayCode(), TagField.$0, "0", "marc.tf338.0.label.key", true ),
				new TagFieldTypeData("$338_1", DataFieldType.$338.getDisplayCode(), TagField.$1, "1", "marc.tf338.1.label.key", true ),
				new TagFieldTypeData("$338_2", DataFieldType.$338.getDisplayCode(), TagField.$2, "2", "marc.tf338.2.label.key", false ),
				new TagFieldTypeData("$338_3", DataFieldType.$338.getDisplayCode(), TagField.$3, "3", "marc.tf338.3.label.key", false ),
				new TagFieldTypeData("$338_6", DataFieldType.$338.getDisplayCode(), TagField.$6, "6", "marc.tf338.6.label.key", false ),
				new TagFieldTypeData("$338_8", DataFieldType.$338.getDisplayCode(), TagField.$8, "8", "marc.tf338.8.label.key", true ),} );
		
		case $340: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$340_a", DataFieldType.$340.getDisplayCode(), TagField.$a, "a", "marc.tf340.a.label.key", true ),
				new TagFieldTypeData("$340_b", DataFieldType.$340.getDisplayCode(), TagField.$b, "b", "marc.tf340.b.label.key", true ),
				new TagFieldTypeData("$340_c", DataFieldType.$340.getDisplayCode(), TagField.$c, "c", "marc.tf340.c.label.key", true ),
				new TagFieldTypeData("$340_d", DataFieldType.$340.getDisplayCode(), TagField.$d, "d", "marc.tf340.d.label.key", true ),
				new TagFieldTypeData("$340_e", DataFieldType.$340.getDisplayCode(), TagField.$e, "e", "marc.tf340.e.label.key", true ),
				new TagFieldTypeData("$340_f", DataFieldType.$340.getDisplayCode(), TagField.$f, "f", "marc.tf340.f.label.key", true ),
				new TagFieldTypeData("$340_g", DataFieldType.$340.getDisplayCode(), TagField.$g, "g", "marc.tf340.g.label.key", true ),
				new TagFieldTypeData("$340_h", DataFieldType.$340.getDisplayCode(), TagField.$h, "h", "marc.tf340.h.label.key", true ),
				new TagFieldTypeData("$340_i", DataFieldType.$340.getDisplayCode(), TagField.$i, "i", "marc.tf340.i.label.key", true ),
				new TagFieldTypeData("$340_j", DataFieldType.$340.getDisplayCode(), TagField.$j, "j", "marc.tf340.j.label.key", true ),
				new TagFieldTypeData("$340_k", DataFieldType.$340.getDisplayCode(), TagField.$k, "k", "marc.tf340.k.label.key", true ),
				new TagFieldTypeData("$340_l", DataFieldType.$340.getDisplayCode(), TagField.$l, "l", "marc.tf340.l.label.key", true ),
				new TagFieldTypeData("$340_m", DataFieldType.$340.getDisplayCode(), TagField.$m, "m", "marc.tf340.m.label.key", true ),
				new TagFieldTypeData("$340_n", DataFieldType.$340.getDisplayCode(), TagField.$n, "n", "marc.tf340.n.label.key", true ),
				new TagFieldTypeData("$340_o", DataFieldType.$340.getDisplayCode(), TagField.$o, "o", "marc.tf340.o.label.key", true ),
				new TagFieldTypeData("$340_p", DataFieldType.$340.getDisplayCode(), TagField.$p, "p", "marc.tf340.p.label.key", true ),
				new TagFieldTypeData("$340_q", DataFieldType.$340.getDisplayCode(), TagField.$q, "q", "marc.tf340.q.label.key", true ),
				new TagFieldTypeData("$340_0", DataFieldType.$340.getDisplayCode(), TagField.$0, "0", "marc.tf340.0.label.key", true ),
				new TagFieldTypeData("$340_1", DataFieldType.$340.getDisplayCode(), TagField.$1, "1", "marc.tf340.1.label.key", true ),
				new TagFieldTypeData("$340_2", DataFieldType.$340.getDisplayCode(), TagField.$2, "2", "marc.tf340.2.label.key", false ),
				new TagFieldTypeData("$340_3", DataFieldType.$340.getDisplayCode(), TagField.$3, "3", "marc.tf340.3.label.key", false ),
				new TagFieldTypeData("$340_6", DataFieldType.$340.getDisplayCode(), TagField.$6, "6", "marc.tf340.6.label.key", false ),
				new TagFieldTypeData("$340_8", DataFieldType.$340.getDisplayCode(), TagField.$8, "8", "marc.tf340.8.label.key", true ),} );
		
		case $341: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$341_a", DataFieldType.$341.getDisplayCode(), TagField.$a, "a", "marc.tf341.a.label.key", false ),
				new TagFieldTypeData("$341_b", DataFieldType.$341.getDisplayCode(), TagField.$b, "b", "marc.tf341.b.label.key", true ),
				new TagFieldTypeData("$341_c", DataFieldType.$341.getDisplayCode(), TagField.$c, "c", "marc.tf341.c.label.key", true ),
				new TagFieldTypeData("$341_d", DataFieldType.$341.getDisplayCode(), TagField.$d, "d", "marc.tf341.d.label.key", true ),
				new TagFieldTypeData("$341_e", DataFieldType.$341.getDisplayCode(), TagField.$e, "e", "marc.tf341.e.label.key", true ),
				new TagFieldTypeData("$341_0", DataFieldType.$341.getDisplayCode(), TagField.$0, "0", "marc.tf341.0.label.key", true ),
				new TagFieldTypeData("$341_1", DataFieldType.$341.getDisplayCode(), TagField.$1, "1", "marc.tf341.1.label.key", true ),
				new TagFieldTypeData("$341_2", DataFieldType.$341.getDisplayCode(), TagField.$2, "2", "marc.tf341.2.label.key", false ),
				new TagFieldTypeData("$341_3", DataFieldType.$341.getDisplayCode(), TagField.$3, "3", "marc.tf341.3.label.key", false ),
				new TagFieldTypeData("$341_6", DataFieldType.$341.getDisplayCode(), TagField.$6, "6", "marc.tf341.6.label.key", false ),
				new TagFieldTypeData("$341_8", DataFieldType.$341.getDisplayCode(), TagField.$8, "8", "marc.tf341.8.label.key", true ),} );
		
		case $342: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$342_a", DataFieldType.$342.getDisplayCode(), TagField.$a, "a", "marc.tf342.a.label.key", false ),
				new TagFieldTypeData("$342_b", DataFieldType.$342.getDisplayCode(), TagField.$b, "b", "marc.tf342.b.label.key", false ),
				new TagFieldTypeData("$342_c", DataFieldType.$342.getDisplayCode(), TagField.$c, "c", "marc.tf342.c.label.key", false ),
				new TagFieldTypeData("$342_d", DataFieldType.$342.getDisplayCode(), TagField.$d, "d", "marc.tf342.d.label.key", false ),
				new TagFieldTypeData("$342_e", DataFieldType.$342.getDisplayCode(), TagField.$e, "e", "marc.tf342.e.label.key", true ),
				new TagFieldTypeData("$342_f", DataFieldType.$342.getDisplayCode(), TagField.$f, "f", "marc.tf342.f.label.key", false ),
				new TagFieldTypeData("$342_g", DataFieldType.$342.getDisplayCode(), TagField.$g, "g", "marc.tf342.g.label.key", false ),
				new TagFieldTypeData("$342_h", DataFieldType.$342.getDisplayCode(), TagField.$h, "h", "marc.tf342.h.label.key", false ),
				new TagFieldTypeData("$342_i", DataFieldType.$342.getDisplayCode(), TagField.$i, "i", "marc.tf342.i.label.key", false ),
				new TagFieldTypeData("$342_j", DataFieldType.$342.getDisplayCode(), TagField.$j, "j", "marc.tf342.j.label.key", false ),
				new TagFieldTypeData("$342_k", DataFieldType.$342.getDisplayCode(), TagField.$k, "k", "marc.tf342.k.label.key", false ),
				new TagFieldTypeData("$342_l", DataFieldType.$342.getDisplayCode(), TagField.$l, "l", "marc.tf342.l.label.key", false ),
				new TagFieldTypeData("$342_m", DataFieldType.$342.getDisplayCode(), TagField.$m, "m", "marc.tf342.m.label.key", false ),
				new TagFieldTypeData("$342_n", DataFieldType.$342.getDisplayCode(), TagField.$n, "n", "marc.tf342.n.label.key", false ),
				new TagFieldTypeData("$342_o", DataFieldType.$342.getDisplayCode(), TagField.$o, "o", "marc.tf342.o.label.key", false ),
				new TagFieldTypeData("$342_p", DataFieldType.$342.getDisplayCode(), TagField.$p, "p", "marc.tf342.p.label.key", false ),
				new TagFieldTypeData("$342_q", DataFieldType.$342.getDisplayCode(), TagField.$q, "q", "marc.tf342.q.label.key", false ),
				new TagFieldTypeData("$342_r", DataFieldType.$342.getDisplayCode(), TagField.$r, "r", "marc.tf342.r.label.key", false ),
				new TagFieldTypeData("$342_s", DataFieldType.$342.getDisplayCode(), TagField.$s, "s", "marc.tf342.s.label.key", false ),
				new TagFieldTypeData("$342_t", DataFieldType.$342.getDisplayCode(), TagField.$t, "t", "marc.tf342.t.label.key", false ),
				new TagFieldTypeData("$342_u", DataFieldType.$342.getDisplayCode(), TagField.$u, "u", "marc.tf342.u.label.key", false ),
				new TagFieldTypeData("$342_v", DataFieldType.$342.getDisplayCode(), TagField.$v, "v", "marc.tf342.v.label.key", false ),
				new TagFieldTypeData("$342_w", DataFieldType.$342.getDisplayCode(), TagField.$w, "w", "marc.tf342.w.label.key", false ),
				new TagFieldTypeData("$342_2", DataFieldType.$342.getDisplayCode(), TagField.$2, "2", "marc.tf342.2.label.key", false ),
				new TagFieldTypeData("$342_6", DataFieldType.$342.getDisplayCode(), TagField.$6, "6", "marc.tf342.6.label.key", false ),
				new TagFieldTypeData("$342_8", DataFieldType.$342.getDisplayCode(), TagField.$8, "8", "marc.tf342.8.label.key", true ),} );
		
		case $343: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$343_a", DataFieldType.$343.getDisplayCode(), TagField.$a, "a", "marc.tf343.a.label.key", false ),
				new TagFieldTypeData("$343_b", DataFieldType.$343.getDisplayCode(), TagField.$b, "b", "marc.tf343.b.label.key", false ),
				new TagFieldTypeData("$343_c", DataFieldType.$343.getDisplayCode(), TagField.$c, "c", "marc.tf343.c.label.key", false ),
				new TagFieldTypeData("$343_d", DataFieldType.$343.getDisplayCode(), TagField.$d, "d", "marc.tf343.d.label.key", false ),
				new TagFieldTypeData("$343_e", DataFieldType.$343.getDisplayCode(), TagField.$e, "e", "marc.tf343.e.label.key", false ),
				new TagFieldTypeData("$343_f", DataFieldType.$343.getDisplayCode(), TagField.$f, "f", "marc.tf343.f.label.key", false ),
				new TagFieldTypeData("$343_g", DataFieldType.$343.getDisplayCode(), TagField.$g, "g", "marc.tf343.g.label.key", false ),
				new TagFieldTypeData("$343_h", DataFieldType.$343.getDisplayCode(), TagField.$h, "h", "marc.tf343.h.label.key", false ),
				new TagFieldTypeData("$343_i", DataFieldType.$343.getDisplayCode(), TagField.$i, "i", "marc.tf343.i.label.key", false ),
				new TagFieldTypeData("$343_6", DataFieldType.$343.getDisplayCode(), TagField.$6, "6", "marc.tf343.6.label.key", false ),
				new TagFieldTypeData("$343_8", DataFieldType.$343.getDisplayCode(), TagField.$8, "8", "marc.tf343.8.label.key", true ),} );
		
		case $344: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$344_a", DataFieldType.$344.getDisplayCode(), TagField.$a, "a", "marc.tf344.a.label.key", true ),
				new TagFieldTypeData("$344_b", DataFieldType.$344.getDisplayCode(), TagField.$b, "b", "marc.tf344.b.label.key", true ),
				new TagFieldTypeData("$344_c", DataFieldType.$344.getDisplayCode(), TagField.$c, "c", "marc.tf344.c.label.key", true ),
				new TagFieldTypeData("$344_d", DataFieldType.$344.getDisplayCode(), TagField.$d, "d", "marc.tf344.d.label.key", true ),
				new TagFieldTypeData("$344_e", DataFieldType.$344.getDisplayCode(), TagField.$e, "e", "marc.tf344.e.label.key", true ),
				new TagFieldTypeData("$344_f", DataFieldType.$344.getDisplayCode(), TagField.$f, "f", "marc.tf344.f.label.key", true ),
				new TagFieldTypeData("$344_g", DataFieldType.$344.getDisplayCode(), TagField.$g, "g", "marc.tf344.g.label.key", true ),
				new TagFieldTypeData("$344_h", DataFieldType.$344.getDisplayCode(), TagField.$h, "h", "marc.tf344.h.label.key", true ),
				new TagFieldTypeData("$344_i", DataFieldType.$344.getDisplayCode(), TagField.$i, "i", "marc.tf344.i.label.key", true ),
				new TagFieldTypeData("$344_j", DataFieldType.$344.getDisplayCode(), TagField.$j, "j", "marc.tf344.j.label.key", true ),
				new TagFieldTypeData("$344_0", DataFieldType.$344.getDisplayCode(), TagField.$0, "0", "marc.tf344.0.label.key", true ),
				new TagFieldTypeData("$344_1", DataFieldType.$344.getDisplayCode(), TagField.$1, "1", "marc.tf344.1.label.key", true ),
				new TagFieldTypeData("$344_2", DataFieldType.$344.getDisplayCode(), TagField.$2, "2", "marc.tf344.2.label.key", false ),
				new TagFieldTypeData("$344_3", DataFieldType.$344.getDisplayCode(), TagField.$3, "3", "marc.tf344.3.label.key", false ),
				new TagFieldTypeData("$344_6", DataFieldType.$344.getDisplayCode(), TagField.$6, "6", "marc.tf344.6.label.key", false ),
				new TagFieldTypeData("$344_8", DataFieldType.$344.getDisplayCode(), TagField.$8, "8", "marc.tf344.8.label.key", true ),} );
		
		case $345: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$345_a", DataFieldType.$345.getDisplayCode(), TagField.$a, "a", "marc.tf345.a.label.key", true ),
				new TagFieldTypeData("$345_b", DataFieldType.$345.getDisplayCode(), TagField.$b, "b", "marc.tf345.b.label.key", true ),
				new TagFieldTypeData("$345_c", DataFieldType.$345.getDisplayCode(), TagField.$c, "c", "marc.tf345.c.label.key", true ),
				new TagFieldTypeData("$345_d", DataFieldType.$345.getDisplayCode(), TagField.$d, "d", "marc.tf345.d.label.key", true ),
				new TagFieldTypeData("$345_0", DataFieldType.$345.getDisplayCode(), TagField.$0, "0", "marc.tf345.0.label.key", true ),
				new TagFieldTypeData("$345_1", DataFieldType.$345.getDisplayCode(), TagField.$1, "1", "marc.tf345.1.label.key", true ),
				new TagFieldTypeData("$345_2", DataFieldType.$345.getDisplayCode(), TagField.$2, "2", "marc.tf345.2.label.key", false ),
				new TagFieldTypeData("$345_3", DataFieldType.$345.getDisplayCode(), TagField.$3, "3", "marc.tf345.3.label.key", false ),
				new TagFieldTypeData("$345_6", DataFieldType.$345.getDisplayCode(), TagField.$6, "6", "marc.tf345.6.label.key", false ),
				new TagFieldTypeData("$345_8", DataFieldType.$345.getDisplayCode(), TagField.$8, "8", "marc.tf345.8.label.key", true ),} );
		
		case $346: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$346_a", DataFieldType.$346.getDisplayCode(), TagField.$a, "a", "marc.tf346.a.label.key", true ),
				new TagFieldTypeData("$346_b", DataFieldType.$346.getDisplayCode(), TagField.$b, "b", "marc.tf346.b.label.key", true ),
				new TagFieldTypeData("$346_0", DataFieldType.$346.getDisplayCode(), TagField.$0, "0", "marc.tf346.0.label.key", true ),
				new TagFieldTypeData("$346_1", DataFieldType.$346.getDisplayCode(), TagField.$1, "1", "marc.tf346.1.label.key", true ),
				new TagFieldTypeData("$346_2", DataFieldType.$346.getDisplayCode(), TagField.$2, "2", "marc.tf346.2.label.key", false ),
				new TagFieldTypeData("$346_3", DataFieldType.$346.getDisplayCode(), TagField.$3, "3", "marc.tf346.3.label.key", false ),
				new TagFieldTypeData("$346_6", DataFieldType.$346.getDisplayCode(), TagField.$6, "6", "marc.tf346.6.label.key", false ),
				new TagFieldTypeData("$346_8", DataFieldType.$346.getDisplayCode(), TagField.$8, "8", "marc.tf346.8.label.key", true ),} );
		
		case $347: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$347_a", DataFieldType.$347.getDisplayCode(), TagField.$a, "a", "marc.tf347.a.label.key", true ),
				new TagFieldTypeData("$347_b", DataFieldType.$347.getDisplayCode(), TagField.$b, "b", "marc.tf347.b.label.key", true ),
				new TagFieldTypeData("$347_c", DataFieldType.$347.getDisplayCode(), TagField.$c, "c", "marc.tf347.c.label.key", true ),
				new TagFieldTypeData("$347_d", DataFieldType.$347.getDisplayCode(), TagField.$d, "d", "marc.tf347.d.label.key", true ),
				new TagFieldTypeData("$347_e", DataFieldType.$347.getDisplayCode(), TagField.$e, "e", "marc.tf347.e.label.key", true ),
				new TagFieldTypeData("$347_f", DataFieldType.$347.getDisplayCode(), TagField.$f, "f", "marc.tf347.f.label.key", true ),
				new TagFieldTypeData("$347_0", DataFieldType.$347.getDisplayCode(), TagField.$0, "0", "marc.tf347.0.label.key", true ),
				new TagFieldTypeData("$347_1", DataFieldType.$347.getDisplayCode(), TagField.$1, "1", "marc.tf347.1.label.key", true ),
				new TagFieldTypeData("$347_2", DataFieldType.$347.getDisplayCode(), TagField.$2, "2", "marc.tf347.2.label.key", false ),
				new TagFieldTypeData("$347_3", DataFieldType.$347.getDisplayCode(), TagField.$3, "3", "marc.tf347.3.label.key", false ),
				new TagFieldTypeData("$347_6", DataFieldType.$347.getDisplayCode(), TagField.$6, "6", "marc.tf347.6.label.key", false ),
				new TagFieldTypeData("$347_8", DataFieldType.$347.getDisplayCode(), TagField.$8, "8", "marc.tf347.8.label.key", true ),} );
		
		case $348: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$348_a", DataFieldType.$348.getDisplayCode(), TagField.$a, "a", "marc.tf348.a.label.key", true ),
				new TagFieldTypeData("$348_b", DataFieldType.$348.getDisplayCode(), TagField.$b, "b", "marc.tf348.b.label.key", true ),
				new TagFieldTypeData("$348_c", DataFieldType.$348.getDisplayCode(), TagField.$c, "c", "marc.tf348.c.label.key", true ),
				new TagFieldTypeData("$348_d", DataFieldType.$348.getDisplayCode(), TagField.$d, "d", "marc.tf348.d.label.key", true ),
				new TagFieldTypeData("$348_0", DataFieldType.$348.getDisplayCode(), TagField.$0, "0", "marc.tf348.0.label.key", true ),
				new TagFieldTypeData("$348_1", DataFieldType.$348.getDisplayCode(), TagField.$1, "1", "marc.tf348.1.label.key", true ),
				new TagFieldTypeData("$348_2", DataFieldType.$348.getDisplayCode(), TagField.$2, "2", "marc.tf348.2.label.key", false ),
				new TagFieldTypeData("$348_3", DataFieldType.$348.getDisplayCode(), TagField.$3, "3", "marc.tf348.3.label.key", false ),
				new TagFieldTypeData("$348_6", DataFieldType.$348.getDisplayCode(), TagField.$6, "6", "marc.tf348.6.label.key", false ),
				new TagFieldTypeData("$348_7", DataFieldType.$348.getDisplayCode(), TagField.$7, "7", "marc.tf348.7.label.key", true ),
				new TagFieldTypeData("$348_8", DataFieldType.$348.getDisplayCode(), TagField.$8, "8", "marc.tf348.8.label.key", true ),} );
		
		case $351: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$351_a", DataFieldType.$351.getDisplayCode(), TagField.$a, "a", "marc.tf351.a.label.key", true ),
				new TagFieldTypeData("$351_b", DataFieldType.$351.getDisplayCode(), TagField.$b, "b", "marc.tf351.b.label.key", true ),
				new TagFieldTypeData("$351_c", DataFieldType.$351.getDisplayCode(), TagField.$c, "c", "marc.tf351.c.label.key", false ),
				new TagFieldTypeData("$351_3", DataFieldType.$351.getDisplayCode(), TagField.$3, "3", "marc.tf351.3.label.key", false ),
				new TagFieldTypeData("$351_6", DataFieldType.$351.getDisplayCode(), TagField.$6, "6", "marc.tf351.6.label.key", false ),
				new TagFieldTypeData("$351_8", DataFieldType.$351.getDisplayCode(), TagField.$8, "8", "marc.tf351.8.label.key", true ),} );
		
		case $352: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$352_a", DataFieldType.$352.getDisplayCode(), TagField.$a, "a", "marc.tf352.a.label.key", true ),
				new TagFieldTypeData("$352_b", DataFieldType.$352.getDisplayCode(), TagField.$b, "b", "marc.tf352.b.label.key", true ),
				new TagFieldTypeData("$352_c", DataFieldType.$352.getDisplayCode(), TagField.$c, "c", "marc.tf352.c.label.key", true ),
				new TagFieldTypeData("$352_d", DataFieldType.$352.getDisplayCode(), TagField.$d, "d", "marc.tf352.d.label.key", false ),
				new TagFieldTypeData("$352_e", DataFieldType.$352.getDisplayCode(), TagField.$e, "e", "marc.tf352.e.label.key", false ),
				new TagFieldTypeData("$352_f", DataFieldType.$352.getDisplayCode(), TagField.$f, "f", "marc.tf352.f.label.key", false ),
				new TagFieldTypeData("$352_g", DataFieldType.$352.getDisplayCode(), TagField.$g, "g", "marc.tf352.g.label.key", false ),
				new TagFieldTypeData("$352_i", DataFieldType.$352.getDisplayCode(), TagField.$i, "i", "marc.tf352.i.label.key", false ),
				new TagFieldTypeData("$352_q", DataFieldType.$352.getDisplayCode(), TagField.$q, "q", "marc.tf352.q.label.key", false ),
				new TagFieldTypeData("$352_6", DataFieldType.$352.getDisplayCode(), TagField.$6, "6", "marc.tf352.6.label.key", false ),
				new TagFieldTypeData("$352_8", DataFieldType.$352.getDisplayCode(), TagField.$8, "8", "marc.tf352.8.label.key", true ),} );
		
		case $353: return Arrays.asList( new TagFieldTypeData[] {				new TagFieldTypeData("$353_a", DataFieldType.$353.getDisplayCode(), TagField.$a, "a", "marc.tf353.a.label.key", true ),
				new TagFieldTypeData("$353_b", DataFieldType.$353.getDisplayCode(), TagField.$b, "b", "marc.tf353.b.label.key", true ),
				new TagFieldTypeData("$353_0", DataFieldType.$353.getDisplayCode(), TagField.$0, "0", "marc.tf353.0.label.key", true ),
				new TagFieldTypeData("$353_1", DataFieldType.$353.getDisplayCode(), TagField.$1, "1", "marc.tf353.1.label.key", true ),
				new TagFieldTypeData("$353_2", DataFieldType.$353.getDisplayCode(), TagField.$2, "2", "marc.tf353.2.label.key", false ),
				new TagFieldTypeData("$353_3", DataFieldType.$353.getDisplayCode(), TagField.$3, "3", "marc.tf353.3.label.key", false ),
				new TagFieldTypeData("$353_6", DataFieldType.$353.getDisplayCode(), TagField.$6, "6", "marc.tf353.6.label.key", false ),} );
		
		case $355: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$355_a", DataFieldType.$355.getDisplayCode(), TagField.$a, "a", "marc.tf355.a.label.key", false ),
				new TagFieldTypeData("$355_b", DataFieldType.$355.getDisplayCode(), TagField.$b, "b", "marc.tf355.b.label.key", true ),
				new TagFieldTypeData("$355_c", DataFieldType.$355.getDisplayCode(), TagField.$c, "c", "marc.tf355.c.label.key", true ),
				new TagFieldTypeData("$355_d", DataFieldType.$355.getDisplayCode(), TagField.$d, "d", "marc.tf355.d.label.key", false ),
				new TagFieldTypeData("$355_e", DataFieldType.$355.getDisplayCode(), TagField.$e, "e", "marc.tf355.e.label.key", false ),
				new TagFieldTypeData("$355_f", DataFieldType.$355.getDisplayCode(), TagField.$f, "f", "marc.tf355.f.label.key", false ),
				new TagFieldTypeData("$355_g", DataFieldType.$355.getDisplayCode(), TagField.$g, "g", "marc.tf355.g.label.key", false ),
				new TagFieldTypeData("$355_h", DataFieldType.$355.getDisplayCode(), TagField.$h, "h", "marc.tf355.h.label.key", false ),
				new TagFieldTypeData("$355_j", DataFieldType.$355.getDisplayCode(), TagField.$j, "j", "marc.tf355.j.label.key", true ),
				new TagFieldTypeData("$355_6", DataFieldType.$355.getDisplayCode(), TagField.$6, "6", "marc.tf355.6.label.key", false ),
				new TagFieldTypeData("$355_8", DataFieldType.$355.getDisplayCode(), TagField.$8, "8", "marc.tf355.8.label.key", true ),} );
		
		case $357: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$357_a", DataFieldType.$357.getDisplayCode(), TagField.$a, "a", "marc.tf357.a.label.key", false ),
				new TagFieldTypeData("$357_b", DataFieldType.$357.getDisplayCode(), TagField.$b, "b", "marc.tf357.b.label.key", true ),
				new TagFieldTypeData("$357_c", DataFieldType.$357.getDisplayCode(), TagField.$c, "c", "marc.tf357.c.label.key", true ),
				new TagFieldTypeData("$357_g", DataFieldType.$357.getDisplayCode(), TagField.$g, "g", "marc.tf357.g.label.key", true ),
				new TagFieldTypeData("$357_6", DataFieldType.$357.getDisplayCode(), TagField.$6, "6", "marc.tf357.6.label.key", false ),
				new TagFieldTypeData("$357_8", DataFieldType.$357.getDisplayCode(), TagField.$8, "8", "marc.tf357.8.label.key", true ),} );
		
		case $361: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$361_a", DataFieldType.$361.getDisplayCode(), TagField.$a, "a", "marc.tf361.a.label.key", false ),
				new TagFieldTypeData("$361_f", DataFieldType.$361.getDisplayCode(), TagField.$f, "f", "marc.tf361.f.label.key", true ),
				new TagFieldTypeData("$361_k", DataFieldType.$361.getDisplayCode(), TagField.$k, "k", "marc.tf361.k.label.key", false ),
				new TagFieldTypeData("$361_l", DataFieldType.$361.getDisplayCode(), TagField.$l, "l", "marc.tf361.l.label.key", false ),
				new TagFieldTypeData("$361_o", DataFieldType.$361.getDisplayCode(), TagField.$o, "o", "marc.tf361.o.label.key", true ),
				new TagFieldTypeData("$361_s", DataFieldType.$361.getDisplayCode(), TagField.$s, "s", "marc.tf361.s.label.key", false ),
				new TagFieldTypeData("$361_u", DataFieldType.$361.getDisplayCode(), TagField.$u, "u", "marc.tf361.u.label.key", true ),
				new TagFieldTypeData("$361_x", DataFieldType.$361.getDisplayCode(), TagField.$x, "x", "marc.tf361.x.label.key", true ),
				new TagFieldTypeData("$361_y", DataFieldType.$361.getDisplayCode(), TagField.$y, "y", "marc.tf361.y.label.key", false ),
				new TagFieldTypeData("$361_z", DataFieldType.$361.getDisplayCode(), TagField.$z, "z", "marc.tf361.z.label.key", true ),
				new TagFieldTypeData("$361_0", DataFieldType.$361.getDisplayCode(), TagField.$0, "0", "marc.tf361.0.label.key", true ),
				new TagFieldTypeData("$361_1", DataFieldType.$361.getDisplayCode(), TagField.$1, "1", "marc.tf361.1.label.key", true ),
				new TagFieldTypeData("$361_3", DataFieldType.$361.getDisplayCode(), TagField.$3, "3", "marc.tf361.3.label.key", false ),
				new TagFieldTypeData("$361_5", DataFieldType.$361.getDisplayCode(), TagField.$5, "5", "marc.tf361.5.label.key", false ),
				new TagFieldTypeData("$361_6", DataFieldType.$361.getDisplayCode(), TagField.$6, "6", "marc.tf361.6.label.key", false ),
				new TagFieldTypeData("$361_7", DataFieldType.$361.getDisplayCode(), TagField.$7, "7", "marc.tf361.7.label.key", true ),
				new TagFieldTypeData("$361_8", DataFieldType.$361.getDisplayCode(), TagField.$8, "8", "marc.tf361.8.label.key", true ),} );
		
		case $362: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$362_a", DataFieldType.$362.getDisplayCode(), TagField.$a, "a", "marc.tf362.a.label.key", false ),
				new TagFieldTypeData("$362_z", DataFieldType.$362.getDisplayCode(), TagField.$z, "z", "marc.tf362.z.label.key", false ),
				new TagFieldTypeData("$362_6", DataFieldType.$362.getDisplayCode(), TagField.$6, "6", "marc.tf362.6.label.key", false ),
				new TagFieldTypeData("$362_8", DataFieldType.$362.getDisplayCode(), TagField.$8, "8", "marc.tf362.8.label.key", true ),} );
		
		case $363: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$363_a", DataFieldType.$363.getDisplayCode(), TagField.$a, "a", "marc.tf363.a.label.key", false ),
				new TagFieldTypeData("$363_b", DataFieldType.$363.getDisplayCode(), TagField.$b, "b", "marc.tf363.b.label.key", false ),
				new TagFieldTypeData("$363_c", DataFieldType.$363.getDisplayCode(), TagField.$c, "c", "marc.tf363.c.label.key", false ),
				new TagFieldTypeData("$363_d", DataFieldType.$363.getDisplayCode(), TagField.$d, "d", "marc.tf363.d.label.key", false ),
				new TagFieldTypeData("$363_e", DataFieldType.$363.getDisplayCode(), TagField.$e, "e", "marc.tf363.e.label.key", false ),
				new TagFieldTypeData("$363_f", DataFieldType.$363.getDisplayCode(), TagField.$f, "f", "marc.tf363.f.label.key", false ),
				new TagFieldTypeData("$363_g", DataFieldType.$363.getDisplayCode(), TagField.$g, "g", "marc.tf363.g.label.key", false ),
				new TagFieldTypeData("$363_h", DataFieldType.$363.getDisplayCode(), TagField.$h, "h", "marc.tf363.h.label.key", false ),
				new TagFieldTypeData("$363_i", DataFieldType.$363.getDisplayCode(), TagField.$i, "i", "marc.tf363.i.label.key", false ),
				new TagFieldTypeData("$363_j", DataFieldType.$363.getDisplayCode(), TagField.$j, "j", "marc.tf363.j.label.key", false ),
				new TagFieldTypeData("$363_k", DataFieldType.$363.getDisplayCode(), TagField.$k, "k", "marc.tf363.k.label.key", false ),
				new TagFieldTypeData("$363_l", DataFieldType.$363.getDisplayCode(), TagField.$l, "l", "marc.tf363.l.label.key", false ),
				new TagFieldTypeData("$363_m", DataFieldType.$363.getDisplayCode(), TagField.$m, "m", "marc.tf363.m.label.key", false ),
				new TagFieldTypeData("$363_u", DataFieldType.$363.getDisplayCode(), TagField.$u, "u", "marc.tf363.u.label.key", false ),
				new TagFieldTypeData("$363_v", DataFieldType.$363.getDisplayCode(), TagField.$v, "v", "marc.tf363.v.label.key", false ),
				new TagFieldTypeData("$363_x", DataFieldType.$363.getDisplayCode(), TagField.$x, "x", "marc.tf363.x.label.key", true ),
				new TagFieldTypeData("$363_z", DataFieldType.$363.getDisplayCode(), TagField.$z, "z", "marc.tf363.z.label.key", true ),
				new TagFieldTypeData("$363_6", DataFieldType.$363.getDisplayCode(), TagField.$6, "6", "marc.tf363.6.label.key", false ),
				new TagFieldTypeData("$363_8", DataFieldType.$363.getDisplayCode(), TagField.$8, "8", "marc.tf363.8.label.key", false ),} );
		
		case $365: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$365_a", DataFieldType.$365.getDisplayCode(), TagField.$a, "a", "marc.tf365.a.label.key", false ),
				new TagFieldTypeData("$365_b", DataFieldType.$365.getDisplayCode(), TagField.$b, "b", "marc.tf365.b.label.key", false ),
				new TagFieldTypeData("$365_c", DataFieldType.$365.getDisplayCode(), TagField.$c, "c", "marc.tf365.c.label.key", false ),
				new TagFieldTypeData("$365_d", DataFieldType.$365.getDisplayCode(), TagField.$d, "d", "marc.tf365.d.label.key", false ),
				new TagFieldTypeData("$365_e", DataFieldType.$365.getDisplayCode(), TagField.$e, "e", "marc.tf365.e.label.key", false ),
				new TagFieldTypeData("$365_f", DataFieldType.$365.getDisplayCode(), TagField.$f, "f", "marc.tf365.f.label.key", false ),
				new TagFieldTypeData("$365_g", DataFieldType.$365.getDisplayCode(), TagField.$g, "g", "marc.tf365.g.label.key", false ),
				new TagFieldTypeData("$365_h", DataFieldType.$365.getDisplayCode(), TagField.$h, "h", "marc.tf365.h.label.key", false ),
				new TagFieldTypeData("$365_i", DataFieldType.$365.getDisplayCode(), TagField.$i, "i", "marc.tf365.i.label.key", false ),
				new TagFieldTypeData("$365_j", DataFieldType.$365.getDisplayCode(), TagField.$j, "j", "marc.tf365.j.label.key", false ),
				new TagFieldTypeData("$365_k", DataFieldType.$365.getDisplayCode(), TagField.$k, "k", "marc.tf365.k.label.key", false ),
				new TagFieldTypeData("$365_m", DataFieldType.$365.getDisplayCode(), TagField.$m, "m", "marc.tf365.m.label.key", false ),
				new TagFieldTypeData("$365_2", DataFieldType.$365.getDisplayCode(), TagField.$2, "2", "marc.tf365.2.label.key", false ),
				new TagFieldTypeData("$365_6", DataFieldType.$365.getDisplayCode(), TagField.$6, "6", "marc.tf365.6.label.key", false ),
				new TagFieldTypeData("$365_8", DataFieldType.$365.getDisplayCode(), TagField.$8, "8", "marc.tf365.8.label.key", true ),} );
		
		case $366: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$366_a", DataFieldType.$366.getDisplayCode(), TagField.$a, "a", "marc.tf366.a.label.key", false ),
				new TagFieldTypeData("$366_b", DataFieldType.$366.getDisplayCode(), TagField.$b, "b", "marc.tf366.b.label.key", false ),
				new TagFieldTypeData("$366_c", DataFieldType.$366.getDisplayCode(), TagField.$c, "c", "marc.tf366.c.label.key", false ),
				new TagFieldTypeData("$366_d", DataFieldType.$366.getDisplayCode(), TagField.$d, "d", "marc.tf366.d.label.key", false ),
				new TagFieldTypeData("$366_e", DataFieldType.$366.getDisplayCode(), TagField.$e, "e", "marc.tf366.e.label.key", false ),
				new TagFieldTypeData("$366_f", DataFieldType.$366.getDisplayCode(), TagField.$f, "f", "marc.tf366.f.label.key", false ),
				new TagFieldTypeData("$366_g", DataFieldType.$366.getDisplayCode(), TagField.$g, "g", "marc.tf366.g.label.key", false ),
				new TagFieldTypeData("$366_j", DataFieldType.$366.getDisplayCode(), TagField.$j, "j", "marc.tf366.j.label.key", false ),
				new TagFieldTypeData("$366_k", DataFieldType.$366.getDisplayCode(), TagField.$k, "k", "marc.tf366.k.label.key", false ),
				new TagFieldTypeData("$366_m", DataFieldType.$366.getDisplayCode(), TagField.$m, "m", "marc.tf366.m.label.key", false ),
				new TagFieldTypeData("$366_2", DataFieldType.$366.getDisplayCode(), TagField.$2, "2", "marc.tf366.2.label.key", false ),
				new TagFieldTypeData("$366_6", DataFieldType.$366.getDisplayCode(), TagField.$6, "6", "marc.tf366.6.label.key", false ),
				new TagFieldTypeData("$366_8", DataFieldType.$366.getDisplayCode(), TagField.$8, "8", "marc.tf366.8.label.key", true ),} );
		
		case $370: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$370_c", DataFieldType.$370.getDisplayCode(), TagField.$c, "c", "marc.tf370.c.label.key", true ),
				new TagFieldTypeData("$370_f", DataFieldType.$370.getDisplayCode(), TagField.$f, "f", "marc.tf370.f.label.key", true ),
				new TagFieldTypeData("$370_g", DataFieldType.$370.getDisplayCode(), TagField.$g, "g", "marc.tf370.g.label.key", true ),
				new TagFieldTypeData("$370_i", DataFieldType.$370.getDisplayCode(), TagField.$i, "i", "marc.tf370.i.label.key", true ),
				new TagFieldTypeData("$370_s", DataFieldType.$370.getDisplayCode(), TagField.$s, "s", "marc.tf370.s.label.key", false ),
				new TagFieldTypeData("$370_t", DataFieldType.$370.getDisplayCode(), TagField.$t, "t", "marc.tf370.t.label.key", false ),
				new TagFieldTypeData("$370_u", DataFieldType.$370.getDisplayCode(), TagField.$u, "u", "marc.tf370.u.label.key", true ),
				new TagFieldTypeData("$370_v", DataFieldType.$370.getDisplayCode(), TagField.$v, "v", "marc.tf370.v.label.key", true ),
				new TagFieldTypeData("$370_0", DataFieldType.$370.getDisplayCode(), TagField.$0, "0", "marc.tf370.0.label.key", true ),
				new TagFieldTypeData("$370_1", DataFieldType.$370.getDisplayCode(), TagField.$1, "1", "marc.tf370.1.label.key", true ),
				new TagFieldTypeData("$370_2", DataFieldType.$370.getDisplayCode(), TagField.$2, "2", "marc.tf370.2.label.key", false ),
				new TagFieldTypeData("$370_3", DataFieldType.$370.getDisplayCode(), TagField.$3, "3", "marc.tf370.3.label.key", false ),
				new TagFieldTypeData("$370_4", DataFieldType.$370.getDisplayCode(), TagField.$4, "4", "marc.tf370.4.label.key", true ),
				new TagFieldTypeData("$370_6", DataFieldType.$370.getDisplayCode(), TagField.$6, "6", "marc.tf370.6.label.key", false ),
				new TagFieldTypeData("$370_7", DataFieldType.$370.getDisplayCode(), TagField.$7, "7", "marc.tf370.7.label.key", true ),
				new TagFieldTypeData("$370_8", DataFieldType.$370.getDisplayCode(), TagField.$8, "8", "marc.tf370.8.label.key", true ),} );
		
		case $377: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$377_a", DataFieldType.$377.getDisplayCode(), TagField.$a, "a", "marc.tf377.a.label.key", true ),
				new TagFieldTypeData("$377_l", DataFieldType.$377.getDisplayCode(), TagField.$l, "l", "marc.tf377.l.label.key", true ),
				new TagFieldTypeData("$377_0", DataFieldType.$377.getDisplayCode(), TagField.$0, "0", "marc.tf377.0.label.key", true ),
				new TagFieldTypeData("$377_1", DataFieldType.$377.getDisplayCode(), TagField.$1, "1", "marc.tf377.1.label.key", true ),
				new TagFieldTypeData("$377_2", DataFieldType.$377.getDisplayCode(), TagField.$2, "2", "marc.tf377.2.label.key", false ),
				new TagFieldTypeData("$377_3", DataFieldType.$377.getDisplayCode(), TagField.$3, "3", "marc.tf377.3.label.key", false ),
				new TagFieldTypeData("$377_6", DataFieldType.$377.getDisplayCode(), TagField.$6, "6", "marc.tf377.6.label.key", false ),
				new TagFieldTypeData("$377_7", DataFieldType.$377.getDisplayCode(), TagField.$7, "7", "marc.tf377.7.label.key", true ),
				new TagFieldTypeData("$377_8", DataFieldType.$377.getDisplayCode(), TagField.$8, "8", "marc.tf377.8.label.key", true ),} );
		
		case $380: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$380_a", DataFieldType.$380.getDisplayCode(), TagField.$a, "a", "marc.tf380.a.label.key", true ),
				new TagFieldTypeData("$380_0", DataFieldType.$380.getDisplayCode(), TagField.$0, "0", "marc.tf380.0.label.key", true ),
				new TagFieldTypeData("$380_1", DataFieldType.$380.getDisplayCode(), TagField.$1, "1", "marc.tf380.1.label.key", true ),
				new TagFieldTypeData("$380_2", DataFieldType.$380.getDisplayCode(), TagField.$2, "2", "marc.tf380.2.label.key", false ),
				new TagFieldTypeData("$380_3", DataFieldType.$380.getDisplayCode(), TagField.$3, "3", "marc.tf380.3.label.key", false ),
				new TagFieldTypeData("$380_6", DataFieldType.$380.getDisplayCode(), TagField.$6, "6", "marc.tf380.6.label.key", false ),
				new TagFieldTypeData("$380_7", DataFieldType.$380.getDisplayCode(), TagField.$7, "7", "marc.tf380.7.label.key", true ),
				new TagFieldTypeData("$380_8", DataFieldType.$380.getDisplayCode(), TagField.$8, "8", "marc.tf380.8.label.key", true ),} );
		
		case $381: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$381_a", DataFieldType.$381.getDisplayCode(), TagField.$a, "a", "marc.tf381.a.label.key", true ),
				new TagFieldTypeData("$381_u", DataFieldType.$381.getDisplayCode(), TagField.$u, "u", "marc.tf381.u.label.key", true ),
				new TagFieldTypeData("$381_v", DataFieldType.$381.getDisplayCode(), TagField.$v, "v", "marc.tf381.v.label.key", true ),
				new TagFieldTypeData("$381_0", DataFieldType.$381.getDisplayCode(), TagField.$0, "0", "marc.tf381.0.label.key", true ),
				new TagFieldTypeData("$381_1", DataFieldType.$381.getDisplayCode(), TagField.$1, "1", "marc.tf381.1.label.key", true ),
				new TagFieldTypeData("$381_2", DataFieldType.$381.getDisplayCode(), TagField.$2, "2", "marc.tf381.2.label.key", false ),
				new TagFieldTypeData("$381_3", DataFieldType.$381.getDisplayCode(), TagField.$3, "3", "marc.tf381.3.label.key", false ),
				new TagFieldTypeData("$381_6", DataFieldType.$381.getDisplayCode(), TagField.$6, "6", "marc.tf381.6.label.key", false ),
				new TagFieldTypeData("$381_7", DataFieldType.$381.getDisplayCode(), TagField.$7, "7", "marc.tf381.7.label.key", true ),
				new TagFieldTypeData("$381_8", DataFieldType.$381.getDisplayCode(), TagField.$8, "8", "marc.tf381.8.label.key", true ),} );
		
		case $382: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$382_a", DataFieldType.$382.getDisplayCode(), TagField.$a, "a", "marc.tf382.a.label.key", true ),
				new TagFieldTypeData("$382_b", DataFieldType.$382.getDisplayCode(), TagField.$b, "b", "marc.tf382.b.label.key", true ),
				new TagFieldTypeData("$382_d", DataFieldType.$382.getDisplayCode(), TagField.$d, "d", "marc.tf382.d.label.key", true ),
				new TagFieldTypeData("$382_e", DataFieldType.$382.getDisplayCode(), TagField.$e, "e", "marc.tf382.e.label.key", true ),
				new TagFieldTypeData("$382_n", DataFieldType.$382.getDisplayCode(), TagField.$n, "n", "marc.tf382.n.label.key", true ),
				new TagFieldTypeData("$382_p", DataFieldType.$382.getDisplayCode(), TagField.$p, "p", "marc.tf382.p.label.key", true ),
				new TagFieldTypeData("$382_r", DataFieldType.$382.getDisplayCode(), TagField.$r, "r", "marc.tf382.r.label.key", false ),
				new TagFieldTypeData("$382_s", DataFieldType.$382.getDisplayCode(), TagField.$s, "s", "marc.tf382.s.label.key", false ),
				new TagFieldTypeData("$382_t", DataFieldType.$382.getDisplayCode(), TagField.$t, "t", "marc.tf382.t.label.key", false ),
				new TagFieldTypeData("$382_v", DataFieldType.$382.getDisplayCode(), TagField.$v, "v", "marc.tf382.v.label.key", true ),
				new TagFieldTypeData("$382_0", DataFieldType.$382.getDisplayCode(), TagField.$0, "0", "marc.tf382.0.label.key", true ),
				new TagFieldTypeData("$382_1", DataFieldType.$382.getDisplayCode(), TagField.$1, "1", "marc.tf382.1.label.key", true ),
				new TagFieldTypeData("$382_2", DataFieldType.$382.getDisplayCode(), TagField.$2, "2", "marc.tf382.2.label.key", false ),
				new TagFieldTypeData("$382_3", DataFieldType.$382.getDisplayCode(), TagField.$3, "3", "marc.tf382.3.label.key", false ),
				new TagFieldTypeData("$382_6", DataFieldType.$382.getDisplayCode(), TagField.$6, "6", "marc.tf382.6.label.key", false ),
				new TagFieldTypeData("$382_7", DataFieldType.$382.getDisplayCode(), TagField.$7, "7", "marc.tf382.7.label.key", true ),
				new TagFieldTypeData("$382_8", DataFieldType.$382.getDisplayCode(), TagField.$8, "8", "marc.tf382.8.label.key", true ),} );
		
		case $383: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$383_a", DataFieldType.$383.getDisplayCode(), TagField.$a, "a", "marc.tf383.a.label.key", true ),
				new TagFieldTypeData("$383_b", DataFieldType.$383.getDisplayCode(), TagField.$b, "b", "marc.tf383.b.label.key", true ),
				new TagFieldTypeData("$383_c", DataFieldType.$383.getDisplayCode(), TagField.$c, "c", "marc.tf383.c.label.key", true ),
				new TagFieldTypeData("$383_d", DataFieldType.$383.getDisplayCode(), TagField.$d, "d", "marc.tf383.d.label.key", false ),
				new TagFieldTypeData("$383_e", DataFieldType.$383.getDisplayCode(), TagField.$e, "e", "marc.tf383.e.label.key", false ),
				new TagFieldTypeData("$383_2", DataFieldType.$383.getDisplayCode(), TagField.$2, "2", "marc.tf383.2.label.key", false ),
				new TagFieldTypeData("$383_3", DataFieldType.$383.getDisplayCode(), TagField.$3, "3", "marc.tf383.3.label.key", false ),
				new TagFieldTypeData("$383_6", DataFieldType.$383.getDisplayCode(), TagField.$6, "6", "marc.tf383.6.label.key", false ),
				new TagFieldTypeData("$383_7", DataFieldType.$383.getDisplayCode(), TagField.$7, "7", "marc.tf383.7.label.key", true ),
				new TagFieldTypeData("$383_8", DataFieldType.$383.getDisplayCode(), TagField.$8, "8", "marc.tf383.8.label.key", true ),} );
		
		case $384: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$384_a", DataFieldType.$384.getDisplayCode(), TagField.$a, "a", "marc.tf384.a.label.key", false ),
				new TagFieldTypeData("$384_0", DataFieldType.$384.getDisplayCode(), TagField.$0, "0", "marc.tf384.0.label.key", true ),
				new TagFieldTypeData("$384_1", DataFieldType.$384.getDisplayCode(), TagField.$1, "1", "marc.tf384.1.label.key", true ),
				new TagFieldTypeData("$384_3", DataFieldType.$384.getDisplayCode(), TagField.$3, "3", "marc.tf384.3.label.key", false ),
				new TagFieldTypeData("$384_6", DataFieldType.$384.getDisplayCode(), TagField.$6, "6", "marc.tf384.6.label.key", false ),
				new TagFieldTypeData("$384_7", DataFieldType.$384.getDisplayCode(), TagField.$7, "7", "marc.tf384.7.label.key", true ),
				new TagFieldTypeData("$384_8", DataFieldType.$384.getDisplayCode(), TagField.$8, "8", "marc.tf384.8.label.key", true ),} );
		
		case $385: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$385_a", DataFieldType.$385.getDisplayCode(), TagField.$a, "a", "marc.tf385.a.label.key", true ),
				new TagFieldTypeData("$385_b", DataFieldType.$385.getDisplayCode(), TagField.$b, "b", "marc.tf385.b.label.key", true ),
				new TagFieldTypeData("$385_m", DataFieldType.$385.getDisplayCode(), TagField.$m, "m", "marc.tf385.m.label.key", false ),
				new TagFieldTypeData("$385_n", DataFieldType.$385.getDisplayCode(), TagField.$n, "n", "marc.tf385.n.label.key", false ),
				new TagFieldTypeData("$385_0", DataFieldType.$385.getDisplayCode(), TagField.$0, "0", "marc.tf385.0.label.key", true ),
				new TagFieldTypeData("$385_1", DataFieldType.$385.getDisplayCode(), TagField.$1, "1", "marc.tf385.1.label.key", true ),
				new TagFieldTypeData("$385_2", DataFieldType.$385.getDisplayCode(), TagField.$2, "2", "marc.tf385.2.label.key", false ),
				new TagFieldTypeData("$385_3", DataFieldType.$385.getDisplayCode(), TagField.$3, "3", "marc.tf385.3.label.key", false ),
				new TagFieldTypeData("$385_6", DataFieldType.$385.getDisplayCode(), TagField.$6, "6", "marc.tf385.6.label.key", false ),
				new TagFieldTypeData("$385_7", DataFieldType.$385.getDisplayCode(), TagField.$7, "7", "marc.tf385.7.label.key", true ),
				new TagFieldTypeData("$385_8", DataFieldType.$385.getDisplayCode(), TagField.$8, "8", "marc.tf385.8.label.key", true ),} );
		
		case $386: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$386_a", DataFieldType.$386.getDisplayCode(), TagField.$a, "a", "marc.tf386.a.label.key", true ),
				new TagFieldTypeData("$386_b", DataFieldType.$386.getDisplayCode(), TagField.$b, "b", "marc.tf386.b.label.key", true ),
				new TagFieldTypeData("$386_i", DataFieldType.$386.getDisplayCode(), TagField.$i, "i", "marc.tf386.i.label.key", true ),
				new TagFieldTypeData("$386_m", DataFieldType.$386.getDisplayCode(), TagField.$m, "m", "marc.tf386.m.label.key", false ),
				new TagFieldTypeData("$386_n", DataFieldType.$386.getDisplayCode(), TagField.$n, "n", "marc.tf386.n.label.key", false ),
				new TagFieldTypeData("$386_0", DataFieldType.$386.getDisplayCode(), TagField.$0, "0", "marc.tf386.0.label.key", true ),
				new TagFieldTypeData("$386_1", DataFieldType.$386.getDisplayCode(), TagField.$1, "1", "marc.tf386.1.label.key", true ),
				new TagFieldTypeData("$386_2", DataFieldType.$386.getDisplayCode(), TagField.$2, "2", "marc.tf386.2.label.key", false ),
				new TagFieldTypeData("$386_3", DataFieldType.$386.getDisplayCode(), TagField.$3, "3", "marc.tf386.3.label.key", false ),
				new TagFieldTypeData("$386_4", DataFieldType.$386.getDisplayCode(), TagField.$4, "4", "marc.tf386.4.label.key", true ),
				new TagFieldTypeData("$386_6", DataFieldType.$386.getDisplayCode(), TagField.$6, "6", "marc.tf386.6.label.key", false ),
				new TagFieldTypeData("$386_7", DataFieldType.$386.getDisplayCode(), TagField.$7, "7", "marc.tf386.7.label.key", true ),
				new TagFieldTypeData("$386_8", DataFieldType.$386.getDisplayCode(), TagField.$8, "8", "marc.tf386.8.label.key", true ),} );
		
		case $387: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$387_a", DataFieldType.$387.getDisplayCode(), TagField.$a, "a", "marc.tf387.a.label.key", true ),
				new TagFieldTypeData("$387_b", DataFieldType.$387.getDisplayCode(), TagField.$b, "b", "marc.tf387.b.label.key", true ),
				new TagFieldTypeData("$387_c", DataFieldType.$387.getDisplayCode(), TagField.$c, "c", "marc.tf387.c.label.key", true ),
				new TagFieldTypeData("$387_d", DataFieldType.$387.getDisplayCode(), TagField.$d, "d", "marc.tf387.d.label.key", true ),
				new TagFieldTypeData("$387_e", DataFieldType.$387.getDisplayCode(), TagField.$e, "e", "marc.tf387.e.label.key", true ),
				new TagFieldTypeData("$387_f", DataFieldType.$387.getDisplayCode(), TagField.$f, "f", "marc.tf387.f.label.key", true ),
				new TagFieldTypeData("$387_g", DataFieldType.$387.getDisplayCode(), TagField.$g, "g", "marc.tf387.g.label.key", true ),
				new TagFieldTypeData("$387_h", DataFieldType.$387.getDisplayCode(), TagField.$h, "h", "marc.tf387.h.label.key", true ),
				new TagFieldTypeData("$387_i", DataFieldType.$387.getDisplayCode(), TagField.$i, "i", "marc.tf387.i.label.key", true ),
				new TagFieldTypeData("$387_j", DataFieldType.$387.getDisplayCode(), TagField.$j, "j", "marc.tf387.j.label.key", true ),
				new TagFieldTypeData("$387_k", DataFieldType.$387.getDisplayCode(), TagField.$k, "k", "marc.tf387.k.label.key", true ),
				new TagFieldTypeData("$387_l", DataFieldType.$387.getDisplayCode(), TagField.$l, "l", "marc.tf387.l.label.key", true ),
				new TagFieldTypeData("$387_m", DataFieldType.$387.getDisplayCode(), TagField.$m, "m", "marc.tf387.m.label.key", true ),
				new TagFieldTypeData("$387_0", DataFieldType.$387.getDisplayCode(), TagField.$0, "0", "marc.tf387.0.label.key", true ),
				new TagFieldTypeData("$387_1", DataFieldType.$387.getDisplayCode(), TagField.$1, "1", "marc.tf387.1.label.key", true ),
				new TagFieldTypeData("$387_2", DataFieldType.$387.getDisplayCode(), TagField.$2, "2", "marc.tf387.2.label.key", false ),
				new TagFieldTypeData("$387_3", DataFieldType.$387.getDisplayCode(), TagField.$3, "3", "marc.tf387.3.label.key", false ),
				new TagFieldTypeData("$387_6", DataFieldType.$387.getDisplayCode(), TagField.$6, "6", "marc.tf387.6.label.key", false ),
				new TagFieldTypeData("$387_7", DataFieldType.$387.getDisplayCode(), TagField.$7, "7", "marc.tf387.7.label.key", true ),
				new TagFieldTypeData("$387_8", DataFieldType.$387.getDisplayCode(), TagField.$8, "8", "marc.tf387.8.label.key", true ),} );
		
		case $388: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$388_a", DataFieldType.$388.getDisplayCode(), TagField.$a, "a", "marc.tf388.a.label.key", true ),
				new TagFieldTypeData("$388_0", DataFieldType.$388.getDisplayCode(), TagField.$0, "0", "marc.tf388.0.label.key", true ),
				new TagFieldTypeData("$388_1", DataFieldType.$388.getDisplayCode(), TagField.$1, "1", "marc.tf388.1.label.key", true ),
				new TagFieldTypeData("$388_2", DataFieldType.$388.getDisplayCode(), TagField.$2, "2", "marc.tf388.2.label.key", false ),
				new TagFieldTypeData("$388_3", DataFieldType.$388.getDisplayCode(), TagField.$3, "3", "marc.tf388.3.label.key", false ),
				new TagFieldTypeData("$388_6", DataFieldType.$388.getDisplayCode(), TagField.$6, "6", "marc.tf388.6.label.key", false ),
				new TagFieldTypeData("$388_7", DataFieldType.$388.getDisplayCode(), TagField.$7, "7", "marc.tf388.7.label.key", true ),
				new TagFieldTypeData("$388_8", DataFieldType.$388.getDisplayCode(), TagField.$8, "8", "marc.tf388.8.label.key", true ),} );
		
		case $490: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$490_a", DataFieldType.$490.getDisplayCode(), TagField.$a, "a", "marc.tf490.a.label.key", true ),
				new TagFieldTypeData("$490_l", DataFieldType.$490.getDisplayCode(), TagField.$l, "l", "marc.tf490.l.label.key", false ),
				new TagFieldTypeData("$490_v", DataFieldType.$490.getDisplayCode(), TagField.$v, "v", "marc.tf490.v.label.key", true ),
				new TagFieldTypeData("$490_x", DataFieldType.$490.getDisplayCode(), TagField.$x, "x", "marc.tf490.x.label.key", true ),
				new TagFieldTypeData("$490_y", DataFieldType.$490.getDisplayCode(), TagField.$y, "y", "marc.tf490.y.label.key", true ),
				new TagFieldTypeData("$490_z", DataFieldType.$490.getDisplayCode(), TagField.$z, "z", "marc.tf490.z.label.key", true ),
				new TagFieldTypeData("$490_3", DataFieldType.$490.getDisplayCode(), TagField.$3, "3", "marc.tf490.3.label.key", false ),
				new TagFieldTypeData("$490_6", DataFieldType.$490.getDisplayCode(), TagField.$6, "6", "marc.tf490.6.label.key", false ),
				new TagFieldTypeData("$490_7", DataFieldType.$490.getDisplayCode(), TagField.$7, "7", "marc.tf490.7.label.key", true ),
				new TagFieldTypeData("$490_8", DataFieldType.$490.getDisplayCode(), TagField.$8, "8", "marc.tf490.8.label.key", true ),} );
		
		case $400: return Arrays.asList( new TagFieldTypeData[] {} );
		case $410: return Arrays.asList( new TagFieldTypeData[] {} );
		case $411: return Arrays.asList( new TagFieldTypeData[] {} );
		case $440: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$440_a", DataFieldType.$440.getDisplayCode(), TagField.$a, "a", "marc.tf440.a.label.key", false ),
				new TagFieldTypeData("$440_n", DataFieldType.$440.getDisplayCode(), TagField.$n, "n", "marc.tf440.n.label.key", true ),
				new TagFieldTypeData("$440_p", DataFieldType.$440.getDisplayCode(), TagField.$p, "p", "marc.tf440.p.label.key", true ),
				new TagFieldTypeData("$440_v", DataFieldType.$440.getDisplayCode(), TagField.$v, "v", "marc.tf440.v.label.key", false ),
				new TagFieldTypeData("$440_x", DataFieldType.$440.getDisplayCode(), TagField.$x, "x", "marc.tf440.x.label.key", false ),} );
		
		case $500: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$500_a", DataFieldType.$500.getDisplayCode(), TagField.$a, "a", "marc.tf500.a.label.key", false ),
				new TagFieldTypeData("$500_3", DataFieldType.$500.getDisplayCode(), TagField.$3, "3", "marc.tf500.3.label.key", false ),
				new TagFieldTypeData("$500_5", DataFieldType.$500.getDisplayCode(), TagField.$5, "5", "marc.tf500.5.label.key", false ),
				new TagFieldTypeData("$500_6", DataFieldType.$500.getDisplayCode(), TagField.$6, "6", "marc.tf500.6.label.key", false ),
				new TagFieldTypeData("$500_7", DataFieldType.$500.getDisplayCode(), TagField.$7, "7", "marc.tf500.7.label.key", true ),
				new TagFieldTypeData("$500_8", DataFieldType.$500.getDisplayCode(), TagField.$8, "8", "marc.tf500.8.label.key", true ),} );
		
		case $501: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$501_a", DataFieldType.$501.getDisplayCode(), TagField.$a, "a", "marc.tf501.a.label.key", false ),
				new TagFieldTypeData("$501_5", DataFieldType.$501.getDisplayCode(), TagField.$5, "5", "marc.tf501.5.label.key", false ),
				new TagFieldTypeData("$501_6", DataFieldType.$501.getDisplayCode(), TagField.$6, "6", "marc.tf501.6.label.key", false ),
				new TagFieldTypeData("$501_7", DataFieldType.$501.getDisplayCode(), TagField.$7, "7", "marc.tf501.7.label.key", true ),
				new TagFieldTypeData("$501_8", DataFieldType.$501.getDisplayCode(), TagField.$8, "8", "marc.tf501.8.label.key", true ),} );
		
		case $502: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$502_a", DataFieldType.$502.getDisplayCode(), TagField.$a, "a", "marc.tf502.a.label.key", false ),
				new TagFieldTypeData("$502_b", DataFieldType.$502.getDisplayCode(), TagField.$b, "b", "marc.tf502.b.label.key", false ),
				new TagFieldTypeData("$502_c", DataFieldType.$502.getDisplayCode(), TagField.$c, "c", "marc.tf502.c.label.key", false ),
				new TagFieldTypeData("$502_d", DataFieldType.$502.getDisplayCode(), TagField.$d, "d", "marc.tf502.d.label.key", false ),
				new TagFieldTypeData("$502_g", DataFieldType.$502.getDisplayCode(), TagField.$g, "g", "marc.tf502.g.label.key", true ),
				new TagFieldTypeData("$502_o", DataFieldType.$502.getDisplayCode(), TagField.$o, "o", "marc.tf502.o.label.key", true ),
				new TagFieldTypeData("$502_6", DataFieldType.$502.getDisplayCode(), TagField.$6, "6", "marc.tf502.6.label.key", false ),
				new TagFieldTypeData("$502_7", DataFieldType.$502.getDisplayCode(), TagField.$7, "7", "marc.tf502.7.label.key", true ),
				new TagFieldTypeData("$502_8", DataFieldType.$502.getDisplayCode(), TagField.$8, "8", "marc.tf502.8.label.key", true ),} );
		
		case $504: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$504_a", DataFieldType.$504.getDisplayCode(), TagField.$a, "a", "marc.tf504.a.label.key", false ),
				new TagFieldTypeData("$504_b", DataFieldType.$504.getDisplayCode(), TagField.$b, "b", "marc.tf504.b.label.key", false ),
				new TagFieldTypeData("$504_6", DataFieldType.$504.getDisplayCode(), TagField.$6, "6", "marc.tf504.6.label.key", false ),
				new TagFieldTypeData("$504_8", DataFieldType.$504.getDisplayCode(), TagField.$8, "8", "marc.tf504.8.label.key", true ),} );
		
		case $505: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$505_a", DataFieldType.$505.getDisplayCode(), TagField.$a, "a", "marc.tf505.a.label.key", false ),
				new TagFieldTypeData("$505_g", DataFieldType.$505.getDisplayCode(), TagField.$g, "g", "marc.tf505.g.label.key", true ),
				new TagFieldTypeData("$505_r", DataFieldType.$505.getDisplayCode(), TagField.$r, "r", "marc.tf505.r.label.key", true ),
				new TagFieldTypeData("$505_t", DataFieldType.$505.getDisplayCode(), TagField.$t, "t", "marc.tf505.t.label.key", true ),
				new TagFieldTypeData("$505_u", DataFieldType.$505.getDisplayCode(), TagField.$u, "u", "marc.tf505.u.label.key", true ),
				new TagFieldTypeData("$505_6", DataFieldType.$505.getDisplayCode(), TagField.$6, "6", "marc.tf505.6.label.key", false ),
				new TagFieldTypeData("$505_7", DataFieldType.$505.getDisplayCode(), TagField.$7, "7", "marc.tf505.7.label.key", true ),
				new TagFieldTypeData("$505_8", DataFieldType.$505.getDisplayCode(), TagField.$8, "8", "marc.tf505.8.label.key", true ),} );
		
		case $506: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$506_a", DataFieldType.$506.getDisplayCode(), TagField.$a, "a", "marc.tf506.a.label.key", false ),
				new TagFieldTypeData("$506_b", DataFieldType.$506.getDisplayCode(), TagField.$b, "b", "marc.tf506.b.label.key", true ),
				new TagFieldTypeData("$506_c", DataFieldType.$506.getDisplayCode(), TagField.$c, "c", "marc.tf506.c.label.key", true ),
				new TagFieldTypeData("$506_d", DataFieldType.$506.getDisplayCode(), TagField.$d, "d", "marc.tf506.d.label.key", true ),
				new TagFieldTypeData("$506_e", DataFieldType.$506.getDisplayCode(), TagField.$e, "e", "marc.tf506.e.label.key", true ),
				new TagFieldTypeData("$506_f", DataFieldType.$506.getDisplayCode(), TagField.$f, "f", "marc.tf506.f.label.key", true ),
				new TagFieldTypeData("$506_g", DataFieldType.$506.getDisplayCode(), TagField.$g, "g", "marc.tf506.g.label.key", true ),
				new TagFieldTypeData("$506_q", DataFieldType.$506.getDisplayCode(), TagField.$q, "q", "marc.tf506.q.label.key", false ),
				new TagFieldTypeData("$506_u", DataFieldType.$506.getDisplayCode(), TagField.$u, "u", "marc.tf506.u.label.key", true ),
				new TagFieldTypeData("$506_2", DataFieldType.$506.getDisplayCode(), TagField.$2, "2", "marc.tf506.2.label.key", false ),
				new TagFieldTypeData("$506_3", DataFieldType.$506.getDisplayCode(), TagField.$3, "3", "marc.tf506.3.label.key", false ),
				new TagFieldTypeData("$506_5", DataFieldType.$506.getDisplayCode(), TagField.$5, "5", "marc.tf506.5.label.key", false ),
				new TagFieldTypeData("$506_6", DataFieldType.$506.getDisplayCode(), TagField.$6, "6", "marc.tf506.6.label.key", false ),
				new TagFieldTypeData("$506_8", DataFieldType.$506.getDisplayCode(), TagField.$8, "8", "marc.tf506.8.label.key", true ),} );
		
		case $507: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$507_a", DataFieldType.$507.getDisplayCode(), TagField.$a, "a", "marc.tf507.a.label.key", false ),
				new TagFieldTypeData("$507_b", DataFieldType.$507.getDisplayCode(), TagField.$b, "b", "marc.tf507.b.label.key", false ),
				new TagFieldTypeData("$507_6", DataFieldType.$507.getDisplayCode(), TagField.$6, "6", "marc.tf507.6.label.key", false ),
				new TagFieldTypeData("$507_8", DataFieldType.$507.getDisplayCode(), TagField.$8, "8", "marc.tf507.8.label.key", true ),} );
		
		case $508: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$508_a", DataFieldType.$508.getDisplayCode(), TagField.$a, "a", "marc.tf508.a.label.key", false ),
				new TagFieldTypeData("$508_6", DataFieldType.$508.getDisplayCode(), TagField.$6, "6", "marc.tf508.6.label.key", false ),
				new TagFieldTypeData("$508_7", DataFieldType.$508.getDisplayCode(), TagField.$7, "7", "marc.tf508.7.label.key", true ),
				new TagFieldTypeData("$508_8", DataFieldType.$508.getDisplayCode(), TagField.$8, "8", "marc.tf508.8.label.key", true ),} );
		
		case $510: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$510_a", DataFieldType.$510.getDisplayCode(), TagField.$a, "a", "marc.tf510.a.label.key", false ),
				new TagFieldTypeData("$510_b", DataFieldType.$510.getDisplayCode(), TagField.$b, "b", "marc.tf510.b.label.key", false ),
				new TagFieldTypeData("$510_c", DataFieldType.$510.getDisplayCode(), TagField.$c, "c", "marc.tf510.c.label.key", false ),
				new TagFieldTypeData("$510_u", DataFieldType.$510.getDisplayCode(), TagField.$u, "u", "marc.tf510.u.label.key", true ),
				new TagFieldTypeData("$510_x", DataFieldType.$510.getDisplayCode(), TagField.$x, "x", "marc.tf510.x.label.key", false ),
				new TagFieldTypeData("$510_3", DataFieldType.$510.getDisplayCode(), TagField.$3, "3", "marc.tf510.3.label.key", false ),
				new TagFieldTypeData("$510_6", DataFieldType.$510.getDisplayCode(), TagField.$6, "6", "marc.tf510.6.label.key", false ),
				new TagFieldTypeData("$510_7", DataFieldType.$510.getDisplayCode(), TagField.$7, "7", "marc.tf510.7.label.key", true ),
				new TagFieldTypeData("$510_8", DataFieldType.$510.getDisplayCode(), TagField.$8, "8", "marc.tf510.8.label.key", true ),} );
		
		case $511: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$511_a", DataFieldType.$511.getDisplayCode(), TagField.$a, "a", "marc.tf511.a.label.key", false ),
				new TagFieldTypeData("$511_6", DataFieldType.$511.getDisplayCode(), TagField.$6, "6", "marc.tf511.6.label.key", false ),
				new TagFieldTypeData("$511_8", DataFieldType.$511.getDisplayCode(), TagField.$8, "8", "marc.tf511.8.label.key", true ),} );
		
		case $513: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$513_a", DataFieldType.$513.getDisplayCode(), TagField.$a, "a", "marc.tf513.a.label.key", false ),
				new TagFieldTypeData("$513_b", DataFieldType.$513.getDisplayCode(), TagField.$b, "b", "marc.tf513.b.label.key", false ),
				new TagFieldTypeData("$513_6", DataFieldType.$513.getDisplayCode(), TagField.$6, "6", "marc.tf513.6.label.key", false ),
				new TagFieldTypeData("$513_8", DataFieldType.$513.getDisplayCode(), TagField.$8, "8", "marc.tf513.8.label.key", true ),} );
		
		case $514: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$514_a", DataFieldType.$514.getDisplayCode(), TagField.$a, "a", "marc.tf514.a.label.key", false ),
				new TagFieldTypeData("$514_b", DataFieldType.$514.getDisplayCode(), TagField.$b, "b", "marc.tf514.b.label.key", true ),
				new TagFieldTypeData("$514_c", DataFieldType.$514.getDisplayCode(), TagField.$c, "c", "marc.tf514.c.label.key", true ),
				new TagFieldTypeData("$514_d", DataFieldType.$514.getDisplayCode(), TagField.$d, "d", "marc.tf514.d.label.key", false ),
				new TagFieldTypeData("$514_e", DataFieldType.$514.getDisplayCode(), TagField.$e, "e", "marc.tf514.e.label.key", false ),
				new TagFieldTypeData("$514_f", DataFieldType.$514.getDisplayCode(), TagField.$f, "f", "marc.tf514.f.label.key", false ),
				new TagFieldTypeData("$514_g", DataFieldType.$514.getDisplayCode(), TagField.$g, "g", "marc.tf514.g.label.key", true ),
				new TagFieldTypeData("$514_h", DataFieldType.$514.getDisplayCode(), TagField.$h, "h", "marc.tf514.h.label.key", true ),
				new TagFieldTypeData("$514_i", DataFieldType.$514.getDisplayCode(), TagField.$i, "i", "marc.tf514.i.label.key", false ),
				new TagFieldTypeData("$514_j", DataFieldType.$514.getDisplayCode(), TagField.$j, "j", "marc.tf514.j.label.key", true ),
				new TagFieldTypeData("$514_k", DataFieldType.$514.getDisplayCode(), TagField.$k, "k", "marc.tf514.k.label.key", true ),
				new TagFieldTypeData("$514_m", DataFieldType.$514.getDisplayCode(), TagField.$m, "m", "marc.tf514.m.label.key", false ),
				new TagFieldTypeData("$514_u", DataFieldType.$514.getDisplayCode(), TagField.$u, "u", "marc.tf514.u.label.key", true ),
				new TagFieldTypeData("$514_z", DataFieldType.$514.getDisplayCode(), TagField.$z, "z", "marc.tf514.z.label.key", true ),
				new TagFieldTypeData("$514_6", DataFieldType.$514.getDisplayCode(), TagField.$6, "6", "marc.tf514.6.label.key", false ),
				new TagFieldTypeData("$514_8", DataFieldType.$514.getDisplayCode(), TagField.$8, "8", "marc.tf514.8.label.key", true ),} );
		
		case $515: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$515_a", DataFieldType.$515.getDisplayCode(), TagField.$a, "a", "marc.tf515.a.label.key", false ),
				new TagFieldTypeData("$515_6", DataFieldType.$515.getDisplayCode(), TagField.$6, "6", "marc.tf515.6.label.key", false ),
				new TagFieldTypeData("$515_7", DataFieldType.$515.getDisplayCode(), TagField.$7, "7", "marc.tf515.7.label.key", true ),
				new TagFieldTypeData("$515_8", DataFieldType.$515.getDisplayCode(), TagField.$8, "8", "marc.tf515.8.label.key", true ),} );
		
		case $516: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$516_a", DataFieldType.$516.getDisplayCode(), TagField.$a, "a", "marc.tf516.a.label.key", false ),
				new TagFieldTypeData("$516_6", DataFieldType.$516.getDisplayCode(), TagField.$6, "6", "marc.tf516.6.label.key", false ),
				new TagFieldTypeData("$516_8", DataFieldType.$516.getDisplayCode(), TagField.$8, "8", "marc.tf516.8.label.key", true ),} );
		
		case $518: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$518_a", DataFieldType.$518.getDisplayCode(), TagField.$a, "a", "marc.tf518.a.label.key", false ),
				new TagFieldTypeData("$518_d", DataFieldType.$518.getDisplayCode(), TagField.$d, "d", "marc.tf518.d.label.key", true ),
				new TagFieldTypeData("$518_o", DataFieldType.$518.getDisplayCode(), TagField.$o, "o", "marc.tf518.o.label.key", true ),
				new TagFieldTypeData("$518_p", DataFieldType.$518.getDisplayCode(), TagField.$p, "p", "marc.tf518.p.label.key", true ),
				new TagFieldTypeData("$518_0", DataFieldType.$518.getDisplayCode(), TagField.$0, "0", "marc.tf518.0.label.key", true ),
				new TagFieldTypeData("$518_1", DataFieldType.$518.getDisplayCode(), TagField.$1, "1", "marc.tf518.1.label.key", true ),
				new TagFieldTypeData("$518_2", DataFieldType.$518.getDisplayCode(), TagField.$2, "2", "marc.tf518.2.label.key", true ),
				new TagFieldTypeData("$518_3", DataFieldType.$518.getDisplayCode(), TagField.$3, "3", "marc.tf518.3.label.key", false ),
				new TagFieldTypeData("$518_6", DataFieldType.$518.getDisplayCode(), TagField.$6, "6", "marc.tf518.6.label.key", false ),
				new TagFieldTypeData("$518_7", DataFieldType.$518.getDisplayCode(), TagField.$7, "7", "marc.tf518.7.label.key", true ),
				new TagFieldTypeData("$518_8", DataFieldType.$518.getDisplayCode(), TagField.$8, "8", "marc.tf518.8.label.key", true ),} );
		
		case $520: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$520_a", DataFieldType.$520.getDisplayCode(), TagField.$a, "a", "marc.tf520.a.label.key", false ),
				new TagFieldTypeData("$520_b", DataFieldType.$520.getDisplayCode(), TagField.$b, "b", "marc.tf520.b.label.key", false ),
				new TagFieldTypeData("$520_c", DataFieldType.$520.getDisplayCode(), TagField.$c, "c", "marc.tf520.c.label.key", false ),
				new TagFieldTypeData("$520_u", DataFieldType.$520.getDisplayCode(), TagField.$u, "u", "marc.tf520.u.label.key", true ),
				new TagFieldTypeData("$520_2", DataFieldType.$520.getDisplayCode(), TagField.$2, "2", "marc.tf520.2.label.key", false ),
				new TagFieldTypeData("$520_3", DataFieldType.$520.getDisplayCode(), TagField.$3, "3", "marc.tf520.3.label.key", false ),
				new TagFieldTypeData("$520_6", DataFieldType.$520.getDisplayCode(), TagField.$6, "6", "marc.tf520.6.label.key", false ),
				new TagFieldTypeData("$520_7", DataFieldType.$520.getDisplayCode(), TagField.$7, "7", "marc.tf520.7.label.key", true ),
				new TagFieldTypeData("$520_8", DataFieldType.$520.getDisplayCode(), TagField.$8, "8", "marc.tf520.8.label.key", true ),} );
		
		case $521: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$521_a", DataFieldType.$521.getDisplayCode(), TagField.$a, "a", "marc.tf521.a.label.key", true ),
				new TagFieldTypeData("$521_b", DataFieldType.$521.getDisplayCode(), TagField.$b, "b", "marc.tf521.b.label.key", false ),
				new TagFieldTypeData("$521_3", DataFieldType.$521.getDisplayCode(), TagField.$3, "3", "marc.tf521.3.label.key", false ),
				new TagFieldTypeData("$521_6", DataFieldType.$521.getDisplayCode(), TagField.$6, "6", "marc.tf521.6.label.key", false ),
				new TagFieldTypeData("$521_8", DataFieldType.$521.getDisplayCode(), TagField.$8, "8", "marc.tf521.8.label.key", true ),} );
		
		case $522: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$522_a", DataFieldType.$522.getDisplayCode(), TagField.$a, "a", "marc.tf522.a.label.key", false ),
				new TagFieldTypeData("$522_6", DataFieldType.$522.getDisplayCode(), TagField.$6, "6", "marc.tf522.6.label.key", false ),
				new TagFieldTypeData("$522_8", DataFieldType.$522.getDisplayCode(), TagField.$8, "8", "marc.tf522.8.label.key", true ),} );
		
		case $524: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$524_a", DataFieldType.$524.getDisplayCode(), TagField.$a, "a", "marc.tf524.a.label.key", false ),
				new TagFieldTypeData("$524_2", DataFieldType.$524.getDisplayCode(), TagField.$2, "2", "marc.tf524.2.label.key", false ),
				new TagFieldTypeData("$524_3", DataFieldType.$524.getDisplayCode(), TagField.$3, "3", "marc.tf524.3.label.key", false ),
				new TagFieldTypeData("$524_6", DataFieldType.$524.getDisplayCode(), TagField.$6, "6", "marc.tf524.6.label.key", false ),
				new TagFieldTypeData("$524_8", DataFieldType.$524.getDisplayCode(), TagField.$8, "8", "marc.tf524.8.label.key", true ),} );
		
		case $525: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$525_a", DataFieldType.$525.getDisplayCode(), TagField.$a, "a", "marc.tf525.a.label.key", false ),
				new TagFieldTypeData("$525_6", DataFieldType.$525.getDisplayCode(), TagField.$6, "6", "marc.tf525.6.label.key", false ),
				new TagFieldTypeData("$525_8", DataFieldType.$525.getDisplayCode(), TagField.$8, "8", "marc.tf525.8.label.key", true ),} );
		
		case $526: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$526_a", DataFieldType.$526.getDisplayCode(), TagField.$a, "a", "marc.tf526.a.label.key", false ),
				new TagFieldTypeData("$526_b", DataFieldType.$526.getDisplayCode(), TagField.$b, "b", "marc.tf526.b.label.key", false ),
				new TagFieldTypeData("$526_c", DataFieldType.$526.getDisplayCode(), TagField.$c, "c", "marc.tf526.c.label.key", false ),
				new TagFieldTypeData("$526_d", DataFieldType.$526.getDisplayCode(), TagField.$d, "d", "marc.tf526.d.label.key", false ),
				new TagFieldTypeData("$526_i", DataFieldType.$526.getDisplayCode(), TagField.$i, "i", "marc.tf526.i.label.key", false ),
				new TagFieldTypeData("$526_x", DataFieldType.$526.getDisplayCode(), TagField.$x, "x", "marc.tf526.x.label.key", true ),
				new TagFieldTypeData("$526_z", DataFieldType.$526.getDisplayCode(), TagField.$z, "z", "marc.tf526.z.label.key", true ),
				new TagFieldTypeData("$526_5", DataFieldType.$526.getDisplayCode(), TagField.$5, "5", "marc.tf526.5.label.key", false ),
				new TagFieldTypeData("$526_6", DataFieldType.$526.getDisplayCode(), TagField.$6, "6", "marc.tf526.6.label.key", false ),
				new TagFieldTypeData("$526_8", DataFieldType.$526.getDisplayCode(), TagField.$8, "8", "marc.tf526.8.label.key", true ), } );
		
		case $530: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$530_a", DataFieldType.$530.getDisplayCode(), TagField.$a, "a", "marc.tf530.a.label.key", false ),
				new TagFieldTypeData("$530_b", DataFieldType.$530.getDisplayCode(), TagField.$b, "b", "marc.tf530.b.label.key", false ),
				new TagFieldTypeData("$530_c", DataFieldType.$530.getDisplayCode(), TagField.$c, "c", "marc.tf530.c.label.key", false ),
				new TagFieldTypeData("$530_d", DataFieldType.$530.getDisplayCode(), TagField.$d, "d", "marc.tf530.d.label.key", false ),
				new TagFieldTypeData("$530_u", DataFieldType.$530.getDisplayCode(), TagField.$u, "u", "marc.tf530.u.label.key", true ),
				new TagFieldTypeData("$530_3", DataFieldType.$530.getDisplayCode(), TagField.$3, "3", "marc.tf530.3.label.key", false ),
				new TagFieldTypeData("$530_6", DataFieldType.$530.getDisplayCode(), TagField.$6, "6", "marc.tf530.6.label.key", false ),
				new TagFieldTypeData("$530_8", DataFieldType.$530.getDisplayCode(), TagField.$8, "8", "marc.tf530.8.label.key", true ),} );
		
		case $532: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$532_a", DataFieldType.$532.getDisplayCode(), TagField.$a, "a", "marc.tf532.a.label.key", false ),
				new TagFieldTypeData("$532_3", DataFieldType.$532.getDisplayCode(), TagField.$3, "3", "marc.tf532.3.label.key", false ),
				new TagFieldTypeData("$532_6", DataFieldType.$532.getDisplayCode(), TagField.$6, "6", "marc.tf532.6.label.key", false ),
				new TagFieldTypeData("$532_8", DataFieldType.$532.getDisplayCode(), TagField.$8, "8", "marc.tf532.8.label.key", true ),} );
		
		case $533: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$533_a", DataFieldType.$533.getDisplayCode(), TagField.$a, "a", "marc.tf533.a.label.key", false ),
				new TagFieldTypeData("$533_b", DataFieldType.$533.getDisplayCode(), TagField.$b, "b", "marc.tf533.b.label.key", true ),
				new TagFieldTypeData("$533_c", DataFieldType.$533.getDisplayCode(), TagField.$c, "c", "marc.tf533.c.label.key", true ),
				new TagFieldTypeData("$533_d", DataFieldType.$533.getDisplayCode(), TagField.$d, "d", "marc.tf533.d.label.key", false ),
				new TagFieldTypeData("$533_e", DataFieldType.$533.getDisplayCode(), TagField.$e, "e", "marc.tf533.e.label.key", false ),
				new TagFieldTypeData("$533_f", DataFieldType.$533.getDisplayCode(), TagField.$f, "f", "marc.tf533.f.label.key", true ),
				new TagFieldTypeData("$533_m", DataFieldType.$533.getDisplayCode(), TagField.$m, "m", "marc.tf533.m.label.key", true ),
				new TagFieldTypeData("$533_n", DataFieldType.$533.getDisplayCode(), TagField.$n, "n", "marc.tf533.n.label.key", true ),
				new TagFieldTypeData("$533_y", DataFieldType.$533.getDisplayCode(), TagField.$y, "y", "marc.tf533.y.label.key", true ),
				new TagFieldTypeData("$533_3", DataFieldType.$533.getDisplayCode(), TagField.$3, "3", "marc.tf533.3.label.key", false ),
				new TagFieldTypeData("$533_5", DataFieldType.$533.getDisplayCode(), TagField.$5, "5", "marc.tf533.5.label.key", false ),
				new TagFieldTypeData("$533_6", DataFieldType.$533.getDisplayCode(), TagField.$6, "6", "marc.tf533.6.label.key", false ),
				new TagFieldTypeData("$533_7", DataFieldType.$533.getDisplayCode(), TagField.$7, "7", "marc.tf533.7.label.key", false ),
				new TagFieldTypeData("$533_8", DataFieldType.$533.getDisplayCode(), TagField.$8, "8", "marc.tf533.8.label.key", true ),} );
		
		case $534: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$534_a", DataFieldType.$534.getDisplayCode(), TagField.$a, "a", "marc.tf534.a.label.key", false ),
				new TagFieldTypeData("$534_b", DataFieldType.$534.getDisplayCode(), TagField.$b, "b", "marc.tf534.b.label.key", false ),
				new TagFieldTypeData("$534_c", DataFieldType.$534.getDisplayCode(), TagField.$c, "c", "marc.tf534.c.label.key", false ),
				new TagFieldTypeData("$534_e", DataFieldType.$534.getDisplayCode(), TagField.$e, "e", "marc.tf534.e.label.key", false ),
				new TagFieldTypeData("$534_f", DataFieldType.$534.getDisplayCode(), TagField.$f, "f", "marc.tf534.f.label.key", true ),
				new TagFieldTypeData("$534_k", DataFieldType.$534.getDisplayCode(), TagField.$k, "k", "marc.tf534.k.label.key", true ),
				new TagFieldTypeData("$534_l", DataFieldType.$534.getDisplayCode(), TagField.$l, "l", "marc.tf534.l.label.key", false ),
				new TagFieldTypeData("$534_m", DataFieldType.$534.getDisplayCode(), TagField.$m, "m", "marc.tf534.m.label.key", false ),
				new TagFieldTypeData("$534_n", DataFieldType.$534.getDisplayCode(), TagField.$n, "n", "marc.tf534.n.label.key", true ),
				new TagFieldTypeData("$534_o", DataFieldType.$534.getDisplayCode(), TagField.$o, "o", "marc.tf534.o.label.key", true ),
				new TagFieldTypeData("$534_p", DataFieldType.$534.getDisplayCode(), TagField.$p, "p", "marc.tf534.p.label.key", false ),
				new TagFieldTypeData("$534_t", DataFieldType.$534.getDisplayCode(), TagField.$t, "t", "marc.tf534.t.label.key", false ),
				new TagFieldTypeData("$534_x", DataFieldType.$534.getDisplayCode(), TagField.$x, "x", "marc.tf534.x.label.key", true ),
				new TagFieldTypeData("$534_z", DataFieldType.$534.getDisplayCode(), TagField.$z, "z", "marc.tf534.z.label.key", true ),
				new TagFieldTypeData("$534_3", DataFieldType.$534.getDisplayCode(), TagField.$3, "3", "marc.tf534.3.label.key", false ),
				new TagFieldTypeData("$534_6", DataFieldType.$534.getDisplayCode(), TagField.$6, "6", "marc.tf534.6.label.key", false ),
				new TagFieldTypeData("$534_8", DataFieldType.$534.getDisplayCode(), TagField.$8, "8", "marc.tf534.8.label.key", true ),} );
		
		case $535: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$535_a", DataFieldType.$535.getDisplayCode(), TagField.$a, "a", "marc.tf535.a.label.key", false ),
				new TagFieldTypeData("$535_b", DataFieldType.$535.getDisplayCode(), TagField.$b, "b", "marc.tf535.b.label.key", true ),
				new TagFieldTypeData("$535_c", DataFieldType.$535.getDisplayCode(), TagField.$c, "c", "marc.tf535.c.label.key", true ),
				new TagFieldTypeData("$535_d", DataFieldType.$535.getDisplayCode(), TagField.$d, "d", "marc.tf535.d.label.key", true ),
				new TagFieldTypeData("$535_g", DataFieldType.$535.getDisplayCode(), TagField.$g, "g", "marc.tf535.g.label.key", false ),
				new TagFieldTypeData("$535_3", DataFieldType.$535.getDisplayCode(), TagField.$3, "3", "marc.tf535.3.label.key", false ),
				new TagFieldTypeData("$535_6", DataFieldType.$535.getDisplayCode(), TagField.$6, "6", "marc.tf535.6.label.key", false ),
				new TagFieldTypeData("$535_8", DataFieldType.$535.getDisplayCode(), TagField.$8, "8", "marc.tf535.8.label.key", true ),} );
		
		case $536: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$536_a", DataFieldType.$536.getDisplayCode(), TagField.$a, "a", "marc.tf536.a.label.key", false ),
				new TagFieldTypeData("$536_b", DataFieldType.$536.getDisplayCode(), TagField.$b, "b", "marc.tf536.b.label.key", true ),
				new TagFieldTypeData("$536_c", DataFieldType.$536.getDisplayCode(), TagField.$c, "c", "marc.tf536.c.label.key", true ),
				new TagFieldTypeData("$536_d", DataFieldType.$536.getDisplayCode(), TagField.$d, "d", "marc.tf536.d.label.key", true ),
				new TagFieldTypeData("$536_e", DataFieldType.$536.getDisplayCode(), TagField.$e, "e", "marc.tf536.e.label.key", true ),
				new TagFieldTypeData("$536_f", DataFieldType.$536.getDisplayCode(), TagField.$f, "f", "marc.tf536.f.label.key", true ),
				new TagFieldTypeData("$536_g", DataFieldType.$536.getDisplayCode(), TagField.$g, "g", "marc.tf536.g.label.key", true ),
				new TagFieldTypeData("$536_h", DataFieldType.$536.getDisplayCode(), TagField.$h, "h", "marc.tf536.h.label.key", true ),
				new TagFieldTypeData("$536_6", DataFieldType.$536.getDisplayCode(), TagField.$6, "6", "marc.tf536.6.label.key", false ),
				new TagFieldTypeData("$536_8", DataFieldType.$536.getDisplayCode(), TagField.$8, "8", "marc.tf536.8.label.key", true ),} );
		
		case $538: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$538_a", DataFieldType.$538.getDisplayCode(), TagField.$a, "a", "marc.tf538.a.label.key", false ),
				new TagFieldTypeData("$538_i", DataFieldType.$538.getDisplayCode(), TagField.$i, "i", "marc.tf538.i.label.key", false ),
				new TagFieldTypeData("$538_u", DataFieldType.$538.getDisplayCode(), TagField.$u, "u", "marc.tf538.u.label.key", true ),
				new TagFieldTypeData("$538_3", DataFieldType.$538.getDisplayCode(), TagField.$3, "3", "marc.tf538.3.label.key", false ),
				new TagFieldTypeData("$538_5", DataFieldType.$538.getDisplayCode(), TagField.$5, "5", "marc.tf538.5.label.key", true ),
				new TagFieldTypeData("$538_6", DataFieldType.$538.getDisplayCode(), TagField.$6, "6", "marc.tf538.6.label.key", false ),
				new TagFieldTypeData("$538_8", DataFieldType.$538.getDisplayCode(), TagField.$8, "8", "marc.tf538.8.label.key", true ),} );
		
		case $540: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$540_a", DataFieldType.$540.getDisplayCode(), TagField.$a, "a", "marc.tf540.a.label.key", false ),
				new TagFieldTypeData("$540_b", DataFieldType.$540.getDisplayCode(), TagField.$b, "b", "marc.tf540.b.label.key", false ),
				new TagFieldTypeData("$540_c", DataFieldType.$540.getDisplayCode(), TagField.$c, "c", "marc.tf540.c.label.key", false ),
				new TagFieldTypeData("$540_d", DataFieldType.$540.getDisplayCode(), TagField.$d, "d", "marc.tf540.d.label.key", false ),
				new TagFieldTypeData("$540_f", DataFieldType.$540.getDisplayCode(), TagField.$f, "f", "marc.tf540.f.label.key", true ),
				new TagFieldTypeData("$540_g", DataFieldType.$540.getDisplayCode(), TagField.$g, "g", "marc.tf540.g.label.key", true ),
				new TagFieldTypeData("$540_q", DataFieldType.$540.getDisplayCode(), TagField.$q, "q", "marc.tf540.q.label.key", false ),
				new TagFieldTypeData("$540_u", DataFieldType.$540.getDisplayCode(), TagField.$u, "u", "marc.tf540.u.label.key", true ),
				new TagFieldTypeData("$540_2", DataFieldType.$540.getDisplayCode(), TagField.$2, "2", "marc.tf540.2.label.key", false ),
				new TagFieldTypeData("$540_3", DataFieldType.$540.getDisplayCode(), TagField.$3, "3", "marc.tf540.3.label.key", false ),
				new TagFieldTypeData("$540_5", DataFieldType.$540.getDisplayCode(), TagField.$5, "5", "marc.tf540.5.label.key", false ),
				new TagFieldTypeData("$540_6", DataFieldType.$540.getDisplayCode(), TagField.$6, "6", "marc.tf540.6.label.key", false ),
				new TagFieldTypeData("$540_8", DataFieldType.$540.getDisplayCode(), TagField.$8, "8", "marc.tf540.8.label.key", true ),} );
		
		case $541: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$541_a", DataFieldType.$541.getDisplayCode(), TagField.$a, "a", "marc.tf541.a.label.key", false ),
				new TagFieldTypeData("$541_b", DataFieldType.$541.getDisplayCode(), TagField.$b, "b", "marc.tf541.b.label.key", false ),
				new TagFieldTypeData("$541_c", DataFieldType.$541.getDisplayCode(), TagField.$c, "c", "marc.tf541.c.label.key", false ),
				new TagFieldTypeData("$541_d", DataFieldType.$541.getDisplayCode(), TagField.$d, "d", "marc.tf541.d.label.key", false ),
				new TagFieldTypeData("$541_e", DataFieldType.$541.getDisplayCode(), TagField.$e, "e", "marc.tf541.e.label.key", false ),
				new TagFieldTypeData("$541_f", DataFieldType.$541.getDisplayCode(), TagField.$f, "f", "marc.tf541.f.label.key", false ),
				new TagFieldTypeData("$541_h", DataFieldType.$541.getDisplayCode(), TagField.$h, "h", "marc.tf541.h.label.key", false ),
				new TagFieldTypeData("$541_n", DataFieldType.$541.getDisplayCode(), TagField.$n, "n", "marc.tf541.n.label.key", true ),
				new TagFieldTypeData("$541_o", DataFieldType.$541.getDisplayCode(), TagField.$o, "o", "marc.tf541.o.label.key", true ),
				new TagFieldTypeData("$541_3", DataFieldType.$541.getDisplayCode(), TagField.$3, "3", "marc.tf541.3.label.key", false ),
				new TagFieldTypeData("$541_5", DataFieldType.$541.getDisplayCode(), TagField.$5, "5", "marc.tf541.5.label.key", false ),
				new TagFieldTypeData("$541_6", DataFieldType.$541.getDisplayCode(), TagField.$6, "6", "marc.tf541.6.label.key", false ),
				new TagFieldTypeData("$541_8", DataFieldType.$541.getDisplayCode(), TagField.$8, "8", "marc.tf541.8.label.key", true ),} );
		
		case $542: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$542_a", DataFieldType.$542.getDisplayCode(), TagField.$a, "a", "marc.tf542.a.label.key", false ),
				new TagFieldTypeData("$542_b", DataFieldType.$542.getDisplayCode(), TagField.$b, "b", "marc.tf542.b.label.key", false ),
				new TagFieldTypeData("$542_c", DataFieldType.$542.getDisplayCode(), TagField.$c, "c", "marc.tf542.c.label.key", false ),
				new TagFieldTypeData("$542_d", DataFieldType.$542.getDisplayCode(), TagField.$d, "d", "marc.tf542.d.label.key", true ),
				new TagFieldTypeData("$542_e", DataFieldType.$542.getDisplayCode(), TagField.$e, "e", "marc.tf542.e.label.key", true ),
				new TagFieldTypeData("$542_f", DataFieldType.$542.getDisplayCode(), TagField.$f, "f", "marc.tf542.f.label.key", true ),
				new TagFieldTypeData("$542_g", DataFieldType.$542.getDisplayCode(), TagField.$g, "g", "marc.tf542.g.label.key", false ),
				new TagFieldTypeData("$542_h", DataFieldType.$542.getDisplayCode(), TagField.$h, "h", "marc.tf542.h.label.key", true ),
				new TagFieldTypeData("$542_i", DataFieldType.$542.getDisplayCode(), TagField.$i, "i", "marc.tf542.i.label.key", false ),
				new TagFieldTypeData("$542_j", DataFieldType.$542.getDisplayCode(), TagField.$j, "j", "marc.tf542.j.label.key", false ),
				new TagFieldTypeData("$542_k", DataFieldType.$542.getDisplayCode(), TagField.$k, "k", "marc.tf542.k.label.key", true ),
				new TagFieldTypeData("$542_l", DataFieldType.$542.getDisplayCode(), TagField.$l, "l", "marc.tf542.l.label.key", false ),
				new TagFieldTypeData("$542_m", DataFieldType.$542.getDisplayCode(), TagField.$m, "m", "marc.tf542.m.label.key", false ),
				new TagFieldTypeData("$542_n", DataFieldType.$542.getDisplayCode(), TagField.$n, "n", "marc.tf542.n.label.key", true ),
				new TagFieldTypeData("$542_o", DataFieldType.$542.getDisplayCode(), TagField.$o, "o", "marc.tf542.o.label.key", false ),
				new TagFieldTypeData("$542_p", DataFieldType.$542.getDisplayCode(), TagField.$p, "p", "marc.tf542.p.label.key", true ),
				new TagFieldTypeData("$542_q", DataFieldType.$542.getDisplayCode(), TagField.$q, "q", "marc.tf542.q.label.key", false ),
				new TagFieldTypeData("$542_r", DataFieldType.$542.getDisplayCode(), TagField.$r, "r", "marc.tf542.r.label.key", false ),
				new TagFieldTypeData("$542_s", DataFieldType.$542.getDisplayCode(), TagField.$s, "s", "marc.tf542.s.label.key", false ),
				new TagFieldTypeData("$542_u", DataFieldType.$542.getDisplayCode(), TagField.$u, "u", "marc.tf542.u.label.key", true ),
				new TagFieldTypeData("$542_3", DataFieldType.$542.getDisplayCode(), TagField.$3, "3", "marc.tf542.3.label.key", false ),
				new TagFieldTypeData("$542_6", DataFieldType.$542.getDisplayCode(), TagField.$6, "6", "marc.tf542.6.label.key", false ),
				new TagFieldTypeData("$542_8", DataFieldType.$542.getDisplayCode(), TagField.$8, "8", "marc.tf542.8.label.key", true ),} );
		
		case $544: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$544_a", DataFieldType.$544.getDisplayCode(), TagField.$a, "a", "marc.tf544.a.label.key", true ),
				new TagFieldTypeData("$544_b", DataFieldType.$544.getDisplayCode(), TagField.$b, "b", "marc.tf544.b.label.key", true ),
				new TagFieldTypeData("$544_c", DataFieldType.$544.getDisplayCode(), TagField.$c, "c", "marc.tf544.c.label.key", true ),
				new TagFieldTypeData("$544_d", DataFieldType.$544.getDisplayCode(), TagField.$d, "d", "marc.tf544.d.label.key", true ),
				new TagFieldTypeData("$544_e", DataFieldType.$544.getDisplayCode(), TagField.$e, "e", "marc.tf544.e.label.key", true ),
				new TagFieldTypeData("$544_n", DataFieldType.$544.getDisplayCode(), TagField.$n, "n", "marc.tf544.n.label.key", true ),
				new TagFieldTypeData("$544_3", DataFieldType.$544.getDisplayCode(), TagField.$3, "3", "marc.tf544.3.label.key", false ),
				new TagFieldTypeData("$544_6", DataFieldType.$544.getDisplayCode(), TagField.$6, "6", "marc.tf544.6.label.key", false ),
				new TagFieldTypeData("$544_8", DataFieldType.$544.getDisplayCode(), TagField.$8, "8", "marc.tf544.8.label.key", true ),} );
		
		case $545: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$545_a", DataFieldType.$545.getDisplayCode(), TagField.$a, "a", "marc.tf545.a.label.key", false ),
				new TagFieldTypeData("$545_b", DataFieldType.$545.getDisplayCode(), TagField.$b, "b", "marc.tf545.b.label.key", true ),
				new TagFieldTypeData("$545_u", DataFieldType.$545.getDisplayCode(), TagField.$u, "u", "marc.tf545.u.label.key", true ),
				new TagFieldTypeData("$545_6", DataFieldType.$545.getDisplayCode(), TagField.$6, "6", "marc.tf545.6.label.key", false ),
				new TagFieldTypeData("$545_8", DataFieldType.$545.getDisplayCode(), TagField.$8, "8", "marc.tf545.8.label.key", true ),} );
		
		case $546: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$546_a", DataFieldType.$546.getDisplayCode(), TagField.$a, "a", "marc.tf546.a.label.key", false ),
				new TagFieldTypeData("$546_b", DataFieldType.$546.getDisplayCode(), TagField.$b, "b", "marc.tf546.b.label.key", true ),
				new TagFieldTypeData("$546_3", DataFieldType.$546.getDisplayCode(), TagField.$3, "3", "marc.tf546.3.label.key", false ),
				new TagFieldTypeData("$546_6", DataFieldType.$546.getDisplayCode(), TagField.$6, "6", "marc.tf546.6.label.key", false ),
				new TagFieldTypeData("$546_7", DataFieldType.$546.getDisplayCode(), TagField.$7, "7", "marc.tf546.7.label.key", true ),
				new TagFieldTypeData("$546_8", DataFieldType.$546.getDisplayCode(), TagField.$8, "8", "marc.tf546.8.label.key", true ),} );
		
		case $547: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$547_a", DataFieldType.$547.getDisplayCode(), TagField.$a, "a", "marc.tf547.a.label.key", false ),
				new TagFieldTypeData("$547_6", DataFieldType.$547.getDisplayCode(), TagField.$6, "6", "marc.tf547.6.label.key", false ),
				new TagFieldTypeData("$547_8", DataFieldType.$547.getDisplayCode(), TagField.$8, "8", "marc.tf547.8.label.key", true ),} );
		
		case $550: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$550_a", DataFieldType.$550.getDisplayCode(), TagField.$a, "a", "marc.tf550.a.label.key", false ),
				new TagFieldTypeData("$550_6", DataFieldType.$550.getDisplayCode(), TagField.$6, "6", "marc.tf550.6.label.key", false ),
				new TagFieldTypeData("$550_7", DataFieldType.$550.getDisplayCode(), TagField.$7, "7", "marc.tf550.7.label.key", true ),
				new TagFieldTypeData("$550_8", DataFieldType.$550.getDisplayCode(), TagField.$8, "8", "marc.tf550.8.label.key", true ),} );
		
		case $552: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$552_a", DataFieldType.$552.getDisplayCode(), TagField.$a, "a", "marc.tf552.a.label.key", false ),
				new TagFieldTypeData("$552_b", DataFieldType.$552.getDisplayCode(), TagField.$b, "b", "marc.tf552.b.label.key", false ),
				new TagFieldTypeData("$552_c", DataFieldType.$552.getDisplayCode(), TagField.$c, "c", "marc.tf552.c.label.key", false ),
				new TagFieldTypeData("$552_d", DataFieldType.$552.getDisplayCode(), TagField.$d, "d", "marc.tf552.d.label.key", false ),
				new TagFieldTypeData("$552_e", DataFieldType.$552.getDisplayCode(), TagField.$e, "e", "marc.tf552.e.label.key", true ),
				new TagFieldTypeData("$552_f", DataFieldType.$552.getDisplayCode(), TagField.$f, "f", "marc.tf552.f.label.key", true ),
				new TagFieldTypeData("$552_g", DataFieldType.$552.getDisplayCode(), TagField.$g, "g", "marc.tf552.g.label.key", false ),
				new TagFieldTypeData("$552_h", DataFieldType.$552.getDisplayCode(), TagField.$h, "h", "marc.tf552.h.label.key", false ),
				new TagFieldTypeData("$552_i", DataFieldType.$552.getDisplayCode(), TagField.$i, "i", "marc.tf552.i.label.key", false ),
				new TagFieldTypeData("$552_j", DataFieldType.$552.getDisplayCode(), TagField.$j, "j", "marc.tf552.j.label.key", false ),
				new TagFieldTypeData("$552_k", DataFieldType.$552.getDisplayCode(), TagField.$k, "k", "marc.tf552.k.label.key", false ),
				new TagFieldTypeData("$552_l", DataFieldType.$552.getDisplayCode(), TagField.$l, "l", "marc.tf552.l.label.key", false ),
				new TagFieldTypeData("$552_m", DataFieldType.$552.getDisplayCode(), TagField.$m, "m", "marc.tf552.m.label.key", false ),
				new TagFieldTypeData("$552_n", DataFieldType.$552.getDisplayCode(), TagField.$n, "n", "marc.tf552.n.label.key", false ),
				new TagFieldTypeData("$552_o", DataFieldType.$552.getDisplayCode(), TagField.$o, "o", "marc.tf552.o.label.key", true ),
				new TagFieldTypeData("$552_p", DataFieldType.$552.getDisplayCode(), TagField.$p, "p", "marc.tf552.p.label.key", true ),
				new TagFieldTypeData("$552_u", DataFieldType.$552.getDisplayCode(), TagField.$u, "u", "marc.tf552.u.label.key", true ),
				new TagFieldTypeData("$552_z", DataFieldType.$552.getDisplayCode(), TagField.$z, "z", "marc.tf552.z.label.key", true ),
				new TagFieldTypeData("$552_6", DataFieldType.$552.getDisplayCode(), TagField.$6, "6", "marc.tf552.6.label.key", false ),
				new TagFieldTypeData("$552_8", DataFieldType.$552.getDisplayCode(), TagField.$8, "8", "marc.tf552.8.label.key", true ),} );
		
		case $555: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$555_a", DataFieldType.$555.getDisplayCode(), TagField.$a, "a", "marc.tf555.a.label.key", false ),
				new TagFieldTypeData("$555_b", DataFieldType.$555.getDisplayCode(), TagField.$b, "b", "marc.tf555.b.label.key", true ),
				new TagFieldTypeData("$555_c", DataFieldType.$555.getDisplayCode(), TagField.$c, "c", "marc.tf555.c.label.key", false ),
				new TagFieldTypeData("$555_d", DataFieldType.$555.getDisplayCode(), TagField.$d, "d", "marc.tf555.d.label.key", false ),
				new TagFieldTypeData("$555_u", DataFieldType.$555.getDisplayCode(), TagField.$u, "u", "marc.tf555.u.label.key", true ),
				new TagFieldTypeData("$555_3", DataFieldType.$555.getDisplayCode(), TagField.$3, "3", "marc.tf555.3.label.key", false ),
				new TagFieldTypeData("$555_6", DataFieldType.$555.getDisplayCode(), TagField.$6, "6", "marc.tf555.6.label.key", false ),
				new TagFieldTypeData("$555_7", DataFieldType.$555.getDisplayCode(), TagField.$7, "7", "marc.tf555.7.label.key", true ),
				new TagFieldTypeData("$555_8", DataFieldType.$555.getDisplayCode(), TagField.$8, "8", "marc.tf555.8.label.key", true ),} );
		
		case $556: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$556_a", DataFieldType.$556.getDisplayCode(), TagField.$a, "a", "marc.tf556.a.label.key", false ),
				new TagFieldTypeData("$556_z", DataFieldType.$556.getDisplayCode(), TagField.$z, "z", "marc.tf556.z.label.key", true ),
				new TagFieldTypeData("$556_6", DataFieldType.$556.getDisplayCode(), TagField.$6, "6", "marc.tf556.6.label.key", false ),
				new TagFieldTypeData("$556_8", DataFieldType.$556.getDisplayCode(), TagField.$8, "8", "marc.tf556.8.label.key", true ),} );
		
		case $561: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$561_a", DataFieldType.$561.getDisplayCode(), TagField.$a, "a", "marc.tf561.a.label.key", false ),
				new TagFieldTypeData("$561_u", DataFieldType.$561.getDisplayCode(), TagField.$u, "u", "marc.tf561.u.label.key", true ),
				new TagFieldTypeData("$561_3", DataFieldType.$561.getDisplayCode(), TagField.$3, "3", "marc.tf561.3.label.key", false ),
				new TagFieldTypeData("$561_5", DataFieldType.$561.getDisplayCode(), TagField.$5, "5", "marc.tf561.5.label.key", false ),
				new TagFieldTypeData("$561_6", DataFieldType.$561.getDisplayCode(), TagField.$6, "6", "marc.tf561.6.label.key", false ),
				new TagFieldTypeData("$561_8", DataFieldType.$561.getDisplayCode(), TagField.$8, "8", "marc.tf561.8.label.key", true ),} );
		
		case $562: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$562_a", DataFieldType.$562.getDisplayCode(), TagField.$a, "a", "marc.tf562.a.label.key", true ),
				new TagFieldTypeData("$562_b", DataFieldType.$562.getDisplayCode(), TagField.$b, "b", "marc.tf562.b.label.key", true ),
				new TagFieldTypeData("$562_c", DataFieldType.$562.getDisplayCode(), TagField.$c, "c", "marc.tf562.c.label.key", true ),
				new TagFieldTypeData("$562_d", DataFieldType.$562.getDisplayCode(), TagField.$d, "d", "marc.tf562.d.label.key", true ),
				new TagFieldTypeData("$562_e", DataFieldType.$562.getDisplayCode(), TagField.$e, "e", "marc.tf562.e.label.key", true ),
				new TagFieldTypeData("$562_3", DataFieldType.$562.getDisplayCode(), TagField.$3, "3", "marc.tf562.3.label.key", false ),
				new TagFieldTypeData("$562_5", DataFieldType.$562.getDisplayCode(), TagField.$5, "5", "marc.tf562.5.label.key", false ),
				new TagFieldTypeData("$562_6", DataFieldType.$562.getDisplayCode(), TagField.$6, "6", "marc.tf562.6.label.key", false ),
				new TagFieldTypeData("$562_8", DataFieldType.$562.getDisplayCode(), TagField.$8, "8", "marc.tf562.8.label.key", true ),} );
		
		case $563: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$563_a", DataFieldType.$563.getDisplayCode(), TagField.$a, "a", "marc.tf563.a.label.key", false ),
				new TagFieldTypeData("$563_u", DataFieldType.$563.getDisplayCode(), TagField.$u, "u", "marc.tf563.u.label.key", true ),
				new TagFieldTypeData("$563_3", DataFieldType.$563.getDisplayCode(), TagField.$3, "3", "marc.tf563.3.label.key", false ),
				new TagFieldTypeData("$563_5", DataFieldType.$563.getDisplayCode(), TagField.$5, "5", "marc.tf563.5.label.key", false ),
				new TagFieldTypeData("$563_6", DataFieldType.$563.getDisplayCode(), TagField.$6, "6", "marc.tf563.6.label.key", false ),
				new TagFieldTypeData("$563_8", DataFieldType.$563.getDisplayCode(), TagField.$8, "8", "marc.tf563.8.label.key", true ),} );
		
		case $565: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$565_a", DataFieldType.$565.getDisplayCode(), TagField.$a, "a", "marc.tf565.a.label.key", false ),
				new TagFieldTypeData("$565_b", DataFieldType.$565.getDisplayCode(), TagField.$b, "b", "marc.tf565.b.label.key", true ),
				new TagFieldTypeData("$565_c", DataFieldType.$565.getDisplayCode(), TagField.$c, "c", "marc.tf565.c.label.key", true ),
				new TagFieldTypeData("$565_d", DataFieldType.$565.getDisplayCode(), TagField.$d, "d", "marc.tf565.d.label.key", true ),
				new TagFieldTypeData("$565_e", DataFieldType.$565.getDisplayCode(), TagField.$e, "e", "marc.tf565.e.label.key", true ),
				new TagFieldTypeData("$565_3", DataFieldType.$565.getDisplayCode(), TagField.$3, "3", "marc.tf565.3.label.key", false ),
				new TagFieldTypeData("$565_6", DataFieldType.$565.getDisplayCode(), TagField.$6, "6", "marc.tf565.6.label.key", false ),
				new TagFieldTypeData("$565_8", DataFieldType.$565.getDisplayCode(), TagField.$8, "8", "marc.tf565.8.label.key", true ),} );
		
		case $567: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$567_a", DataFieldType.$567.getDisplayCode(), TagField.$a, "a", "marc.tf567.a.label.key", false ),
				new TagFieldTypeData("$567_b", DataFieldType.$567.getDisplayCode(), TagField.$b, "b", "marc.tf567.b.label.key", true ),
				new TagFieldTypeData("$567_0", DataFieldType.$567.getDisplayCode(), TagField.$0, "0", "marc.tf567.0.label.key", true ),
				new TagFieldTypeData("$567_1", DataFieldType.$567.getDisplayCode(), TagField.$1, "1", "marc.tf567.1.label.key", true ),
				new TagFieldTypeData("$567_2", DataFieldType.$567.getDisplayCode(), TagField.$2, "2", "marc.tf567.2.label.key", false ),
				new TagFieldTypeData("$567_6", DataFieldType.$567.getDisplayCode(), TagField.$6, "6", "marc.tf567.6.label.key", false ),
				new TagFieldTypeData("$567_8", DataFieldType.$567.getDisplayCode(), TagField.$8, "8", "marc.tf567.8.label.key", true ),} );
		
		case $580: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$580_a", DataFieldType.$580.getDisplayCode(), TagField.$a, "a", "marc.tf580.a.label.key", false ),
				new TagFieldTypeData("$580_5", DataFieldType.$580.getDisplayCode(), TagField.$5, "5", "marc.tf580.5.label.key", false ),
				new TagFieldTypeData("$580_6", DataFieldType.$580.getDisplayCode(), TagField.$6, "6", "marc.tf580.6.label.key", false ),
				new TagFieldTypeData("$580_8", DataFieldType.$580.getDisplayCode(), TagField.$8, "8", "marc.tf580.8.label.key", true ),} );
		
		case $581: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$581_a", DataFieldType.$581.getDisplayCode(), TagField.$a, "a", "marc.tf581.a.label.key", false ),
				new TagFieldTypeData("$581_z", DataFieldType.$581.getDisplayCode(), TagField.$z, "z", "marc.tf581.z.label.key", true ),
				new TagFieldTypeData("$581_3", DataFieldType.$581.getDisplayCode(), TagField.$3, "3", "marc.tf581.3.label.key", false ),
				new TagFieldTypeData("$581_6", DataFieldType.$581.getDisplayCode(), TagField.$6, "6", "marc.tf581.6.label.key", false ),
				new TagFieldTypeData("$581_8", DataFieldType.$581.getDisplayCode(), TagField.$8, "8", "marc.tf581.8.label.key", true ),} );
		
		case $583: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$583_a", DataFieldType.$583.getDisplayCode(), TagField.$a, "a", "marc.tf583.a.label.key", false ),
				new TagFieldTypeData("$583_b", DataFieldType.$583.getDisplayCode(), TagField.$b, "b", "marc.tf583.b.label.key", true ),
				new TagFieldTypeData("$583_c", DataFieldType.$583.getDisplayCode(), TagField.$c, "c", "marc.tf583.c.label.key", true ),
				new TagFieldTypeData("$583_d", DataFieldType.$583.getDisplayCode(), TagField.$d, "d", "marc.tf583.d.label.key", true ),
				new TagFieldTypeData("$583_e", DataFieldType.$583.getDisplayCode(), TagField.$e, "e", "marc.tf583.e.label.key", true ),
				new TagFieldTypeData("$583_f", DataFieldType.$583.getDisplayCode(), TagField.$f, "f", "marc.tf583.f.label.key", true ),
				new TagFieldTypeData("$583_h", DataFieldType.$583.getDisplayCode(), TagField.$h, "h", "marc.tf583.h.label.key", true ),
				new TagFieldTypeData("$583_i", DataFieldType.$583.getDisplayCode(), TagField.$i, "i", "marc.tf583.i.label.key", true ),
				new TagFieldTypeData("$583_j", DataFieldType.$583.getDisplayCode(), TagField.$j, "j", "marc.tf583.j.label.key", true ),
				new TagFieldTypeData("$583_k", DataFieldType.$583.getDisplayCode(), TagField.$k, "k", "marc.tf583.k.label.key", true ),
				new TagFieldTypeData("$583_l", DataFieldType.$583.getDisplayCode(), TagField.$l, "l", "marc.tf583.l.label.key", true ),
				new TagFieldTypeData("$583_n", DataFieldType.$583.getDisplayCode(), TagField.$n, "n", "marc.tf583.n.label.key", true ),
				new TagFieldTypeData("$583_o", DataFieldType.$583.getDisplayCode(), TagField.$o, "o", "marc.tf583.o.label.key", true ),
				new TagFieldTypeData("$583_u", DataFieldType.$583.getDisplayCode(), TagField.$u, "u", "marc.tf583.u.label.key", true ),
				new TagFieldTypeData("$583_x", DataFieldType.$583.getDisplayCode(), TagField.$x, "x", "marc.tf583.x.label.key", true ),
				new TagFieldTypeData("$583_z", DataFieldType.$583.getDisplayCode(), TagField.$z, "z", "marc.tf583.z.label.key", true ),
				new TagFieldTypeData("$583_2", DataFieldType.$583.getDisplayCode(), TagField.$2, "2", "marc.tf583.2.label.key", false ),
				new TagFieldTypeData("$583_3", DataFieldType.$583.getDisplayCode(), TagField.$3, "3", "marc.tf583.3.label.key", false ),
				new TagFieldTypeData("$583_5", DataFieldType.$583.getDisplayCode(), TagField.$5, "5", "marc.tf583.5.label.key", false ),
				new TagFieldTypeData("$583_6", DataFieldType.$583.getDisplayCode(), TagField.$6, "6", "marc.tf583.6.label.key", false ),
				new TagFieldTypeData("$583_7", DataFieldType.$583.getDisplayCode(), TagField.$7, "7", "marc.tf583.7.label.key", true ),
				new TagFieldTypeData("$583_8", DataFieldType.$583.getDisplayCode(), TagField.$8, "8", "marc.tf583.8.label.key", true ),} );
		
		case $584: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$584_a", DataFieldType.$584.getDisplayCode(), TagField.$a, "a", "marc.tf584.a.label.key", true ),
				new TagFieldTypeData("$584_b", DataFieldType.$584.getDisplayCode(), TagField.$b, "b", "marc.tf584.b.label.key", true ),
				new TagFieldTypeData("$584_3", DataFieldType.$584.getDisplayCode(), TagField.$3, "3", "marc.tf584.3.label.key", false ),
				new TagFieldTypeData("$584_5", DataFieldType.$584.getDisplayCode(), TagField.$5, "5", "marc.tf584.5.label.key", false ),
				new TagFieldTypeData("$584_6", DataFieldType.$584.getDisplayCode(), TagField.$6, "6", "marc.tf584.6.label.key", false ),
				new TagFieldTypeData("$584_8", DataFieldType.$584.getDisplayCode(), TagField.$8, "8", "marc.tf584.8.label.key", true ),} );
		
		case $585: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$585_a", DataFieldType.$585.getDisplayCode(), TagField.$a, "a", "marc.tf585.a.label.key", false ),
				new TagFieldTypeData("$585_3", DataFieldType.$585.getDisplayCode(), TagField.$3, "3", "marc.tf585.3.label.key", false ),
				new TagFieldTypeData("$585_5", DataFieldType.$585.getDisplayCode(), TagField.$5, "5", "marc.tf585.5.label.key", false ),
				new TagFieldTypeData("$585_6", DataFieldType.$585.getDisplayCode(), TagField.$6, "6", "marc.tf585.6.label.key", false ),
				new TagFieldTypeData("$585_8", DataFieldType.$585.getDisplayCode(), TagField.$8, "8", "marc.tf585.8.label.key", true ),} );
		
		case $586: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$586_a", DataFieldType.$586.getDisplayCode(), TagField.$a, "a", "marc.tf586.a.label.key", false ),
				new TagFieldTypeData("$586_3", DataFieldType.$586.getDisplayCode(), TagField.$3, "3", "marc.tf586.3.label.key", false ),
				new TagFieldTypeData("$586_6", DataFieldType.$586.getDisplayCode(), TagField.$6, "6", "marc.tf586.6.label.key", false ),
				new TagFieldTypeData("$586_8", DataFieldType.$586.getDisplayCode(), TagField.$8, "8", "marc.tf586.8.label.key", true ),} );
		
		case $588: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$588_a", DataFieldType.$588.getDisplayCode(), TagField.$a, "a", "marc.tf588.a.label.key", false ),
				new TagFieldTypeData("$588_5", DataFieldType.$588.getDisplayCode(), TagField.$5, "5", "marc.tf588.5.label.key", false ),
				new TagFieldTypeData("$588_6", DataFieldType.$588.getDisplayCode(), TagField.$6, "6", "marc.tf588.6.label.key", false ),
				new TagFieldTypeData("$588_8", DataFieldType.$588.getDisplayCode(), TagField.$8, "8", "marc.tf588.8.label.key", true ),} );
		
		/*case $59X: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$59X_a", DataFieldType.$59X.getDisplayCode(), TagField.$a, "a", "marc.tf59X.a.label.key", true ),
				new TagFieldTypeData("$59X_b", DataFieldType.$59X.getDisplayCode(), TagField.$b, "b", "marc.tf59X.b.label.key", true ),
				new TagFieldTypeData("$59X_c", DataFieldType.$59X.getDisplayCode(), TagField.$c, "c", "marc.tf59X.c.label.key", true ),
				new TagFieldTypeData("$59X_d", DataFieldType.$59X.getDisplayCode(), TagField.$d, "d", "marc.tf59X.d.label.key", true ),} );*/
		
		
		case $600: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$600_a", DataFieldType.$600.getDisplayCode(), TagField.$a, "a", "marc.tf600.a.label.key", false ),
				new TagFieldTypeData("$600_b", DataFieldType.$600.getDisplayCode(), TagField.$b, "b", "marc.tf600.b.label.key", false ),
				new TagFieldTypeData("$600_c", DataFieldType.$600.getDisplayCode(), TagField.$c, "c", "marc.tf600.c.label.key", true ),
				new TagFieldTypeData("$600_d", DataFieldType.$600.getDisplayCode(), TagField.$d, "d", "marc.tf600.d.label.key", false ),
				new TagFieldTypeData("$600_e", DataFieldType.$600.getDisplayCode(), TagField.$e, "e", "marc.tf600.e.label.key", true ),
				new TagFieldTypeData("$600_f", DataFieldType.$600.getDisplayCode(), TagField.$f, "f", "marc.tf600.f.label.key", false ),
				new TagFieldTypeData("$600_g", DataFieldType.$600.getDisplayCode(), TagField.$g, "g", "marc.tf600.g.label.key", true ),
				new TagFieldTypeData("$600_h", DataFieldType.$600.getDisplayCode(), TagField.$h, "h", "marc.tf600.h.label.key", false ),
				new TagFieldTypeData("$600_j", DataFieldType.$600.getDisplayCode(), TagField.$j, "j", "marc.tf600.j.label.key", true ),
				new TagFieldTypeData("$600_k", DataFieldType.$600.getDisplayCode(), TagField.$k, "k", "marc.tf600.k.label.key", true ),
				new TagFieldTypeData("$600_l", DataFieldType.$600.getDisplayCode(), TagField.$l, "l", "marc.tf600.l.label.key", false ),
				new TagFieldTypeData("$600_m", DataFieldType.$600.getDisplayCode(), TagField.$m, "m", "marc.tf600.m.label.key", true ),
				new TagFieldTypeData("$600_n", DataFieldType.$600.getDisplayCode(), TagField.$n, "n", "marc.tf600.n.label.key", true ),
				new TagFieldTypeData("$600_o", DataFieldType.$600.getDisplayCode(), TagField.$o, "o", "marc.tf600.o.label.key", false ),
				new TagFieldTypeData("$600_p", DataFieldType.$600.getDisplayCode(), TagField.$p, "p", "marc.tf600.p.label.key", true ),
				new TagFieldTypeData("$600_q", DataFieldType.$600.getDisplayCode(), TagField.$q, "q", "marc.tf600.q.label.key", false ),
				new TagFieldTypeData("$600_r", DataFieldType.$600.getDisplayCode(), TagField.$r, "r", "marc.tf600.r.label.key", false ),
				new TagFieldTypeData("$600_s", DataFieldType.$600.getDisplayCode(), TagField.$s, "s", "marc.tf600.s.label.key", true ),
				new TagFieldTypeData("$600_t", DataFieldType.$600.getDisplayCode(), TagField.$t, "t", "marc.tf600.t.label.key", false ),
				new TagFieldTypeData("$600_u", DataFieldType.$600.getDisplayCode(), TagField.$u, "u", "marc.tf600.u.label.key", false ),
				new TagFieldTypeData("$600_v", DataFieldType.$600.getDisplayCode(), TagField.$v, "v", "marc.tf600.v.label.key", true ),
				new TagFieldTypeData("$600_w", DataFieldType.$600.getDisplayCode(), TagField.$w, "w", "marc.tf600.w.label.key", true ),
				new TagFieldTypeData("$600_x", DataFieldType.$600.getDisplayCode(), TagField.$x, "x", "marc.tf600.x.label.key", true ),
				new TagFieldTypeData("$600_y", DataFieldType.$600.getDisplayCode(), TagField.$y, "y", "marc.tf600.y.label.key", true ),
				new TagFieldTypeData("$600_z", DataFieldType.$600.getDisplayCode(), TagField.$z, "z", "marc.tf600.z.label.key", true ),
				new TagFieldTypeData("$600_0", DataFieldType.$600.getDisplayCode(), TagField.$0, "0", "marc.tf600.0.label.key", true ),
				new TagFieldTypeData("$600_1", DataFieldType.$600.getDisplayCode(), TagField.$1, "1", "marc.tf600.1.label.key", true ),
				new TagFieldTypeData("$600_2", DataFieldType.$600.getDisplayCode(), TagField.$2, "2", "marc.tf600.2.label.key", false ),
				new TagFieldTypeData("$600_3", DataFieldType.$600.getDisplayCode(), TagField.$3, "3", "marc.tf600.3.label.key", false ),
				new TagFieldTypeData("$600_4", DataFieldType.$600.getDisplayCode(), TagField.$4, "4", "marc.tf600.4.label.key", true ),
				new TagFieldTypeData("$600_6", DataFieldType.$600.getDisplayCode(), TagField.$6, "6", "marc.tf600.6.label.key", false ),
				new TagFieldTypeData("$600_7", DataFieldType.$600.getDisplayCode(), TagField.$7, "7", "marc.tf600.7.label.key", true ),
				new TagFieldTypeData("$600_8", DataFieldType.$600.getDisplayCode(), TagField.$8, "8", "marc.tf600.8.label.key", true ),} );
		
		case $610: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$610_a", DataFieldType.$610.getDisplayCode(), TagField.$a, "a", "marc.tf610.a.label.key", false ),
				new TagFieldTypeData("$610_b", DataFieldType.$610.getDisplayCode(), TagField.$b, "b", "marc.tf610.b.label.key", true ),
				new TagFieldTypeData("$610_c", DataFieldType.$610.getDisplayCode(), TagField.$c, "c", "marc.tf610.c.label.key", true ),
				new TagFieldTypeData("$610_d", DataFieldType.$610.getDisplayCode(), TagField.$d, "d", "marc.tf610.d.label.key", true ),
				new TagFieldTypeData("$610_e", DataFieldType.$610.getDisplayCode(), TagField.$e, "e", "marc.tf610.e.label.key", true ),
				new TagFieldTypeData("$610_f", DataFieldType.$610.getDisplayCode(), TagField.$f, "f", "marc.tf610.f.label.key", true ),
				new TagFieldTypeData("$610_g", DataFieldType.$610.getDisplayCode(), TagField.$g, "g", "marc.tf610.g.label.key", true ),
				new TagFieldTypeData("$610_h", DataFieldType.$610.getDisplayCode(), TagField.$h, "h", "marc.tf610.h.label.key", false ),
				new TagFieldTypeData("$610_j", DataFieldType.$610.getDisplayCode(), TagField.$j, "j", "marc.tf610.j.label.key", true ),
				new TagFieldTypeData("$610_k", DataFieldType.$610.getDisplayCode(), TagField.$k, "k", "marc.tf610.k.label.key", true ),
				new TagFieldTypeData("$610_l", DataFieldType.$610.getDisplayCode(), TagField.$l, "l", "marc.tf610.l.label.key", false ),
				new TagFieldTypeData("$610_m", DataFieldType.$610.getDisplayCode(), TagField.$m, "m", "marc.tf610.m.label.key", true ),
				new TagFieldTypeData("$610_n", DataFieldType.$610.getDisplayCode(), TagField.$n, "n", "marc.tf610.n.label.key", true ),
				new TagFieldTypeData("$610_o", DataFieldType.$610.getDisplayCode(), TagField.$o, "o", "marc.tf610.o.label.key", false ),
				new TagFieldTypeData("$610_p", DataFieldType.$610.getDisplayCode(), TagField.$p, "p", "marc.tf610.p.label.key", true ),
				new TagFieldTypeData("$610_r", DataFieldType.$610.getDisplayCode(), TagField.$r, "r", "marc.tf610.r.label.key", false ),
				new TagFieldTypeData("$610_s", DataFieldType.$610.getDisplayCode(), TagField.$s, "s", "marc.tf610.s.label.key", true ),
				new TagFieldTypeData("$610_t", DataFieldType.$610.getDisplayCode(), TagField.$t, "t", "marc.tf610.t.label.key", false ),
				new TagFieldTypeData("$610_u", DataFieldType.$610.getDisplayCode(), TagField.$u, "u", "marc.tf610.u.label.key", false ),
				new TagFieldTypeData("$610_v", DataFieldType.$610.getDisplayCode(), TagField.$v, "v", "marc.tf610.v.label.key", true ),
				new TagFieldTypeData("$610_x", DataFieldType.$610.getDisplayCode(), TagField.$x, "x", "marc.tf610.x.label.key", true ),
				new TagFieldTypeData("$610_y", DataFieldType.$610.getDisplayCode(), TagField.$y, "y", "marc.tf610.y.label.key", true ),
				new TagFieldTypeData("$610_z", DataFieldType.$610.getDisplayCode(), TagField.$z, "z", "marc.tf610.z.label.key", true ),
				new TagFieldTypeData("$610_0", DataFieldType.$610.getDisplayCode(), TagField.$0, "0", "marc.tf610.0.label.key", true ),
				new TagFieldTypeData("$610_1", DataFieldType.$610.getDisplayCode(), TagField.$1, "1", "marc.tf610.1.label.key", true ),
				new TagFieldTypeData("$610_2", DataFieldType.$610.getDisplayCode(), TagField.$2, "2", "marc.tf610.2.label.key", false ),
				new TagFieldTypeData("$610_3", DataFieldType.$610.getDisplayCode(), TagField.$3, "3", "marc.tf610.3.label.key", true ),
				new TagFieldTypeData("$610_4", DataFieldType.$610.getDisplayCode(), TagField.$4, "4", "marc.tf610.4.label.key", true ),
				new TagFieldTypeData("$610_6", DataFieldType.$610.getDisplayCode(), TagField.$6, "6", "marc.tf610.6.label.key", false ),
				new TagFieldTypeData("$610_7", DataFieldType.$610.getDisplayCode(), TagField.$7, "7", "marc.tf610.7.label.key", true ),
				new TagFieldTypeData("$610_8", DataFieldType.$610.getDisplayCode(), TagField.$8, "8", "marc.tf610.8.label.key", true ),} );
		
		case $611: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$611_a", DataFieldType.$611.getDisplayCode(), TagField.$a, "a", "marc.tf611.a.label.key", false ),
				new TagFieldTypeData("$611_c", DataFieldType.$611.getDisplayCode(), TagField.$c, "c", "marc.tf611.c.label.key", true ),
				new TagFieldTypeData("$611_d", DataFieldType.$611.getDisplayCode(), TagField.$d, "d", "marc.tf611.d.label.key", true ),
				new TagFieldTypeData("$611_e", DataFieldType.$611.getDisplayCode(), TagField.$e, "e", "marc.tf611.e.label.key", true ),
				new TagFieldTypeData("$611_f", DataFieldType.$611.getDisplayCode(), TagField.$f, "f", "marc.tf611.f.label.key", false ),
				new TagFieldTypeData("$611_g", DataFieldType.$611.getDisplayCode(), TagField.$g, "g", "marc.tf611.g.label.key", false ),
				new TagFieldTypeData("$611_h", DataFieldType.$611.getDisplayCode(), TagField.$h, "h", "marc.tf611.h.label.key", true ),
				new TagFieldTypeData("$611_j", DataFieldType.$611.getDisplayCode(), TagField.$j, "j", "marc.tf611.j.label.key", true ),
				new TagFieldTypeData("$611_k", DataFieldType.$611.getDisplayCode(), TagField.$k, "k", "marc.tf611.k.label.key", true ),
				new TagFieldTypeData("$611_l", DataFieldType.$611.getDisplayCode(), TagField.$l, "l", "marc.tf611.l.label.key", false ),
				new TagFieldTypeData("$611_n", DataFieldType.$611.getDisplayCode(), TagField.$n, "n", "marc.tf611.n.label.key", true ),
				new TagFieldTypeData("$611_p", DataFieldType.$611.getDisplayCode(), TagField.$p, "p", "marc.tf611.p.label.key", true ),
				new TagFieldTypeData("$611_q", DataFieldType.$611.getDisplayCode(), TagField.$q, "q", "marc.tf611.q.label.key", false ),
				new TagFieldTypeData("$611_s", DataFieldType.$611.getDisplayCode(), TagField.$s, "s", "marc.tf611.s.label.key", true ),
				new TagFieldTypeData("$611_t", DataFieldType.$611.getDisplayCode(), TagField.$t, "t", "marc.tf611.t.label.key", false ),
				new TagFieldTypeData("$611_u", DataFieldType.$611.getDisplayCode(), TagField.$u, "u", "marc.tf611.u.label.key", false ),
				new TagFieldTypeData("$611_v", DataFieldType.$611.getDisplayCode(), TagField.$v, "v", "marc.tf611.v.label.key", true ),
				new TagFieldTypeData("$611_y", DataFieldType.$611.getDisplayCode(), TagField.$y, "y", "marc.tf611.y.label.key", true ),
				new TagFieldTypeData("$611_z", DataFieldType.$611.getDisplayCode(), TagField.$z, "z", "marc.tf611.z.label.key", true ),
				new TagFieldTypeData("$611_0", DataFieldType.$611.getDisplayCode(), TagField.$0, "0", "marc.tf611.0.label.key", true ),
				new TagFieldTypeData("$611_1", DataFieldType.$611.getDisplayCode(), TagField.$1, "1", "marc.tf611.1.label.key", true ),
				new TagFieldTypeData("$611_2", DataFieldType.$611.getDisplayCode(), TagField.$2, "2", "marc.tf611.2.label.key", false ),
				new TagFieldTypeData("$611_3", DataFieldType.$611.getDisplayCode(), TagField.$3, "3", "marc.tf611.3.label.key", false ),
				new TagFieldTypeData("$611_4", DataFieldType.$611.getDisplayCode(), TagField.$4, "4", "marc.tf611.4.label.key", true ),
				new TagFieldTypeData("$611_6", DataFieldType.$611.getDisplayCode(), TagField.$6, "6", "marc.tf611.6.label.key", false ),
				new TagFieldTypeData("$611_7", DataFieldType.$611.getDisplayCode(), TagField.$7, "7", "marc.tf611.7.label.key", true ),
				new TagFieldTypeData("$611_8", DataFieldType.$611.getDisplayCode(), TagField.$8, "8", "marc.tf611.8.label.key", true ),} );
		
		case $630: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$630_a", DataFieldType.$630.getDisplayCode(), TagField.$a, "a", "marc.tf630.a.label.key", false ),
				new TagFieldTypeData("$630_d", DataFieldType.$630.getDisplayCode(), TagField.$d, "d", "marc.tf630.d.label.key", true ),
				new TagFieldTypeData("$630_e", DataFieldType.$630.getDisplayCode(), TagField.$e, "e", "marc.tf630.e.label.key", true ),
				new TagFieldTypeData("$630_f", DataFieldType.$630.getDisplayCode(), TagField.$f, "f", "marc.tf630.f.label.key", false ),
				new TagFieldTypeData("$630_g", DataFieldType.$630.getDisplayCode(), TagField.$g, "g", "marc.tf630.g.label.key", true ),
				new TagFieldTypeData("$630_h", DataFieldType.$630.getDisplayCode(), TagField.$h, "h", "marc.tf630.h.label.key", false ),
				new TagFieldTypeData("$630_k", DataFieldType.$630.getDisplayCode(), TagField.$k, "k", "marc.tf630.k.label.key", true ),
				new TagFieldTypeData("$630_l", DataFieldType.$630.getDisplayCode(), TagField.$l, "l", "marc.tf630.l.label.key", false ),
				new TagFieldTypeData("$630_m", DataFieldType.$630.getDisplayCode(), TagField.$m, "m", "marc.tf630.m.label.key", true ),
				new TagFieldTypeData("$630_n", DataFieldType.$630.getDisplayCode(), TagField.$n, "n", "marc.tf630.n.label.key", true ),
				new TagFieldTypeData("$630_o", DataFieldType.$630.getDisplayCode(), TagField.$o, "o", "marc.tf630.o.label.key", false ),
				new TagFieldTypeData("$630_p", DataFieldType.$630.getDisplayCode(), TagField.$p, "p", "marc.tf630.p.label.key", true ),
				new TagFieldTypeData("$630_r", DataFieldType.$630.getDisplayCode(), TagField.$r, "r", "marc.tf630.r.label.key", false ),
				new TagFieldTypeData("$630_s", DataFieldType.$630.getDisplayCode(), TagField.$s, "s", "marc.tf630.s.label.key", true ),
				new TagFieldTypeData("$630_t", DataFieldType.$630.getDisplayCode(), TagField.$t, "t", "marc.tf630.t.label.key", false ),
				new TagFieldTypeData("$630_v", DataFieldType.$630.getDisplayCode(), TagField.$v, "v", "marc.tf630.v.label.key", true ),
				new TagFieldTypeData("$630_x", DataFieldType.$630.getDisplayCode(), TagField.$x, "x", "marc.tf630.x.label.key", true ),
				new TagFieldTypeData("$630_y", DataFieldType.$630.getDisplayCode(), TagField.$y, "y", "marc.tf630.y.label.key", true ),
				new TagFieldTypeData("$630_z", DataFieldType.$630.getDisplayCode(), TagField.$z, "z", "marc.tf630.z.label.key", true ),
				new TagFieldTypeData("$630_0", DataFieldType.$630.getDisplayCode(), TagField.$0, "0", "marc.tf630.0.label.key", true ),
				new TagFieldTypeData("$630_1", DataFieldType.$630.getDisplayCode(), TagField.$1, "1", "marc.tf630.1.label.key", true ),
				new TagFieldTypeData("$630_2", DataFieldType.$630.getDisplayCode(), TagField.$2, "2", "marc.tf630.2.label.key", false ),
				new TagFieldTypeData("$630_3", DataFieldType.$630.getDisplayCode(), TagField.$3, "3", "marc.tf630.3.label.key", false ),
				new TagFieldTypeData("$630_4", DataFieldType.$630.getDisplayCode(), TagField.$4, "4", "marc.tf630.4.label.key", true ),
				new TagFieldTypeData("$630_6", DataFieldType.$630.getDisplayCode(), TagField.$6, "6", "marc.tf630.6.label.key", false ),
				new TagFieldTypeData("$630_7", DataFieldType.$630.getDisplayCode(), TagField.$7, "7", "marc.tf630.7.label.key", true ),
				new TagFieldTypeData("$630_8", DataFieldType.$630.getDisplayCode(), TagField.$8, "8", "marc.tf630.8.label.key", true ),} );
		
		case $647: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$647_a", DataFieldType.$647.getDisplayCode(), TagField.$a, "a", "marc.tf647.a.label.key", false ),
				new TagFieldTypeData("$647_c", DataFieldType.$647.getDisplayCode(), TagField.$c, "c", "marc.tf647.c.label.key", true ),
				new TagFieldTypeData("$647_d", DataFieldType.$647.getDisplayCode(), TagField.$d, "d", "marc.tf647.d.label.key", false ),
				new TagFieldTypeData("$647_e", DataFieldType.$647.getDisplayCode(), TagField.$e, "e", "marc.tf647.e.label.key", true ),
				new TagFieldTypeData("$647_g", DataFieldType.$647.getDisplayCode(), TagField.$g, "g", "marc.tf647.g.label.key", true ),
				new TagFieldTypeData("$647_v", DataFieldType.$647.getDisplayCode(), TagField.$v, "v", "marc.tf647.v.label.key", true ),
				new TagFieldTypeData("$647_x", DataFieldType.$647.getDisplayCode(), TagField.$x, "x", "marc.tf647.x.label.key", true ),
				new TagFieldTypeData("$647_y", DataFieldType.$647.getDisplayCode(), TagField.$y, "y", "marc.tf647.y.label.key", true ),
				new TagFieldTypeData("$647_z", DataFieldType.$647.getDisplayCode(), TagField.$z, "z", "marc.tf647.z.label.key", true ),
				new TagFieldTypeData("$647_0", DataFieldType.$647.getDisplayCode(), TagField.$0, "0", "marc.tf647.0.label.key", true ),
				new TagFieldTypeData("$647_1", DataFieldType.$647.getDisplayCode(), TagField.$1, "1", "marc.tf647.1.label.key", true ),
				new TagFieldTypeData("$647_2", DataFieldType.$647.getDisplayCode(), TagField.$2, "2", "marc.tf647.2.label.key", false ),
				new TagFieldTypeData("$647_3", DataFieldType.$647.getDisplayCode(), TagField.$3, "3", "marc.tf647.3.label.key", false ),
				new TagFieldTypeData("$647_4", DataFieldType.$647.getDisplayCode(), TagField.$4, "4", "marc.tf647.4.label.key", true ),
				new TagFieldTypeData("$647_6", DataFieldType.$647.getDisplayCode(), TagField.$6, "6", "marc.tf647.6.label.key", false ),
				new TagFieldTypeData("$647_8", DataFieldType.$647.getDisplayCode(), TagField.$8, "8", "marc.tf647.8.label.key", true ),} );
		
		case $648: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$648_a", DataFieldType.$648.getDisplayCode(), TagField.$a, "a", "marc.tf648.a.label.key", false ),
				new TagFieldTypeData("$648_e", DataFieldType.$648.getDisplayCode(), TagField.$e, "e", "marc.tf648.e.label.key", true ),
				new TagFieldTypeData("$648_v", DataFieldType.$648.getDisplayCode(), TagField.$v, "v", "marc.tf648.v.label.key", true ),
				new TagFieldTypeData("$648_x", DataFieldType.$648.getDisplayCode(), TagField.$x, "x", "marc.tf648.x.label.key", true ),
				new TagFieldTypeData("$648_y", DataFieldType.$648.getDisplayCode(), TagField.$y, "y", "marc.tf648.y.label.key", true ),
				new TagFieldTypeData("$648_z", DataFieldType.$648.getDisplayCode(), TagField.$z, "z", "marc.tf648.z.label.key", true ),
				new TagFieldTypeData("$648_0", DataFieldType.$648.getDisplayCode(), TagField.$0, "0", "marc.tf648.0.label.key", true ),
				new TagFieldTypeData("$648_1", DataFieldType.$648.getDisplayCode(), TagField.$1, "1", "marc.tf648.1.label.key", true ),
				new TagFieldTypeData("$648_2", DataFieldType.$648.getDisplayCode(), TagField.$2, "2", "marc.tf648.2.label.key", false ),
				new TagFieldTypeData("$648_3", DataFieldType.$648.getDisplayCode(), TagField.$3, "3", "marc.tf648.3.label.key", false ),
				new TagFieldTypeData("$648_4", DataFieldType.$648.getDisplayCode(), TagField.$4, "4", "marc.tf648.4.label.key", true ),
				new TagFieldTypeData("$648_6", DataFieldType.$648.getDisplayCode(), TagField.$6, "6", "marc.tf648.6.label.key", false ),
				new TagFieldTypeData("$648_7", DataFieldType.$648.getDisplayCode(), TagField.$7, "7", "marc.tf648.7.label.key", true ),
				new TagFieldTypeData("$648_8", DataFieldType.$648.getDisplayCode(), TagField.$8, "8", "marc.tf648.8.label.key", true ),} );
		
		case $650: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$650_a", DataFieldType.$650.getDisplayCode(), TagField.$a, "a", "marc.tf650.a.label.key", false ),
				new TagFieldTypeData("$650_b", DataFieldType.$650.getDisplayCode(), TagField.$b, "b", "marc.tf650.b.label.key", false ),
				new TagFieldTypeData("$650_c", DataFieldType.$650.getDisplayCode(), TagField.$c, "c", "marc.tf650.c.label.key", false ),
				new TagFieldTypeData("$650_d", DataFieldType.$650.getDisplayCode(), TagField.$d, "d", "marc.tf650.d.label.key", false ),
				new TagFieldTypeData("$650_e", DataFieldType.$650.getDisplayCode(), TagField.$e, "e", "marc.tf650.e.label.key", true ),
				new TagFieldTypeData("$650_g", DataFieldType.$650.getDisplayCode(), TagField.$g, "g", "marc.tf650.g.label.key", true ),
				new TagFieldTypeData("$650_v", DataFieldType.$650.getDisplayCode(), TagField.$v, "v", "marc.tf650.v.label.key", true ),
				new TagFieldTypeData("$650_x", DataFieldType.$650.getDisplayCode(), TagField.$x, "x", "marc.tf650.x.label.key", true ),
				new TagFieldTypeData("$650_y", DataFieldType.$650.getDisplayCode(), TagField.$y, "y", "marc.tf650.y.label.key", true ),
				new TagFieldTypeData("$650_z", DataFieldType.$650.getDisplayCode(), TagField.$z, "z", "marc.tf650.z.label.key", true ),
				new TagFieldTypeData("$650_0", DataFieldType.$650.getDisplayCode(), TagField.$0, "0", "marc.tf650.0.label.key", true ),
				new TagFieldTypeData("$650_1", DataFieldType.$650.getDisplayCode(), TagField.$1, "1", "marc.tf650.1.label.key", true ),
				new TagFieldTypeData("$650_2", DataFieldType.$650.getDisplayCode(), TagField.$2, "2", "marc.tf650.2.label.key", false ),
				new TagFieldTypeData("$650_3", DataFieldType.$650.getDisplayCode(), TagField.$3, "3", "marc.tf650.3.label.key", false ),
				new TagFieldTypeData("$650_4", DataFieldType.$650.getDisplayCode(), TagField.$4, "4", "marc.tf650.4.label.key", true ),
				new TagFieldTypeData("$650_6", DataFieldType.$650.getDisplayCode(), TagField.$6, "6", "marc.tf650.6.label.key", false ),
				new TagFieldTypeData("$650_7", DataFieldType.$650.getDisplayCode(), TagField.$7, "7", "marc.tf650.7.label.key", true ),
				new TagFieldTypeData("$650_8", DataFieldType.$650.getDisplayCode(), TagField.$8, "8", "marc.tf650.8.label.key", true ),} );
		
		case $651: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$651_a", DataFieldType.$651.getDisplayCode(), TagField.$a, "a", "marc.tf651.a.label.key", false ),
				new TagFieldTypeData("$651_e", DataFieldType.$651.getDisplayCode(), TagField.$e, "e", "marc.tf651.e.label.key", true ),
				new TagFieldTypeData("$651_g", DataFieldType.$651.getDisplayCode(), TagField.$g, "g", "marc.tf651.g.label.key", true ),
				new TagFieldTypeData("$651_v", DataFieldType.$651.getDisplayCode(), TagField.$v, "v", "marc.tf651.v.label.key", true ),
				new TagFieldTypeData("$651_x", DataFieldType.$651.getDisplayCode(), TagField.$x, "x", "marc.tf651.x.label.key", true ),
				new TagFieldTypeData("$651_y", DataFieldType.$651.getDisplayCode(), TagField.$y, "y", "marc.tf651.y.label.key", true ),
				new TagFieldTypeData("$651_z", DataFieldType.$651.getDisplayCode(), TagField.$z, "z", "marc.tf651.z.label.key", true ),
				new TagFieldTypeData("$651_0", DataFieldType.$651.getDisplayCode(), TagField.$0, "0", "marc.tf651.0.label.key", true ),
				new TagFieldTypeData("$651_1", DataFieldType.$651.getDisplayCode(), TagField.$1, "1", "marc.tf651.1.label.key", true ),
				new TagFieldTypeData("$651_2", DataFieldType.$651.getDisplayCode(), TagField.$2, "2", "marc.tf651.2.label.key", false ),
				new TagFieldTypeData("$651_3", DataFieldType.$651.getDisplayCode(), TagField.$3, "3", "marc.tf651.3.label.key", false ),
				new TagFieldTypeData("$651_4", DataFieldType.$651.getDisplayCode(), TagField.$4, "4", "marc.tf651.4.label.key", true ),
				new TagFieldTypeData("$651_6", DataFieldType.$651.getDisplayCode(), TagField.$6, "6", "marc.tf651.6.label.key", false ),
				new TagFieldTypeData("$651_7", DataFieldType.$651.getDisplayCode(), TagField.$7, "7", "marc.tf651.7.label.key", true ),
				new TagFieldTypeData("$651_8", DataFieldType.$651.getDisplayCode(), TagField.$8, "8", "marc.tf651.8.label.key", true ),} );
		
		case $653: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$653_a", DataFieldType.$653.getDisplayCode(), TagField.$a, "a", "marc.tf653.a.label.key", true ),
				new TagFieldTypeData("$653_0", DataFieldType.$653.getDisplayCode(), TagField.$0, "0", "marc.tf653.0.label.key", true ),
				new TagFieldTypeData("$653_1", DataFieldType.$653.getDisplayCode(), TagField.$1, "1", "marc.tf653.1.label.key", true ),
				new TagFieldTypeData("$653_5", DataFieldType.$653.getDisplayCode(), TagField.$5, "5", "marc.tf653.5.label.key", false ),
				new TagFieldTypeData("$653_6", DataFieldType.$653.getDisplayCode(), TagField.$6, "6", "marc.tf653.6.label.key", false ),
				new TagFieldTypeData("$653_7", DataFieldType.$653.getDisplayCode(), TagField.$7, "7", "marc.tf653.7.label.key", true ),
				new TagFieldTypeData("$653_8", DataFieldType.$653.getDisplayCode(), TagField.$8, "8", "marc.tf653.8.label.key", true ),} );
		
		case $654: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$654_a", DataFieldType.$654.getDisplayCode(), TagField.$a, "a", "marc.tf654.a.label.key", true ),
				new TagFieldTypeData("$654_b", DataFieldType.$654.getDisplayCode(), TagField.$b, "b", "marc.tf654.b.label.key", true ),
				new TagFieldTypeData("$654_c", DataFieldType.$654.getDisplayCode(), TagField.$c, "c", "marc.tf654.c.label.key", true ),
				new TagFieldTypeData("$654_e", DataFieldType.$654.getDisplayCode(), TagField.$e, "e", "marc.tf654.e.label.key", true ),
				new TagFieldTypeData("$654_v", DataFieldType.$654.getDisplayCode(), TagField.$v, "v", "marc.tf654.v.label.key", true ),
				new TagFieldTypeData("$654_y", DataFieldType.$654.getDisplayCode(), TagField.$y, "y", "marc.tf654.y.label.key", true ),
				new TagFieldTypeData("$654_z", DataFieldType.$654.getDisplayCode(), TagField.$z, "z", "marc.tf654.z.label.key", true ),
				new TagFieldTypeData("$654_1", DataFieldType.$654.getDisplayCode(), TagField.$1, "1", "marc.tf654.1.label.key", true ),
				new TagFieldTypeData("$654_2", DataFieldType.$654.getDisplayCode(), TagField.$2, "2", "marc.tf654.2.label.key", false ),
				new TagFieldTypeData("$654_3", DataFieldType.$654.getDisplayCode(), TagField.$3, "3", "marc.tf654.3.label.key", false ),
				new TagFieldTypeData("$654_4", DataFieldType.$654.getDisplayCode(), TagField.$4, "4", "marc.tf654.4.label.key", true ),
				new TagFieldTypeData("$654_6", DataFieldType.$654.getDisplayCode(), TagField.$6, "6", "marc.tf654.6.label.key", false ),
				new TagFieldTypeData("$654_8", DataFieldType.$654.getDisplayCode(), TagField.$8, "8", "marc.tf654.8.label.key", true ),} );
		
		case $655: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$655_a", DataFieldType.$655.getDisplayCode(), TagField.$a, "a", "marc.tf655.a.label.key", false ),
				new TagFieldTypeData("$655_b", DataFieldType.$655.getDisplayCode(), TagField.$b, "b", "marc.tf655.b.label.key", true ),
				new TagFieldTypeData("$655_c", DataFieldType.$655.getDisplayCode(), TagField.$c, "c", "marc.tf655.c.label.key", true ),
				new TagFieldTypeData("$655_v", DataFieldType.$655.getDisplayCode(), TagField.$v, "v", "marc.tf655.v.label.key", true ),
				new TagFieldTypeData("$655_x", DataFieldType.$655.getDisplayCode(), TagField.$x, "x", "marc.tf655.x.label.key", true ),
				new TagFieldTypeData("$655_y", DataFieldType.$655.getDisplayCode(), TagField.$y, "y", "marc.tf655.y.label.key", true ),
				new TagFieldTypeData("$655_z", DataFieldType.$655.getDisplayCode(), TagField.$z, "z", "marc.tf655.z.label.key", true ),
				new TagFieldTypeData("$655_0", DataFieldType.$655.getDisplayCode(), TagField.$0, "0", "marc.tf655.0.label.key", true ),
				new TagFieldTypeData("$655_1", DataFieldType.$655.getDisplayCode(), TagField.$1, "1", "marc.tf655.1.label.key", true ),
				new TagFieldTypeData("$655_2", DataFieldType.$655.getDisplayCode(), TagField.$2, "2", "marc.tf655.2.label.key", false ),
				new TagFieldTypeData("$655_3", DataFieldType.$655.getDisplayCode(), TagField.$3, "3", "marc.tf655.3.label.key", false ),
				new TagFieldTypeData("$655_5", DataFieldType.$655.getDisplayCode(), TagField.$5, "5", "marc.tf655.5.label.key", false ),
				new TagFieldTypeData("$655_6", DataFieldType.$655.getDisplayCode(), TagField.$6, "6", "marc.tf655.6.label.key", false ),
				new TagFieldTypeData("$655_7", DataFieldType.$655.getDisplayCode(), TagField.$7, "7", "marc.tf655.7.label.key", true ),
				new TagFieldTypeData("$655_8", DataFieldType.$655.getDisplayCode(), TagField.$8, "8", "marc.tf655.8.label.key", true ),} );
		
		case $656: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$656_a", DataFieldType.$656.getDisplayCode(), TagField.$a, "a", "marc.tf656.a.label.key", false ),
				new TagFieldTypeData("$656_k", DataFieldType.$656.getDisplayCode(), TagField.$k, "k", "marc.tf656.k.label.key", false ),
				new TagFieldTypeData("$656_v", DataFieldType.$656.getDisplayCode(), TagField.$v, "v", "marc.tf656.v.label.key", true ),
				new TagFieldTypeData("$656_x", DataFieldType.$656.getDisplayCode(), TagField.$x, "x", "marc.tf656.x.label.key", true ),
				new TagFieldTypeData("$656_y", DataFieldType.$656.getDisplayCode(), TagField.$y, "y", "marc.tf656.y.label.key", true ),
				new TagFieldTypeData("$656_z", DataFieldType.$656.getDisplayCode(), TagField.$z, "z", "marc.tf656.z.label.key", true ),
				new TagFieldTypeData("$656_0", DataFieldType.$656.getDisplayCode(), TagField.$0, "0", "marc.tf656.0.label.key", true ),
				new TagFieldTypeData("$656_1", DataFieldType.$656.getDisplayCode(), TagField.$1, "1", "marc.tf656.1.label.key", true ),
				new TagFieldTypeData("$656_2", DataFieldType.$656.getDisplayCode(), TagField.$2, "2", "marc.tf656.2.label.key", false ),
				new TagFieldTypeData("$656_3", DataFieldType.$656.getDisplayCode(), TagField.$3, "3", "marc.tf656.3.label.key", false ),
				new TagFieldTypeData("$656_6", DataFieldType.$656.getDisplayCode(), TagField.$6, "6", "marc.tf656.6.label.key", false ),
				new TagFieldTypeData("$656_8", DataFieldType.$656.getDisplayCode(), TagField.$8, "8", "marc.tf656.8.label.key", true ),} );
		
		case $657: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$657_a", DataFieldType.$657.getDisplayCode(), TagField.$a, "a", "marc.tf657.a.label.key", false ),
				new TagFieldTypeData("$657_v", DataFieldType.$657.getDisplayCode(), TagField.$v, "v", "marc.tf657.v.label.key", true ),
				new TagFieldTypeData("$657_x", DataFieldType.$657.getDisplayCode(), TagField.$x, "x", "marc.tf657.x.label.key", true ),
				new TagFieldTypeData("$657_y", DataFieldType.$657.getDisplayCode(), TagField.$y, "y", "marc.tf657.y.label.key", true ),
				new TagFieldTypeData("$657_z", DataFieldType.$657.getDisplayCode(), TagField.$z, "z", "marc.tf657.z.label.key", true ),
				new TagFieldTypeData("$657_0", DataFieldType.$657.getDisplayCode(), TagField.$0, "0", "marc.tf657.0.label.key", true ),
				new TagFieldTypeData("$657_1", DataFieldType.$657.getDisplayCode(), TagField.$1, "1", "marc.tf657.1.label.key", true ),
				new TagFieldTypeData("$657_2", DataFieldType.$657.getDisplayCode(), TagField.$2, "2", "marc.tf657.2.label.key", false ),
				new TagFieldTypeData("$657_3", DataFieldType.$657.getDisplayCode(), TagField.$3, "3", "marc.tf657.3.label.key", false ),
				new TagFieldTypeData("$657_6", DataFieldType.$657.getDisplayCode(), TagField.$6, "6", "marc.tf657.6.label.key", false ),
				new TagFieldTypeData("$657_8", DataFieldType.$657.getDisplayCode(), TagField.$8, "8", "marc.tf657.8.label.key", true ),} );
		
		case $658: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$658_a", DataFieldType.$658.getDisplayCode(), TagField.$a, "a", "marc.tf658.a.label.key", false ),
				new TagFieldTypeData("$658_b", DataFieldType.$658.getDisplayCode(), TagField.$b, "b", "marc.tf658.b.label.key", true ),
				new TagFieldTypeData("$658_c", DataFieldType.$658.getDisplayCode(), TagField.$c, "c", "marc.tf658.c.label.key", false ),
				new TagFieldTypeData("$658_d", DataFieldType.$658.getDisplayCode(), TagField.$d, "d", "marc.tf658.d.label.key", false ),
				new TagFieldTypeData("$658_0", DataFieldType.$658.getDisplayCode(), TagField.$0, "0", "marc.tf658.0.label.key", true ),
				new TagFieldTypeData("$658_1", DataFieldType.$658.getDisplayCode(), TagField.$1, "1", "marc.tf658.1.label.key", true ),
				new TagFieldTypeData("$658_2", DataFieldType.$658.getDisplayCode(), TagField.$2, "2", "marc.tf658.2.label.key", false ),
				new TagFieldTypeData("$658_6", DataFieldType.$658.getDisplayCode(), TagField.$6, "6", "marc.tf658.6.label.key", false ),
				new TagFieldTypeData("$658_8", DataFieldType.$658.getDisplayCode(), TagField.$8, "8", "marc.tf658.8.label.key", true ),} );
		
		case $662: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$662_a", DataFieldType.$662.getDisplayCode(), TagField.$a, "a", "marc.tf662.a.label.key", true ),
				new TagFieldTypeData("$662_b", DataFieldType.$662.getDisplayCode(), TagField.$b, "b", "marc.tf662.b.label.key", false ),
				new TagFieldTypeData("$662_c", DataFieldType.$662.getDisplayCode(), TagField.$c, "c", "marc.tf662.c.label.key", true ),
				new TagFieldTypeData("$662_d", DataFieldType.$662.getDisplayCode(), TagField.$d, "d", "marc.tf662.d.label.key", false ),
				new TagFieldTypeData("$662_e", DataFieldType.$662.getDisplayCode(), TagField.$e, "e", "marc.tf662.e.label.key", true ),
				new TagFieldTypeData("$662_f", DataFieldType.$662.getDisplayCode(), TagField.$f, "f", "marc.tf662.f.label.key", true ),
				new TagFieldTypeData("$662_g", DataFieldType.$662.getDisplayCode(), TagField.$g, "g", "marc.tf662.g.label.key", true ),
				new TagFieldTypeData("$662_h", DataFieldType.$662.getDisplayCode(), TagField.$h, "h", "marc.tf662.h.label.key", true ),
				new TagFieldTypeData("$662_0", DataFieldType.$662.getDisplayCode(), TagField.$0, "0", "marc.tf662.0.label.key", true ),
				new TagFieldTypeData("$662_1", DataFieldType.$662.getDisplayCode(), TagField.$1, "1", "marc.tf662.1.label.key", true ),
				new TagFieldTypeData("$662_2", DataFieldType.$662.getDisplayCode(), TagField.$2, "2", "marc.tf662.2.label.key", false ),
				new TagFieldTypeData("$662_3", DataFieldType.$662.getDisplayCode(), TagField.$3, "3", "marc.tf662.3.label.key", true ),
				new TagFieldTypeData("$662_4", DataFieldType.$662.getDisplayCode(), TagField.$4, "4", "marc.tf662.4.label.key", true ),
				new TagFieldTypeData("$662_6", DataFieldType.$662.getDisplayCode(), TagField.$6, "6", "marc.tf662.6.label.key", false ),
				new TagFieldTypeData("$662_8", DataFieldType.$662.getDisplayCode(), TagField.$8, "8", "marc.tf662.8.label.key", true ),} );
		
		case $688: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$688_a", DataFieldType.$688.getDisplayCode(), TagField.$a, "a", "marc.tf688.a.label.key", false ),
				new TagFieldTypeData("$688_e", DataFieldType.$688.getDisplayCode(), TagField.$e, "e", "marc.tf688.e.label.key", true ),
				new TagFieldTypeData("$688_g", DataFieldType.$688.getDisplayCode(), TagField.$g, "g", "marc.tf688.g.label.key", true ),
				new TagFieldTypeData("$688_0", DataFieldType.$688.getDisplayCode(), TagField.$0, "0", "marc.tf688.0.label.key", true ),
				new TagFieldTypeData("$688_1", DataFieldType.$688.getDisplayCode(), TagField.$1, "1", "marc.tf688.1.label.key", true ),
				new TagFieldTypeData("$688_2", DataFieldType.$688.getDisplayCode(), TagField.$2, "2", "marc.tf688.2.label.key", false ),
				new TagFieldTypeData("$688_3", DataFieldType.$688.getDisplayCode(), TagField.$3, "3", "marc.tf688.3.label.key", false ),
				new TagFieldTypeData("$688_4", DataFieldType.$688.getDisplayCode(), TagField.$4, "4", "marc.tf688.4.label.key", true ),
				new TagFieldTypeData("$688_6", DataFieldType.$688.getDisplayCode(), TagField.$6, "6", "marc.tf688.6.label.key", false ),
				new TagFieldTypeData("$688_8", DataFieldType.$688.getDisplayCode(), TagField.$8, "8", "marc.tf688.8.label.key", true ),} );
		
		//case $69X: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$69X_a", DataFieldType.$69X.getDisplayCode(), TagField.$a, "a", "marc.tf69X.a.label.key", true ),} );
		
		default: return getSubFields1();
		}
	}
	
	private List<TagFieldTypeData> getSubFields1() {
		switch (this) {

		case $700: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$700_a", DataFieldType.$700.getDisplayCode(), TagField.$a, "a", "marc.tf700.a.label.key", false ),
				new TagFieldTypeData("$700_b", DataFieldType.$700.getDisplayCode(), TagField.$b, "b", "marc.tf700.b.label.key", false ),
				new TagFieldTypeData("$700_c", DataFieldType.$700.getDisplayCode(), TagField.$c, "c", "marc.tf700.c.label.key", true ),
				new TagFieldTypeData("$700_d", DataFieldType.$700.getDisplayCode(), TagField.$d, "d", "marc.tf700.d.label.key", false ),
				new TagFieldTypeData("$700_e", DataFieldType.$700.getDisplayCode(), TagField.$e, "e", "marc.tf700.e.label.key", true ),
				new TagFieldTypeData("$700_f", DataFieldType.$700.getDisplayCode(), TagField.$f, "f", "marc.tf700.f.label.key", false ),
				new TagFieldTypeData("$700_g", DataFieldType.$700.getDisplayCode(), TagField.$g, "g", "marc.tf700.g.label.key", true ),
				new TagFieldTypeData("$700_h", DataFieldType.$700.getDisplayCode(), TagField.$h, "h", "marc.tf700.h.label.key", false ),
				new TagFieldTypeData("$700_i", DataFieldType.$700.getDisplayCode(), TagField.$i, "i", "marc.tf700.i.label.key", true ),
				new TagFieldTypeData("$700_j", DataFieldType.$700.getDisplayCode(), TagField.$j, "j", "marc.tf700.j.label.key", true ),
				new TagFieldTypeData("$700_k", DataFieldType.$700.getDisplayCode(), TagField.$k, "k", "marc.tf700.k.label.key", true ),
				new TagFieldTypeData("$700_l", DataFieldType.$700.getDisplayCode(), TagField.$l, "l", "marc.tf700.l.label.key", true ),
				new TagFieldTypeData("$700_m", DataFieldType.$700.getDisplayCode(), TagField.$m, "m", "marc.tf700.m.label.key", true ),
				new TagFieldTypeData("$700_n", DataFieldType.$700.getDisplayCode(), TagField.$n, "n", "marc.tf700.n.label.key", true ),
				new TagFieldTypeData("$700_o", DataFieldType.$700.getDisplayCode(), TagField.$o, "o", "marc.tf700.o.label.key", false ),
				new TagFieldTypeData("$700_p", DataFieldType.$700.getDisplayCode(), TagField.$p, "p", "marc.tf700.p.label.key", true ),
				new TagFieldTypeData("$700_q", DataFieldType.$700.getDisplayCode(), TagField.$q, "q", "marc.tf700.q.label.key", false ),
				new TagFieldTypeData("$700_r", DataFieldType.$700.getDisplayCode(), TagField.$r, "r", "marc.tf700.r.label.key", false ),
				new TagFieldTypeData("$700_s", DataFieldType.$700.getDisplayCode(), TagField.$s, "s", "marc.tf700.s.label.key", true ),
				new TagFieldTypeData("$700_t", DataFieldType.$700.getDisplayCode(), TagField.$t, "t", "marc.tf700.t.label.key", false ),
				new TagFieldTypeData("$700_u", DataFieldType.$700.getDisplayCode(), TagField.$u, "u", "marc.tf700.u.label.key", true ),
				new TagFieldTypeData("$700_x", DataFieldType.$700.getDisplayCode(), TagField.$x, "x", "marc.tf700.x.label.key", false ),
				new TagFieldTypeData("$700_0", DataFieldType.$700.getDisplayCode(), TagField.$0, "0", "marc.tf700.0.label.key", true ),
				new TagFieldTypeData("$700_1", DataFieldType.$700.getDisplayCode(), TagField.$1, "1", "marc.tf700.1.label.key", true ),
				new TagFieldTypeData("$700_2", DataFieldType.$700.getDisplayCode(), TagField.$2, "2", "marc.tf700.2.label.key", false ),
				new TagFieldTypeData("$700_3", DataFieldType.$700.getDisplayCode(), TagField.$3, "3", "marc.tf700.3.label.key", false ),
				new TagFieldTypeData("$700_4", DataFieldType.$700.getDisplayCode(), TagField.$4, "4", "marc.tf700.4.label.key", true ),
				new TagFieldTypeData("$700_5", DataFieldType.$700.getDisplayCode(), TagField.$5, "5", "marc.tf700.5.label.key", false ),
				new TagFieldTypeData("$700_6", DataFieldType.$700.getDisplayCode(), TagField.$6, "6", "marc.tf700.6.label.key", false ),
				new TagFieldTypeData("$700_7", DataFieldType.$700.getDisplayCode(), TagField.$7, "7", "marc.tf700.7.label.key", true ),
				new TagFieldTypeData("$700_8", DataFieldType.$700.getDisplayCode(), TagField.$8, "8", "marc.tf700.8.label.key", true ),} );
		
		case $710: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$710_a", DataFieldType.$710.getDisplayCode(), TagField.$a, "a", "marc.tf710.a.label.key", false ),
				new TagFieldTypeData("$710_b", DataFieldType.$710.getDisplayCode(), TagField.$b, "b", "marc.tf710.b.label.key", true ),
				new TagFieldTypeData("$710_c", DataFieldType.$710.getDisplayCode(), TagField.$c, "c", "marc.tf710.c.label.key", true ),
				new TagFieldTypeData("$710_d", DataFieldType.$710.getDisplayCode(), TagField.$d, "d", "marc.tf710.d.label.key", true ),
				new TagFieldTypeData("$710_e", DataFieldType.$710.getDisplayCode(), TagField.$e, "e", "marc.tf710.e.label.key", true ),
				new TagFieldTypeData("$710_f", DataFieldType.$710.getDisplayCode(), TagField.$f, "f", "marc.tf710.f.label.key", false ),
				new TagFieldTypeData("$710_g", DataFieldType.$710.getDisplayCode(), TagField.$g, "g", "marc.tf710.g.label.key", true ),
				new TagFieldTypeData("$710_h", DataFieldType.$710.getDisplayCode(), TagField.$h, "h", "marc.tf710.h.label.key", false ),
				new TagFieldTypeData("$710_i", DataFieldType.$710.getDisplayCode(), TagField.$i, "i", "marc.tf710.i.label.key", true ),
				new TagFieldTypeData("$710_k", DataFieldType.$710.getDisplayCode(), TagField.$k, "k", "marc.tf710.k.label.key", true ),
				new TagFieldTypeData("$710_l", DataFieldType.$710.getDisplayCode(), TagField.$l, "l", "marc.tf710.l.label.key", true ),
				new TagFieldTypeData("$710_m", DataFieldType.$710.getDisplayCode(), TagField.$m, "m", "marc.tf710.m.label.key", true ),
				new TagFieldTypeData("$710_n", DataFieldType.$710.getDisplayCode(), TagField.$n, "n", "marc.tf710.n.label.key", true ),
				new TagFieldTypeData("$710_o", DataFieldType.$710.getDisplayCode(), TagField.$o, "o", "marc.tf710.o.label.key", false ),
				new TagFieldTypeData("$710_p", DataFieldType.$710.getDisplayCode(), TagField.$p, "p", "marc.tf710.p.label.key", true ),
				new TagFieldTypeData("$710_q", DataFieldType.$710.getDisplayCode(), TagField.$q, "q", "marc.tf710.q.label.key", true ),
				new TagFieldTypeData("$710_r", DataFieldType.$710.getDisplayCode(), TagField.$r, "r", "marc.tf710.r.label.key", false ),
				new TagFieldTypeData("$710_s", DataFieldType.$710.getDisplayCode(), TagField.$s, "s", "marc.tf710.s.label.key", true ),
				new TagFieldTypeData("$710_t", DataFieldType.$710.getDisplayCode(), TagField.$t, "t", "marc.tf710.t.label.key", false ),
				new TagFieldTypeData("$710_u", DataFieldType.$710.getDisplayCode(), TagField.$u, "u", "marc.tf710.u.label.key", false ),
				new TagFieldTypeData("$710_x", DataFieldType.$710.getDisplayCode(), TagField.$x, "x", "marc.tf710.x.label.key", false ),
				new TagFieldTypeData("$710_0", DataFieldType.$710.getDisplayCode(), TagField.$0, "0", "marc.tf710.0.label.key", true ),
				new TagFieldTypeData("$710_1", DataFieldType.$710.getDisplayCode(), TagField.$1, "1", "marc.tf710.1.label.key", true ),
				new TagFieldTypeData("$710_2", DataFieldType.$710.getDisplayCode(), TagField.$2, "2", "marc.tf710.2.label.key", false ),
				new TagFieldTypeData("$710_3", DataFieldType.$710.getDisplayCode(), TagField.$3, "3", "marc.tf710.3.label.key", false ),
				new TagFieldTypeData("$710_4", DataFieldType.$710.getDisplayCode(), TagField.$4, "4", "marc.tf710.4.label.key", true ),
				new TagFieldTypeData("$710_5", DataFieldType.$710.getDisplayCode(), TagField.$5, "5", "marc.tf710.5.label.key", false ),
				new TagFieldTypeData("$710_6", DataFieldType.$710.getDisplayCode(), TagField.$6, "6", "marc.tf710.6.label.key", false ),
				new TagFieldTypeData("$710_7", DataFieldType.$710.getDisplayCode(), TagField.$7, "7", "marc.tf710.7.label.key", true ),
				new TagFieldTypeData("$710_8", DataFieldType.$710.getDisplayCode(), TagField.$8, "8", "marc.tf710.8.label.key", true ),} );
		
		case $711: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$711_a", DataFieldType.$711.getDisplayCode(), TagField.$a, "a", "marc.tf711.a.label.key", false ),
				new TagFieldTypeData("$711_c", DataFieldType.$711.getDisplayCode(), TagField.$c, "c", "marc.tf711.c.label.key", true ),
				new TagFieldTypeData("$711_d", DataFieldType.$711.getDisplayCode(), TagField.$d, "d", "marc.tf711.d.label.key", true ),
				new TagFieldTypeData("$711_e", DataFieldType.$711.getDisplayCode(), TagField.$e, "e", "marc.tf711.e.label.key", true ),
				new TagFieldTypeData("$711_f", DataFieldType.$711.getDisplayCode(), TagField.$f, "f", "marc.tf711.f.label.key", false ),
				new TagFieldTypeData("$711_g", DataFieldType.$711.getDisplayCode(), TagField.$g, "g", "marc.tf711.g.label.key", true ),
				new TagFieldTypeData("$711_h", DataFieldType.$711.getDisplayCode(), TagField.$h, "h", "marc.tf711.h.label.key", false ),
				new TagFieldTypeData("$711_i", DataFieldType.$711.getDisplayCode(), TagField.$i, "i", "marc.tf711.i.label.key", true ),
				new TagFieldTypeData("$711_j", DataFieldType.$711.getDisplayCode(), TagField.$j, "j", "marc.tf711.j.label.key", true ),
				new TagFieldTypeData("$711_k", DataFieldType.$711.getDisplayCode(), TagField.$k, "k", "marc.tf711.k.label.key", true ),
				new TagFieldTypeData("$711_l", DataFieldType.$711.getDisplayCode(), TagField.$l, "l", "marc.tf711.l.label.key", false ),
				new TagFieldTypeData("$711_n", DataFieldType.$711.getDisplayCode(), TagField.$n, "n", "marc.tf711.n.label.key", true ),
				new TagFieldTypeData("$711_p", DataFieldType.$711.getDisplayCode(), TagField.$p, "p", "marc.tf711.p.label.key", true ),
				new TagFieldTypeData("$711_q", DataFieldType.$711.getDisplayCode(), TagField.$q, "q", "marc.tf711.q.label.key", false ),
				new TagFieldTypeData("$711_s", DataFieldType.$711.getDisplayCode(), TagField.$s, "s", "marc.tf711.s.label.key", true ),
				new TagFieldTypeData("$711_t", DataFieldType.$711.getDisplayCode(), TagField.$t, "t", "marc.tf711.t.label.key", false ),
				new TagFieldTypeData("$711_u", DataFieldType.$711.getDisplayCode(), TagField.$u, "u", "marc.tf711.u.label.key", false ),
				new TagFieldTypeData("$711_x", DataFieldType.$711.getDisplayCode(), TagField.$x, "x", "marc.tf711.x.label.key", false ),
				new TagFieldTypeData("$711_0", DataFieldType.$711.getDisplayCode(), TagField.$0, "0", "marc.tf711.0.label.key", true ),
				new TagFieldTypeData("$711_1", DataFieldType.$711.getDisplayCode(), TagField.$1, "1", "marc.tf711.1.label.key", true ),
				new TagFieldTypeData("$711_2", DataFieldType.$711.getDisplayCode(), TagField.$2, "2", "marc.tf711.2.label.key", true ),
				new TagFieldTypeData("$711_3", DataFieldType.$711.getDisplayCode(), TagField.$3, "3", "marc.tf711.3.label.key", false ),
				new TagFieldTypeData("$711_4", DataFieldType.$711.getDisplayCode(), TagField.$4, "4", "marc.tf711.4.label.key", true ),
				new TagFieldTypeData("$711_5", DataFieldType.$711.getDisplayCode(), TagField.$5, "5", "marc.tf711.5.label.key", false ),
				new TagFieldTypeData("$711_6", DataFieldType.$711.getDisplayCode(), TagField.$6, "6", "marc.tf711.6.label.key", false ),
				new TagFieldTypeData("$711_7", DataFieldType.$711.getDisplayCode(), TagField.$7, "7", "marc.tf711.7.label.key", true ),
				new TagFieldTypeData("$711_8", DataFieldType.$711.getDisplayCode(), TagField.$8, "8", "marc.tf711.8.label.key", true ),} );
		
		case $720: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$720_a", DataFieldType.$720.getDisplayCode(), TagField.$a, "a", "marc.tf720.a.label.key", false ),
				new TagFieldTypeData("$720_e", DataFieldType.$720.getDisplayCode(), TagField.$e, "e", "marc.tf720.e.label.key", true ),
				new TagFieldTypeData("$720_0", DataFieldType.$720.getDisplayCode(), TagField.$0, "0", "marc.tf720.0.label.key", true ),
				new TagFieldTypeData("$720_1", DataFieldType.$720.getDisplayCode(), TagField.$1, "1", "marc.tf720.1.label.key", true ),
				new TagFieldTypeData("$720_4", DataFieldType.$720.getDisplayCode(), TagField.$4, "4", "marc.tf720.4.label.key", true ),
				new TagFieldTypeData("$720_5", DataFieldType.$720.getDisplayCode(), TagField.$5, "5", "marc.tf720.5.label.key", false ),
				new TagFieldTypeData("$720_6", DataFieldType.$720.getDisplayCode(), TagField.$6, "6", "marc.tf720.6.label.key", false ),
				new TagFieldTypeData("$720_7", DataFieldType.$720.getDisplayCode(), TagField.$7, "7", "marc.tf720.7.label.key", true ),
				new TagFieldTypeData("$720_8", DataFieldType.$720.getDisplayCode(), TagField.$8, "8", "marc.tf720.8.label.key", true ),} );
		
		case $730: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$730_a", DataFieldType.$730.getDisplayCode(), TagField.$a, "a", "marc.tf730.a.label.key", false ),
				new TagFieldTypeData("$730_d", DataFieldType.$730.getDisplayCode(), TagField.$d, "d", "marc.tf730.d.label.key", true ),
				new TagFieldTypeData("$730_f", DataFieldType.$730.getDisplayCode(), TagField.$f, "f", "marc.tf730.f.label.key", false ),
				new TagFieldTypeData("$730_g", DataFieldType.$730.getDisplayCode(), TagField.$g, "g", "marc.tf730.g.label.key", true ),
				new TagFieldTypeData("$730_h", DataFieldType.$730.getDisplayCode(), TagField.$h, "h", "marc.tf730.h.label.key", false ),
				new TagFieldTypeData("$730_i", DataFieldType.$730.getDisplayCode(), TagField.$i, "i", "marc.tf730.i.label.key", true ),
				new TagFieldTypeData("$730_k", DataFieldType.$730.getDisplayCode(), TagField.$k, "k", "marc.tf730.k.label.key", true ),
				new TagFieldTypeData("$730_l", DataFieldType.$730.getDisplayCode(), TagField.$l, "l", "marc.tf730.l.label.key", false ),
				new TagFieldTypeData("$730_m", DataFieldType.$730.getDisplayCode(), TagField.$m, "m", "marc.tf730.m.label.key", true ),
				new TagFieldTypeData("$730_n", DataFieldType.$730.getDisplayCode(), TagField.$n, "n", "marc.tf730.n.label.key", true ),
				new TagFieldTypeData("$730_o", DataFieldType.$730.getDisplayCode(), TagField.$o, "o", "marc.tf730.o.label.key", false ),
				new TagFieldTypeData("$730_p", DataFieldType.$730.getDisplayCode(), TagField.$p, "p", "marc.tf730.p.label.key", true ),
				new TagFieldTypeData("$730_r", DataFieldType.$730.getDisplayCode(), TagField.$r, "r", "marc.tf730.r.label.key", false ),
				new TagFieldTypeData("$730_s", DataFieldType.$730.getDisplayCode(), TagField.$s, "s", "marc.tf730.s.label.key", true ),
				new TagFieldTypeData("$730_t", DataFieldType.$730.getDisplayCode(), TagField.$t, "t", "marc.tf730.t.label.key", false ),
				new TagFieldTypeData("$730_x", DataFieldType.$730.getDisplayCode(), TagField.$x, "x", "marc.tf730.x.label.key", false ),
				new TagFieldTypeData("$730_0", DataFieldType.$730.getDisplayCode(), TagField.$0, "0", "marc.tf730.0.label.key", true ),
				new TagFieldTypeData("$730_1", DataFieldType.$730.getDisplayCode(), TagField.$1, "1", "marc.tf730.1.label.key", true ),
				new TagFieldTypeData("$730_2", DataFieldType.$730.getDisplayCode(), TagField.$2, "2", "marc.tf730.2.label.key", false ),
				new TagFieldTypeData("$730_3", DataFieldType.$730.getDisplayCode(), TagField.$3, "3", "marc.tf730.3.label.key", false ),
				new TagFieldTypeData("$730_4", DataFieldType.$730.getDisplayCode(), TagField.$4, "4", "marc.tf730.4.label.key", true ),
				new TagFieldTypeData("$730_5", DataFieldType.$730.getDisplayCode(), TagField.$5, "5", "marc.tf730.5.label.key", false ),
				new TagFieldTypeData("$730_6", DataFieldType.$730.getDisplayCode(), TagField.$6, "6", "marc.tf730.6.label.key", false ),
				new TagFieldTypeData("$730_8", DataFieldType.$730.getDisplayCode(), TagField.$8, "8", "marc.tf730.8.label.key", true ),} );
		
		case $740: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$740_a", DataFieldType.$740.getDisplayCode(), TagField.$a, "a", "marc.tf740.a.label.key", false ),
				new TagFieldTypeData("$740_h", DataFieldType.$740.getDisplayCode(), TagField.$h, "h", "marc.tf740.h.label.key", false ),
				new TagFieldTypeData("$740_n", DataFieldType.$740.getDisplayCode(), TagField.$n, "n", "marc.tf740.n.label.key", true ),
				new TagFieldTypeData("$740_p", DataFieldType.$740.getDisplayCode(), TagField.$p, "p", "marc.tf740.p.label.key", true ),
				new TagFieldTypeData("$740_5", DataFieldType.$740.getDisplayCode(), TagField.$5, "5", "marc.tf740.5.label.key", false ),
				new TagFieldTypeData("$740_6", DataFieldType.$740.getDisplayCode(), TagField.$6, "6", "marc.tf740.6.label.key", false ),
				new TagFieldTypeData("$740_8", DataFieldType.$740.getDisplayCode(), TagField.$8, "8", "marc.tf740.8.label.key", true ),} );
		
		case $751: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$751_a", DataFieldType.$751.getDisplayCode(), TagField.$a, "a", "marc.tf751.a.label.key", false ),
				new TagFieldTypeData("$751_e", DataFieldType.$751.getDisplayCode(), TagField.$e, "e", "marc.tf751.e.label.key", true ),
				new TagFieldTypeData("$751_g", DataFieldType.$751.getDisplayCode(), TagField.$g, "g", "marc.tf751.g.label.key", true ),
				new TagFieldTypeData("$751_0", DataFieldType.$751.getDisplayCode(), TagField.$0, "0", "marc.tf751.0.label.key", true ),
				new TagFieldTypeData("$751_1", DataFieldType.$751.getDisplayCode(), TagField.$1, "1", "marc.tf751.1.label.key", true ),
				new TagFieldTypeData("$751_2", DataFieldType.$751.getDisplayCode(), TagField.$2, "2", "marc.tf751.2.label.key", false ),
				new TagFieldTypeData("$751_3", DataFieldType.$751.getDisplayCode(), TagField.$3, "3", "marc.tf751.3.label.key", false ),
				new TagFieldTypeData("$751_4", DataFieldType.$751.getDisplayCode(), TagField.$4, "4", "marc.tf751.4.label.key", true ),
				new TagFieldTypeData("$751_6", DataFieldType.$751.getDisplayCode(), TagField.$6, "6", "marc.tf751.6.label.key", false ),
				new TagFieldTypeData("$751_7", DataFieldType.$751.getDisplayCode(), TagField.$7, "7", "marc.tf751.7.label.key", true ),
				new TagFieldTypeData("$751_8", DataFieldType.$751.getDisplayCode(), TagField.$8, "8", "marc.tf751.8.label.key", true ),} );
		
		case $752: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$752_a", DataFieldType.$752.getDisplayCode(), TagField.$a, "a", "marc.tf752.a.label.key", true ),
				new TagFieldTypeData("$752_b", DataFieldType.$752.getDisplayCode(), TagField.$b, "b", "marc.tf752.b.label.key", false ),
				new TagFieldTypeData("$752_c", DataFieldType.$752.getDisplayCode(), TagField.$c, "c", "marc.tf752.c.label.key", true ),
				new TagFieldTypeData("$752_d", DataFieldType.$752.getDisplayCode(), TagField.$d, "d", "marc.tf752.d.label.key", false ),
				new TagFieldTypeData("$752_e", DataFieldType.$752.getDisplayCode(), TagField.$e, "e", "marc.tf752.e.label.key", true ),
				new TagFieldTypeData("$752_f", DataFieldType.$752.getDisplayCode(), TagField.$f, "f", "marc.tf752.f.label.key", true ),
				new TagFieldTypeData("$752_g", DataFieldType.$752.getDisplayCode(), TagField.$g, "g", "marc.tf752.g.label.key", true ),
				new TagFieldTypeData("$752_h", DataFieldType.$752.getDisplayCode(), TagField.$h, "h", "marc.tf752.h.label.key", true ),
				new TagFieldTypeData("$752_0", DataFieldType.$752.getDisplayCode(), TagField.$0, "0", "marc.tf752.0.label.key", true ),
				new TagFieldTypeData("$752_1", DataFieldType.$752.getDisplayCode(), TagField.$1, "1", "marc.tf752.1.label.key", true ),
				new TagFieldTypeData("$752_2", DataFieldType.$752.getDisplayCode(), TagField.$2, "2", "marc.tf752.2.label.key", false ),
				new TagFieldTypeData("$752_4", DataFieldType.$752.getDisplayCode(), TagField.$4, "4", "marc.tf752.4.label.key", true ),
				new TagFieldTypeData("$752_6", DataFieldType.$752.getDisplayCode(), TagField.$6, "6", "marc.tf752.6.label.key", false ),
				new TagFieldTypeData("$752_8", DataFieldType.$752.getDisplayCode(), TagField.$8, "8", "marc.tf752.8.label.key", true ),} );
		
		case $753: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$753_a", DataFieldType.$753.getDisplayCode(), TagField.$a, "a", "marc.tf753.a.label.key", false ),
				new TagFieldTypeData("$753_b", DataFieldType.$753.getDisplayCode(), TagField.$b, "b", "marc.tf753.b.label.key", false ),
				new TagFieldTypeData("$753_c", DataFieldType.$753.getDisplayCode(), TagField.$c, "c", "marc.tf753.c.label.key", false ),
				new TagFieldTypeData("$753_0", DataFieldType.$753.getDisplayCode(), TagField.$0, "0", "marc.tf753.0.label.key", true ),
				new TagFieldTypeData("$753_1", DataFieldType.$753.getDisplayCode(), TagField.$1, "1", "marc.tf753.1.label.key", true ),
				new TagFieldTypeData("$753_2", DataFieldType.$753.getDisplayCode(), TagField.$2, "2", "marc.tf753.2.label.key", false ),
				new TagFieldTypeData("$753_6", DataFieldType.$753.getDisplayCode(), TagField.$6, "6", "marc.tf753.6.label.key", false ),
				new TagFieldTypeData("$753_8", DataFieldType.$753.getDisplayCode(), TagField.$8, "8", "marc.tf753.8.label.key", true ),} );
		
		case $754: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$754_a", DataFieldType.$754.getDisplayCode(), TagField.$a, "a", "marc.tf754.a.label.key", true ),
				new TagFieldTypeData("$754_c", DataFieldType.$754.getDisplayCode(), TagField.$c, "c", "marc.tf754.c.label.key", true ),
				new TagFieldTypeData("$754_d", DataFieldType.$754.getDisplayCode(), TagField.$d, "d", "marc.tf754.d.label.key", true ),
				new TagFieldTypeData("$754_x", DataFieldType.$754.getDisplayCode(), TagField.$x, "x", "marc.tf754.x.label.key", true ),
				new TagFieldTypeData("$754_z", DataFieldType.$754.getDisplayCode(), TagField.$z, "z", "marc.tf754.z.label.key", true ),
				new TagFieldTypeData("$754_0", DataFieldType.$754.getDisplayCode(), TagField.$0, "0", "marc.tf754.0.label.key", true ),
				new TagFieldTypeData("$754_1", DataFieldType.$754.getDisplayCode(), TagField.$1, "1", "marc.tf754.1.label.key", true ),
				new TagFieldTypeData("$754_2", DataFieldType.$754.getDisplayCode(), TagField.$2, "2", "marc.tf754.2.label.key", false ),
				new TagFieldTypeData("$754_6", DataFieldType.$754.getDisplayCode(), TagField.$6, "6", "marc.tf754.6.label.key", false ),
				new TagFieldTypeData("$754_8", DataFieldType.$754.getDisplayCode(), TagField.$8, "8", "marc.tf754.8.label.key", true ),} );
		
		case $758: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$758_a", DataFieldType.$758.getDisplayCode(), TagField.$a, "a", "marc.tf758.a.label.key", false ),
				new TagFieldTypeData("$758_i", DataFieldType.$758.getDisplayCode(), TagField.$i, "i", "marc.tf758.i.label.key", true ),
				new TagFieldTypeData("$758_0", DataFieldType.$758.getDisplayCode(), TagField.$0, "0", "marc.tf758.0.label.key", true ),
				new TagFieldTypeData("$758_1", DataFieldType.$758.getDisplayCode(), TagField.$1, "1", "marc.tf758.1.label.key", true ),
				new TagFieldTypeData("$758_2", DataFieldType.$758.getDisplayCode(), TagField.$2, "2", "marc.tf758.2.label.key", false ),
				new TagFieldTypeData("$758_3", DataFieldType.$758.getDisplayCode(), TagField.$3, "3", "marc.tf758.3.label.key", false ),
				new TagFieldTypeData("$758_4", DataFieldType.$758.getDisplayCode(), TagField.$4, "4", "marc.tf758.4.label.key", true ),
				new TagFieldTypeData("$758_5", DataFieldType.$758.getDisplayCode(), TagField.$5, "5", "marc.tf758.5.label.key", false ),
				new TagFieldTypeData("$758_6", DataFieldType.$758.getDisplayCode(), TagField.$6, "6", "marc.tf758.6.label.key", false ),
				new TagFieldTypeData("$758_8", DataFieldType.$758.getDisplayCode(), TagField.$8, "8", "marc.tf758.8.label.key", true ),} );
		
		case $760: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$760_a", DataFieldType.$760.getDisplayCode(), TagField.$a, "a", "marc.tf760.a.label.key", false ),
				new TagFieldTypeData("$760_b", DataFieldType.$760.getDisplayCode(), TagField.$b, "b", "marc.tf760.b.label.key", false ),
				new TagFieldTypeData("$760_c", DataFieldType.$760.getDisplayCode(), TagField.$c, "c", "marc.tf760.c.label.key", false ),
				new TagFieldTypeData("$760_d", DataFieldType.$760.getDisplayCode(), TagField.$d, "d", "marc.tf760.d.label.key", false ),
				new TagFieldTypeData("$760_g", DataFieldType.$760.getDisplayCode(), TagField.$g, "g", "marc.tf760.g.label.key", true ),
				new TagFieldTypeData("$760_h", DataFieldType.$760.getDisplayCode(), TagField.$h, "h", "marc.tf760.h.label.key", false ),
				new TagFieldTypeData("$760_i", DataFieldType.$760.getDisplayCode(), TagField.$i, "i", "marc.tf760.i.label.key", true ),
				new TagFieldTypeData("$760_l", DataFieldType.$760.getDisplayCode(), TagField.$l, "l", "marc.tf760.l.label.key", true ),
				new TagFieldTypeData("$760_m", DataFieldType.$760.getDisplayCode(), TagField.$m, "m", "marc.tf760.m.label.key", false ),
				new TagFieldTypeData("$760_n", DataFieldType.$760.getDisplayCode(), TagField.$n, "n", "marc.tf760.n.label.key", true ),
				new TagFieldTypeData("$760_o", DataFieldType.$760.getDisplayCode(), TagField.$o, "o", "marc.tf760.o.label.key", true ),
				new TagFieldTypeData("$760_s", DataFieldType.$760.getDisplayCode(), TagField.$s, "s", "marc.tf760.s.label.key", false ),
				new TagFieldTypeData("$760_t", DataFieldType.$760.getDisplayCode(), TagField.$t, "t", "marc.tf760.t.label.key", false ),
				new TagFieldTypeData("$760_w", DataFieldType.$760.getDisplayCode(), TagField.$w, "w", "marc.tf760.w.label.key", true ),
				new TagFieldTypeData("$760_x", DataFieldType.$760.getDisplayCode(), TagField.$x, "x", "marc.tf760.x.label.key", false ),
				new TagFieldTypeData("$760_y", DataFieldType.$760.getDisplayCode(), TagField.$y, "y", "marc.tf760.y.label.key", false ),
				new TagFieldTypeData("$760_4", DataFieldType.$760.getDisplayCode(), TagField.$4, "4", "marc.tf760.4.label.key", true ),
				new TagFieldTypeData("$760_6", DataFieldType.$760.getDisplayCode(), TagField.$6, "6", "marc.tf760.6.label.key", false ),
				new TagFieldTypeData("$760_7", DataFieldType.$760.getDisplayCode(), TagField.$7, "7", "marc.tf760.7.label.key", true ),
				new TagFieldTypeData("$760_8", DataFieldType.$760.getDisplayCode(), TagField.$8, "8", "marc.tf760.8.label.key", true ),} );
		
		case $762: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$762_a", DataFieldType.$762.getDisplayCode(), TagField.$a, "a", "marc.tf762.a.label.key", false ),
				new TagFieldTypeData("$762_b", DataFieldType.$762.getDisplayCode(), TagField.$b, "b", "marc.tf762.b.label.key", false ),
				new TagFieldTypeData("$762_c", DataFieldType.$762.getDisplayCode(), TagField.$c, "c", "marc.tf762.c.label.key", false ),
				new TagFieldTypeData("$762_d", DataFieldType.$762.getDisplayCode(), TagField.$d, "d", "marc.tf762.d.label.key", false ),
				new TagFieldTypeData("$762_g", DataFieldType.$762.getDisplayCode(), TagField.$g, "g", "marc.tf762.g.label.key", true ),
				new TagFieldTypeData("$762_h", DataFieldType.$762.getDisplayCode(), TagField.$h, "h", "marc.tf762.h.label.key", false ),
				new TagFieldTypeData("$762_i", DataFieldType.$762.getDisplayCode(), TagField.$i, "i", "marc.tf762.i.label.key", true ),
				new TagFieldTypeData("$762_l", DataFieldType.$762.getDisplayCode(), TagField.$l, "l", "marc.tf762.l.label.key", true ),
				new TagFieldTypeData("$762_m", DataFieldType.$762.getDisplayCode(), TagField.$m, "m", "marc.tf762.m.label.key", false ),
				new TagFieldTypeData("$762_n", DataFieldType.$762.getDisplayCode(), TagField.$n, "n", "marc.tf762.n.label.key", true ),
				new TagFieldTypeData("$762_o", DataFieldType.$762.getDisplayCode(), TagField.$o, "o", "marc.tf762.o.label.key", true ),
				new TagFieldTypeData("$762_s", DataFieldType.$762.getDisplayCode(), TagField.$s, "s", "marc.tf762.s.label.key", false ),
				new TagFieldTypeData("$762_t", DataFieldType.$762.getDisplayCode(), TagField.$t, "t", "marc.tf762.t.label.key", false ),
				new TagFieldTypeData("$762_w", DataFieldType.$762.getDisplayCode(), TagField.$w, "w", "marc.tf762.w.label.key", true ),
				new TagFieldTypeData("$762_x", DataFieldType.$762.getDisplayCode(), TagField.$x, "x", "marc.tf762.x.label.key", false ),
				new TagFieldTypeData("$762_y", DataFieldType.$762.getDisplayCode(), TagField.$y, "y", "marc.tf762.y.label.key", false ),
				new TagFieldTypeData("$762_4", DataFieldType.$762.getDisplayCode(), TagField.$4, "4", "marc.tf762.4.label.key", true ),
				new TagFieldTypeData("$762_6", DataFieldType.$762.getDisplayCode(), TagField.$6, "6", "marc.tf762.6.label.key", false ),
				new TagFieldTypeData("$762_7", DataFieldType.$762.getDisplayCode(), TagField.$7, "7", "marc.tf762.7.label.key", false ),
				new TagFieldTypeData("$762_8", DataFieldType.$762.getDisplayCode(), TagField.$8, "8", "marc.tf762.8.label.key", true ),} );
		
		case $765: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$765_a", DataFieldType.$765.getDisplayCode(), TagField.$a, "a", "marc.tf765.a.label.key", false ),
				new TagFieldTypeData("$765_b", DataFieldType.$765.getDisplayCode(), TagField.$b, "b", "marc.tf765.b.label.key", false ),
				new TagFieldTypeData("$765_c", DataFieldType.$765.getDisplayCode(), TagField.$c, "c", "marc.tf765.c.label.key", false ),
				new TagFieldTypeData("$765_d", DataFieldType.$765.getDisplayCode(), TagField.$d, "d", "marc.tf765.d.label.key", false ),
				new TagFieldTypeData("$765_g", DataFieldType.$765.getDisplayCode(), TagField.$g, "g", "marc.tf765.g.label.key", true ),
				new TagFieldTypeData("$765_h", DataFieldType.$765.getDisplayCode(), TagField.$h, "h", "marc.tf765.h.label.key", false ),
				new TagFieldTypeData("$765_i", DataFieldType.$765.getDisplayCode(), TagField.$i, "i", "marc.tf765.i.label.key", true ),
				new TagFieldTypeData("$765_l", DataFieldType.$765.getDisplayCode(), TagField.$l, "l", "marc.tf765.l.label.key", true ),
				new TagFieldTypeData("$765_m", DataFieldType.$765.getDisplayCode(), TagField.$m, "m", "marc.tf765.m.label.key", false ),
				new TagFieldTypeData("$765_n", DataFieldType.$765.getDisplayCode(), TagField.$n, "n", "marc.tf765.n.label.key", true ),
				new TagFieldTypeData("$765_o", DataFieldType.$765.getDisplayCode(), TagField.$o, "o", "marc.tf765.o.label.key", true ),
				new TagFieldTypeData("$765_r", DataFieldType.$765.getDisplayCode(), TagField.$r, "r", "marc.tf765.r.label.key", true ),
				new TagFieldTypeData("$765_s", DataFieldType.$765.getDisplayCode(), TagField.$s, "s", "marc.tf765.s.label.key", false ),
				new TagFieldTypeData("$765_t", DataFieldType.$765.getDisplayCode(), TagField.$t, "t", "marc.tf765.t.label.key", false ),
				new TagFieldTypeData("$765_u", DataFieldType.$765.getDisplayCode(), TagField.$u, "u", "marc.tf765.u.label.key", false ),
				new TagFieldTypeData("$765_w", DataFieldType.$765.getDisplayCode(), TagField.$w, "w", "marc.tf765.w.label.key", true ),
				new TagFieldTypeData("$765_x", DataFieldType.$765.getDisplayCode(), TagField.$x, "x", "marc.tf765.x.label.key", false ),
				new TagFieldTypeData("$765_y", DataFieldType.$765.getDisplayCode(), TagField.$y, "y", "marc.tf765.y.label.key", false ),
				new TagFieldTypeData("$765_4", DataFieldType.$765.getDisplayCode(), TagField.$4, "4", "marc.tf765.4.label.key", true ),
				new TagFieldTypeData("$765_6", DataFieldType.$765.getDisplayCode(), TagField.$6, "6", "marc.tf765.6.label.key", false ),
				new TagFieldTypeData("$765_7", DataFieldType.$765.getDisplayCode(), TagField.$7, "7", "marc.tf765.7.label.key", false ),
				new TagFieldTypeData("$765_8", DataFieldType.$765.getDisplayCode(), TagField.$8, "8", "marc.tf765.8.label.key", true ),} );
		
		case $767: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$767_a", DataFieldType.$767.getDisplayCode(), TagField.$a, "a", "marc.tf767.a.label.key", false ),
				new TagFieldTypeData("$767_b", DataFieldType.$767.getDisplayCode(), TagField.$b, "b", "marc.tf767.b.label.key", false ),
				new TagFieldTypeData("$767_c", DataFieldType.$767.getDisplayCode(), TagField.$c, "c", "marc.tf767.c.label.key", false ),
				new TagFieldTypeData("$767_d", DataFieldType.$767.getDisplayCode(), TagField.$d, "d", "marc.tf767.d.label.key", false ),
				new TagFieldTypeData("$767_g", DataFieldType.$767.getDisplayCode(), TagField.$g, "g", "marc.tf767.g.label.key", true ),
				new TagFieldTypeData("$767_h", DataFieldType.$767.getDisplayCode(), TagField.$h, "h", "marc.tf767.h.label.key", false ),
				new TagFieldTypeData("$767_i", DataFieldType.$767.getDisplayCode(), TagField.$i, "i", "marc.tf767.i.label.key", true ),
				new TagFieldTypeData("$767_k", DataFieldType.$767.getDisplayCode(), TagField.$k, "k", "marc.tf767.k.label.key", true ),
				new TagFieldTypeData("$767_l", DataFieldType.$767.getDisplayCode(), TagField.$l, "l", "marc.tf767.l.label.key", true ),
				new TagFieldTypeData("$767_m", DataFieldType.$767.getDisplayCode(), TagField.$m, "m", "marc.tf767.m.label.key", false ),
				new TagFieldTypeData("$767_n", DataFieldType.$767.getDisplayCode(), TagField.$n, "n", "marc.tf767.n.label.key", true ),
				new TagFieldTypeData("$767_o", DataFieldType.$767.getDisplayCode(), TagField.$o, "o", "marc.tf767.o.label.key", true ),
				new TagFieldTypeData("$767_r", DataFieldType.$767.getDisplayCode(), TagField.$r, "r", "marc.tf767.r.label.key", true ),
				new TagFieldTypeData("$767_s", DataFieldType.$767.getDisplayCode(), TagField.$s, "s", "marc.tf767.s.label.key", false ),
				new TagFieldTypeData("$767_t", DataFieldType.$767.getDisplayCode(), TagField.$t, "t", "marc.tf767.t.label.key", false ),
				new TagFieldTypeData("$767_u", DataFieldType.$767.getDisplayCode(), TagField.$u, "u", "marc.tf767.u.label.key", false ),
				new TagFieldTypeData("$767_w", DataFieldType.$767.getDisplayCode(), TagField.$w, "w", "marc.tf767.w.label.key", true ),
				new TagFieldTypeData("$767_x", DataFieldType.$767.getDisplayCode(), TagField.$x, "x", "marc.tf767.x.label.key", false ),
				new TagFieldTypeData("$767_y", DataFieldType.$767.getDisplayCode(), TagField.$y, "y", "marc.tf767.y.label.key", false ),
				new TagFieldTypeData("$767_z", DataFieldType.$767.getDisplayCode(), TagField.$z, "z", "marc.tf767.z.label.key", true ),
				new TagFieldTypeData("$767_4", DataFieldType.$767.getDisplayCode(), TagField.$4, "4", "marc.tf767.4.label.key", true ),
				new TagFieldTypeData("$767_6", DataFieldType.$767.getDisplayCode(), TagField.$6, "6", "marc.tf767.6.label.key", false ),
				new TagFieldTypeData("$767_7", DataFieldType.$767.getDisplayCode(), TagField.$7, "7", "marc.tf767.7.label.key", false ),
				new TagFieldTypeData("$767_8", DataFieldType.$767.getDisplayCode(), TagField.$8, "8", "marc.tf767.8.label.key", true ),} );
		
		case $770: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$770_a", DataFieldType.$770.getDisplayCode(), TagField.$a, "a", "marc.tf770.a.label.key", false ),
				new TagFieldTypeData("$770_b", DataFieldType.$770.getDisplayCode(), TagField.$b, "b", "marc.tf770.b.label.key", false ),
				new TagFieldTypeData("$770_c", DataFieldType.$770.getDisplayCode(), TagField.$c, "c", "marc.tf770.c.label.key", false ),
				new TagFieldTypeData("$770_d", DataFieldType.$770.getDisplayCode(), TagField.$d, "d", "marc.tf770.d.label.key", false ),
				new TagFieldTypeData("$770_g", DataFieldType.$770.getDisplayCode(), TagField.$g, "g", "marc.tf770.g.label.key", true ),
				new TagFieldTypeData("$770_h", DataFieldType.$770.getDisplayCode(), TagField.$h, "h", "marc.tf770.h.label.key", false ),
				new TagFieldTypeData("$770_i", DataFieldType.$770.getDisplayCode(), TagField.$i, "i", "marc.tf770.i.label.key", true ),
				new TagFieldTypeData("$770_k", DataFieldType.$770.getDisplayCode(), TagField.$k, "k", "marc.tf770.k.label.key", true ),
				new TagFieldTypeData("$770_l", DataFieldType.$770.getDisplayCode(), TagField.$l, "l", "marc.tf770.l.label.key", true ),
				new TagFieldTypeData("$770_m", DataFieldType.$770.getDisplayCode(), TagField.$m, "m", "marc.tf770.m.label.key", false ),
				new TagFieldTypeData("$770_n", DataFieldType.$770.getDisplayCode(), TagField.$n, "n", "marc.tf770.n.label.key", true ),
				new TagFieldTypeData("$770_o", DataFieldType.$770.getDisplayCode(), TagField.$o, "o", "marc.tf770.o.label.key", true ),
				new TagFieldTypeData("$770_r", DataFieldType.$770.getDisplayCode(), TagField.$r, "r", "marc.tf770.r.label.key", true ),
				new TagFieldTypeData("$770_s", DataFieldType.$770.getDisplayCode(), TagField.$s, "s", "marc.tf770.s.label.key", false ),
				new TagFieldTypeData("$770_t", DataFieldType.$770.getDisplayCode(), TagField.$t, "t", "marc.tf770.t.label.key", false ),
				new TagFieldTypeData("$770_u", DataFieldType.$770.getDisplayCode(), TagField.$u, "u", "marc.tf770.u.label.key", false ),
				new TagFieldTypeData("$770_w", DataFieldType.$770.getDisplayCode(), TagField.$w, "w", "marc.tf770.w.label.key", true ),
				new TagFieldTypeData("$770_x", DataFieldType.$770.getDisplayCode(), TagField.$x, "x", "marc.tf770.x.label.key", false ),
				new TagFieldTypeData("$770_y", DataFieldType.$770.getDisplayCode(), TagField.$y, "y", "marc.tf770.y.label.key", false ),
				new TagFieldTypeData("$770_z", DataFieldType.$770.getDisplayCode(), TagField.$z, "z", "marc.tf770.z.label.key", true ),
				new TagFieldTypeData("$770_4", DataFieldType.$770.getDisplayCode(), TagField.$4, "4", "marc.tf770.4.label.key", true ),
				new TagFieldTypeData("$770_6", DataFieldType.$770.getDisplayCode(), TagField.$6, "6", "marc.tf770.6.label.key", false ),
				new TagFieldTypeData("$770_7", DataFieldType.$770.getDisplayCode(), TagField.$7, "7", "marc.tf770.7.label.key", false ),
				new TagFieldTypeData("$770_8", DataFieldType.$770.getDisplayCode(), TagField.$8, "8", "marc.tf770.8.label.key", true ),} );
		
		case $772: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$772_a", DataFieldType.$772.getDisplayCode(), TagField.$a, "a", "marc.tf772.a.label.key", false ),
				new TagFieldTypeData("$772_b", DataFieldType.$772.getDisplayCode(), TagField.$b, "b", "marc.tf772.b.label.key", false ),
				new TagFieldTypeData("$772_c", DataFieldType.$772.getDisplayCode(), TagField.$c, "c", "marc.tf772.c.label.key", false ),
				new TagFieldTypeData("$772_d", DataFieldType.$772.getDisplayCode(), TagField.$d, "d", "marc.tf772.d.label.key", false ),
				new TagFieldTypeData("$772_g", DataFieldType.$772.getDisplayCode(), TagField.$g, "g", "marc.tf772.g.label.key", true ),
				new TagFieldTypeData("$772_h", DataFieldType.$772.getDisplayCode(), TagField.$h, "h", "marc.tf772.h.label.key", false ),
				new TagFieldTypeData("$772_i", DataFieldType.$772.getDisplayCode(), TagField.$i, "i", "marc.tf772.i.label.key", true ),
				new TagFieldTypeData("$772_k", DataFieldType.$772.getDisplayCode(), TagField.$k, "k", "marc.tf772.k.label.key", true ),
				new TagFieldTypeData("$772_l", DataFieldType.$772.getDisplayCode(), TagField.$l, "l", "marc.tf772.l.label.key", true ),
				new TagFieldTypeData("$772_m", DataFieldType.$772.getDisplayCode(), TagField.$m, "m", "marc.tf772.m.label.key", false ),
				new TagFieldTypeData("$772_n", DataFieldType.$772.getDisplayCode(), TagField.$n, "n", "marc.tf772.n.label.key", true ),
				new TagFieldTypeData("$772_o", DataFieldType.$772.getDisplayCode(), TagField.$o, "o", "marc.tf772.o.label.key", true ),
				new TagFieldTypeData("$772_r", DataFieldType.$772.getDisplayCode(), TagField.$r, "r", "marc.tf772.r.label.key", true ),
				new TagFieldTypeData("$772_s", DataFieldType.$772.getDisplayCode(), TagField.$s, "s", "marc.tf772.s.label.key", false ),
				new TagFieldTypeData("$772_t", DataFieldType.$772.getDisplayCode(), TagField.$t, "t", "marc.tf772.t.label.key", false ),
				new TagFieldTypeData("$772_u", DataFieldType.$772.getDisplayCode(), TagField.$u, "u", "marc.tf772.u.label.key", false ),
				new TagFieldTypeData("$772_w", DataFieldType.$772.getDisplayCode(), TagField.$w, "w", "marc.tf772.w.label.key", true ),
				new TagFieldTypeData("$772_x", DataFieldType.$772.getDisplayCode(), TagField.$x, "x", "marc.tf772.x.label.key", false ),
				new TagFieldTypeData("$772_y", DataFieldType.$772.getDisplayCode(), TagField.$y, "y", "marc.tf772.y.label.key", false ),
				new TagFieldTypeData("$772_z", DataFieldType.$772.getDisplayCode(), TagField.$z, "z", "marc.tf772.z.label.key", true ),
				new TagFieldTypeData("$772_4", DataFieldType.$772.getDisplayCode(), TagField.$4, "4", "marc.tf772.4.label.key", true ),
				new TagFieldTypeData("$772_6", DataFieldType.$772.getDisplayCode(), TagField.$6, "6", "marc.tf772.6.label.key", false ),
				new TagFieldTypeData("$772_7", DataFieldType.$772.getDisplayCode(), TagField.$7, "7", "marc.tf772.7.label.key", false ),
				new TagFieldTypeData("$772_8", DataFieldType.$772.getDisplayCode(), TagField.$8, "8", "marc.tf772.8.label.key", true ),} );
		
		case $773: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$773_a", DataFieldType.$773.getDisplayCode(), TagField.$a, "a", "marc.tf773.a.label.key", false ),
				new TagFieldTypeData("$773_b", DataFieldType.$773.getDisplayCode(), TagField.$b, "b", "marc.tf773.b.label.key", false ),
				new TagFieldTypeData("$773_d", DataFieldType.$773.getDisplayCode(), TagField.$d, "d", "marc.tf773.d.label.key", false ),
				new TagFieldTypeData("$773_g", DataFieldType.$773.getDisplayCode(), TagField.$g, "g", "marc.tf773.g.label.key", true ),
				new TagFieldTypeData("$773_h", DataFieldType.$773.getDisplayCode(), TagField.$h, "h", "marc.tf773.h.label.key", false ),
				new TagFieldTypeData("$773_i", DataFieldType.$773.getDisplayCode(), TagField.$i, "i", "marc.tf773.i.label.key", true ),
				new TagFieldTypeData("$773_k", DataFieldType.$773.getDisplayCode(), TagField.$k, "k", "marc.tf773.k.label.key", true ),
				new TagFieldTypeData("$773_l", DataFieldType.$773.getDisplayCode(), TagField.$l, "l", "marc.tf773.l.label.key", true ),
				new TagFieldTypeData("$773_m", DataFieldType.$773.getDisplayCode(), TagField.$m, "m", "marc.tf773.m.label.key", false ),
				new TagFieldTypeData("$773_n", DataFieldType.$773.getDisplayCode(), TagField.$n, "n", "marc.tf773.n.label.key", true ),
				new TagFieldTypeData("$773_o", DataFieldType.$773.getDisplayCode(), TagField.$o, "o", "marc.tf773.o.label.key", true ),
				new TagFieldTypeData("$773_p", DataFieldType.$773.getDisplayCode(), TagField.$p, "p", "marc.tf773.p.label.key", false ),
				new TagFieldTypeData("$773_q", DataFieldType.$773.getDisplayCode(), TagField.$q, "q", "marc.tf773.q.label.key", true ),
				new TagFieldTypeData("$773_r", DataFieldType.$773.getDisplayCode(), TagField.$r, "r", "marc.tf773.r.label.key", true ),
				new TagFieldTypeData("$773_s", DataFieldType.$773.getDisplayCode(), TagField.$s, "s", "marc.tf773.s.label.key", false ),
				new TagFieldTypeData("$773_t", DataFieldType.$773.getDisplayCode(), TagField.$t, "t", "marc.tf773.t.label.key", false ),
				new TagFieldTypeData("$773_u", DataFieldType.$773.getDisplayCode(), TagField.$u, "u", "marc.tf773.u.label.key", false ),
				new TagFieldTypeData("$773_w", DataFieldType.$773.getDisplayCode(), TagField.$w, "w", "marc.tf773.w.label.key", true ),
				new TagFieldTypeData("$773_x", DataFieldType.$773.getDisplayCode(), TagField.$x, "x", "marc.tf773.x.label.key", false ),
				new TagFieldTypeData("$773_y", DataFieldType.$773.getDisplayCode(), TagField.$y, "y", "marc.tf773.y.label.key", false ),
				new TagFieldTypeData("$773_z", DataFieldType.$773.getDisplayCode(), TagField.$z, "z", "marc.tf773.z.label.key", true ),
				new TagFieldTypeData("$773_3", DataFieldType.$773.getDisplayCode(), TagField.$3, "3", "marc.tf773.3.label.key", false ),
				new TagFieldTypeData("$773_4", DataFieldType.$773.getDisplayCode(), TagField.$4, "4", "marc.tf773.4.label.key", true ),
				new TagFieldTypeData("$773_5", DataFieldType.$773.getDisplayCode(), TagField.$5, "5", "marc.tf773.5.label.key", false ),
				new TagFieldTypeData("$773_6", DataFieldType.$773.getDisplayCode(), TagField.$6, "6", "marc.tf773.6.label.key", false ),
				new TagFieldTypeData("$773_7", DataFieldType.$773.getDisplayCode(), TagField.$7, "7", "marc.tf773.7.label.key", false ),
				new TagFieldTypeData("$773_8", DataFieldType.$773.getDisplayCode(), TagField.$8, "8", "marc.tf773.8.label.key", true ),} );
		
		case $774: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$774_a", DataFieldType.$774.getDisplayCode(), TagField.$a, "a", "marc.tf774.a.label.key", false ),
				new TagFieldTypeData("$774_b", DataFieldType.$774.getDisplayCode(), TagField.$b, "b", "marc.tf774.b.label.key", false ),
				new TagFieldTypeData("$774_c", DataFieldType.$774.getDisplayCode(), TagField.$c, "c", "marc.tf774.c.label.key", false ),
				new TagFieldTypeData("$774_d", DataFieldType.$774.getDisplayCode(), TagField.$d, "d", "marc.tf774.d.label.key", false ),
				new TagFieldTypeData("$774_g", DataFieldType.$774.getDisplayCode(), TagField.$g, "g", "marc.tf774.g.label.key", true ),
				new TagFieldTypeData("$774_h", DataFieldType.$774.getDisplayCode(), TagField.$h, "h", "marc.tf774.h.label.key", false ),
				new TagFieldTypeData("$774_i", DataFieldType.$774.getDisplayCode(), TagField.$i, "i", "marc.tf774.i.label.key", true ),
				new TagFieldTypeData("$774_j", DataFieldType.$774.getDisplayCode(), TagField.$j, "j", "marc.tf774.j.label.key", true ),
				new TagFieldTypeData("$774_k", DataFieldType.$774.getDisplayCode(), TagField.$k, "k", "marc.tf774.k.label.key", true ),
				new TagFieldTypeData("$774_l", DataFieldType.$774.getDisplayCode(), TagField.$l, "l", "marc.tf774.l.label.key", true ),
				new TagFieldTypeData("$774_m", DataFieldType.$774.getDisplayCode(), TagField.$m, "m", "marc.tf774.m.label.key", false ),
				new TagFieldTypeData("$774_n", DataFieldType.$774.getDisplayCode(), TagField.$n, "n", "marc.tf774.n.label.key", true ),
				new TagFieldTypeData("$774_o", DataFieldType.$774.getDisplayCode(), TagField.$o, "o", "marc.tf774.o.label.key", true ),
				new TagFieldTypeData("$774_r", DataFieldType.$774.getDisplayCode(), TagField.$r, "r", "marc.tf774.r.label.key", true ),
				new TagFieldTypeData("$774_s", DataFieldType.$774.getDisplayCode(), TagField.$s, "s", "marc.tf774.s.label.key", false ),
				new TagFieldTypeData("$774_t", DataFieldType.$774.getDisplayCode(), TagField.$t, "t", "marc.tf774.t.label.key", false ),
				new TagFieldTypeData("$774_u", DataFieldType.$774.getDisplayCode(), TagField.$u, "u", "marc.tf774.u.label.key", false ),
				new TagFieldTypeData("$774_w", DataFieldType.$774.getDisplayCode(), TagField.$w, "w", "marc.tf774.w.label.key", true ),
				new TagFieldTypeData("$774_x", DataFieldType.$774.getDisplayCode(), TagField.$x, "x", "marc.tf774.x.label.key", false ),
				new TagFieldTypeData("$774_y", DataFieldType.$774.getDisplayCode(), TagField.$y, "y", "marc.tf774.y.label.key", false ),
				new TagFieldTypeData("$774_z", DataFieldType.$774.getDisplayCode(), TagField.$z, "z", "marc.tf774.z.label.key", true ),
				new TagFieldTypeData("$774_4", DataFieldType.$774.getDisplayCode(), TagField.$4, "4", "marc.tf774.4.label.key", true ),
				new TagFieldTypeData("$774_5", DataFieldType.$774.getDisplayCode(), TagField.$5, "5", "marc.tf774.5.label.key", false ),
				new TagFieldTypeData("$774_6", DataFieldType.$774.getDisplayCode(), TagField.$6, "6", "marc.tf774.6.label.key", false ),
				new TagFieldTypeData("$774_7", DataFieldType.$774.getDisplayCode(), TagField.$7, "7", "marc.tf774.7.label.key", false ),
				new TagFieldTypeData("$774_8", DataFieldType.$774.getDisplayCode(), TagField.$8, "8", "marc.tf774.8.label.key", true ),} );
		
		case $775: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$775_a", DataFieldType.$775.getDisplayCode(), TagField.$a, "a", "marc.tf775.a.label.key", false ),
				new TagFieldTypeData("$775_b", DataFieldType.$775.getDisplayCode(), TagField.$b, "b", "marc.tf775.b.label.key", false ),
				new TagFieldTypeData("$775_c", DataFieldType.$775.getDisplayCode(), TagField.$c, "c", "marc.tf775.c.label.key", false ),
				new TagFieldTypeData("$775_d", DataFieldType.$775.getDisplayCode(), TagField.$d, "d", "marc.tf775.d.label.key", false ),
				new TagFieldTypeData("$775_e", DataFieldType.$775.getDisplayCode(), TagField.$e, "e", "marc.tf775.e.label.key", false ),
				new TagFieldTypeData("$775_f", DataFieldType.$775.getDisplayCode(), TagField.$f, "f", "marc.tf775.f.label.key", false ),
				new TagFieldTypeData("$775_g", DataFieldType.$775.getDisplayCode(), TagField.$g, "g", "marc.tf775.g.label.key", true ),
				new TagFieldTypeData("$775_h", DataFieldType.$775.getDisplayCode(), TagField.$h, "h", "marc.tf775.h.label.key", false ),
				new TagFieldTypeData("$775_i", DataFieldType.$775.getDisplayCode(), TagField.$i, "i", "marc.tf775.i.label.key", true ),
				new TagFieldTypeData("$775_j", DataFieldType.$775.getDisplayCode(), TagField.$j, "j", "marc.tf775.j.label.key", true ),
				new TagFieldTypeData("$775_k", DataFieldType.$775.getDisplayCode(), TagField.$k, "k", "marc.tf775.k.label.key", true ),
				new TagFieldTypeData("$775_l", DataFieldType.$775.getDisplayCode(), TagField.$l, "l", "marc.tf775.l.label.key", true ),
				new TagFieldTypeData("$775_m", DataFieldType.$775.getDisplayCode(), TagField.$m, "m", "marc.tf775.m.label.key", false ),
				new TagFieldTypeData("$775_n", DataFieldType.$775.getDisplayCode(), TagField.$n, "n", "marc.tf775.n.label.key", true ),
				new TagFieldTypeData("$775_o", DataFieldType.$775.getDisplayCode(), TagField.$o, "o", "marc.tf775.o.label.key", true ),
				new TagFieldTypeData("$775_r", DataFieldType.$775.getDisplayCode(), TagField.$r, "r", "marc.tf775.r.label.key", true ),
				new TagFieldTypeData("$775_s", DataFieldType.$775.getDisplayCode(), TagField.$s, "s", "marc.tf775.s.label.key", false ),
				new TagFieldTypeData("$775_t", DataFieldType.$775.getDisplayCode(), TagField.$t, "t", "marc.tf775.t.label.key", false ),
				new TagFieldTypeData("$775_u", DataFieldType.$775.getDisplayCode(), TagField.$u, "u", "marc.tf775.u.label.key", false ),
				new TagFieldTypeData("$775_w", DataFieldType.$775.getDisplayCode(), TagField.$w, "w", "marc.tf775.w.label.key", true ),
				new TagFieldTypeData("$775_x", DataFieldType.$775.getDisplayCode(), TagField.$x, "x", "marc.tf775.x.label.key", false ),
				new TagFieldTypeData("$775_y", DataFieldType.$775.getDisplayCode(), TagField.$y, "y", "marc.tf775.y.label.key", false ),
				new TagFieldTypeData("$775_z", DataFieldType.$775.getDisplayCode(), TagField.$z, "z", "marc.tf775.z.label.key", true ),
				new TagFieldTypeData("$775_4", DataFieldType.$775.getDisplayCode(), TagField.$4, "4", "marc.tf775.4.label.key", true ),
				new TagFieldTypeData("$775_6", DataFieldType.$775.getDisplayCode(), TagField.$6, "6", "marc.tf775.6.label.key", false ),
				new TagFieldTypeData("$775_7", DataFieldType.$775.getDisplayCode(), TagField.$7, "7", "marc.tf775.7.label.key", false ),
				new TagFieldTypeData("$775_8", DataFieldType.$775.getDisplayCode(), TagField.$8, "8", "marc.tf775.8.label.key", true ),} );
		
		case $776: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$776_a", DataFieldType.$776.getDisplayCode(), TagField.$a, "a", "marc.tf776.a.label.key", false ),
				new TagFieldTypeData("$776_b", DataFieldType.$776.getDisplayCode(), TagField.$b, "b", "marc.tf776.b.label.key", false ),
				new TagFieldTypeData("$776_c", DataFieldType.$776.getDisplayCode(), TagField.$c, "c", "marc.tf776.c.label.key", false ),
				new TagFieldTypeData("$776_d", DataFieldType.$776.getDisplayCode(), TagField.$d, "d", "marc.tf776.d.label.key", false ),
				new TagFieldTypeData("$776_g", DataFieldType.$776.getDisplayCode(), TagField.$g, "g", "marc.tf776.g.label.key", true ),
				new TagFieldTypeData("$776_h", DataFieldType.$776.getDisplayCode(), TagField.$h, "h", "marc.tf776.h.label.key", false ),
				new TagFieldTypeData("$776_i", DataFieldType.$776.getDisplayCode(), TagField.$i, "i", "marc.tf776.i.label.key", true ),
				new TagFieldTypeData("$776_j", DataFieldType.$776.getDisplayCode(), TagField.$j, "j", "marc.tf776.j.label.key", true ),
				new TagFieldTypeData("$776_k", DataFieldType.$776.getDisplayCode(), TagField.$k, "k", "marc.tf776.k.label.key", true ),
				new TagFieldTypeData("$776_l", DataFieldType.$776.getDisplayCode(), TagField.$l, "l", "marc.tf776.l.label.key", true ),
				new TagFieldTypeData("$776_m", DataFieldType.$776.getDisplayCode(), TagField.$m, "m", "marc.tf776.m.label.key", false ),
				new TagFieldTypeData("$776_n", DataFieldType.$776.getDisplayCode(), TagField.$n, "n", "marc.tf776.n.label.key", true ),
				new TagFieldTypeData("$776_o", DataFieldType.$776.getDisplayCode(), TagField.$o, "o", "marc.tf776.o.label.key", true ),
				new TagFieldTypeData("$776_r", DataFieldType.$776.getDisplayCode(), TagField.$r, "r", "marc.tf776.r.label.key", true ),
				new TagFieldTypeData("$776_s", DataFieldType.$776.getDisplayCode(), TagField.$s, "s", "marc.tf776.s.label.key", false ),
				new TagFieldTypeData("$776_t", DataFieldType.$776.getDisplayCode(), TagField.$t, "t", "marc.tf776.t.label.key", false ),
				new TagFieldTypeData("$776_u", DataFieldType.$776.getDisplayCode(), TagField.$u, "u", "marc.tf776.u.label.key", false ),
				new TagFieldTypeData("$776_w", DataFieldType.$776.getDisplayCode(), TagField.$w, "w", "marc.tf776.w.label.key", true ),
				new TagFieldTypeData("$776_x", DataFieldType.$776.getDisplayCode(), TagField.$x, "x", "marc.tf776.x.label.key", false ),
				new TagFieldTypeData("$776_y", DataFieldType.$776.getDisplayCode(), TagField.$y, "y", "marc.tf776.y.label.key", false ),
				new TagFieldTypeData("$776_z", DataFieldType.$776.getDisplayCode(), TagField.$z, "z", "marc.tf776.z.label.key", true ),
				new TagFieldTypeData("$776_4", DataFieldType.$776.getDisplayCode(), TagField.$4, "4", "marc.tf776.4.label.key", true ),
				new TagFieldTypeData("$776_6", DataFieldType.$776.getDisplayCode(), TagField.$6, "6", "marc.tf776.6.label.key", false ),
				new TagFieldTypeData("$776_7", DataFieldType.$776.getDisplayCode(), TagField.$7, "7", "marc.tf776.7.label.key", false ),
				new TagFieldTypeData("$776_8", DataFieldType.$776.getDisplayCode(), TagField.$8, "8", "marc.tf776.8.label.key", true ),} );
		
		case $777: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$777_a", DataFieldType.$777.getDisplayCode(), TagField.$a, "a", "marc.tf777.a.label.key", false ),
				new TagFieldTypeData("$777_b", DataFieldType.$777.getDisplayCode(), TagField.$b, "b", "marc.tf777.b.label.key", false ),
				new TagFieldTypeData("$777_c", DataFieldType.$777.getDisplayCode(), TagField.$c, "c", "marc.tf777.c.label.key", false ),
				new TagFieldTypeData("$777_d", DataFieldType.$777.getDisplayCode(), TagField.$d, "d", "marc.tf777.d.label.key", false ),
				new TagFieldTypeData("$777_g", DataFieldType.$777.getDisplayCode(), TagField.$g, "g", "marc.tf777.g.label.key", true ),
				new TagFieldTypeData("$777_h", DataFieldType.$777.getDisplayCode(), TagField.$h, "h", "marc.tf777.h.label.key", false ),
				new TagFieldTypeData("$777_i", DataFieldType.$777.getDisplayCode(), TagField.$i, "i", "marc.tf777.i.label.key", true ),
				new TagFieldTypeData("$777_j", DataFieldType.$777.getDisplayCode(), TagField.$j, "j", "marc.tf777.j.label.key", true ),
				new TagFieldTypeData("$777_k", DataFieldType.$777.getDisplayCode(), TagField.$k, "k", "marc.tf777.k.label.key", true ),
				new TagFieldTypeData("$777_l", DataFieldType.$777.getDisplayCode(), TagField.$l, "l", "marc.tf777.l.label.key", true ),
				new TagFieldTypeData("$777_m", DataFieldType.$777.getDisplayCode(), TagField.$m, "m", "marc.tf777.m.label.key", false ),
				new TagFieldTypeData("$777_n", DataFieldType.$777.getDisplayCode(), TagField.$n, "n", "marc.tf777.n.label.key", true ),
				new TagFieldTypeData("$777_o", DataFieldType.$777.getDisplayCode(), TagField.$o, "o", "marc.tf777.o.label.key", true ),
				new TagFieldTypeData("$777_r", DataFieldType.$777.getDisplayCode(), TagField.$r, "r", "marc.tf777.r.label.key", true ),
				new TagFieldTypeData("$777_s", DataFieldType.$777.getDisplayCode(), TagField.$s, "s", "marc.tf777.s.label.key", false ),
				new TagFieldTypeData("$777_t", DataFieldType.$777.getDisplayCode(), TagField.$t, "t", "marc.tf777.t.label.key", false ),
				new TagFieldTypeData("$777_u", DataFieldType.$777.getDisplayCode(), TagField.$u, "u", "marc.tf777.u.label.key", false ),
				new TagFieldTypeData("$777_w", DataFieldType.$777.getDisplayCode(), TagField.$w, "w", "marc.tf777.w.label.key", true ),
				new TagFieldTypeData("$777_x", DataFieldType.$777.getDisplayCode(), TagField.$x, "x", "marc.tf777.x.label.key", false ),
				new TagFieldTypeData("$777_y", DataFieldType.$777.getDisplayCode(), TagField.$y, "y", "marc.tf777.y.label.key", false ),
				new TagFieldTypeData("$777_z", DataFieldType.$777.getDisplayCode(), TagField.$z, "z", "marc.tf777.z.label.key", true ),
				new TagFieldTypeData("$777_4", DataFieldType.$777.getDisplayCode(), TagField.$4, "4", "marc.tf777.4.label.key", true ),
				new TagFieldTypeData("$777_6", DataFieldType.$777.getDisplayCode(), TagField.$6, "6", "marc.tf777.6.label.key", false ),
				new TagFieldTypeData("$777_7", DataFieldType.$777.getDisplayCode(), TagField.$7, "7", "marc.tf777.7.label.key", false ),
				new TagFieldTypeData("$777_8", DataFieldType.$777.getDisplayCode(), TagField.$8, "8", "marc.tf777.8.label.key", true ),} );
		
		case $780: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$780_a", DataFieldType.$780.getDisplayCode(), TagField.$a, "a", "marc.tf780.a.label.key", false ),
				new TagFieldTypeData("$780_b", DataFieldType.$780.getDisplayCode(), TagField.$b, "b", "marc.tf780.b.label.key", false ),
				new TagFieldTypeData("$780_c", DataFieldType.$780.getDisplayCode(), TagField.$c, "c", "marc.tf780.c.label.key", false ),
				new TagFieldTypeData("$780_d", DataFieldType.$780.getDisplayCode(), TagField.$d, "d", "marc.tf780.d.label.key", false ),
				new TagFieldTypeData("$780_g", DataFieldType.$780.getDisplayCode(), TagField.$g, "g", "marc.tf780.g.label.key", true ),
				new TagFieldTypeData("$780_h", DataFieldType.$780.getDisplayCode(), TagField.$h, "h", "marc.tf780.h.label.key", false ),
				new TagFieldTypeData("$780_i", DataFieldType.$780.getDisplayCode(), TagField.$i, "i", "marc.tf780.i.label.key", true ),
				new TagFieldTypeData("$780_j", DataFieldType.$780.getDisplayCode(), TagField.$j, "j", "marc.tf780.j.label.key", true ),
				new TagFieldTypeData("$780_k", DataFieldType.$780.getDisplayCode(), TagField.$k, "k", "marc.tf780.k.label.key", true ),
				new TagFieldTypeData("$780_l", DataFieldType.$780.getDisplayCode(), TagField.$l, "l", "marc.tf780.l.label.key", true ),
				new TagFieldTypeData("$780_m", DataFieldType.$780.getDisplayCode(), TagField.$m, "m", "marc.tf780.m.label.key", false ),
				new TagFieldTypeData("$780_n", DataFieldType.$780.getDisplayCode(), TagField.$n, "n", "marc.tf780.n.label.key", true ),
				new TagFieldTypeData("$780_o", DataFieldType.$780.getDisplayCode(), TagField.$o, "o", "marc.tf780.o.label.key", true ),
				new TagFieldTypeData("$780_r", DataFieldType.$780.getDisplayCode(), TagField.$r, "r", "marc.tf780.r.label.key", true ),
				new TagFieldTypeData("$780_s", DataFieldType.$780.getDisplayCode(), TagField.$s, "s", "marc.tf780.s.label.key", false ),
				new TagFieldTypeData("$780_t", DataFieldType.$780.getDisplayCode(), TagField.$t, "t", "marc.tf780.t.label.key", false ),
				new TagFieldTypeData("$780_u", DataFieldType.$780.getDisplayCode(), TagField.$u, "u", "marc.tf780.u.label.key", false ),
				new TagFieldTypeData("$780_w", DataFieldType.$780.getDisplayCode(), TagField.$w, "w", "marc.tf780.w.label.key", true ),
				new TagFieldTypeData("$780_x", DataFieldType.$780.getDisplayCode(), TagField.$x, "x", "marc.tf780.x.label.key", false ),
				new TagFieldTypeData("$780_y", DataFieldType.$780.getDisplayCode(), TagField.$y, "y", "marc.tf780.y.label.key", false ),
				new TagFieldTypeData("$780_z", DataFieldType.$780.getDisplayCode(), TagField.$z, "z", "marc.tf780.z.label.key", true ),
				new TagFieldTypeData("$780_4", DataFieldType.$780.getDisplayCode(), TagField.$4, "4", "marc.tf780.4.label.key", true ),
				new TagFieldTypeData("$780_6", DataFieldType.$780.getDisplayCode(), TagField.$6, "6", "marc.tf780.6.label.key", false ),
				new TagFieldTypeData("$780_7", DataFieldType.$780.getDisplayCode(), TagField.$7, "7", "marc.tf780.7.label.key", false ),
				new TagFieldTypeData("$780_8", DataFieldType.$780.getDisplayCode(), TagField.$8, "8", "marc.tf780.8.label.key", true ),} );
		
		case $785: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$785_a", DataFieldType.$785.getDisplayCode(), TagField.$a, "a", "marc.tf785.a.label.key", false ),
				new TagFieldTypeData("$785_b", DataFieldType.$785.getDisplayCode(), TagField.$b, "b", "marc.tf785.b.label.key", false ),
				new TagFieldTypeData("$785_c", DataFieldType.$785.getDisplayCode(), TagField.$c, "c", "marc.tf785.c.label.key", false ),
				new TagFieldTypeData("$785_d", DataFieldType.$785.getDisplayCode(), TagField.$d, "d", "marc.tf785.d.label.key", false ),
				new TagFieldTypeData("$785_g", DataFieldType.$785.getDisplayCode(), TagField.$g, "g", "marc.tf785.g.label.key", true ),
				new TagFieldTypeData("$785_h", DataFieldType.$785.getDisplayCode(), TagField.$h, "h", "marc.tf785.h.label.key", false ),
				new TagFieldTypeData("$785_i", DataFieldType.$785.getDisplayCode(), TagField.$i, "i", "marc.tf785.i.label.key", true ),
				new TagFieldTypeData("$785_j", DataFieldType.$785.getDisplayCode(), TagField.$j, "j", "marc.tf785.j.label.key", true ),
				new TagFieldTypeData("$785_k", DataFieldType.$785.getDisplayCode(), TagField.$k, "k", "marc.tf785.k.label.key", true ),
				new TagFieldTypeData("$785_l", DataFieldType.$785.getDisplayCode(), TagField.$l, "l", "marc.tf785.l.label.key", true ),
				new TagFieldTypeData("$785_m", DataFieldType.$785.getDisplayCode(), TagField.$m, "m", "marc.tf785.m.label.key", false ),
				new TagFieldTypeData("$785_n", DataFieldType.$785.getDisplayCode(), TagField.$n, "n", "marc.tf785.n.label.key", true ),
				new TagFieldTypeData("$785_o", DataFieldType.$785.getDisplayCode(), TagField.$o, "o", "marc.tf785.o.label.key", true ),
				new TagFieldTypeData("$785_r", DataFieldType.$785.getDisplayCode(), TagField.$r, "r", "marc.tf785.r.label.key", true ),
				new TagFieldTypeData("$785_s", DataFieldType.$785.getDisplayCode(), TagField.$s, "s", "marc.tf785.s.label.key", false ),
				new TagFieldTypeData("$785_t", DataFieldType.$785.getDisplayCode(), TagField.$t, "t", "marc.tf785.t.label.key", false ),
				new TagFieldTypeData("$785_u", DataFieldType.$785.getDisplayCode(), TagField.$u, "u", "marc.tf785.u.label.key", false ),
				new TagFieldTypeData("$785_w", DataFieldType.$785.getDisplayCode(), TagField.$w, "w", "marc.tf785.w.label.key", true ),
				new TagFieldTypeData("$785_x", DataFieldType.$785.getDisplayCode(), TagField.$x, "x", "marc.tf785.x.label.key", false ),
				new TagFieldTypeData("$785_y", DataFieldType.$785.getDisplayCode(), TagField.$y, "y", "marc.tf785.y.label.key", false ),
				new TagFieldTypeData("$785_z", DataFieldType.$785.getDisplayCode(), TagField.$z, "z", "marc.tf785.z.label.key", true ),
				new TagFieldTypeData("$785_4", DataFieldType.$785.getDisplayCode(), TagField.$4, "4", "marc.tf785.4.label.key", true ),
				new TagFieldTypeData("$785_6", DataFieldType.$785.getDisplayCode(), TagField.$6, "6", "marc.tf785.6.label.key", false ),
				new TagFieldTypeData("$785_7", DataFieldType.$785.getDisplayCode(), TagField.$7, "7", "marc.tf785.7.label.key", false ),
				new TagFieldTypeData("$785_8", DataFieldType.$785.getDisplayCode(), TagField.$8, "8", "marc.tf785.8.label.key", true ),} );
		
		case $786: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$786_a", DataFieldType.$786.getDisplayCode(), TagField.$a, "a", "marc.tf786.a.label.key", false ),
				new TagFieldTypeData("$786_b", DataFieldType.$786.getDisplayCode(), TagField.$b, "b", "marc.tf786.b.label.key", false ),
				new TagFieldTypeData("$786_c", DataFieldType.$786.getDisplayCode(), TagField.$c, "c", "marc.tf786.c.label.key", false ),
				new TagFieldTypeData("$786_d", DataFieldType.$786.getDisplayCode(), TagField.$d, "d", "marc.tf786.d.label.key", false ),
				new TagFieldTypeData("$786_g", DataFieldType.$786.getDisplayCode(), TagField.$g, "g", "marc.tf786.g.label.key", true ),
				new TagFieldTypeData("$786_h", DataFieldType.$786.getDisplayCode(), TagField.$h, "h", "marc.tf786.h.label.key", false ),
				new TagFieldTypeData("$786_i", DataFieldType.$786.getDisplayCode(), TagField.$i, "i", "marc.tf786.i.label.key", true ),
				new TagFieldTypeData("$786_j", DataFieldType.$786.getDisplayCode(), TagField.$j, "j", "marc.tf786.j.label.key", true ),
				new TagFieldTypeData("$786_k", DataFieldType.$786.getDisplayCode(), TagField.$k, "k", "marc.tf786.k.label.key", true ),
				new TagFieldTypeData("$786_l", DataFieldType.$786.getDisplayCode(), TagField.$l, "l", "marc.tf786.l.label.key", true ),
				new TagFieldTypeData("$786_m", DataFieldType.$786.getDisplayCode(), TagField.$m, "m", "marc.tf786.m.label.key", false ),
				new TagFieldTypeData("$786_n", DataFieldType.$786.getDisplayCode(), TagField.$n, "n", "marc.tf786.n.label.key", true ),
				new TagFieldTypeData("$786_o", DataFieldType.$786.getDisplayCode(), TagField.$o, "o", "marc.tf786.o.label.key", true ),
				new TagFieldTypeData("$786_p", DataFieldType.$786.getDisplayCode(), TagField.$p, "p", "marc.tf786.p.label.key", false ),
				new TagFieldTypeData("$786_r", DataFieldType.$786.getDisplayCode(), TagField.$r, "r", "marc.tf786.r.label.key", true ),
				new TagFieldTypeData("$786_s", DataFieldType.$786.getDisplayCode(), TagField.$s, "s", "marc.tf786.s.label.key", false ),
				new TagFieldTypeData("$786_t", DataFieldType.$786.getDisplayCode(), TagField.$t, "t", "marc.tf786.t.label.key", false ),
				new TagFieldTypeData("$786_u", DataFieldType.$786.getDisplayCode(), TagField.$u, "u", "marc.tf786.u.label.key", false ),
				new TagFieldTypeData("$786_w", DataFieldType.$786.getDisplayCode(), TagField.$w, "w", "marc.tf786.w.label.key", true ),
				new TagFieldTypeData("$786_x", DataFieldType.$786.getDisplayCode(), TagField.$x, "x", "marc.tf786.x.label.key", false ),
				new TagFieldTypeData("$786_y", DataFieldType.$786.getDisplayCode(), TagField.$y, "y", "marc.tf786.y.label.key", false ),
				new TagFieldTypeData("$786_z", DataFieldType.$786.getDisplayCode(), TagField.$z, "z", "marc.tf786.z.label.key", true ),
				new TagFieldTypeData("$786_4", DataFieldType.$786.getDisplayCode(), TagField.$4, "4", "marc.tf786.4.label.key", true ),
				new TagFieldTypeData("$786_6", DataFieldType.$786.getDisplayCode(), TagField.$6, "6", "marc.tf786.6.label.key", false ),
				new TagFieldTypeData("$786_7", DataFieldType.$786.getDisplayCode(), TagField.$7, "7", "marc.tf786.7.label.key", false ),
				new TagFieldTypeData("$786_8", DataFieldType.$786.getDisplayCode(), TagField.$8, "8", "marc.tf786.8.label.key", true ),} );
		
		case $787: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$787_a", DataFieldType.$787.getDisplayCode(), TagField.$a, "a", "marc.tf787.a.label.key", false ),
				new TagFieldTypeData("$787_b", DataFieldType.$787.getDisplayCode(), TagField.$b, "b", "marc.tf787.b.label.key", false ),
				new TagFieldTypeData("$787_c", DataFieldType.$787.getDisplayCode(), TagField.$c, "c", "marc.tf787.c.label.key", false ),
				new TagFieldTypeData("$787_d", DataFieldType.$787.getDisplayCode(), TagField.$d, "d", "marc.tf787.d.label.key", false ),
				new TagFieldTypeData("$787_g", DataFieldType.$787.getDisplayCode(), TagField.$g, "g", "marc.tf787.g.label.key", true ),
				new TagFieldTypeData("$787_h", DataFieldType.$787.getDisplayCode(), TagField.$h, "h", "marc.tf787.h.label.key", false ),
				new TagFieldTypeData("$787_i", DataFieldType.$787.getDisplayCode(), TagField.$i, "i", "marc.tf787.i.label.key", true ),
				new TagFieldTypeData("$787_j", DataFieldType.$787.getDisplayCode(), TagField.$j, "j", "marc.tf787.j.label.key", true ),
				new TagFieldTypeData("$787_k", DataFieldType.$787.getDisplayCode(), TagField.$k, "k", "marc.tf787.k.label.key", true ),
				new TagFieldTypeData("$787_l", DataFieldType.$787.getDisplayCode(), TagField.$l, "l", "marc.tf787.l.label.key", true ),
				new TagFieldTypeData("$787_m", DataFieldType.$787.getDisplayCode(), TagField.$m, "m", "marc.tf787.m.label.key", false ),
				new TagFieldTypeData("$787_n", DataFieldType.$787.getDisplayCode(), TagField.$n, "n", "marc.tf787.n.label.key", true ),
				new TagFieldTypeData("$787_o", DataFieldType.$787.getDisplayCode(), TagField.$o, "o", "marc.tf787.o.label.key", true ),
				new TagFieldTypeData("$787_r", DataFieldType.$787.getDisplayCode(), TagField.$r, "r", "marc.tf787.r.label.key", true ),
				new TagFieldTypeData("$787_s", DataFieldType.$787.getDisplayCode(), TagField.$s, "s", "marc.tf787.s.label.key", false ),
				new TagFieldTypeData("$787_t", DataFieldType.$787.getDisplayCode(), TagField.$t, "t", "marc.tf787.t.label.key", false ),
				new TagFieldTypeData("$787_u", DataFieldType.$787.getDisplayCode(), TagField.$u, "u", "marc.tf787.u.label.key", false ),
				new TagFieldTypeData("$787_w", DataFieldType.$787.getDisplayCode(), TagField.$w, "w", "marc.tf787.w.label.key", true ),
				new TagFieldTypeData("$787_x", DataFieldType.$787.getDisplayCode(), TagField.$x, "x", "marc.tf787.x.label.key", false ),
				new TagFieldTypeData("$787_y", DataFieldType.$787.getDisplayCode(), TagField.$y, "y", "marc.tf787.y.label.key", false ),
				new TagFieldTypeData("$787_z", DataFieldType.$787.getDisplayCode(), TagField.$z, "z", "marc.tf787.z.label.key", true ),
				new TagFieldTypeData("$787_4", DataFieldType.$787.getDisplayCode(), TagField.$4, "4", "marc.tf787.4.label.key", true ),
				new TagFieldTypeData("$787_5", DataFieldType.$787.getDisplayCode(), TagField.$5, "5", "marc.tf787.5.label.key", false ),
				new TagFieldTypeData("$787_6", DataFieldType.$787.getDisplayCode(), TagField.$6, "6", "marc.tf787.6.label.key", false ),
				new TagFieldTypeData("$787_7", DataFieldType.$787.getDisplayCode(), TagField.$7, "7", "marc.tf787.7.label.key", false ),
				new TagFieldTypeData("$787_8", DataFieldType.$787.getDisplayCode(), TagField.$8, "8", "marc.tf787.8.label.key", true ),} );
		
		case $788: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$788_a", DataFieldType.$788.getDisplayCode(), TagField.$a, "a", "marc.tf788.a.label.key", false ),
				new TagFieldTypeData("$788_b", DataFieldType.$788.getDisplayCode(), TagField.$b, "b", "marc.tf788.b.label.key", true ),
				new TagFieldTypeData("$788_d", DataFieldType.$788.getDisplayCode(), TagField.$d, "d", "marc.tf788.d.label.key", false ),
				new TagFieldTypeData("$788_e", DataFieldType.$788.getDisplayCode(), TagField.$e, "e", "marc.tf788.e.label.key", false ),
				new TagFieldTypeData("$788_i", DataFieldType.$788.getDisplayCode(), TagField.$i, "i", "marc.tf788.i.label.key", true ),
				new TagFieldTypeData("$788_l", DataFieldType.$788.getDisplayCode(), TagField.$l, "l", "marc.tf788.l.label.key", true ),
				new TagFieldTypeData("$788_n", DataFieldType.$788.getDisplayCode(), TagField.$n, "n", "marc.tf788.n.label.key", true ),
				new TagFieldTypeData("$788_s", DataFieldType.$788.getDisplayCode(), TagField.$s, "s", "marc.tf788.s.label.key", false ),
				new TagFieldTypeData("$788_t", DataFieldType.$788.getDisplayCode(), TagField.$t, "t", "marc.tf788.t.label.key", false ),
				new TagFieldTypeData("$788_w", DataFieldType.$788.getDisplayCode(), TagField.$w, "w", "marc.tf788.w.label.key", true ),
				new TagFieldTypeData("$788_x", DataFieldType.$788.getDisplayCode(), TagField.$x, "x", "marc.tf788.x.label.key", false ),
				new TagFieldTypeData("$788_4", DataFieldType.$788.getDisplayCode(), TagField.$4, "4", "marc.tf788.4.label.key", true ),
				new TagFieldTypeData("$788_5", DataFieldType.$788.getDisplayCode(), TagField.$5, "5", "marc.tf788.5.label.key", false ),
				new TagFieldTypeData("$788_6", DataFieldType.$788.getDisplayCode(), TagField.$6, "6", "marc.tf788.6.label.key", false ),
				new TagFieldTypeData("$788_8", DataFieldType.$788.getDisplayCode(), TagField.$8, "8", "marc.tf788.8.label.key", true ),} );
		
		case $800: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$800_a", DataFieldType.$800.getDisplayCode(), TagField.$a, "a", "marc.tf800.a.label.key", false ),
				new TagFieldTypeData("$800_b", DataFieldType.$800.getDisplayCode(), TagField.$b, "b", "marc.tf800.b.label.key", false ),
				new TagFieldTypeData("$800_c", DataFieldType.$800.getDisplayCode(), TagField.$c, "c", "marc.tf800.c.label.key", true ),
				new TagFieldTypeData("$800_d", DataFieldType.$800.getDisplayCode(), TagField.$d, "d", "marc.tf800.d.label.key", false ),
				new TagFieldTypeData("$800_e", DataFieldType.$800.getDisplayCode(), TagField.$e, "e", "marc.tf800.e.label.key", true ),
				new TagFieldTypeData("$800_f", DataFieldType.$800.getDisplayCode(), TagField.$f, "f", "marc.tf800.f.label.key", false ),
				new TagFieldTypeData("$800_g", DataFieldType.$800.getDisplayCode(), TagField.$g, "g", "marc.tf800.g.label.key", true ),
				new TagFieldTypeData("$800_h", DataFieldType.$800.getDisplayCode(), TagField.$h, "h", "marc.tf800.h.label.key", false ),
				new TagFieldTypeData("$800_j", DataFieldType.$800.getDisplayCode(), TagField.$j, "j", "marc.tf800.j.label.key", true ),
				new TagFieldTypeData("$800_k", DataFieldType.$800.getDisplayCode(), TagField.$k, "k", "marc.tf800.k.label.key", true ),
				new TagFieldTypeData("$800_l", DataFieldType.$800.getDisplayCode(), TagField.$l, "l", "marc.tf800.l.label.key", false ),
				new TagFieldTypeData("$800_m", DataFieldType.$800.getDisplayCode(), TagField.$m, "m", "marc.tf800.m.label.key", true ),
				new TagFieldTypeData("$800_n", DataFieldType.$800.getDisplayCode(), TagField.$n, "n", "marc.tf800.n.label.key", true ),
				new TagFieldTypeData("$800_o", DataFieldType.$800.getDisplayCode(), TagField.$o, "o", "marc.tf800.o.label.key", false ),
				new TagFieldTypeData("$800_p", DataFieldType.$800.getDisplayCode(), TagField.$p, "p", "marc.tf800.p.label.key", true ),
				new TagFieldTypeData("$800_q", DataFieldType.$800.getDisplayCode(), TagField.$q, "q", "marc.tf800.q.label.key", false ),
				new TagFieldTypeData("$800_r", DataFieldType.$800.getDisplayCode(), TagField.$r, "r", "marc.tf800.r.label.key", false ),
				new TagFieldTypeData("$800_s", DataFieldType.$800.getDisplayCode(), TagField.$s, "s", "marc.tf800.s.label.key", true ),
				new TagFieldTypeData("$800_t", DataFieldType.$800.getDisplayCode(), TagField.$t, "t", "marc.tf800.t.label.key", false ),
				new TagFieldTypeData("$800_u", DataFieldType.$800.getDisplayCode(), TagField.$u, "u", "marc.tf800.u.label.key", false ),
				new TagFieldTypeData("$800_v", DataFieldType.$800.getDisplayCode(), TagField.$v, "v", "marc.tf800.v.label.key", false ),
				new TagFieldTypeData("$800_w", DataFieldType.$800.getDisplayCode(), TagField.$w, "w", "marc.tf800.w.label.key", true ),
				new TagFieldTypeData("$800_x", DataFieldType.$800.getDisplayCode(), TagField.$x, "x", "marc.tf800.x.label.key", false ),
				new TagFieldTypeData("$800_y", DataFieldType.$800.getDisplayCode(), TagField.$y, "y", "marc.tf800.y.label.key", true ),
				new TagFieldTypeData("$800_0", DataFieldType.$800.getDisplayCode(), TagField.$0, "0", "marc.tf800.0.label.key", true ),
				new TagFieldTypeData("$800_1", DataFieldType.$800.getDisplayCode(), TagField.$1, "1", "marc.tf800.1.label.key", true ),
				new TagFieldTypeData("$800_2", DataFieldType.$800.getDisplayCode(), TagField.$2, "2", "marc.tf800.2.label.key", false ),
				new TagFieldTypeData("$800_3", DataFieldType.$800.getDisplayCode(), TagField.$3, "3", "marc.tf800.3.label.key", false ),
				new TagFieldTypeData("$800_4", DataFieldType.$800.getDisplayCode(), TagField.$4, "4", "marc.tf800.4.label.key", true ),
				new TagFieldTypeData("$800_5", DataFieldType.$800.getDisplayCode(), TagField.$5, "5", "marc.tf800.5.label.key", true ),
				new TagFieldTypeData("$800_6", DataFieldType.$800.getDisplayCode(), TagField.$6, "6", "marc.tf800.6.label.key", false ),
				new TagFieldTypeData("$800_7", DataFieldType.$800.getDisplayCode(), TagField.$7, "7", "marc.tf800.7.label.key", false ),
				new TagFieldTypeData("$800_8", DataFieldType.$800.getDisplayCode(), TagField.$8, "8", "marc.tf800.8.label.key", true ),} );
		
		case $810: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$810_a", DataFieldType.$810.getDisplayCode(), TagField.$a, "a", "marc.tf810.a.label.key", false ),
				new TagFieldTypeData("$810_b", DataFieldType.$810.getDisplayCode(), TagField.$b, "b", "marc.tf810.b.label.key", true ),
				new TagFieldTypeData("$810_c", DataFieldType.$810.getDisplayCode(), TagField.$c, "c", "marc.tf810.c.label.key", true ),
				new TagFieldTypeData("$810_d", DataFieldType.$810.getDisplayCode(), TagField.$d, "d", "marc.tf810.d.label.key", true ),
				new TagFieldTypeData("$810_e", DataFieldType.$810.getDisplayCode(), TagField.$e, "e", "marc.tf810.e.label.key", true ),
				new TagFieldTypeData("$810_f", DataFieldType.$810.getDisplayCode(), TagField.$f, "f", "marc.tf810.f.label.key", false ),
				new TagFieldTypeData("$810_g", DataFieldType.$810.getDisplayCode(), TagField.$g, "g", "marc.tf810.g.label.key", true ),
				new TagFieldTypeData("$810_h", DataFieldType.$810.getDisplayCode(), TagField.$h, "h", "marc.tf810.h.label.key", false ),
				new TagFieldTypeData("$810_k", DataFieldType.$810.getDisplayCode(), TagField.$k, "k", "marc.tf810.k.label.key", true ),
				new TagFieldTypeData("$810_l", DataFieldType.$810.getDisplayCode(), TagField.$l, "l", "marc.tf810.l.label.key", false ),
				new TagFieldTypeData("$810_m", DataFieldType.$810.getDisplayCode(), TagField.$m, "m", "marc.tf810.m.label.key", true ),
				new TagFieldTypeData("$810_n", DataFieldType.$810.getDisplayCode(), TagField.$n, "n", "marc.tf810.n.label.key", true ),
				new TagFieldTypeData("$810_o", DataFieldType.$810.getDisplayCode(), TagField.$o, "o", "marc.tf810.o.label.key", false ),
				new TagFieldTypeData("$810_p", DataFieldType.$810.getDisplayCode(), TagField.$p, "p", "marc.tf810.p.label.key", true ),
				new TagFieldTypeData("$810_r", DataFieldType.$810.getDisplayCode(), TagField.$r, "r", "marc.tf810.r.label.key", false ),
				new TagFieldTypeData("$810_s", DataFieldType.$810.getDisplayCode(), TagField.$s, "s", "marc.tf810.s.label.key", true ),
				new TagFieldTypeData("$810_t", DataFieldType.$810.getDisplayCode(), TagField.$t, "t", "marc.tf810.t.label.key", false ),
				new TagFieldTypeData("$810_u", DataFieldType.$810.getDisplayCode(), TagField.$u, "u", "marc.tf810.u.label.key", false ),
				new TagFieldTypeData("$810_v", DataFieldType.$810.getDisplayCode(), TagField.$v, "v", "marc.tf810.v.label.key", true ),
				new TagFieldTypeData("$810_w", DataFieldType.$810.getDisplayCode(), TagField.$w, "w", "marc.tf810.w.label.key", true ),
				new TagFieldTypeData("$810_x", DataFieldType.$810.getDisplayCode(), TagField.$x, "x", "marc.tf810.x.label.key", false ),
				new TagFieldTypeData("$810_y", DataFieldType.$810.getDisplayCode(), TagField.$y, "y", "marc.tf810.y.label.key", true ),
				new TagFieldTypeData("$810_0", DataFieldType.$810.getDisplayCode(), TagField.$0, "0", "marc.tf810.0.label.key", true ),
				new TagFieldTypeData("$810_1", DataFieldType.$810.getDisplayCode(), TagField.$1, "1", "marc.tf810.1.label.key", true ),
				new TagFieldTypeData("$810_2", DataFieldType.$810.getDisplayCode(), TagField.$2, "2", "marc.tf810.2.label.key", false ),
				new TagFieldTypeData("$810_3", DataFieldType.$810.getDisplayCode(), TagField.$3, "3", "marc.tf810.3.label.key", false ),
				new TagFieldTypeData("$810_4", DataFieldType.$810.getDisplayCode(), TagField.$4, "4", "marc.tf810.4.label.key", true ),
				new TagFieldTypeData("$810_5", DataFieldType.$810.getDisplayCode(), TagField.$5, "5", "marc.tf810.5.label.key", true ),
				new TagFieldTypeData("$810_6", DataFieldType.$810.getDisplayCode(), TagField.$6, "6", "marc.tf810.6.label.key", false ),
				new TagFieldTypeData("$810_7", DataFieldType.$810.getDisplayCode(), TagField.$7, "7", "marc.tf810.7.label.key", false ),
				new TagFieldTypeData("$810_8", DataFieldType.$810.getDisplayCode(), TagField.$8, "8", "marc.tf810.8.label.key", true ),
				new TagFieldTypeData("$810_9", DataFieldType.$810.getDisplayCode(), TagField.$9, "9", "marc.tf810.9.label.key", true ),} );
		
		case $811: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$811_a", DataFieldType.$811.getDisplayCode(), TagField.$a, "a", "marc.tf811.a.label.key", false ),
				new TagFieldTypeData("$811_b", DataFieldType.$811.getDisplayCode(), TagField.$b, "b", "marc.tf811.b.label.key", true ),
				new TagFieldTypeData("$811_c", DataFieldType.$811.getDisplayCode(), TagField.$c, "c", "marc.tf811.c.label.key", true ),
				new TagFieldTypeData("$811_d", DataFieldType.$811.getDisplayCode(), TagField.$d, "d", "marc.tf811.d.label.key", true ),
				new TagFieldTypeData("$811_e", DataFieldType.$811.getDisplayCode(), TagField.$e, "e", "marc.tf811.e.label.key", true ),
				new TagFieldTypeData("$811_f", DataFieldType.$811.getDisplayCode(), TagField.$f, "f", "marc.tf811.f.label.key", false ),
				new TagFieldTypeData("$811_g", DataFieldType.$811.getDisplayCode(), TagField.$g, "g", "marc.tf811.g.label.key", true ),
				new TagFieldTypeData("$811_h", DataFieldType.$811.getDisplayCode(), TagField.$h, "h", "marc.tf811.h.label.key", false ),
				new TagFieldTypeData("$811_j", DataFieldType.$811.getDisplayCode(), TagField.$j, "j", "marc.tf811.j.label.key", true ),
				new TagFieldTypeData("$811_k", DataFieldType.$811.getDisplayCode(), TagField.$k, "k", "marc.tf811.k.label.key", true ),
				new TagFieldTypeData("$811_l", DataFieldType.$811.getDisplayCode(), TagField.$l, "l", "marc.tf811.l.label.key", false ),
				new TagFieldTypeData("$811_m", DataFieldType.$811.getDisplayCode(), TagField.$m, "m", "marc.tf811.m.label.key", true ),
				new TagFieldTypeData("$811_p", DataFieldType.$811.getDisplayCode(), TagField.$p, "p", "marc.tf811.p.label.key", true ),
				new TagFieldTypeData("$811_q", DataFieldType.$811.getDisplayCode(), TagField.$q, "q", "marc.tf811.q.label.key", false ),
				new TagFieldTypeData("$811_r", DataFieldType.$811.getDisplayCode(), TagField.$r, "r", "marc.tf811.r.label.key", true ),
				new TagFieldTypeData("$811_s", DataFieldType.$811.getDisplayCode(), TagField.$s, "s", "marc.tf811.s.label.key", true ),
				new TagFieldTypeData("$811_t", DataFieldType.$811.getDisplayCode(), TagField.$t, "t", "marc.tf811.t.label.key", false ),
				new TagFieldTypeData("$811_u", DataFieldType.$811.getDisplayCode(), TagField.$u, "u", "marc.tf811.u.label.key", false ),
				new TagFieldTypeData("$811_v", DataFieldType.$811.getDisplayCode(), TagField.$v, "v", "marc.tf811.v.label.key", false ),
				new TagFieldTypeData("$811_w", DataFieldType.$811.getDisplayCode(), TagField.$w, "w", "marc.tf811.w.label.key", true ),
				new TagFieldTypeData("$811_x", DataFieldType.$811.getDisplayCode(), TagField.$x, "x", "marc.tf811.x.label.key", false ),
				new TagFieldTypeData("$811_y", DataFieldType.$811.getDisplayCode(), TagField.$y, "y", "marc.tf811.y.label.key", true ),
				new TagFieldTypeData("$811_0", DataFieldType.$811.getDisplayCode(), TagField.$0, "0", "marc.tf811.0.label.key", true ),
				new TagFieldTypeData("$811_1", DataFieldType.$811.getDisplayCode(), TagField.$1, "1", "marc.tf811.1.label.key", true ),
				new TagFieldTypeData("$811_2", DataFieldType.$811.getDisplayCode(), TagField.$2, "2", "marc.tf811.2.label.key", false ),
				new TagFieldTypeData("$811_3", DataFieldType.$811.getDisplayCode(), TagField.$3, "3", "marc.tf811.3.label.key", false ),
				new TagFieldTypeData("$811_4", DataFieldType.$811.getDisplayCode(), TagField.$4, "4", "marc.tf811.4.label.key", true ),
				new TagFieldTypeData("$811_5", DataFieldType.$811.getDisplayCode(), TagField.$5, "5", "marc.tf811.5.label.key", true ),
				new TagFieldTypeData("$811_6", DataFieldType.$811.getDisplayCode(), TagField.$6, "6", "marc.tf811.6.label.key", false ),
				new TagFieldTypeData("$811_7", DataFieldType.$811.getDisplayCode(), TagField.$7, "7", "marc.tf811.7.label.key", false ),
				new TagFieldTypeData("$811_8", DataFieldType.$811.getDisplayCode(), TagField.$8, "8", "marc.tf811.8.label.key", true ),} );
		
		case $830: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$830_a", DataFieldType.$830.getDisplayCode(), TagField.$a, "a", "marc.tf830.a.label.key", false ),
				new TagFieldTypeData("$830_d", DataFieldType.$830.getDisplayCode(), TagField.$d, "d", "marc.tf830.d.label.key", true ),
				new TagFieldTypeData("$830_f", DataFieldType.$830.getDisplayCode(), TagField.$f, "f", "marc.tf830.f.label.key", false ),
				new TagFieldTypeData("$830_g", DataFieldType.$830.getDisplayCode(), TagField.$g, "g", "marc.tf830.g.label.key", true ),
				new TagFieldTypeData("$830_h", DataFieldType.$830.getDisplayCode(), TagField.$h, "h", "marc.tf830.h.label.key", false ),
				new TagFieldTypeData("$830_k", DataFieldType.$830.getDisplayCode(), TagField.$k, "k", "marc.tf830.k.label.key", true ),
				new TagFieldTypeData("$830_l", DataFieldType.$830.getDisplayCode(), TagField.$l, "l", "marc.tf830.l.label.key", false ),
				new TagFieldTypeData("$830_m", DataFieldType.$830.getDisplayCode(), TagField.$m, "m", "marc.tf830.m.label.key", true ),
				new TagFieldTypeData("$830_n", DataFieldType.$830.getDisplayCode(), TagField.$n, "n", "marc.tf830.n.label.key", true ),
				new TagFieldTypeData("$830_o", DataFieldType.$830.getDisplayCode(), TagField.$o, "o", "marc.tf830.o.label.key", false ),
				new TagFieldTypeData("$830_p", DataFieldType.$830.getDisplayCode(), TagField.$p, "p", "marc.tf830.p.label.key", true ),
				new TagFieldTypeData("$830_r", DataFieldType.$830.getDisplayCode(), TagField.$r, "r", "marc.tf830.r.label.key", false ),
				new TagFieldTypeData("$830_s", DataFieldType.$830.getDisplayCode(), TagField.$s, "s", "marc.tf830.s.label.key", true ),
				new TagFieldTypeData("$830_t", DataFieldType.$830.getDisplayCode(), TagField.$t, "t", "marc.tf830.t.label.key", false ),
				new TagFieldTypeData("$830_v", DataFieldType.$830.getDisplayCode(), TagField.$v, "v", "marc.tf830.v.label.key", false ),
				new TagFieldTypeData("$830_w", DataFieldType.$830.getDisplayCode(), TagField.$w, "w", "marc.tf830.w.label.key", true ),
				new TagFieldTypeData("$830_x", DataFieldType.$830.getDisplayCode(), TagField.$x, "x", "marc.tf830.x.label.key", false ),
				new TagFieldTypeData("$830_y", DataFieldType.$830.getDisplayCode(), TagField.$y, "y", "marc.tf830.y.label.key", true ),
				new TagFieldTypeData("$830_0", DataFieldType.$830.getDisplayCode(), TagField.$0, "0", "marc.tf830.0.label.key", true ),
				new TagFieldTypeData("$830_1", DataFieldType.$830.getDisplayCode(), TagField.$1, "1", "marc.tf830.1.label.key", true ),
				new TagFieldTypeData("$830_2", DataFieldType.$830.getDisplayCode(), TagField.$2, "2", "marc.tf830.2.label.key", false ),
				new TagFieldTypeData("$830_3", DataFieldType.$830.getDisplayCode(), TagField.$3, "3", "marc.tf830.3.label.key", false ),
				new TagFieldTypeData("$830_4", DataFieldType.$830.getDisplayCode(), TagField.$4, "4", "marc.tf830.4.label.key", true ),
				new TagFieldTypeData("$830_5", DataFieldType.$830.getDisplayCode(), TagField.$5, "5", "marc.tf830.5.label.key", true ),
				new TagFieldTypeData("$830_6", DataFieldType.$830.getDisplayCode(), TagField.$6, "6", "marc.tf830.6.label.key", false ),
				new TagFieldTypeData("$830_7", DataFieldType.$830.getDisplayCode(), TagField.$7, "7", "marc.tf830.7.label.key", false ),
				new TagFieldTypeData("$830_8", DataFieldType.$830.getDisplayCode(), TagField.$8, "8", "marc.tf830.8.label.key", true ),} );
		
		case $841: return Arrays.asList( new TagFieldTypeData[] {} );
		case $842: return Arrays.asList( new TagFieldTypeData[] {} );
		case $843: return Arrays.asList( new TagFieldTypeData[] {} );
		case $844: return Arrays.asList( new TagFieldTypeData[] {} );
		case $845: return Arrays.asList( new TagFieldTypeData[] {} );
		case $850: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$850_a", DataFieldType.$850.getDisplayCode(), TagField.$a, "a", "marc.tf850.a.label.key", true ),
				new TagFieldTypeData("$850_8", DataFieldType.$850.getDisplayCode(), TagField.$8, "8", "marc.tf850.8.label.key", true ),} );
		
		case $852: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$852_a", DataFieldType.$852.getDisplayCode(), TagField.$a, "a", "marc.tf852.a.label.key", false ),
				new TagFieldTypeData("$852_b", DataFieldType.$852.getDisplayCode(), TagField.$b, "b", "marc.tf852.b.label.key", true ),
				new TagFieldTypeData("$852_c", DataFieldType.$852.getDisplayCode(), TagField.$c, "c", "marc.tf852.c.label.key", true ),
				new TagFieldTypeData("$852_d", DataFieldType.$852.getDisplayCode(), TagField.$d, "d", "marc.tf852.d.label.key", true ),
				new TagFieldTypeData("$852_e", DataFieldType.$852.getDisplayCode(), TagField.$e, "e", "marc.tf852.e.label.key", true ),
				new TagFieldTypeData("$852_f", DataFieldType.$852.getDisplayCode(), TagField.$f, "f", "marc.tf852.f.label.key", true ),
				new TagFieldTypeData("$852_g", DataFieldType.$852.getDisplayCode(), TagField.$g, "g", "marc.tf852.g.label.key", true ),
				new TagFieldTypeData("$852_h", DataFieldType.$852.getDisplayCode(), TagField.$h, "h", "marc.tf852.h.label.key", false ),
				new TagFieldTypeData("$852_i", DataFieldType.$852.getDisplayCode(), TagField.$i, "i", "marc.tf852.i.label.key", true ),
				new TagFieldTypeData("$852_j", DataFieldType.$852.getDisplayCode(), TagField.$j, "j", "marc.tf852.j.label.key", false ),
				new TagFieldTypeData("$852_k", DataFieldType.$852.getDisplayCode(), TagField.$k, "k", "marc.tf852.k.label.key", true ),
				new TagFieldTypeData("$852_l", DataFieldType.$852.getDisplayCode(), TagField.$l, "l", "marc.tf852.l.label.key", false ),
				new TagFieldTypeData("$852_m", DataFieldType.$852.getDisplayCode(), TagField.$m, "m", "marc.tf852.m.label.key", true ),
				new TagFieldTypeData("$852_n", DataFieldType.$852.getDisplayCode(), TagField.$n, "n", "marc.tf852.n.label.key", false ),
				new TagFieldTypeData("$852_p", DataFieldType.$852.getDisplayCode(), TagField.$p, "p", "marc.tf852.p.label.key", false ),
				new TagFieldTypeData("$852_q", DataFieldType.$852.getDisplayCode(), TagField.$q, "q", "marc.tf852.q.label.key", false ),
				new TagFieldTypeData("$852_s", DataFieldType.$852.getDisplayCode(), TagField.$s, "s", "marc.tf852.s.label.key", true ),
				new TagFieldTypeData("$852_t", DataFieldType.$852.getDisplayCode(), TagField.$t, "t", "marc.tf852.t.label.key", false ),
				new TagFieldTypeData("$852_u", DataFieldType.$852.getDisplayCode(), TagField.$u, "u", "marc.tf852.u.label.key", true ),
				new TagFieldTypeData("$852_x", DataFieldType.$852.getDisplayCode(), TagField.$x, "x", "marc.tf852.x.label.key", true ),
				new TagFieldTypeData("$852_z", DataFieldType.$852.getDisplayCode(), TagField.$z, "z", "marc.tf852.z.label.key", true ),
				new TagFieldTypeData("$852_2", DataFieldType.$852.getDisplayCode(), TagField.$2, "2", "marc.tf852.2.label.key", false ),
				new TagFieldTypeData("$852_3", DataFieldType.$852.getDisplayCode(), TagField.$3, "3", "marc.tf852.3.label.key", false ),
				new TagFieldTypeData("$852_6", DataFieldType.$852.getDisplayCode(), TagField.$6, "6", "marc.tf852.6.label.key", false ),
				new TagFieldTypeData("$852_8", DataFieldType.$852.getDisplayCode(), TagField.$8, "8", "marc.tf852.8.label.key", false ),} );
		
		case $853: return Arrays.asList( new TagFieldTypeData[] {} );
		case $854: return Arrays.asList( new TagFieldTypeData[] {} );
		case $855: return Arrays.asList( new TagFieldTypeData[] {} );
		case $856: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$856_a", DataFieldType.$856.getDisplayCode(), TagField.$a, "a", "marc.tf856.a.label.key", true ),
				new TagFieldTypeData("$856_c", DataFieldType.$856.getDisplayCode(), TagField.$c, "c", "marc.tf856.c.label.key", true ),
				new TagFieldTypeData("$856_d", DataFieldType.$856.getDisplayCode(), TagField.$d, "d", "marc.tf856.d.label.key", true ),
				new TagFieldTypeData("$856_e", DataFieldType.$856.getDisplayCode(), TagField.$e, "e", "marc.tf856.e.label.key", true ),
				new TagFieldTypeData("$856_f", DataFieldType.$856.getDisplayCode(), TagField.$f, "f", "marc.tf856.f.label.key", true ),
				new TagFieldTypeData("$856_g", DataFieldType.$856.getDisplayCode(), TagField.$g, "g", "marc.tf856.g.label.key", true ),
				new TagFieldTypeData("$856_h", DataFieldType.$856.getDisplayCode(), TagField.$h, "h", "marc.tf856.h.label.key", true ),
				new TagFieldTypeData("$856_l", DataFieldType.$856.getDisplayCode(), TagField.$l, "l", "marc.tf856.l.label.key", true ),
				new TagFieldTypeData("$856_m", DataFieldType.$856.getDisplayCode(), TagField.$m, "m", "marc.tf856.m.label.key", true ),
				new TagFieldTypeData("$856_n", DataFieldType.$856.getDisplayCode(), TagField.$n, "n", "marc.tf856.n.label.key", true ),
				new TagFieldTypeData("$856_o", DataFieldType.$856.getDisplayCode(), TagField.$o, "o", "marc.tf856.o.label.key", false ),
				new TagFieldTypeData("$856_p", DataFieldType.$856.getDisplayCode(), TagField.$p, "p", "marc.tf856.p.label.key", false ),
				new TagFieldTypeData("$856_q", DataFieldType.$856.getDisplayCode(), TagField.$q, "q", "marc.tf856.q.label.key", true ),
				new TagFieldTypeData("$856_r", DataFieldType.$856.getDisplayCode(), TagField.$r, "r", "marc.tf856.r.label.key", true ),
				new TagFieldTypeData("$856_s", DataFieldType.$856.getDisplayCode(), TagField.$s, "s", "marc.tf856.s.label.key", true ),
				new TagFieldTypeData("$856_t", DataFieldType.$856.getDisplayCode(), TagField.$t, "t", "marc.tf856.t.label.key", true ),
				new TagFieldTypeData("$856_u", DataFieldType.$856.getDisplayCode(), TagField.$u, "u", "marc.tf856.u.label.key", true ),
				new TagFieldTypeData("$856_v", DataFieldType.$856.getDisplayCode(), TagField.$v, "v", "marc.tf856.v.label.key", true ),
				new TagFieldTypeData("$856_w", DataFieldType.$856.getDisplayCode(), TagField.$w, "w", "marc.tf856.w.label.key", true ),
				new TagFieldTypeData("$856_x", DataFieldType.$856.getDisplayCode(), TagField.$x, "x", "marc.tf856.x.label.key", true ),
				new TagFieldTypeData("$856_y", DataFieldType.$856.getDisplayCode(), TagField.$y, "y", "marc.tf856.y.label.key", true ),
				new TagFieldTypeData("$856_z", DataFieldType.$856.getDisplayCode(), TagField.$z, "z", "marc.tf856.z.label.key", true ),
				new TagFieldTypeData("$856_2", DataFieldType.$856.getDisplayCode(), TagField.$2, "2", "marc.tf856.2.label.key", false ),
				new TagFieldTypeData("$856_3", DataFieldType.$856.getDisplayCode(), TagField.$3, "3", "marc.tf856.3.label.key", false ),
				new TagFieldTypeData("$856_6", DataFieldType.$856.getDisplayCode(), TagField.$6, "6", "marc.tf856.6.label.key", false ),
				new TagFieldTypeData("$856_7", DataFieldType.$856.getDisplayCode(), TagField.$7, "7", "marc.tf856.7.label.key", false ),
				new TagFieldTypeData("$856_8", DataFieldType.$856.getDisplayCode(), TagField.$8, "8", "marc.tf856.8.label.key", true ),} );
		
		case $857: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$857_b", DataFieldType.$857.getDisplayCode(), TagField.$b, "b", "marc.tf857.b.label.key", false ),
				new TagFieldTypeData("$857_c", DataFieldType.$857.getDisplayCode(), TagField.$c, "c", "marc.tf857.c.label.key", false ),
				new TagFieldTypeData("$857_d", DataFieldType.$857.getDisplayCode(), TagField.$d, "d", "marc.tf857.d.label.key", false ),
				new TagFieldTypeData("$857_e", DataFieldType.$857.getDisplayCode(), TagField.$e, "e", "marc.tf857.e.label.key", true ),
				new TagFieldTypeData("$857_f", DataFieldType.$857.getDisplayCode(), TagField.$f, "f", "marc.tf857.f.label.key", false ),
				new TagFieldTypeData("$857_g", DataFieldType.$857.getDisplayCode(), TagField.$g, "g", "marc.tf857.g.label.key", true ),
				new TagFieldTypeData("$857_h", DataFieldType.$857.getDisplayCode(), TagField.$h, "h", "marc.tf857.h.label.key", true ),
				new TagFieldTypeData("$857_l", DataFieldType.$857.getDisplayCode(), TagField.$l, "l", "marc.tf857.l.label.key", true ),
				new TagFieldTypeData("$857_m", DataFieldType.$857.getDisplayCode(), TagField.$m, "m", "marc.tf857.m.label.key", true ),
				new TagFieldTypeData("$857_n", DataFieldType.$857.getDisplayCode(), TagField.$n, "n", "marc.tf857.n.label.key", true ),
				new TagFieldTypeData("$857_q", DataFieldType.$857.getDisplayCode(), TagField.$q, "q", "marc.tf857.q.label.key", true ),
				new TagFieldTypeData("$857_r", DataFieldType.$857.getDisplayCode(), TagField.$r, "r", "marc.tf857.r.label.key", true ),
				new TagFieldTypeData("$857_s", DataFieldType.$857.getDisplayCode(), TagField.$s, "s", "marc.tf857.s.label.key", true ),
				new TagFieldTypeData("$857_t", DataFieldType.$857.getDisplayCode(), TagField.$t, "t", "marc.tf857.t.label.key", true ),
				new TagFieldTypeData("$857_u", DataFieldType.$857.getDisplayCode(), TagField.$u, "u", "marc.tf857.u.label.key", true ),
				new TagFieldTypeData("$857_x", DataFieldType.$857.getDisplayCode(), TagField.$x, "x", "marc.tf857.x.label.key", true ),
				new TagFieldTypeData("$857_y", DataFieldType.$857.getDisplayCode(), TagField.$y, "y", "marc.tf857.y.label.key", true ),
				new TagFieldTypeData("$857_z", DataFieldType.$857.getDisplayCode(), TagField.$z, "z", "marc.tf857.z.label.key", true ),
				new TagFieldTypeData("$857_2", DataFieldType.$857.getDisplayCode(), TagField.$2, "2", "marc.tf857.2.label.key", false ),
				new TagFieldTypeData("$857_3", DataFieldType.$857.getDisplayCode(), TagField.$3, "3", "marc.tf857.3.label.key", false ),
				new TagFieldTypeData("$857_5", DataFieldType.$857.getDisplayCode(), TagField.$5, "5", "marc.tf857.5.label.key", false ),
				new TagFieldTypeData("$857_6", DataFieldType.$857.getDisplayCode(), TagField.$6, "6", "marc.tf857.6.label.key", false ),
				new TagFieldTypeData("$857_7", DataFieldType.$857.getDisplayCode(), TagField.$7, "7", "marc.tf857.7.label.key", false ),
				new TagFieldTypeData("$857_8", DataFieldType.$857.getDisplayCode(), TagField.$8, "8", "marc.tf857.8.label.key", true ),} );
		
		case $863: return Arrays.asList( new TagFieldTypeData[] {} );
		case $864: return Arrays.asList( new TagFieldTypeData[] {} );
		case $865: return Arrays.asList( new TagFieldTypeData[] {} );
		case $866: return Arrays.asList( new TagFieldTypeData[] {} );
		case $867: return Arrays.asList( new TagFieldTypeData[] {} );
		case $868: return Arrays.asList( new TagFieldTypeData[] {} );
		case $876: return Arrays.asList( new TagFieldTypeData[] {} );
		case $877: return Arrays.asList( new TagFieldTypeData[] {} );
		case $878: return Arrays.asList( new TagFieldTypeData[] {} );
		case $880: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$880_a", DataFieldType.$880.getDisplayCode(), TagField.$a, "a", "marc.tf880.a.label.key", true ),
				new TagFieldTypeData("$880_b", DataFieldType.$880.getDisplayCode(), TagField.$b, "b", "marc.tf880.b.label.key", true ),
				new TagFieldTypeData("$880_c", DataFieldType.$880.getDisplayCode(), TagField.$c, "c", "marc.tf880.c.label.key", true ),
				new TagFieldTypeData("$880_d", DataFieldType.$880.getDisplayCode(), TagField.$d, "d", "marc.tf880.d.label.key", true ),
				new TagFieldTypeData("$880_e", DataFieldType.$880.getDisplayCode(), TagField.$e, "e", "marc.tf880.e.label.key", true ),
				new TagFieldTypeData("$880_f", DataFieldType.$880.getDisplayCode(), TagField.$f, "f", "marc.tf880.f.label.key", true ),
				new TagFieldTypeData("$880_g", DataFieldType.$880.getDisplayCode(), TagField.$g, "g", "marc.tf880.g.label.key", true ),
				new TagFieldTypeData("$880_h", DataFieldType.$880.getDisplayCode(), TagField.$h, "h", "marc.tf880.h.label.key", true ),
				new TagFieldTypeData("$880_i", DataFieldType.$880.getDisplayCode(), TagField.$i, "i", "marc.tf880.i.label.key", true ),
				new TagFieldTypeData("$880_j", DataFieldType.$880.getDisplayCode(), TagField.$j, "j", "marc.tf880.j.label.key", true ),
				new TagFieldTypeData("$880_k", DataFieldType.$880.getDisplayCode(), TagField.$k, "k", "marc.tf880.k.label.key", true ),
				new TagFieldTypeData("$880_l", DataFieldType.$880.getDisplayCode(), TagField.$l, "l", "marc.tf880.l.label.key", true ),
				new TagFieldTypeData("$880_m", DataFieldType.$880.getDisplayCode(), TagField.$m, "m", "marc.tf880.m.label.key", true ),
				new TagFieldTypeData("$880_n", DataFieldType.$880.getDisplayCode(), TagField.$n, "n", "marc.tf880.n.label.key", true ),
				new TagFieldTypeData("$880_o", DataFieldType.$880.getDisplayCode(), TagField.$o, "o", "marc.tf880.o.label.key", true ),
				new TagFieldTypeData("$880_p", DataFieldType.$880.getDisplayCode(), TagField.$p, "p", "marc.tf880.p.label.key", true ),
				new TagFieldTypeData("$880_q", DataFieldType.$880.getDisplayCode(), TagField.$q, "q", "marc.tf880.q.label.key", true ),
				new TagFieldTypeData("$880_r", DataFieldType.$880.getDisplayCode(), TagField.$r, "r", "marc.tf880.r.label.key", true ),
				new TagFieldTypeData("$880_s", DataFieldType.$880.getDisplayCode(), TagField.$s, "s", "marc.tf880.s.label.key", true ),
				new TagFieldTypeData("$880_t", DataFieldType.$880.getDisplayCode(), TagField.$t, "t", "marc.tf880.t.label.key", true ),
				new TagFieldTypeData("$880_u", DataFieldType.$880.getDisplayCode(), TagField.$u, "u", "marc.tf880.u.label.key", true ),
				new TagFieldTypeData("$880_v", DataFieldType.$880.getDisplayCode(), TagField.$v, "v", "marc.tf880.v.label.key", true ),
				new TagFieldTypeData("$880_w", DataFieldType.$880.getDisplayCode(), TagField.$w, "w", "marc.tf880.w.label.key", true ),
				new TagFieldTypeData("$880_x", DataFieldType.$880.getDisplayCode(), TagField.$x, "x", "marc.tf880.x.label.key", true ),
				new TagFieldTypeData("$880_y", DataFieldType.$880.getDisplayCode(), TagField.$y, "y", "marc.tf880.y.label.key", true ),
				new TagFieldTypeData("$880_z", DataFieldType.$880.getDisplayCode(), TagField.$z, "z", "marc.tf880.z.label.key", true ),
				new TagFieldTypeData("$880_0", DataFieldType.$880.getDisplayCode(), TagField.$0, "0", "marc.tf880.0.label.key", true ),
				new TagFieldTypeData("$880_1", DataFieldType.$880.getDisplayCode(), TagField.$1, "1", "marc.tf880.1.label.key", true ),
				new TagFieldTypeData("$880_2", DataFieldType.$880.getDisplayCode(), TagField.$2, "2", "marc.tf880.2.label.key", true ),
				new TagFieldTypeData("$880_3", DataFieldType.$880.getDisplayCode(), TagField.$3, "3", "marc.tf880.3.label.key", true ),
				new TagFieldTypeData("$880_4", DataFieldType.$880.getDisplayCode(), TagField.$4, "4", "marc.tf880.4.label.key", true ),
				new TagFieldTypeData("$880_5", DataFieldType.$880.getDisplayCode(), TagField.$5, "5", "marc.tf880.5.label.key", true ),
				new TagFieldTypeData("$880_6", DataFieldType.$880.getDisplayCode(), TagField.$6, "6", "marc.tf880.6.label.key", false ),
				new TagFieldTypeData("$880_7", DataFieldType.$880.getDisplayCode(), TagField.$7, "7", "marc.tf880.7.label.key", true ),
				new TagFieldTypeData("$880_8", DataFieldType.$880.getDisplayCode(), TagField.$8, "8", "marc.tf880.8.label.key", true ),
				new TagFieldTypeData("$880_9", DataFieldType.$880.getDisplayCode(), TagField.$9, "9", "marc.tf880.9.label.key", true ),} );
		
		case $881: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$881_a", DataFieldType.$881.getDisplayCode(), TagField.$a, "a", "marc.tf881.a.label.key", true ),
				new TagFieldTypeData("$881_b", DataFieldType.$881.getDisplayCode(), TagField.$b, "b", "marc.tf881.b.label.key", true ),
				new TagFieldTypeData("$881_c", DataFieldType.$881.getDisplayCode(), TagField.$c, "c", "marc.tf881.c.label.key", true ),
				new TagFieldTypeData("$881_d", DataFieldType.$881.getDisplayCode(), TagField.$d, "d", "marc.tf881.d.label.key", true ),
				new TagFieldTypeData("$881_e", DataFieldType.$881.getDisplayCode(), TagField.$e, "e", "marc.tf881.e.label.key", true ),
				new TagFieldTypeData("$881_f", DataFieldType.$881.getDisplayCode(), TagField.$f, "f", "marc.tf881.f.label.key", true ),
				new TagFieldTypeData("$881_g", DataFieldType.$881.getDisplayCode(), TagField.$g, "g", "marc.tf881.g.label.key", true ),
				new TagFieldTypeData("$881_h", DataFieldType.$881.getDisplayCode(), TagField.$h, "h", "marc.tf881.h.label.key", true ),
				new TagFieldTypeData("$881_i", DataFieldType.$881.getDisplayCode(), TagField.$i, "i", "marc.tf881.i.label.key", true ),
				new TagFieldTypeData("$881_j", DataFieldType.$881.getDisplayCode(), TagField.$j, "j", "marc.tf881.j.label.key", true ),
				new TagFieldTypeData("$881_k", DataFieldType.$881.getDisplayCode(), TagField.$k, "k", "marc.tf881.k.label.key", true ),
				new TagFieldTypeData("$881_l", DataFieldType.$881.getDisplayCode(), TagField.$l, "l", "marc.tf881.l.label.key", true ),
				new TagFieldTypeData("$881_m", DataFieldType.$881.getDisplayCode(), TagField.$m, "m", "marc.tf881.m.label.key", true ),
				new TagFieldTypeData("$881_n", DataFieldType.$881.getDisplayCode(), TagField.$n, "n", "marc.tf881.n.label.key", true ),
				new TagFieldTypeData("$881_3", DataFieldType.$881.getDisplayCode(), TagField.$3, "3", "marc.tf881.3.label.key", false ),
				new TagFieldTypeData("$881_6", DataFieldType.$881.getDisplayCode(), TagField.$6, "6", "marc.tf881.6.label.key", false ),
				new TagFieldTypeData("$881_8", DataFieldType.$881.getDisplayCode(), TagField.$8, "8", "marc.tf881.8.label.key", true ),} );
		
		case $882: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$882_a", DataFieldType.$882.getDisplayCode(), TagField.$a, "a", "marc.tf882.a.label.key", true ),
				new TagFieldTypeData("$882_i", DataFieldType.$882.getDisplayCode(), TagField.$i, "i", "marc.tf882.i.label.key", true ),
				new TagFieldTypeData("$882_w", DataFieldType.$882.getDisplayCode(), TagField.$w, "w", "marc.tf882.w.label.key", true ),
				new TagFieldTypeData("$882_6", DataFieldType.$882.getDisplayCode(), TagField.$6, "6", "marc.tf882.6.label.key", false ),
				new TagFieldTypeData("$882_8", DataFieldType.$882.getDisplayCode(), TagField.$8, "8", "marc.tf882.8.label.key", true ),} );
		
		case $883: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$883_a", DataFieldType.$883.getDisplayCode(), TagField.$a, "a", "marc.tf883.a.label.key", false ),
				new TagFieldTypeData("$883_c", DataFieldType.$883.getDisplayCode(), TagField.$c, "c", "marc.tf883.c.label.key", false ),
				new TagFieldTypeData("$883_d", DataFieldType.$883.getDisplayCode(), TagField.$d, "d", "marc.tf883.d.label.key", false ),
				new TagFieldTypeData("$883_q", DataFieldType.$883.getDisplayCode(), TagField.$q, "q", "marc.tf883.q.label.key", false ),
				new TagFieldTypeData("$883_u", DataFieldType.$883.getDisplayCode(), TagField.$u, "u", "marc.tf883.u.label.key", true ),
				new TagFieldTypeData("$883_w", DataFieldType.$883.getDisplayCode(), TagField.$w, "w", "marc.tf883.w.label.key", false ),
				new TagFieldTypeData("$883_x", DataFieldType.$883.getDisplayCode(), TagField.$x, "x", "marc.tf883.x.label.key", false ),
				new TagFieldTypeData("$883_0", DataFieldType.$883.getDisplayCode(), TagField.$0, "0", "marc.tf883.0.label.key", true ),
				new TagFieldTypeData("$883_1", DataFieldType.$883.getDisplayCode(), TagField.$1, "1", "marc.tf883.1.label.key", true ),
				new TagFieldTypeData("$883_8", DataFieldType.$883.getDisplayCode(), TagField.$8, "8", "marc.tf883.8.label.key", true ),} );
		
		case $884: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$884_a", DataFieldType.$884.getDisplayCode(), TagField.$a, "a", "marc.tf884.a.label.key", false ),
				new TagFieldTypeData("$884_g", DataFieldType.$884.getDisplayCode(), TagField.$g, "g", "marc.tf884.g.label.key", false ),
				new TagFieldTypeData("$884_k", DataFieldType.$884.getDisplayCode(), TagField.$k, "k", "marc.tf884.k.label.key", false ),
				new TagFieldTypeData("$884_q", DataFieldType.$884.getDisplayCode(), TagField.$q, "q", "marc.tf884.q.label.key", false ),
				new TagFieldTypeData("$884_u", DataFieldType.$884.getDisplayCode(), TagField.$u, "u", "marc.tf884.u.label.key", true ),} );
		
		case $885: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$885_a", DataFieldType.$885.getDisplayCode(), TagField.$a, "a", "marc.tf885.a.label.key", false ),
				new TagFieldTypeData("$885_b", DataFieldType.$885.getDisplayCode(), TagField.$b, "b", "marc.tf885.b.label.key", false ),
				new TagFieldTypeData("$885_c", DataFieldType.$885.getDisplayCode(), TagField.$c, "c", "marc.tf885.c.label.key", false ),
				new TagFieldTypeData("$885_d", DataFieldType.$885.getDisplayCode(), TagField.$d, "d", "marc.tf885.d.label.key", false ),
				new TagFieldTypeData("$885_w", DataFieldType.$885.getDisplayCode(), TagField.$w, "w", "marc.tf885.w.label.key", true ),
				new TagFieldTypeData("$885_x", DataFieldType.$885.getDisplayCode(), TagField.$x, "x", "marc.tf885.x.label.key", true ),
				new TagFieldTypeData("$885_z", DataFieldType.$885.getDisplayCode(), TagField.$z, "z", "marc.tf885.z.label.key", true ),
				new TagFieldTypeData("$885_0", DataFieldType.$885.getDisplayCode(), TagField.$0, "0", "marc.tf885.0.label.key", true ),
				new TagFieldTypeData("$885_1", DataFieldType.$885.getDisplayCode(), TagField.$1, "1", "marc.tf885.1.label.key", true ),
				new TagFieldTypeData("$885_2", DataFieldType.$885.getDisplayCode(), TagField.$2, "2", "marc.tf885.2.label.key", false ),
				new TagFieldTypeData("$885_5", DataFieldType.$885.getDisplayCode(), TagField.$5, "5", "marc.tf885.5.label.key", false ),} );
		
		case $886: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$886_a", DataFieldType.$886.getDisplayCode(), TagField.$a, "a", "marc.tf886.a.label.key", false ),
				new TagFieldTypeData("$886_b", DataFieldType.$886.getDisplayCode(), TagField.$b, "b", "marc.tf886.b.label.key", false ),
				new TagFieldTypeData("$886_c", DataFieldType.$886.getDisplayCode(), TagField.$c, "c", "marc.tf886.c.label.key", true ),
				new TagFieldTypeData("$886_d", DataFieldType.$886.getDisplayCode(), TagField.$d, "d", "marc.tf886.d.label.key", true ),
				new TagFieldTypeData("$886_e", DataFieldType.$886.getDisplayCode(), TagField.$e, "e", "marc.tf886.e.label.key", true ),
				new TagFieldTypeData("$886_f", DataFieldType.$886.getDisplayCode(), TagField.$f, "f", "marc.tf886.f.label.key", true ),
				new TagFieldTypeData("$886_g", DataFieldType.$886.getDisplayCode(), TagField.$g, "g", "marc.tf886.g.label.key", true ),
				new TagFieldTypeData("$886_h", DataFieldType.$886.getDisplayCode(), TagField.$h, "h", "marc.tf886.h.label.key", true ),
				new TagFieldTypeData("$886_i", DataFieldType.$886.getDisplayCode(), TagField.$i, "i", "marc.tf886.i.label.key", true ),
				new TagFieldTypeData("$886_j", DataFieldType.$886.getDisplayCode(), TagField.$j, "j", "marc.tf886.j.label.key", true ),
				new TagFieldTypeData("$886_k", DataFieldType.$886.getDisplayCode(), TagField.$k, "k", "marc.tf886.k.label.key", true ),
				new TagFieldTypeData("$886_l", DataFieldType.$886.getDisplayCode(), TagField.$l, "l", "marc.tf886.l.label.key", true ),
				new TagFieldTypeData("$886_m", DataFieldType.$886.getDisplayCode(), TagField.$m, "m", "marc.tf886.m.label.key", true ),
				new TagFieldTypeData("$886_n", DataFieldType.$886.getDisplayCode(), TagField.$n, "n", "marc.tf886.n.label.key", true ),
				new TagFieldTypeData("$886_o", DataFieldType.$886.getDisplayCode(), TagField.$o, "o", "marc.tf886.o.label.key", true ),
				new TagFieldTypeData("$886_p", DataFieldType.$886.getDisplayCode(), TagField.$p, "p", "marc.tf886.p.label.key", true ),
				new TagFieldTypeData("$886_q", DataFieldType.$886.getDisplayCode(), TagField.$q, "q", "marc.tf886.q.label.key", true ),
				new TagFieldTypeData("$886_r", DataFieldType.$886.getDisplayCode(), TagField.$r, "r", "marc.tf886.r.label.key", true ),
				new TagFieldTypeData("$886_s", DataFieldType.$886.getDisplayCode(), TagField.$s, "s", "marc.tf886.s.label.key", true ),
				new TagFieldTypeData("$886_t", DataFieldType.$886.getDisplayCode(), TagField.$t, "t", "marc.tf886.t.label.key", true ),
				new TagFieldTypeData("$886_u", DataFieldType.$886.getDisplayCode(), TagField.$u, "u", "marc.tf886.u.label.key", true ),
				new TagFieldTypeData("$886_v", DataFieldType.$886.getDisplayCode(), TagField.$v, "v", "marc.tf886.v.label.key", true ),
				new TagFieldTypeData("$886_w", DataFieldType.$886.getDisplayCode(), TagField.$w, "w", "marc.tf886.w.label.key", true ),
				new TagFieldTypeData("$886_x", DataFieldType.$886.getDisplayCode(), TagField.$x, "x", "marc.tf886.x.label.key", true ),
				new TagFieldTypeData("$886_y", DataFieldType.$886.getDisplayCode(), TagField.$y, "y", "marc.tf886.y.label.key", true ),
				new TagFieldTypeData("$886_z", DataFieldType.$886.getDisplayCode(), TagField.$z, "z", "marc.tf886.z.label.key", true ),
				new TagFieldTypeData("$886_0", DataFieldType.$886.getDisplayCode(), TagField.$0, "0", "marc.tf886.0.label.key", true ),
				new TagFieldTypeData("$886_1", DataFieldType.$886.getDisplayCode(), TagField.$1, "1", "marc.tf886.1.label.key", true ),
				new TagFieldTypeData("$886_2", DataFieldType.$886.getDisplayCode(), TagField.$2, "2", "marc.tf886.2.label.key", false ),
				new TagFieldTypeData("$886_3", DataFieldType.$886.getDisplayCode(), TagField.$3, "3", "marc.tf886.3.label.key", true ),
				new TagFieldTypeData("$886_4", DataFieldType.$886.getDisplayCode(), TagField.$4, "4", "marc.tf886.4.label.key", true ),
				new TagFieldTypeData("$886_5", DataFieldType.$886.getDisplayCode(), TagField.$5, "5", "marc.tf886.5.label.key", true ),
				new TagFieldTypeData("$886_6", DataFieldType.$886.getDisplayCode(), TagField.$6, "6", "marc.tf886.6.label.key", true ),
				new TagFieldTypeData("$886_7", DataFieldType.$886.getDisplayCode(), TagField.$7, "7", "marc.tf886.7.label.key", true ),
				new TagFieldTypeData("$886_8", DataFieldType.$886.getDisplayCode(), TagField.$8, "8", "marc.tf886.8.label.key", true ),
				new TagFieldTypeData("$886_9", DataFieldType.$886.getDisplayCode(), TagField.$9, "9", "marc.tf886.9.label.key", true ),} );
		
		case $887: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$887_a", DataFieldType.$887.getDisplayCode(), TagField.$a, "a", "marc.tf887.a.label.key", false ),
				new TagFieldTypeData("$887_2", DataFieldType.$887.getDisplayCode(), TagField.$2, "2", "marc.tf887.2.label.key", false ),} );
		
		/*case $9X: return Arrays.asList( new TagFieldTypeData[] {new TagFieldTypeData("$9X_a", DataFieldType.$9X.getDisplayCode(), TagField.$a, "a", "marc.tf9X.a.label.key", true ),
				new TagFieldTypeData("$9X_b", DataFieldType.$9X.getDisplayCode(), TagField.$b, "b", "marc.tf9X.b.label.key", true ),
				new TagFieldTypeData("$9X_c", DataFieldType.$9X.getDisplayCode(), TagField.$c, "c", "marc.tf9X.c.label.key", true ),
				new TagFieldTypeData("$9X_d", DataFieldType.$9X.getDisplayCode(), TagField.$d, "d", "marc.tf9X.d.label.key", true ),
				new TagFieldTypeData("$9X_e", DataFieldType.$9X.getDisplayCode(), TagField.$e, "e", "marc.tf9X.e.label.key", true ),
				new TagFieldTypeData("$9X_f", DataFieldType.$9X.getDisplayCode(), TagField.$f, "f", "marc.tf9X.f.label.key", true ),
				new TagFieldTypeData("$9X_g", DataFieldType.$9X.getDisplayCode(), TagField.$g, "g", "marc.tf9X.g.label.key", true ),
				new TagFieldTypeData("$9X_h", DataFieldType.$9X.getDisplayCode(), TagField.$h, "h", "marc.tf9X.h.label.key", true ),
				new TagFieldTypeData("$9X_i", DataFieldType.$9X.getDisplayCode(), TagField.$i, "i", "marc.tf9X.i.label.key", true ),
				new TagFieldTypeData("$9X_j", DataFieldType.$9X.getDisplayCode(), TagField.$j, "j", "marc.tf9X.j.label.key", true ),
				new TagFieldTypeData("$9X_k", DataFieldType.$9X.getDisplayCode(), TagField.$k, "k", "marc.tf9X.k.label.key", true ),
				new TagFieldTypeData("$9X_l", DataFieldType.$9X.getDisplayCode(), TagField.$l, "l", "marc.tf9X.l.label.key", true ),
				new TagFieldTypeData("$9X_m", DataFieldType.$9X.getDisplayCode(), TagField.$m, "m", "marc.tf9X.m.label.key", true ),
				new TagFieldTypeData("$9X_n", DataFieldType.$9X.getDisplayCode(), TagField.$n, "n", "marc.tf9X.n.label.key", true ),
				new TagFieldTypeData("$9X_o", DataFieldType.$9X.getDisplayCode(), TagField.$o, "o", "marc.tf9X.o.label.key", true ),
				new TagFieldTypeData("$9X_p", DataFieldType.$9X.getDisplayCode(), TagField.$p, "p", "marc.tf9X.p.label.key", true ),
				new TagFieldTypeData("$9X_q", DataFieldType.$9X.getDisplayCode(), TagField.$q, "q", "marc.tf9X.q.label.key", true ),
				new TagFieldTypeData("$9X_r", DataFieldType.$9X.getDisplayCode(), TagField.$r, "r", "marc.tf9X.r.label.key", true ),
				new TagFieldTypeData("$9X_s", DataFieldType.$9X.getDisplayCode(), TagField.$s, "s", "marc.tf9X.s.label.key", true ),
				new TagFieldTypeData("$9X_t", DataFieldType.$9X.getDisplayCode(), TagField.$t, "t", "marc.tf9X.t.label.key", true ),
				new TagFieldTypeData("$9X_u", DataFieldType.$9X.getDisplayCode(), TagField.$u, "u", "marc.tf9X.u.label.key", true ),
				new TagFieldTypeData("$9X_v", DataFieldType.$9X.getDisplayCode(), TagField.$v, "v", "marc.tf9X.v.label.key", true ),
				new TagFieldTypeData("$9X_w", DataFieldType.$9X.getDisplayCode(), TagField.$w, "w", "marc.tf9X.w.label.key", true ),
				new TagFieldTypeData("$9X_x", DataFieldType.$9X.getDisplayCode(), TagField.$x, "x", "marc.tf9X.x.label.key", true ),
				new TagFieldTypeData("$9X_y", DataFieldType.$9X.getDisplayCode(), TagField.$y, "y", "marc.tf9X.y.label.key", true ),
				new TagFieldTypeData("$9X_z", DataFieldType.$9X.getDisplayCode(), TagField.$z, "z", "marc.tf9X.z.label.key", true ),
				new TagFieldTypeData("$9X_0", DataFieldType.$9X.getDisplayCode(), TagField.$0, "0", "marc.tf9X.0.label.key", true ),
				new TagFieldTypeData("$9X_1", DataFieldType.$9X.getDisplayCode(), TagField.$1, "1", "marc.tf9X.1.label.key", true ),
				new TagFieldTypeData("$9X_2", DataFieldType.$9X.getDisplayCode(), TagField.$2, "2", "marc.tf9X.2.label.key", true ),
				new TagFieldTypeData("$9X_3", DataFieldType.$9X.getDisplayCode(), TagField.$3, "3", "marc.tf9X.3.label.key", true ),
				new TagFieldTypeData("$9X_4", DataFieldType.$9X.getDisplayCode(), TagField.$4, "4", "marc.tf9X.4.label.key", true ),
				new TagFieldTypeData("$9X_5", DataFieldType.$9X.getDisplayCode(), TagField.$5, "5", "marc.tf9X.5.label.key", true ),
				new TagFieldTypeData("$9X_6", DataFieldType.$9X.getDisplayCode(), TagField.$6, "6", "marc.tf9X.6.label.key", true ),
				new TagFieldTypeData("$9X_7", DataFieldType.$9X.getDisplayCode(), TagField.$7, "7", "marc.tf9X.7.label.key", true ),
				new TagFieldTypeData("$9X_8", DataFieldType.$9X.getDisplayCode(), TagField.$8, "8", "marc.tf9X.8.label.key", true ),
				new TagFieldTypeData("$9X_9", DataFieldType.$9X.getDisplayCode(), TagField.$9, "9", "marc.tf9X.9.label.key", true )} );*/
		
		default: return Arrays.asList( new TagFieldTypeData[] {} );
		
		}
	}
}
