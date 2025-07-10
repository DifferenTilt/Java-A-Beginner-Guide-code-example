package chapter11;

import java.util.concurrent.atomic.AtomicIntegerArray;

// Use synchronize to control access
public class SumArray1 {
	private int sum;
	
	// sumArray() is synchronized
	synchronized int sumArray(AtomicIntegerArray nums) {
		sum = 0; // reset sum
		
		for (int i = 0; i < nums.length(); i++) {
			sum += nums.get(i);
			System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
			
			try {
				Thread.sleep(10); // allow task-switch
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
		return sum;
	}
}
