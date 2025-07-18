package chapter13;

// Demonstrate TwoGen
public class SimpGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
		
		// Show the types.
		tgObj.showTypes();
		
		// Obtain and show values.
		int v = tgObj.getOb1();
		System.out.println("Value of ob1: " + v);
		
		String str = tgObj.getOb2();
		System.out.println("Value of ob2: " + str);
	}

}
