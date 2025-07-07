package chapter08;

// Another implementation of Series
public class ByThrees implements Series {
	private int start;
	private int val;

	public ByThrees() {
		start = val = 0;
	}

	// Implemented method have to be public
	@Override
	public int getNext() {
		val += 3;
		return val;
	}

	@Override
	public void reset() {
		val = start;
	}

	@Override
	public void setStart(int x) {
		start = val = x;
	}
}
