package sn.uidt.cisse410.model;

public class Welcome {
	private String value = "A demo java spring application";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
