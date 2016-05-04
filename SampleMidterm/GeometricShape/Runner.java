package GeometricShape;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		ArrayList<GeometricShape> shapes = new ArrayList<>();

		Triangle triangle = new Triangle(10, 10);
		Rectangle rectangle = new Rectangle(10, 10);

		shapes.add(triangle);
		shapes.add(rectangle);

		for(int i=0; i<shapes.size() ; i++){
			GeometricShape currentShape = shapes.get(i);
			System.out.println(currentShape.calculateArea());

		}
		for(GeometricShape currentShape : shapes){
			//same as shapes.get(i)
			System.out.println(currentShape.calculateArea());
		}

	}

}
