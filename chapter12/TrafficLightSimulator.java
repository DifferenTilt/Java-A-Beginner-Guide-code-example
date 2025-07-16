package chapter12;

// A computerized traffic light
public class TrafficLightSimulator implements Runnable {

	// Holds the thread that run the simulation
	private Thread thread;
	// Holds traffic light color
	private TrafficLightColor tlc;
	// Set to true to stop the simulation
	boolean stop = false;
	// True when the light has changed
	boolean changed = false;
	
	// Constructed and started
	public TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		
		// Thread to be created needs a non null Runn obj
		thread = new Thread(this);
		thread.start();
	}
	
	public TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		
		thread = new Thread(this);
		thread.start();
	}
	
	// Start up the light
	@Override
	public void run() {
		while (!stop) {
			try {
				switch (tlc) {
				case GREEN:
					Thread.sleep(5000); // green for 5 seconds
					break;
				case YELLOW:
					Thread.sleep(2000); // yellow for 2 seconds
					break;
				case RED:
					Thread.sleep(6000); // red for 6 seconds
					break;
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			changeColor();
		}
	}

	// Change color. synchronized because notify()
	// could be called only from a sync
	synchronized void changeColor() {
		switch (tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
		}
		
		changed = true;
		// signal that the light has changed
		notify();
	}
	
	// Wait until a light change occurs.
	synchronized void waitForChange() {
		try {
			while (!changed) 
				// wait for light to change
				wait(); 
			changed = false;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// Return current color.
	synchronized TrafficLightColor getColor() {
		return tlc;
	}
	
	// Stop the traffic light.
	synchronized void cancel() {
		stop = true;
	}
}
