/* A9dot1
	Call the Rectangle class and assign widths and heights for each
	rectangle. 
	
	print the Width, Height, Area, and perimeter for each rectangle

*/

public class A9dot1 {
	public static void main(String[] args) {
		// set the values of the rectangle objects
		Rectangle rct1 = new Rectangle(4, 40);
		Rectangle rct2 = new Rectangle(3.5, 35.9);
		
		// print rectangle 1
		System.out.println("Rectangle 1:");
		System.out.printf("\tWidth = %.1f%n", rct1.getWidth());
		System.out.printf("\tHeight = %.1f%n", rct1.getHeight());
		System.out.printf("\tArea = %.1f%n", rct1.getArea());
		System.out.printf("\tPerimeter = %.1f%n\n", rct1.getPerimeter());
		
		// print rectangle 2
		System.out.println("Rectangle 2:");
		System.out.printf("\tWidth = %.1f%n", rct2.getWidth());
		System.out.printf("\tHeight = %.1f%n", rct2.getHeight());
		System.out.printf("\tArea = %.1f%n", rct2.getArea());
		System.out.printf("\tPerimeter = %.1f%n\n", rct2.getPerimeter());
		
	}
}