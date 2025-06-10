package chapter6;
/*
 * This class implements a "fail-soft" array which
 * prevents runtime errors.
 */
class FailSoftArray {
	private int a[]; // reference to array
	private int errval; // value to return if get() fails
	public int lenght; // lenght is public
	
	/* 
	 * Construct array given its size and the value to
	 * return if get() fails
	 */
	public FailSoftArray(int size, int errv) {
		this.a = new int[size];
		this.errval = errv;
		this.lenght = size;
	}
	
	// Return value at given index.
	public int get(int index) {
		if(indexOK(index)) return a[index];
		return errval;	// using return above does not have the necessity of an else
	}
	
	// Put a value at an index. Return False on failure
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
			}
		return false;
	}
	
	// Return true if index is within bounds.
	// Is private because is used only inside the class
	private boolean indexOK(int index) {
		// TODO Auto-generated method stub
		return (index >= 0 && index < lenght); // shorthand for a syntax that could be expanded
		
	}
}

// Demonstrate fail-soft array.
public class FSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration and initialization 
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;
		
		// show quiet failures
		System.out.println("Fail quietly.");
		for(int i=0; i < (fs.lenght * 2); i++)
			fs.put(i, i*10);
		
		for(int i=0; i < (fs.lenght * 2); i++) {
			x = fs.get(i);
			if (x != -1) System.out.println(x + " ");
			}
		
		// Now, handle failures
		System.out.println("\nFail with error reports.");
		for (int i=0; i < (fs.lenght *2); i++)
			if (!fs.put(i, i*10))
				System.out.println("Index " + i + " out-of-bounds");
		
		for (int i=0; i < (fs.lenght *2); i++) {
			x = fs.get(i);
			if (x != -1) System.out.println(x + " ");
			else
				System.out.println("Index " + i + " out-of-bounds");
			}
	}

}
