package chapter11;

// Use synchronize to control access
public class SumArray2 {
	private int sum;
	
	// sumArray() is not synchronized
	int sumArray(int nums[]) {
		sum = 0; // reset sum
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
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
