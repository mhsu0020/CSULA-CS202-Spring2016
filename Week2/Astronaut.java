
public class Astronaut {

	/*
	 * Instance data fields: each object instance has their own copy
	 *
	 * Make data fields private to enforce encapsulation
	 *
	 */
	private String missionCodeName;
	private int age;

	// static variable, shared copy for all astronaut objects
	static String country = "USA";

	//user defined constructor. If we define our own constructor, java will not provide the no-arg constructor anymore
	public Astronaut(String name, int age) {
		System.out.println("Astronaut consturctor called");
		this.missionCodeName = name;
		this.age = age;
	}

	//getter and setter methods for private data fields
	public String getName() {
		return this.missionCodeName;
	}
	public void changeName(String newName) {
		this.missionCodeName = newName;
	}
	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}
}
