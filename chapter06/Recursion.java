package chapter06;
// A simple example of recursion.
class Factorial {
	// this is a recursive function
	int factR (int n) {
		if (n == 1) return n;
		return n * factR(n - 1);
	}
	
	//Here an iterative version
	int factI (int n) {
		int result = 1;
		
		for(int i = 1; i <= n; i++)
			result *= i;
		
		return result;
	}
}
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		
		System.out.println("Factorials using recursive method.");
		System.out.println("Factoria of 3 is " + f.factR(3));
		System.out.println("Factoria of 4 is " + f.factR(4));
		System.out.println("Factoria of 5 is " + f.factR(5));
		System.out.println();
		
		System.out.println("Factorials using iterative method.");
		System.out.println("Factoria of 3 is " + f.factI(3));
		System.out.println("Factoria of 4 is " + f.factI(4));
		System.out.println("Factoria of 5 is " + f.factI(5));
		System.out.println();
	}

}
