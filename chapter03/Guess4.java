package chapter03;
// Guess the letter game, 4th version

public class Guess4 {

	public static void main(String[] args)
	throws java.io.IOException {
		// TODO Auto-generated method stub

		char ch, ignore, answer = 'K';

		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");

			// read the character
			ch = (char) System.in.read();

			//discard any other character in the input buffer
			do {
				ignore = (char)System.in.read();
			} while (ignore != '\n');

			// here we check that the answer is right
			if ( ch == answer)
				System.out.println("** Right **");
			// if the answer wrong we give some indications
			else {
				System.out.println("... Sorry, you're ");
				if (ch < answer)
					System.out.println("too low");
				if (ch > answer)
					System.out.println("too high");
			}
		}while (answer != ch);
	}

}
