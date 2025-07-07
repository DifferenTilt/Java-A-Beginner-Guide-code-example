package chapter06;

// A queue class for characters.
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
	
	Queue (Queue ob) {
		this.putloc = ob.putloc;
		this.getloc = ob.getloc;
		this.q = new char[ob.q.length];
		
		// copy elements
		for(int i = this.getloc; i < this.putloc; i++)
			this.q[i] = ob.q[i];
	}
	
	Queue (char a[]) {
		this.putloc = 0;
		this.getloc = 0;
		q = new char[a.length];
		
		for(int i = 0; i < a.length; i++)
			this.put(a[i]); // here syntax could also be put(a[i]) without this.
	}
	// put a character in queue
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full");
			return; // this line is crucial in order to avoid errors
		}
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

// Demonstrate the Queue class.
public class QDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construct 10-element empty queue
		Queue q1 = new Queue(10);
		
		// Construct queue from array
		char name[] = {'T', 'o', 'm'};
		Queue q2 = new Queue(name);
		
		char ch; 
		int i;
		
		// put some characters into q1
		for(i=0; i < 10; i++) 
			q1.put((char) ('A' + i));
		
		// construct queue from another queue
		Queue q3 = new Queue(q1);
		
		// Show queues.
		System.out.println("Contents of q1: ");
		for (i=0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.println("Contents of q2: ");
		for (i=0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.println("Contents of q3: ");
		for (i=0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
		System.out.println("\n");
	}

}
