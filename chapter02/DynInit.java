package chapter02;
// Demonstrate dynamic initialization

public class DynInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius = 4, height = 5;
		
		// dynamically initialize the volume
		double volume = 3.1416 * radius * radius * height;
		
		System.out.println("Volume is " + volume);
	}

}
