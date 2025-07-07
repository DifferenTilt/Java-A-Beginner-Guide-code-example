package chapter07;

class Vehicle {
	private int passengers;	// number of passengers
	private int fuelcap;	// fuel capacity in gallons
	private int mpg;		// fuel consumption in miles per gallon
	
	// Empty constructor
	Vehicle () {
		
	}
	
	// Override 
	Vehicle (int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Return the range.
	int range() {
		return mpg*fuelcap;
	}
	
	// Compute fuel needed for a given distance.
	double fuelNeeded (int miles) {
		return (double) miles / mpg;
	}
	
	// Getter and setter
	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFuelcap() {
		return fuelcap;
	}

	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	
}

class Truck extends Vehicle {
	private int cargocap; // cargo capacity in pounds
	
	// This is a constructor for Truck.
	Truck (int p, int f, int m, int c) {
		// Initialize Vehicle members using Vehicle's constructor
		super( p, f, m);
		
		cargocap = c;
	}

	public int getCargocap() {
		return cargocap;
	}

	public void setCargocap(int cargocap) {
		this.cargocap = cargocap;
	}
	
	
}

public class TruckDemo {

	public static void main(String[] args) {
		// construct some trucks
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;

		gallons = semi.fuelNeeded(dist);
		System.out.println("Semi can carry " + semi.getCargocap() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
		
		gallons = pickup.fuelNeeded(dist);
		System.out.println("Semi can carry " + pickup.getCargocap() + " pounds.");
		System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
	}

}
