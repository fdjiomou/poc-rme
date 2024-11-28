/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.enums;

/**
 * 
 */
public enum ControlFieldType {

	$000( 0, "000", "marc.cf.000.label.key", true, false, true, 24, true ),
	$001( 0, "001", "marc.cf.001.label.key", false, false, false, 0, false ),
	$003( 0, "003", "marc.cf.003.label.key", false, false, false, 0, false ),
	$005( 0, "005", "marc.cf.005.label.key", true, false, false, 0, false),
	$006( 0, "006", "marc.cf.006.label.key", false, false, false, 0, false ),
	$007( 0, "007", "marc.cf.007.label.key", false, false, true, 23, true ),
	$008( 0, "008", "marc.cf.008.label.key", true, false, true, 40, true ),
	$009( 0, "009", "marc.cf.009.label.key", false, false, false, 0, false );
	
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
	/** Est-ce-que le champ est de taille fixe ? */
	private boolean fixedLength;
	/** Taille du champ (Utilise unique lorsque isFixedLength est a true) */
	private int length;
	/** Valeur structuree (determine si la valeur de ce champ est compose de plusieurs attributs) */
	private boolean valueStructured;
	
	private ControlFieldType() {}

	private ControlFieldType(int classe, String displayCode, String displayLabel, boolean required, boolean canDuplicate,
			boolean fixedLength, int length, boolean valueStructured) {
		this.classe = classe;
		this.displayCode = displayCode;
		this.displayLabel = displayLabel;
		this.required = required;
		this.repeatable = canDuplicate;
		this.fixedLength = fixedLength;
		this.length = length;
		this.valueStructured = valueStructured;
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
	 * @return the fixedLength
	 */
	public boolean isFixedLength() {
		return fixedLength;
	}

	/**
	 * @param fixedLength the fixedLength to set
	 */
	public void setFixedLength(boolean fixedLength) {
		this.fixedLength = fixedLength;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the valueStructured
	 */
	public boolean isValueStructured() {
		return valueStructured;
	}

	/**
	 * @param valueStructured the valueStructured to set
	 */
	public void setValueStructured(boolean valueStructured) {
		this.valueStructured = valueStructured;
	}
	
}
