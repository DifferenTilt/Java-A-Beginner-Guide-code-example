package chapter15;

public class ConstructorRefDemo {

	public static void main(String[] args) {

		/*
		 * Because func() takes an argument, new
		 * refers to the parametrized constructor.
		 */
		MyFunc4 myClassCons = MyClass::new;

		MyClass mc = myClassCons.func(100); // = new MyClass(100);

		// Use the instance of MyClas just created.
		System.out.println("val in mc is " + mc.getVal( ));
	}

}
