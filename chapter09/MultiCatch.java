package chapter09;

// Use multi-catch feature. This code requires JDK 7 or
// later to compile
public class MultiCatch {

	public static void main(String[] args) {
		int a=88, b=0;
		int result;
		char chrs[] = {'A', 'B', 'C'};
		
		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0) {
					result = a / b; // Generates an ArithmeticException
				}
				else {
					chrs[5] = 'X'; // Generate an ArrayIndexOutOfBoundException
				}
			// this catch clause catches both exceptions.
			} 
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught: " + e);
			}		
		}
		System.out.println("After multi-catch.");
	}

}
