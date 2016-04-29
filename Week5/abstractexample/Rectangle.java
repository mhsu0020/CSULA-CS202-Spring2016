package abstractexample;

public class Rectangle extends GeometricObject{

	double width;
	double length;

	@Override
	public double calculateArea(){
		return width * length;
	}

}
