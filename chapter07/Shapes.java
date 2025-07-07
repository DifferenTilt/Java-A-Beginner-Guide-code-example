package chapter07;

// Here and in the related classes syntax is structured in order
// for all the code to see the classes, members, methods
// changing the type of the members could lead into trouble
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle("filled", 4.0, 3.0);
		Triangle t2 = new Triangle("outlined", 8.0, 12.0);
		
		// Here the method of syntax is not optimal
		// we should define constructors
//		t1.width = 4.0;
//		t1.height = 4.0;
//		t1.style = "filled";
//		
//		t2.width = 8.0;
//		t2.height = 12.0;
//		t2.style = "outlined";
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		Rectangle q1 = new Rectangle(8.0, 3.0); 
	}

}
