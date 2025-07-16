package chapter12;

// Demonstrate auto-boxing/un-boxing
public class AutoBox {

	public static void main(String[] args) {
		/*
		 * Here there's no need to suppress wa
		 */
		// Auto-box an int
		Integer iOb = 100;
		// Auto-unbox int
		int i = iOb;
		
		System.out.println(i + " " + iOb);
	}

}
