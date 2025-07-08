package chapter11;

// Use join().
public class JoinThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		MyThread2 mt1 = new MyThread2("Child #1");
		MyThread2 mt2 = new MyThread2("Child #2");
		MyThread2 mt3 = new MyThread2("Child #3");
		
		try {
			mt1.thrd.join();
			System.out.println("Child #1 joined.");
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending.");
	}

}
