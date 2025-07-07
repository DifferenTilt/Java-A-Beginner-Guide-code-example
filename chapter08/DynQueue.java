package chapter08;

// A dynamic queue.
public class DynQueue implements ICharQ {
	private char q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices
	
	// construct an empty queue given its size.
	public DynQueue(int size) {
		q = new char[size]; // allocate memory for queue
		putloc = getloc = 0;
	}
	
	@Override
	public void put(char ch) {
		if(putloc == q.length) {
			// increase queue size
			char t[] = new char[q.length * 2];
			
			// copy elements into new queue
			for (int i = 0; i < q.length; i++) {
				t[i] = q[i];
			}	
			
			// put the character in the queue
			t[putloc++] = ch;
			// neatly changing the reference of q that is indeed an array
			q = t;
			return;
		}
		q[putloc++] = ch;
	}

	@Override
	public char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}

	public int getPutloc() {
		return putloc;
	}

	public void setPutloc(int putloc) {
		this.putloc = putloc;
	}

	public int getGetloc() {
		return getloc;
	}

	public void setGetloc(int getloc) {
		this.getloc = getloc;
	}

}
