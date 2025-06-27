package chapter9;

// Demonstrate the queue exceptions.
public class QExcDemo {

	public static void main(String[] args) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;
		
		try {
			// overrun the queue
			for (int j = 0; j < 11; j++) {
				System.out.print("Attempting to store: " + (char) ('A' + j));
				// without ( ) we encounter some cast problems
				q.put((char) ('A' + j));
				System.out.println(" - OK");
			}
			System.out.println();
		} catch (QueueFullException e) {
			System.out.println(e);
		}
		System.out.println();
		
		try {
			// over-empty the queue
			for (int j = 0; j < 11; j++) {
				System.out.print("Getting next char: ");
				// without ( ) we encounter some cast problems
				ch = q.get();
				System.out.println(ch);
			}
			System.out.println();
		} catch (QueueEmptyException e) {
			System.out.println(e);
		}

	}

}
