package chapter9;

// Custom exception class
public class NonIntResultException extends Exception {

	private int n, d;

	public NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}

	@Override
	public String toString() {
		return "Result of " + n + " / " + d + " is non-integer.";
	}
}
