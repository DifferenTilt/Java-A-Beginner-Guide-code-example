package chapter02;
/*
 * This file prints the logical table
 * for the operators
 */

public class LogicalOpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print the header for the table
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		boolean P = true, Q = true;

		// print the firts line
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (P != Q));

		Q = false;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (P != Q));

		P = false;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (P != Q));

		Q = true;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (P != Q));


		// now comes the part with 1,0
		System.out.println("\nP\tQ\tAND\tOR\tXOR\tNOT");

		P = true; Q = true;
		int and, or, xor, not, p, q;

		p = P ? 1 : 0;	q= Q ? 1 : 0;
		and = (P & Q) ? 1 : 0;
		or = (P | Q) ? 1 : 0;
		xor = (P ^ Q) ? 1 : 0;
		not = (P != Q) ? 1 : 0;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);

		Q = false;
		q= Q ? 1 : 0;
		and = (P & Q) ? 1 : 0;
		or = (P | Q) ? 1 : 0;
		xor = (P ^ Q) ? 1 : 0;
		not = (P != Q) ? 1 : 0;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);

		P = false;
		p = P ? 1 : 0;
		and = (P & Q) ? 1 : 0;
		or = (P | Q) ? 1 : 0;
		xor = (P ^ Q) ? 1 : 0;
		not = (P != Q) ? 1 : 0;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);

		Q = true;
		q= Q ? 1 : 0;
		and = (P & Q) ? 1 : 0;
		or = (P | Q) ? 1 : 0;
		xor = (P ^ Q) ? 1 : 0;
		not = (P != Q) ? 1 : 0;
		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);

		/* Follows inefficient version of the code
		 * if(P) p =1;
		else p = 0;

		if(Q) q =1;
		else q = 0;

		if(P & Q) and =1;
		else and = 0;

		if(P | Q) or =1;
		else or = 0;

		if(P ^ Q) xor =1;
		else xor = 0;

		if(P != Q) not =1;
		else not = 0;

		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);


		Q = false;
		if(P) p =1;
		else p = 0;

		if(Q) q =1;
		else q = 0;

		if(P & Q) and =1;
		else and = 0;

		if(P | Q) or =1;
		else or = 0;

		if(P ^ Q) xor =1;
		else xor = 0;

		if(P != Q) not =1;
		else not = 0;

		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);

		P = false;
		if(P) p =1;
		else p = 0;

		if(Q) q =1;
		else q = 0;

		if(P & Q) and =1;
		else and = 0;

		if(P | Q) or =1;
		else or = 0;

		if(P ^ Q) xor =1;
		else xor = 0;

		if(P != Q) not =1;
		else not = 0;

		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);

		Q = true;
		if(P) p =1;
		else p = 0;

		if(Q) q =1;
		else q = 0;

		if(P & Q) and =1;
		else and = 0;

		if(P | Q) or =1;
		else or = 0;

		if(P ^ Q) xor =1;
		else xor = 0;

		if(P != Q) not =1;
		else not = 0;

		System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);
		*/
	}

}
