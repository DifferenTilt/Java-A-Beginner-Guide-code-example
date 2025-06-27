package chapter8;

// A fixed-size queue class for characters
public class FixedQueue implements ICharQ {

	private char q[]; // this array holds the queue
	private int putloc, getloc; // the put and get indices
	
	
	public FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	@Override
	public void put(char ch) {
		if (putloc == q.length) {
			System.out.println("- Queue is full.");
			return;
		} 
		
		// this particular call is HUGE, the access to the array is with putloc
		// after the memory update putloc is ++ and now is pointing the next
		// put position
		q[putloc++] = ch;
	}
	@Override
	public char get() {
		if (getloc == putloc) {
			System.out.println("- Queue is empty.");
			return (char) 0;
		}
		// same could be said as above
		return q[getloc++];
	}
	
}
