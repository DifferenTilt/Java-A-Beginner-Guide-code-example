package chapter08;

// Demonstrate interface reference
public class SeriesDemo2 {

	public static void main(String[] args) {
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob; // interface reference variable 
		
		for (int i = 0; i < 5; i++) {
			// now they REFER to the same object
			ob = twoOb;
			System.out.println("Next ByTwos value is " + ob.getNext());
			
			// changing the reference
			ob = threeOb;
			System.out.println("Next ByThrees value is " + ob.getNext());
		}
	}

}
