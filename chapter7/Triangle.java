package chapter7;

//A subclass of TwoDShape for triangles. Inherits 
//members and method of the father class
public class Triangle extends TwoDShape {
	String style;
	
	double area() {
		return width * height / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}
