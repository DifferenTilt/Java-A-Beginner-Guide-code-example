package chapter9;

public class RethrowDemo {

	public static void main(String[] args) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Fatal error - program terminated.");
		}
	}

}
