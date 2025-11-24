package chapter15;

public class VarCapture {

	public static void main(String[] args) {

		// A local variable that can be captured.
		int num = 10;

		MyFunc myLambda = (n) -> {
			// This use of nume is OK. It does not modify nume
			int v = num +n;

			// The following is illegal
			//num++;
			return v;
		};

		System.out.println("Ending...");
		// The following line would also cause an error, because
		// it would remove the effectively final status from num.
		//num = 9;
	}

}
