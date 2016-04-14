public class PolymorphismExample {

	public static void main(String[] args) {



		GeometricObject[] shapes = new GeometricObject[5];

		Circle circle = new Circle(20);
		Square square = new Square(20, "BLACK");

		//Because Circle and Square extends GeometricObject, they are both of type GeometricObject. Therefore, you can store them in the GeometricObject array.
		shapes[0] = circle;
		shapes[1] = square;

		GeometricObject shape1 = shapes[0];
		GeometricObject shape2 = shapes[1];

		//Only Circle has a getRadius method. Java doesn't see getRadius in a GeometricObject object. Explicit casting is required.
		if(shape2 instanceof Circle){
		  		System.out.println(((Circle)shape2).getRadius());
		}else{
			System.out.println("shape 2 not a circle");
		}
		System.out.println(shape1.calculateArea());

	}

}
