/* A12dot3 Array Index Out Of Bounds Exception
 * This program will:
	|Create an array with 100 random integers
	|Write the array onto a seperate data file
	|Prompt the user for an index of the array
	|Print the corresponding value of the index of the array.
*/

import java.io.*;
import java.util.*;

public class A12dot3 {
	public static void main(String[] args) {
		try {
			// create new Data file
			File file = new File("Data.txt");
			writeData(file);
			// declare the array
			int[] myList = readData(file);
			Arrays.sort(myList);
			printElement(myList);
		} catch (Exception e) {
			// check if the index is out of bounds
			System.out.println("Out of Bounds");
		}
	}
	
	private static void printElement(int[] myList) {
		Scanner input = new Scanner(System.in);
		// prompt the user for an index of the array
		System.out.print("Enter an index of the Array: ");
		int index = input.nextInt();
		// print the corresponding value of the array
		System.out.println(myList[index]);
	}
	
	private static int[] readData(File file) throws Exception {
		try (Scanner input = new Scanner(file)) {
			// store data from file
			int[] myList = new int[100];
			for (int i = 0; input.hasNext() && i < myList.length; i++) {
				myList[i] = input.nextInt();
			}
			return myList;
		}
		
	}
	
	private static void writeData(File file) throws Exception {
		// write the integer values onto the data file
		try (PrintWriter output = new PrintWriter(file)) {
			int [] myList = new int[100];
			for (int i = 0; i < 100; i++) {
				output.print((int) (Math.random() * 100) + " ");
			}
		}
	}
}