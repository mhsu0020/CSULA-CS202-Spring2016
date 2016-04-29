package interfaceexample;

public interface DriveCar {

	//	same public static final int MAX_WEIGHT = 2000;
	int MAX_WEIGHT = 2000;
	int SAFETY_NUM = 3000;

//  same as public abstract void turn(String direction);

    void turn(String direction);

	int signalTurn(String direction, boolean signalOn);

    default void stop(){
    	System.out.println("this is default stop method");
    }

}
