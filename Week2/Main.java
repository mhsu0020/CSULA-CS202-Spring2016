
public class Main {

	public static void main(String[] args) {

		//Each circle has its own copy of radius and calculate area
		Circle circleOne = new Circle();
		circleOne.radius = 5;
		Circle circleTwo = new Circle();
		circleTwo.radius = 10;

		//Area is different for the different circles
		System.out.println(circleOne.calculateArea());
		System.out.println(circleTwo.calculateArea());


		//Each astronaut has its own copy of name and age, but country is shared
		Astronaut buzzAlderin = new Astronaut("Buzz", 60);
		Astronaut astro2 = new Astronaut("alien", 100);
		Astronaut astro3 = new Astronaut("hahah", 1000);

		//Note the following will not compile, as java doesn't provide a default constructor if you define a constructor yourself
		//Astronaut astro4 = new Astronaut();

		Astronaut.country = "Russia";

		//Because country is a static data field, all objects are changed since they share the same country variable.
		System.out.println(buzzAlderin.country);
		System.out.println(astro2.country);
		System.out.println(astro3.country);

		//proper way to access static variable and methods
		System.out.println(Astronaut.country);



	}

}
