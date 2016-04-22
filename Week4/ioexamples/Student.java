package ioexamples;

public class Student {

	String name;
	String CIN;

	public Student(String name, String cIN) {
		this.name = name;
		CIN = cIN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

}
