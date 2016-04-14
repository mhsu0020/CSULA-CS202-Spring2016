

//Superclass example
public class GeometricObject {

	//All subclasses inherit the color data field
	String color;

	//Since we define our own constructor, Java no longer provides the default constructor. Therefore, all subclasses must call the parent class constructor.
	public GeometricObject(String color){
		this.color = color;
	}


	//All subclasses inherit the calculateArea method. They can override it to do their own behavior.
	public double calculateArea() {
		return 0;
	}
}
