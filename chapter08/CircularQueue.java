package chapter08;

// A circular queue
public class CircularQueue implements ICharQ {
	private char q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices

	// Construct an empty queue given its size.
	public CircularQueue(int size) {
		q = new char[size + 1]; // allocate memory for queue
		putloc = getloc = 0;
	}

	@Override
	public void put(char ch) {
		/*
		 * Queue is full if either putloc is one less than getloc, or if putloc is a the
		 * end of the array and getloc is at the beginning.
		 */
		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println(" - Queue is full");
			return;
		}

		q[putloc++] = ch;
		if (putloc == q.length)
			putloc = 0; // loop back
	}

	@Override
	public char get() {
		if (putloc == getloc) {
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		
		char ch = q[getloc++];

		if (getloc == q.length) {
			getloc = 0;
		}
		return ch;
	}

}
