package chapter11;

// Create a thread by implementing Runnable
public class MyThread2 implements Runnable{

	Thread thrd;
	
	@Override
	public void run() {
		System.out.println(thrd.getName() + " starting." );
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + " count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thrd.getName() + " interrupted...");
		}
		System.out.println(thrd.getName() + " Terminating.");
	}
	
	// Constructor and execution at declaration.
	public MyThread2(String name) {
		thrd = new Thread(this, name);
		thrd.start();
	}

	// Getters and Setter
	public String getThrdName() {
		return thrd.getName();
	}

	public void setThrdName(String thrdName) {
		thrd.setName(thrdName);
	}




}
