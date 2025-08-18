package chapter03;
// Demonstrate the switch without break statements

public class NoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;

		for(i = 0; i <= 5; i++) {
			System.out.println(i);
			switch (i) {
			case 0:
				System.out.println("i is less than one");
			case 1:
				System.out.println("i is less than two");
			case 2:
				System.out.println("i is less than three");
			case 3:
				System.out.println("i is less than four");
			case 4:
				System.out.println("i is less than five");
			}
			System.out.println();

			/*
			 * Running the code demonstrates very well how switch work, when a condition
			 * is met the following are executed as a waterfall -> this happens because we do not
			 * insert the break condition.
			 */
		}
	}

}
