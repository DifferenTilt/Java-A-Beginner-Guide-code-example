package chapter11;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Sync {

	public static void main(String[] args) {
		int a[] = {1, 2 , 3, 4, 5, 6, 89, 32};
		AtomicIntegerArray b = new AtomicIntegerArray(a);
		
		MyThread4 mt1 = new MyThread4("Child #1", b);
		MyThread4 mt2 = new MyThread4("Child #2", b);
		
		// We use join() to tell main to wait thread to end before continuing with 
		// the execution
		try {
			mt1.thread.join();
			mt2.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
	}

}
