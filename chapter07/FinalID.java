package chapter07;

public class FinalID {

	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));

	}

}
