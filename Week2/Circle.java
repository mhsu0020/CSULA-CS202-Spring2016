
public class Circle {

	/*
	 * Instance variable: every single Circle object has its own copy of radius
	 *
	 * */
	double radius;

	/*
	 * constructor:
	 * 1. No return type
	 * 2. Method name has to be the same as the class name
	 *
	 * */
	public Circle(double radius){

		this.radius = radius;

	}
	/*
	 *default constructor
	 *
	 * */
	public Circle(){
		System.out.println("default constructor called");
		radius = 20;
	}
	/*
	 * Instance method: every single Circle object has its own copy of calculateArea()
	 *
	 * */
	public double calculateArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
}
