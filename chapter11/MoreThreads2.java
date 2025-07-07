package chapter11;

public class MoreThreads2 {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		MyThread2 mt1 = new MyThread2("Child #1");
		MyThread2 mt2 = new MyThread2("Child #2");
		MyThread2 mt3 = new MyThread2("Child #3");

		do {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted.");
			}
		} while (mt1.thrd.isAlive() || 
				mt2.thrd.isAlive() ||
				mt3.thrd.isAlive()); 
		System.out.println("Main thread ending.");
	}

}
