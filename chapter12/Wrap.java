package chapter12;

// demonstrate manual boxing and un-boxing with a type wrapper. 
public class Wrap {

	public static void main(String[] args) {
		/*
		 * As could be seen in order to not have warnings we
		 * need to use annotations to suppress warnings
		 * because this method of doing things is 
		 * deprecated.
		 */
		// Manually box the value 100.
		@SuppressWarnings("deprecation")
		Integer iOb = new Integer(100);
		
		// manually un-box the value in iOb 
		int i = iOb.intValue();
		
		System.out.println(i + " " + iOb);
	}

}
