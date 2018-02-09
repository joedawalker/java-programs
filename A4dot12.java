/* A4dot12 Hex to Binary
 * ---This program will convert Hex values to Binary
 *
 * Hex Value <-- prompt the user for the hex value and store
 * Evaluate the Hex value and pair the correct binary value to it
 * Print the pair of values to the User's console
 *******************************************************************/ 

import java.util.Scanner;
import javax.xml.bind.annotation.adapters.*;

public class A4dot12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// prompt the user for a hex digit.
		System.out.print("Enter a hex digit: ");
		String hex = input.nextLine();
 
    // convert the hex digit to binary and print the result.
		switch (hex) {
    case "0": System.out.print(hex + " in binary is 0000");
        break;
    case "1": System.out.print(hex + " in binary is 0001");
        break;
    case "2": System.out.print(hex + " in binary is 0010");
        break;
    case "3": System.out.print(hex + " in binary is 0011");
        break;
    case "4": System.out.print(hex + " in binary is 0100");
        break;
    case "5": System.out.print(hex + " in binary is 0101");
        break;
    case "6": System.out.print(hex + " in binary is 0110");
        break;
    case "7": System.out.print(hex + " in binary is 0111");
        break;
    case "8": System.out.print(hex + " in binary is 1000");
        break;
    case "9": System.out.print(hex + " in binary is 1001");
        break;
    case "A": System.out.print(hex + " in binary is 1010");
        break;
    case "a": System.out.print(hex + " in binary is 1010");
        break;
    case "B": System.out.print(hex + " in binary is 1011");
        break;
    case "b": System.out.print(hex + " in binary is 1011");
        break;
    case "C": System.out.print(hex + " in binary is 1100");
        break;
    case "c": System.out.print(hex + " in binary is 1100");
        break;
    case "D": System.out.print(hex + " in binary is 1101");
        break;
    case "d": System.out.print(hex + " in binary is 1101");
        break;
    case "E": System.out.print(hex + " in binary is 1110");
        break;
    case "e": System.out.print(hex + " in binary is 1110");
        break;
    case "F": System.out.print(hex + " in binary is 1111");
        break;
    case "f": System.out.print(hex + " in binary is 1111");
        break;
    default: System.out.print(hex + " is an invalid input.");

			}

		input.close();
  }
}
