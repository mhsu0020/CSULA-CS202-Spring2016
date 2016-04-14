
public class Rectangle extends GeometricObject{

	double width;
	double height;

	public Rectangle(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea(){
		double area = width * height;
		return area;
	}

}
