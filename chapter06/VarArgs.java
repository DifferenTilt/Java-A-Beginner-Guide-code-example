package chapter06;

// Demonstrate variable-lenght arguments
public class VarArgs {

	// vaTest() uses a vararg
	static void vaTest(int ... v) {
		System.out.println("Number of args: " + v.length);
		System.out.println("Contents: ");
		
		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Notice how vaTest() can be called with a 
		// variable number of arguments.
		vaTest(10); // 1 args
		vaTest(1, 2, 3); // 3 args
		vaTest(); // no args
	}

}
