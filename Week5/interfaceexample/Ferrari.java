package interfaceexample;

public class Ferrari extends Car implements DriveCar{

	String ferrariPrice;

	@Override
	public void turn(String direction) {

		System.out.println("Ferrari only goes straight");

	}

	@Override
	public int signalTurn(String direction, boolean signalOn) {
		System.out.println("Ferrari don't signal turn");
		return 0;

	}

}
