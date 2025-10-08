package chapter15;
/**
 * Demonstrate a simple lambda expression.
 */
public class LambdaDemo {

	public static void main(String[] args) {

		// Declare an interface reference
		MyNumber myNumber;

		/*
		 * Here the lambda expression is a constant expression.
		 * When it is assigned to myNum, a class instance is constructed
		 * in which the lambda expression implements the getValue() method
		 * in MyNumber
		 */
		myNumber = () -> 123.45; // canceling this expression lead to compiling error

		System.out.println("A fixed value:" + myNumber.getValue());

		// A more complex expression
		myNumber = () -> Math.random() * 100;

		/*
		 * Here the same method produce different results and this
		 * is a new flexible way to use code!
		 */
		System.out.println("A random value: " + myNumber.getValue());
		System.out.println("Another random value: " + myNumber.getValue());

		// A lambda must be compatible with the method in the function interface
		//myNum = () -> "123.45";	// Error!
	}

}
