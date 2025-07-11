package chapter11;

public class UseThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		// First construct a MyThread object.
		MyThread1 mt = new MyThread1("Child #1"); // CREATE
		
		// Next, construct a thread from that object.
		Thread newThread = new Thread(mt); // CONSTRUCT
		
		// Finally, start execution of the thread.
		newThread.start(); // In this call there's the run call
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
		}
		System.out.println("Main thread ending.");
	}

}
