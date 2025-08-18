package chapter05;
// Demonstrate a one - dimensional array.

public class ArrayDemo {

	public static void main(String[] args) {

		// Declaring an array with usual Java object declaration
		int sample[] = new int[10];	// brackets of sampe[] are crucial!!!
		int i;

		for (i = 0; i < 10; i++) {
			sample[i] = i;
			System.out.println("This is sample[" + i + "]: " + sample[i]);
			}
	}
}
