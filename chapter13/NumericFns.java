package chapter13;

// Make use of bounded types
public class NumericFns<T extends Number> {
	T num;
	
	// Pass the constructor a reference to
	// a numeric object.
	public NumericFns(T n) {
		num = n;
	}
	
	// Return the reciprocal.
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	// Return the fractional component.
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}
