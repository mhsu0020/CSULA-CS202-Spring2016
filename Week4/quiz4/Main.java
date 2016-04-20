package quiz4;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shoe> shoes = new ArrayList<>();

		HighHeels heels = new HighHeels(100);
		Sneakers sneakers = new Sneakers("air");
		shoes.add(heels);
		shoes.add(sneakers);

		for (int i = 0; i < shoes.size(); i++) {

			//We get a shoe object back out
			Shoe shoeToPrint = shoes.get(i);
			if(shoeToPrint instanceof HighHeels){
				System.out.println(((HighHeels)shoeToPrint).heelHeight);
			} else if(shoeToPrint instanceof Sneakers){
				System.out.println(((Sneakers)shoeToPrint).typeOfCushion);
			}
		}

	}

}
