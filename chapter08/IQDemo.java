package chapter08;

import java.util.Iterator;

// Demonstrate the ICHarQ interface.
public class IQDemo {

	void reset(DynQueue dQ) {
		dQ.setPutloc(0);
		dQ.setGetloc(0);
	}
	
	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		ICharQ iQ;
		
		char ch;
		int i;
		
		iQ = q1;
		
		// Put some characters into fixed queue.
		for (int j = 0; j < 10; j++) {
			iQ.put((char) ('A' + j));
		}

		// Show the queue.
		System.out.print("Contents of the fixed queue: ");
		for (int j = 0; j < 10; j++) {
			ch = iQ.get();
			System.out.print(ch);
			}
		
		System.out.println();
		
		iQ = q2;
		
		// Put some characters into dynamic queue.
		for (int j = 0; j < 10; j++) {
			iQ.put((char) ('Z' - j));
		}

		// Show the queue.
		System.out.print("Contents of the dynamic queue: ");
		for (int j = 0; j < 10; j++) {
			ch = iQ.get();
			System.out.print(ch);
			}
		
		System.out.println();
		
		iQ = q3;
		
		// Put some characters into circular queue.
		for (int j = 0; j < 10; j++) {
			iQ.put((char) ('A' + j));
		}

		// Show the queue.
		System.out.print("Contents of the circular queue: ");
		for (int j = 0; j < 10; j++) {
			ch = iQ.get();
			System.out.print(ch);
			}
		
		System.out.println();
		
		// Put more characters into circular queue.
		for (int j = 10; j < 20; j++) {
			iQ.put((char) ('A' + j));
		}

		// Show the queue.
		System.out.print("Contents of the circular queue: ");
		for (int j = 0; j < 10; j++) {
			ch = iQ.get();
			System.out.print(ch);
			}
		
		System.out.println("\nStore and consume form circular queue.");
		
		// Store in and consume form circular queue.
		for(i=0; i < 20; i++) {
			 iQ.put((char) ('A' + i));
			 ch = iQ.get();
			 System.out.print(ch);
			 }
	}

}
