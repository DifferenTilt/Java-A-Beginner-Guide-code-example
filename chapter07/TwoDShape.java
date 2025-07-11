package chapter07;

// A class for two-dimensional objects.
public class TwoDShape {

	private double width;
	private double height;
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	// Parameterized constructor.
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	// Getter e Setter method for width and height when they are private
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

