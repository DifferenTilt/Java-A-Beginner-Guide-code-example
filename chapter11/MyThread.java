package chapter11;

// Create a thread by implementing Runnable
public class MyThread implements Runnable{
	private String thrdName;
	
	@Override
	public void run() {
		System.out.println(thrdName + " starting." );
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + " count is " + count);
			}
		} catch (InterruptedException e) {
			System.out.println(thrdName + " interrupted...");
		}
		System.out.println(thrdName + " Tterminating.");
	}
	
	// Constructor from the name
	public MyThread(String thrdName) {
		this.thrdName = thrdName;
	}

	// Getters and Setter
	public String getThrdName() {
		return thrdName;
	}

	public void setThrdName(String thrdName) {
		this.thrdName = thrdName;
	}




}
