package chapter03;
// Guess the letter game.

public class Guess {

	public static void main(String[] args)
	throws java.io.IOException {
		// TODO Auto-generated method stub

		char ch, answer = 'K';

		System.out.println("I'm thinking of a letter between A and Z.");
		System.out.print("Can you guess it: ");

		ch = (char) System.in.read(); // Read a char from the keyboard

		if ( ch == answer)
			System.out.println("** Right **");
		else {
			System.out.println("...Sorry, you're ");
			// nested if
			if (ch < answer)
				System.out.println("too low");
			else
				System.out.println("too high");
			}

	}

}
