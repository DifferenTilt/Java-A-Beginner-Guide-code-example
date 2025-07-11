package chapter08;

// Use the default method
public class DefaultMethodDemo {

	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		// can call getUserID(), because it is explicitly
		// implemented by MyIFImp: 
		System.out.println("User ID is " + obj.getUserID());
		
		// Can also call getAdmin(), because of default
		// implementation:
		System.out.println("Administrator ID is " + obj.getAdminID());
		
	}

}
