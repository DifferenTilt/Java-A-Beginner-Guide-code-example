package chapter15;

public class LambdaAsArgumentsDemo {
	/*
	 * This method has a functional interface as the type of its first parameter.
	 * Thus, it can be passed a reference to any instance of that interface,
	 * including the instance created by a lambda expression. The second parameter
	 * specifies the string to operate on.
	 */
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {

		String inStr = "Lambdas add power to Java";
		String outStr;

		System.out.println("Here is input string: " + inStr);

		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);

		outStr = stringOp((str) -> {
			String result = "";
			int i;

			for (i = 0; i < str.length(); i++)
				result += str.charAt(i);

			return result;
		}, inStr);

		System.out.println("The string with spaces removed: " + outStr);
	}

}
