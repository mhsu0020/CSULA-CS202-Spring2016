import java.util.ArrayList;

public class AstronautBookExample {

	public static void main(String[] args) {

		//Astronaut has a books arrayList data field
		Astronaut buzzAlderin = new Astronaut("buzzAlderin", 60);
		Astronaut astro2 = new Astronaut("astro2", 70);
		Astronaut astro3 = new Astronaut("astro3", 80);


		//Creat Book objects
		Book book = new Book("hobbit", "stuff", "fantasy", "$1000", "1934-01-2", "AS12121212");
		Book book2 = new Book("harry potter", "magic", "fantasy", "$10000", "2004-02-2", "BD121212");


		//Adding the book to the favoriteBooks ArrayList in buzzAlderin
		buzzAlderin.addBook(book);
		buzzAlderin.addBook(book2);


		//Each astronaut has their own favoriteBooks arrayList
		Book book3 = new Book("the shining", "stuff", "fantasy", "$1000", "1934-01-2", "AS12121212");
		Book book4 = new Book("the stand", "magic", "fantasy", "$10000", "2004-02-2", "BD121212");
		astro2.addBook(book3);
		astro2.addBook(book4);

		//You can use the arrayList by doing buzzAlderin.favoriteBooks
		ArrayList<Book> buzzFavoriteBooks = buzzAlderin.favoriteBooks;
		int numberOfFavoriteBooks = buzzFavoriteBooks.size();
		System.out.println(numberOfFavoriteBooks);

		//Printing out the books
		for (int i = 0; i < buzzFavoriteBooks.size(); i++) {
			System.out.println(buzzFavoriteBooks.get(i));
		}

		ArrayList<Book> astro2FavoriteBooks = astro2.favoriteBooks;

		//Printing out the books
		for (int i = 0; i < astro2.favoriteBooks.size(); i++) {
			System.out.println(astro2.favoriteBooks.get(i));
		}


	}

}
