package chapter7;

// A class for two-dimensional objects.
public class TwoDShape {

	private double width;
	private double height;
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// Accessor method for width and height when they are private
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setWidth(double w) {
		width = w;
	}
	
	void setHeight (double h) {
		height = h;
	}
}

