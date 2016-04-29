package quiz;

public class Student {

	String name;
	String CIN;
	public Student(String name, String cIN) {
		this.name = name;
		CIN = cIN;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", CIN=" + CIN + "]";
	}


}
