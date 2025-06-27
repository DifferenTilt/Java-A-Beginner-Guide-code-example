package chapter8;

// Implement Series.
public class ByTwos implements Series {

	private int start;
	private int val;
	private int prev;
	
	ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}
	
	// A neat observation could be the fact that even though these 
	// are formally "code outside the class", we have access to 
	// private members of the class.
	@Override
	public int getNext() {
		val += 2;
		return val;
	}

	@Override
	public void reset() {
		val = start;
		prev = start - 2;
	}

	@Override
	public void setStart(int x) {
		start = val = x;
		prev = x - 2;
	}

	int getPrevious() {
		return prev;
	}
}
