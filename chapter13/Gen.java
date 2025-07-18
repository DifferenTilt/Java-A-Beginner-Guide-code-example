package chapter13;

/*
 * A simple generic class.
 * Here, T is a type parameter that
 * will be replaced by a real type
 * when an object of type Gen is created.
 */
public class Gen<T> {
	// declare an object of type T
	private T ob;
	
	// Pass the constructor a reference to
	// an object of type T
	Gen(T o) {
		ob = o;
	}
	
	// Return ob.
	T getOb() {
		return ob;
	}
	
	// Show type of T.
	void showType()	{
		System.out.println("The type of T is " + ob.getClass().getName());
	}
}
