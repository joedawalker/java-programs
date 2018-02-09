public class Rectangle {
	
	// set default values
	double width = 1;
	double height = 1;
	
	// create constructor methods
	Rectangle() {
		
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	// get the area
	public double getArea() {
		return width * height;
	}
	
	// get the perimeter
	public double getPerimeter() {
		return width * 2 + height * 2;
	}
	
	
}