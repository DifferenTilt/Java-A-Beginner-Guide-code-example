package chapter15;

public class MyClass2<T> {

	private T val;

	public MyClass2(T val) {
		this.val = val;
	}

	public MyClass2() {
		val = null;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}



}
