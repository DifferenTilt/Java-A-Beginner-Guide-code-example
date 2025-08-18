package chapter03;
// Demo of do-while loop

public class DWDemo {

	public static void main(String[] args)
	throws java.io.IOException {

		char ch;

		do {
			System.out.print("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // casting operation as usual
			System.out.println();
		} while (ch != 'q');

	}
}
