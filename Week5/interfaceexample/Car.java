package interfaceexample;

public class Car implements Comparable<Car> {

	String manufacturer;
	int numberOfWheels;
	int price;

	@Override
	public int compareTo(Car o) {
		if (this.price == o.price) {
			return 0;
		} else if (this.price < o.price) {
			return -1;
		}
		return 1;
	}

}
