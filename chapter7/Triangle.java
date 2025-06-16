package chapter7;

//A subclass of TwoDShape for triangles. Inherits 
//members and method of the father class
public class Triangle extends TwoDShape {
	String style;
	
	double area() {
		// Here the declaration is different because the member
		// are defined with different keyword
		return this.getWidth() * this.getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
	
	// Override
//	public Triangle() {
//		
//	}
	
	//Constructor
	Triangle(String s, double w, double h) {
		// Here they work if the constructor in the superclass is not defined
//		setWidth(w);
//		setHeight(h);
		
		super(w, h);
		
		style = s;
	}
}
