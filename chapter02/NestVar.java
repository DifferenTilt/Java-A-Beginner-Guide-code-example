package chapter02;
/*
 * This program attempts to declare a variable
 * in an inner scope with the same name as one
 * defined in an outer scope.
 */

public class NestVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;

		for(count = 0; count < 10; count++) {
			System.out.println("This is count: " + count);

			//int count; // illegal
			for (count = 0; count < 2; count++)
				System.out.println("This program is an error!");
		}
	}

}
