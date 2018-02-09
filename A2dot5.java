// program 2.5 - Calculates the gratuity and total of a bill and prints the result
import java.util.Scanner;

public class A2dot5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// prompt user for subtotal and gratuity rate
		System.out.print("Enter the subtotal: ");
		double subtotal = input.nextDouble();
		System.out.print("Enter the gratuity rate: ");
		double gratuityRate = input.nextDouble();
	
	// calculate the gratuity and print the result
		double gratuity = (gratuityRate / 100) * subtotal;
		double gratuityResult = Math.round (gratuity * 100.0) / 100.0;
		System.out.print("The gratuity is $" + gratuityResult + "\n");

	// calculate the total and print the result
		double total = subtotal + gratuity;
		double totalResult = Math.round (total * 100.0) / 100.0;
		System.out.print("The total is $" + totalResult + "\n");
	}
}