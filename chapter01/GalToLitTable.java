package chapter01;
/*
 * Try this 1 - 2 
 * 
 * This program displays a conversion
 * table of gallons to liters
 * 
 * Call this program "GalToLitTable.java".
 */

public class GalToLitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gallons, liters;
		int counter;
		
		counter = 0;
		
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons*3.7854; // convert to liters
			System.out.println(gallons + " gallon is " + liters + " liters.");
			
			counter++;
			// every 10th line, print a blank line
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}

}
