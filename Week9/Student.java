
public class Student {
	String name;
	String CIN;
	public Student(String name, String cIN) {
		this.name = name;
		CIN = cIN;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CIN == null) ? 0 : CIN.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (CIN == null) {
			if (other.CIN != null)
				return false;
		} else if (!CIN.equals(other.CIN))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


}
