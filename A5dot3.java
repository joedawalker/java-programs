/* A5dot3, Conversion from Kilograms to Pounds
 * This program converts Kilograms to Pound by:
 * Looping through numbers the odd numbers of 1 to 200
 * Multipylying the nuber of kilograms by 2.2
 * Printing the result in two columns displaying the value in kilograms with
 * the value in in pounds.
 */


public class A5dot3 {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");
		
		// loop through the odd numbers from 1 to 200
		for (int number = 1; number < 200; number += 2) {
			// calculate pounds
			double pounds = number * 2.2;
			// print kilograms and pounds in two seperate columns.
			System.out.printf(number + "\t\t%6.1f\n", pounds);
		}
	}
}