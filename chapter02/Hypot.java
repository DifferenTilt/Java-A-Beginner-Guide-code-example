package chapter02;
/*
 * Use the Pythagorean theorem to 
 * find the lenght of the hypotenuse
 * given the lenghts of the two opposing
 * sides.
 */

public class Hypot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, z;
		
		x = 3;
		y = 4;
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse is " + z);
	}

}
