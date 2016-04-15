import java.util.ArrayList;

public class AstronautBookExample {

	public static void main(String[] args) {

		//Astronaut has a books arrayList data field
		Astronaut buzzAlderin = new Astronaut("buzzAlderin", 60);


		//Creat Book objects
		Book book = new Book("hobbit", "stuff", "fantasy", "$1000", "1934-01-2", "AS12121212");
		Book book2 = new Book("harry potter", "magic", "fantasy", "$10000", "2004-02-2", "BD121212");


		//Adding the book to the favoriteBooks ArrayList in buzzAlderin
		buzzAlderin.addBook(book);
		buzzAlderin.addBook(book2);

		//You can use the arrayList by doing buzzAlderin.favoriteBooks

		ArrayList<Book> favoriteBooks = buzzAlderin.favoriteBooks;
		int numberOfFavoriteBooks = favoriteBooks.size();
		System.out.println(numberOfFavoriteBooks);

		//Printing out the books in the a
		for (int i = 0; i < favoriteBooks.size(); i++) {
			System.out.println(favoriteBooks.get(i));
		}


	}

}
