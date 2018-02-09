/* A11dot1 Make A Triangle
 * This program will:
 * Prompt the user for the length of 3 sides,
   the color of a triangle,
   and whether the triangle being created is filled.
 * It will then print the area, perimeter, color, and fill value
   of the triangle created.
 */


import java.util.*;

public class A11dot1 {
	public static void main(String[] args) {
		double side1;
		double side2;
		double side3;
		
		// prompt user for the length of the three sides
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("Enter the the length of side1: ");
		side1 = input.nextDouble();
		
		System.out.print("Enter the the length of side2: ");
		side2 = input.nextDouble();
		
		System.out.print("Enter the the length of side3: ");
		side3 = input.nextDouble();
		
		// prompt the user for the color
		System.out.print("Enter the color of the triangle: ");
		String color = input.next();
		
		//prompt the user for the fill
		System.out.print("The triangle is filled (true/false): ");
		boolean filled = input.nextBoolean();
		
		// Create the new triangle using the Triangle class
		Triangle tri = new Triangle(side1, side2, side3);
		
		tri.setColor(color);
		tri.setFilled(filled);
		
		// print the area, perimeter, color, and fill
		System.out.println("The area is: " + tri.getArea());
		System.out.println("The perimeter is: " + tri.getPerimeter());
		System.out.println("Color = " + tri.getColor());
		System.out.println("Filled = " + tri.isFilled());
		
		System.out.println(tri.toString());
		
		
	}
}