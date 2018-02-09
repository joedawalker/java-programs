public class Circle {
	double radius = 1.0;
	
	Circle() {
		
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea(){
		return radius * Math.PI * Math.PI;
	}
}