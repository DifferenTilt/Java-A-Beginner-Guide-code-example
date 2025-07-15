package chapter12;

// An enumeration of Transport varieties.
public enum Transport {
	// At the moment we can consider horizontal 
	// declaration as programming etiquette.
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
	
	// typical speed of each transport
	private int speed;
	
	// Constructor
	private Transport(int s) {
	    speed = s;
	}

	// Getter & Setter
	public int getSpeed() {
		return speed;
	}
	
}
