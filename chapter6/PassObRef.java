package chapter6;

// Objects are passed through their references.
class TestOb {
	int a, b;
	
	TestOb (int i, int j) {
		a = i;
		b = j;
	}
	// Here we want to highlight the passing, another possibility is
	// to have input empty and act on the object
	void change (TestOb ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
public class PassObRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOb ob = new TestOb(15, 20);
		
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		
		ob.change(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}

}
