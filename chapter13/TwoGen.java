package chapter13;

// A simple generic class with two type
// parameters: T and V.
public class TwoGen<T, V> {
	T ob1;
	V ob2;
	
	// Pass the constructor reference to
	// objects of type T and V
	public TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	// Show types of T and V.
	void showTypes() {
		System.out.println("Type of T is " + ob1.getClass().getName());
		System.out.println("Type of V is " + ob2.getClass().getName());
	}

	public T getOb1() {
		return ob1;
	}

	public V getOb2() {
		return ob2;
	}
	
	
}
