
package chapter08;

public interface Series {
	
	int getNext(); // return next number in series

	void reset(); // restart

	void setStart(int x); // set starting value
	
	default int[] getNextArray(int n) {
		int vals[] = new int[n]; 
		
		for (int i = 0; i < vals.length; i++) {
			vals[i] = this.getNext(); // vals[i] = getNext(); Work just fine
		}
		
		return vals;
	}
}
