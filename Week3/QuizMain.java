import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.nextLine();

		System.out.println("Enter description: ");
		String description = scanner.nextLine();

		System.out.println("Enter genre: ");
		String genre = scanner.nextLine();

		System.out.println("Enter price: ");
		String price = scanner.nextLine();

		System.out.println("Enter publishDate: ");
		String publishDate = scanner.nextLine();

		System.out.println("Enter ISBN: ");
		String ISBN = scanner.nextLine();

		Book book = new Book(name, description, genre, price, publishDate, ISBN);
		System.out.println(book);
		System.out.println(book.name);
		System.out.println(book.description);
		System.out.println(book.genre);
		System.out.println(book.price);
		System.out.println(book.publishDate);
		System.out.println(book.ISBN);
		scanner.close();

	}

}
