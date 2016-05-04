package GeometricShape;

public class Triangle extends GeometricShape{

	double base;

	double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}



	@Override
	public double calculateArea() {
		return base * height / 2;
	}

}
