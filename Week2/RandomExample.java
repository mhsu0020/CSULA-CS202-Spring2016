import java.util.Random;

/*
 *
 * If two Random objects have the same seed, they generate the exact same numbers
 *
 * */
public class RandomExample {

	public static void main(String[] args) {
		Math.abs(10);
		Random random = new Random(12345);
		Random random2 = new Random(12345);

		int counter = 100;
		while(counter>0){
			System.out.println(random.nextInt(5));
			counter--;

		}
		counter =100;
		while (counter>0) {
			System.out.println(random2.nextInt(5));
			counter--;
		}
	}

}
