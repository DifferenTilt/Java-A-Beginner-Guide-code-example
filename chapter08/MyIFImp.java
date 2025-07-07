package chapter08;

// Implement MyIF.
public class MyIFImp implements MyIF {
	// Only getUserID() defined by MyIF needs to be implemented.
	// getAdminID() can be allowed to default.
	@Override
	public int getUserID() {
		return 100;
	}

}
