package chapter11;

// This class extends Thread
public class MyThread3 extends Thread {
	
	
	// Begin execution of new thread.
	public void run() {
		System.out.println(getName() + " starting");
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + " count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating.");
	}
	
	// Construct a new thread 
	public MyThread3(String name) {
		super(name); // name thread
		start(); // start the thread
	}
}
