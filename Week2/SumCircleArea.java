
public class SumCircleArea {

	public static void main(String[] args) {

		//Storing Circle objects in the arrays
		Circle[] circles = new Circle[4];
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i);
		}

		double areaSum = 0;
		for (int i = 0; i < circles.length; i++) {
			Circle circleToCalculate = circles[i];
			double area = circleToCalculate.calculateArea();
			areaSum += area;
		}
		System.out.println(areaSum);
	}

}
