// DIsplay the bits within a byte.
public class ShowBits_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		byte val;
		
		val = 123;
		for(t=128; t > 0; t = t/2) {
			if ((val & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
	}

}
