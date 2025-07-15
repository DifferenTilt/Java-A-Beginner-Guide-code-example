package chapter12;

// Use the built-in enumerations methods
public class EnumDemo2 {

	public static void main(String[] args) {

		Transport tp;
		
		System.out.println("Here are all Transport constants");
		
		// use values()
		Transport allTransport[] = Transport.values();
		for (Transport transport : allTransport) {
			System.out.println(transport);
		}
		
		// Another way to use the for each without definition
		// of an external variable allTransport
		for (Transport transport : Transport.values()) {
			System.out.println(transport);
		}
		
		System.out.println();
		
		// use valueOf()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);
	}

}
