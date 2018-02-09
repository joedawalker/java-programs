/* A12dot2 Array Index Out Of Bounds Exception
 * This program will:
	|Prompt the user for 2 integers
	|Calculate the sum of the 2 integers
	|Print the sum
	|Check if the user inputs are valid integers
	|Prompt the user for new values if the 
	 previous values are invalid integers
*/

import java.util.*;

public class A12dot2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			try {
				// prompt the user for 2 integers
				System.out.print("Please enter 2 integers: ");
				int int1 = input.nextInt();
				int int2 = input.nextInt();
				// calculate the sum
				int sum = int1 + int2;
				// print the sum
				System.out.println(sum);
				// change the done to true to end the loop
				done = true;
			} 
			// check if the inputs are valid integers
			catch (InputMismatchException e) {
				// Give error message and re-run the program
				System.out.println("One or more of the values entered are not integers!\n");
			}
			finally {
				input.nextLine();
			}
		}
	}
}
