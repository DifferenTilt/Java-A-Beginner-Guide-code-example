package chapter11;

// Use wait() and notify() to create a ticking clock.
public class TickTock {

	// Contains the state of the clock
	String state;
	/*
	 * Class contains two method that communicates with each other 
	 * to ensure that a tick is followed by a tock and a tick and
	 * so on recursively.	 
	 */
	
	synchronized void tick(boolean running) {
		if(!running) {
			// stop the clock
			state = "ticked";
			// notify any waiting threads
			notify();
			// exit from the method
			return;
		}
		
		System.out.print("Tick ");
		// set the current state to ticked
		state = "ticked";
		
		//let tock() run
		notify();
		try {
			while(!state.equals("tocked"))
				wait(); // wait for tock() to complete
		} catch (InterruptedException e) { 
			System.out.println("Thread interrupted.");
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) {
			// stop the clock
			state = "tocked";
			// notify any waiting threads
			notify();
			return;
		}
		
		System.out.println("Tock ");
		// set the current state to ticked
		state = "tocked";
		
		//let tick() run
		notify();
		try {
			while(!state.equals("ticked"))
				wait(); // wait for tick() to complete
		} catch (InterruptedException e) { 
			System.out.println("Thread interrupted.");
		}
	}
}
