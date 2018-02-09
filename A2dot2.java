// program 2.2 - Computes volume of a cylinder using radius and length
import java.util.Scanner;

public class A2dot2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// prompt user for radius and length
		System.out.print("Enter the radius of the cylinder: ");
		double radius = input.nextDouble();
		System.out.print("Enter the length of the cylinder: ");
		double length = input.nextDouble();
	
	// compute and print the area
		double area = radius * radius * Math.PI;
		double area_result = Math.round (area * 1000.0) / 1000.0;
		System.out.print("The area is " + area_result + "\n");

	// compute and print the volume
		double volume = area * length;
		double volume_result = Math.round (volume * 1000.0) / 1000.0;
		System.out.print("The Volume is " + volume_result + "\n");
	}
}