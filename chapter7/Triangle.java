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
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	//Contructor
	Triangle(String s, double w, double h) {
		setWidth(w);
		setHeight(h);
		
		style = s;
	}
}
