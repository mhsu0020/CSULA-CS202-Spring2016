package abstractexample;

public class Triangle extends GeometricObject{

	double base;
	double height;

	@Override
	public double calculateArea(){
		return base * height /2;
	}



}
