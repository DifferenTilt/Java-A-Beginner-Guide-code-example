package chapter06;

// Use a static block
class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	
	static { // this block is executed when the class is loaded.
		System.out.println("Inside static block."); 
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	
	public StaticBlock(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
}
public class SDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock ob = new StaticBlock("Inside Constructor");
		
		System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
		System.out.println("Square root of 3 is " + StaticBlock.rootOf3);
	}

}
