package chapter7;

class Rectangle extends TwoDShape{

	boolean isSquare() {
		if(this.getWidth() == this.getHeight()) return true;
		return false;
	}
	
	double area() {
		return this.getWidth() * this.getHeight();
	}
	
}
