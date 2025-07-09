package chapter11;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class MyThread4 implements Runnable {
	Thread thread;
	static SumArray sumArray = new SumArray();
	AtomicIntegerArray a;
	int answer;

	
	// Construct a new thread.
	public MyThread4(String name, AtomicIntegerArray nums) {
		  thread = new Thread(this, name);
		  a = nums;
		  thread.start(); // start the thread
	}

	// Begin execution
	@Override
	public void run() {
		int sum;
		// START
		System.out.println(thread.getName() + " starting.");

		// SUMMATION
		answer = sumArray.sumArray(a);
		System.out.println("Sum for " + thread.getName() + " is " + answer);
		
		// ENDING
		System.out.println(thread.getName() + " terminating.");
		
	}
}
