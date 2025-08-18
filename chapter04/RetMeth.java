package chapter04;
// Use a return value

public class RetMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Remember that first we define an address to an object only after
		 * with new we effectively create a "physical" object
		 */
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2, dist = 252;
		double gallons;

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		//assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		range1 = minivan.range();
		range2 = sportscar.range();

		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
		System.out.println("Minivan can carry " + sportscar.passengers + " with range of " + range2 + " miles");

		// alternative version without two int defined
//		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " miles");
//		System.out.println("Minivan can carry " + sportscar.passengers + " with range of " + sportscar.range() + " miles");

		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}

}
