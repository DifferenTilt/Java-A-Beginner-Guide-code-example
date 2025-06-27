package chapter7;

// Create an abstract class
public abstract class AbstractTwoDShape {
	private double width;
	private double height;
	private String name;
	
	// A default constructor.
	AbstractTwoDShape() {
		width = height = 0.0;
		name = "none";
	}

	public AbstractTwoDShape(double width, double height, String name) {
		super();
		this.width = width;
		this.height = height;
		this.name = name;
	}

	public AbstractTwoDShape(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public AbstractTwoDShape(AbstractTwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Now, area() is abstract.
	abstract double area();
}
