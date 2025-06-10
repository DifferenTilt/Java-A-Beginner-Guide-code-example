// This exercise will make use of the Queue data structure and 
// how the operation are defined

/*
 *  A queue for characters
 */
class Queue {
	private char q[];	// array for the queue visible in the entire class
	private int putloc, getloc;
	
	Queue() {
		// TODO Auto-generated constructor stub
	}
	
	Queue(int size) {
		q = new char[size]; // allocate memory for queue
		putloc = getloc = 0;
	}
	
	// put a character into queue
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full");
			return; // this line is crucial in order to avoid errors
		}
		// Having the control above we are sure that
		// the end of the array isn't reached
		q[putloc++] = ch;
	}
	
	// get a character from the queue
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
}
	
public class Qdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Using bigQ to store the alphabet.");
		// put something into bigQ
		for(i = 0; i < 26; i++) 
			bigQ.put((char) ('A' + i));
		
		// retrieve and display elements from bigQ
		System.out.println("Contents of bigQ: ");
		for(i = 0; i < 26; i++) { 
			ch = bigQ.get();
			if (ch != (char) 0)	System.out.println(ch); 
			}
		System.out.println();
		
		// Using smallQ to generate some errors
		System.out.println("Using smallQ to generate some errors");
		for(i = 0; i < 5; i++) { 
			System.out.print("Attempting to store " + (char) ('Z' - i));
			
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		// More errors on smallQ
		System.out.println("Contents of smallQ: ");
				for(i = 0; i < 5; i++) { 
					ch = smallQ.get();
					
					if (ch != (char) 0)	System.out.println(ch); 
				}
	}

}
