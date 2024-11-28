/**
 * 
 */
package ca.qc.banq.rme.shared.enums;

import java.util.Locale;

/**
 * 
 */
public enum AppLang {
	
	fr("ap.lang.fr", Locale.FRENCH),
	en("ap.lang.en", Locale.ENGLISH);
	
	private String key;
	private Locale locale;

	private AppLang() {}
	private AppLang(String key,  Locale loc) {
		this.key = key;
		this.locale = loc;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
}
