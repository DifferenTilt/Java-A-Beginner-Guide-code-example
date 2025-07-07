package chapter06;
// Primitive types are passed by VALUE.
class Test {
	// THis method cause no change to the arguments
	void noChange(int i, int j) {
		i = i+ j;
		j = -j;
	}
}

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob = new Test();
		
		int a = 15, b = 20;
		
		System.out.println("a and b before the call: " + a + " " + b );
		
		ob.noChange(a, b);
		
		System.out.println("a and b after the call: " + a + " " + b );
	}

}
