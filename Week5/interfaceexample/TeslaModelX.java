package interfaceexample;

public class TeslaModelX extends Car implements DriveCar {

	@Override
	public void turn(String direction) {
		System.out.println("Tesla X flies to " + direction);
	}

    @Override
    public void stop(){
    	System.out.println("tesla stop");
    }

	@Override
	public int signalTurn(String direction, boolean signalOn) {

		System.out.println("Tesla X signals flying to " + direction + " then turn signal " + signalOn);
		return 1;
	}


}
