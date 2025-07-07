package chapter06;
// Public vs private access.
class MyClass {
	private int alpha; // private access
	public int beta; // public access
	int gamma; // default access
	
	/* 
	 * Methods to access alpha. It is OK for a member 
	 * of a class to access a private member 
	 * of the same class.
	 */
	void setAlpha (int a) {
		this.alpha = a;
	}
	
	int getAlpha() {
		return this.alpha;
	}
}

public class AccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass ob = new MyClass(); // Even if not defined we got a default constructor
		
		/* 
		 * Access to alpha is allowed only
		 * through its accessor methods
		 */
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		// You cannot access alpha like this:
		
		//ob.alpha = 10; // Wrong since is private!!
		
		// These are OK because beta and gamma are public.
		ob.beta = 88;
		ob.gamma = 99;
	}

}
