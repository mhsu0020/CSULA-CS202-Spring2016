package GeometricShape;

public class Rectangle extends GeometricShape{

	double width;

	double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double calculateArea() {
		return width * length;
	}

}
