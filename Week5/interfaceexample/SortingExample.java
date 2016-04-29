package interfaceexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingExample {
	public static void main(String[] args) {

		ArrayList<Car> cars = new ArrayList<>();

		TeslaModelX carOne = new TeslaModelX();
		carOne.price = 1000;
		TeslaModelX carTwo = new TeslaModelX();
		carTwo.price = 3000;

		TeslaModelX carThree = new TeslaModelX();
		carThree.price = 2000;
		cars.add(carOne);
		cars.add(carTwo);
		cars.add(carThree);

		Collections.sort(cars);
		for (Car car : cars) {
			System.out.println(car.price);
		}

		Car[] carArray = {carOne, carTwo, carThree};
		Arrays.sort(carArray);
		for (int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i].price);
		}

	}

}
