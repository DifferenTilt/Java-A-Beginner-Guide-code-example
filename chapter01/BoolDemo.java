// Demonstrate boolena values
package chapter01;

public class BoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b= true;
		System.out.println("b is " + b);
		
		// a boolean value can control the if statement
		if (b) System.out.println("This is executed");
		
		b= false;
		if (b) System.out.println("This is executed");
		
		// outcome of a relational operator is a boolean value
		System.out.println("10 > 9 is " + (10 > 9));
	}

}
