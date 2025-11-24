package chapter15;

public class ConstructorRefDemo2 {

	public static void main(String[] args) {

		MyFunc5<Integer> myClassCons = MyClass2<Integer>::new;

		MyClass2<Integer> mc = myClassCons.func(100);

		System.out.println("val in mc is " + mc.getVal( ));
	}

}
