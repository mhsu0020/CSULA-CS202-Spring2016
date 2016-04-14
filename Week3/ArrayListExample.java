import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {

		//Unlike an array, ArrayList is not fix sized. It will resize automatically as you add more elements to it.
		ArrayList<Circle> circles = new ArrayList<>();

		//Adding 100 Circles to the ArrayList
		for (int i = 0; i < 100; i++) {
			circles.add(new Circle(i));
		}

		//to get the "length" of a ArrayList, use the size() method.
		System.out.println(circles.size());

		//Lots of useful methods under the Collecitons class. Collections.shuffle randomaizes the elements in the list
		Collections.shuffle(circles);

		for (int i = 0; i < circles.size(); i++) {
			System.out.println(circles.get(i));
		}


		//Here we show creating a ArrayList of Integer (wrapper type). You can have an ArrayList of Strings, Booleans, Doubles, etc.
		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 2000; i++) {
			numbers.add(i);
		}

		Collections.shuffle(numbers);

		System.out.println(Collections.min(numbers) + " " + Collections.max(numbers));

	}

}
