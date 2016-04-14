
public class Book {

	String name;
	String description;
	String genre;
	String price;
	String publishDate;
	String ISBN;

	public Book(String name, String description, String genre, String price, String publishDate, String iSBN) {
		this.name = name;
		this.description = description;
		this.genre = genre;
		this.price = price;
		this.publishDate = publishDate;
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", description=" + description + ", genre=" + genre + ", price=" + price
				+ ", publishDate=" + publishDate + ", ISBN=" + ISBN + "]";
	}


}
