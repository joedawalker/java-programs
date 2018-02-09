//Program 2.1 Converts Celsius to Fahrenheit
import java.util.Scanner;

public class A2dot1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	// prompt user for temperature in celsius
		System.out.print("Enter temperature in Celsius: ");
		double celsius = input.nextDouble();

	// calculate Fahrenheit from Celsius and print result
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.print(fahrenheit + " degrees Fahrenheit \n");
	}
}