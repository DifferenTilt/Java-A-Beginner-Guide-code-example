package chapter04;

public class Vehicle {
	int passengers;	// number of passengers
	int fuelcap;	// fuel capacity in gallons
	int mpg;		// fuel consumption in miles per gallon


	// this construct a vehicle
	Vehicle (int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// empty constructor
	public Vehicle() {
	}

	//Display the range.
	int range() {
		return fuelcap * mpg;	// here I don't have to specify what fuelcap, mpg are
								// they are defined within the class and are available!!
	}

	// the argument input is the amount of miles we want to travel
	// since the rest is know by the class we do not have to pass it in parameters
	double fuelneeded (int miles) {
		return (double) miles /mpg;	// important to cast since the operation is between two int
	}
}
