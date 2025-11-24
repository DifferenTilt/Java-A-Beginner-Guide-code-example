package chapter15;

public class LambdaExceptionDemo {

	public static void main(String[] args) {

		double[] values = { 1.0, 2.0, 3.0, 4.0 };

		DoubleNumericArrayFunc average = (n) -> {
			double sum = 0;

			if(n.length == 0)
				throw new EmptyArrayException();
			for(double d : n)
				sum += d;
			return sum/n.length;
		};

		/*
		 * Try catch could be avoided if the main method is annotated
		 * with the clause throw of the right exception
		 */
		try {
		System.out.println("Averege for values is " + average.func(values));
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
		System.out.println("Averege for values: " + values + " is " + average.func(new double[0]));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
