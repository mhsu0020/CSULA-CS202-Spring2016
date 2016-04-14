
//Extends from GeometricObject, Circle is a subclass of GeometricObject
public class Circle extends GeometricObject {

	double radius;

	public double getRadius() {
		return this.radius;
	}

	// Must call super class constructor the first line, since super class
	// doesn't have a default constructor
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}

	// Constructor chaining
	public Circle(double radius) {
		this(radius, "BLACK");
	}

	/*
	 * overrides the super class implementation of calculateArea();
	 *
	 */
	@Override
	public double calculateArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	// String representation of a Circle object. Every single class in java has
	// this method, since all classes have java.lang.Object as the superclass.
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	/*
	 *
	 * Override both hashcode and equals so that we can use .equals to check if
	 * two Circle objects are the same. Here we define that they are the same if
	 * they have the same radius.
	 *
	 *
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

}
