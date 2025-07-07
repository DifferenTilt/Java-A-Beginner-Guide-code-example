package chapter08;

// Is possible also to implement the default method
public class MyIFImp2 implements MyIF{

	@Override
	public int getUserID() {
		return 100;
	}

	@Override
	public int getAdminID() {
		return 42;
	}
}
