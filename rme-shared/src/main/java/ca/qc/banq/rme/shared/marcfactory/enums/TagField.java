/**
 * 
 */
package ca.qc.banq.rme.shared.marcfactory.enums;

/**
 * 
 */
public enum TagField {

	$a("a"), $b("b"), $c("c"), $d("d"), $e("e"), $f("f"), $g("g"), $h("h"), $i("i"), $j("j"), $k("k"), $l("l"), $m("m"), $n("n"), $o("o"), $p("p"), $q("q"),
	$r("r"), $s("s"), $t("t"), $u("u"), $v("v"), $w("w"), $x("x"), $y("y"), $z("z"), $0("0"), $1("1"), $2("2"), $3("3"), $4("4"), $5("5"), $6("6"), $7("7"),
	$8("8"), $9("9");
	
	private String displayCode;
	
	private TagField() {}
	
	/**
	 * 
	 * @param displayCode
	 */
	private TagField(String displayCode) {
		this.displayCode = displayCode;
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
	
}
