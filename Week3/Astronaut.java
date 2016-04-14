import java.util.ArrayList;

public class Astronaut {

	private String missionCodeName;
	private int age;

	//Object composition, you can objects within objects as data fields
	ArrayList<Book> favoriteBooks;

	public Astronaut(String name, int age) {
		this.missionCodeName = name;
		this.age = age;

		//Initialize Array
		this.favoriteBooks = new ArrayList<>();
	}

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

	public void addBook(Book bookToAdd){
		this.favoriteBooks.add(bookToAdd);


	}
}
