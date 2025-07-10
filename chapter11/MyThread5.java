package chapter11;

// Class used to show synchronized block
public class MyThread5 implements Runnable {
	//CLASS'S MEMBERS
	Thread thread;
	static SumArray2 sumArray2 = new SumArray2();
	int a[];
	int answer;
	
	// Construct a new thread
	public MyThread5(String name, int[] nums) {
		thread = new Thread(this, name);
		a = nums;
		thread.start(); // start the thread
	}
	
	// Begin execution
	@Override
	public void run() {
		
		System.out.println(thread.getName() + " starting.");
		// synchronize calls to SumArray() with a block
		synchronized (sumArray2) {
			answer = sumArray2.sumArray(a);
		}
		System.out.println("Sum for " + thread.getName() + " is " + answer);
		
		System.out.println(thread.getName() + " terminating.");
	}
}
