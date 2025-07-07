package chapter07;

class Rectangle extends TwoDShape{

	Rectangle(double w, double h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	boolean isSquare() {
		if(this.getWidth() == this.getHeight()) return true;
		return false;
	}
	
	double area() {
		return this.getWidth() * this.getHeight();
	}
	
}
