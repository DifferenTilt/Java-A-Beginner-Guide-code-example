package chapter15;

public class MethodRefDemo {

	/*
	 * This method has a functional interface as the type of
	 * its first parameter. Thus, it can be passed any instance of
	 * that interface, including a method reference.
	 */
	static String StringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {

		String inStr = "Lambdas add power to Java";
		String outStr;

		// Here a method reference to strReverse is passed to stringOp()
		// this line works if strReverse is static
		//outStr = StringOp(MyStringOps::strReverse, inStr);

		MyStringOps strOps = new MyStringOps();

		outStr = StringOp(strOps::strReverse, inStr);

		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}

}
