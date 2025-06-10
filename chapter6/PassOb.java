package chapter6;

class Block {
	private int a,b,c;
	private int volume;
	
	Block (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.volume = a*b*c;
	}
	// Since the method is applied to an object is not a function
	// with two parameters but only one, the second obj we want to compare 
	public boolean sameBlock(Block ob) {
		return (this.a == ob.a && this.b == ob.b && this.c == ob.c);
	}
	
	public boolean sameVolume (Block ob) {
		return (this.volume == ob.volume);
	}
}

public class PassOb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		
		System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
	}

}
