
public class Square extends GeometricObject{

	double side;

  public Square(double side, String color){
      super(color);
	  this.side = side;
  }
	@Override
	public double calculateArea(){
		double area = side * side;
		return area;
	}

//Provided by default If you don't define your own constructor
//	public Square(){
//		//think of it as GeometricObject()
//		super();
//	}


}
