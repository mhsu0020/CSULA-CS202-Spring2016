package interfaceexample;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		TeslaModelX carOne = new TeslaModelX();
		carOne.price = 100;
		carOne.turn("left");
		carOne.signalTurn("right", true);

		Ferrari carTwo = new Ferrari();
		carTwo.price=10000000;
		carTwo.turn("right");
		carTwo.signalTurn("left", false);


		System.out.println(DriveCar.SAFETY_NUM);
		carTwo.stop();
		carOne.stop();

		System.out.println(carOne.compareTo(carTwo));

		System.out.println("------------------------------");
		ArrayList<DriveCar> drivingCars = new ArrayList<>();
		drivingCars.add(carOne);
		drivingCars.add(carTwo);

		for (DriveCar driveCar : drivingCars) {
			if(driveCar instanceof Ferrari)
			System.out.println(((Ferrari)driveCar).ferrariPrice);

			driveCar.turn("left");

		}

	}

}
