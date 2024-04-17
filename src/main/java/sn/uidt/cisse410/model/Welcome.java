package sn.uidt.cisse410.model;

public class Welcome {
	private String value = "Hello world!";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
}
