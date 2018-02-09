import java.util.Scanner;

public class A3dot19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
			double perimeter = s1 + s2 + s3;
			System.out.println("The perimeter is " + perimeter);
		}
		else {
			System.out.println("That is not a valid triangle.");
		}
		input.close();
	}

}
