/* A8dot5 Algebra: add two matrices
 * get two 3x3 matrix from user
 * 		~create two for loops to store the data in a two dimensional array
 * multiply the matrices:
 *		~create two for loops to add the two matrices together
 * print the 1st and 2nd matrices then print the sum of the 2
 */

import java.util.*;

public class A8dot5 {
	
	public static void main(String[] args) {
		
		// get the two matrices
		double[][] a = getMatrix();
		double[][] b = getMatrix();
		// get the sum of the matrices
		double[][] c = addMatrices(a, b);
		// call the print method
		printMatrices(a, b, c);
		
	}
	
	private static double[][] addMatrices(double[][] a, double [][] b) {
		// declare new matrix
		double[][] matrix = new double[3][3];
		
		// add the matrices
		for (int row = 0; row < matrix.length; row++) {
			for ( int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = a[row][col] + b[row][col];
			}
		}
		return matrix;
	}
	
	private static void printMatrices(double[][] a, double[][] b, double[][] c) {
		
		// print the matrices
		for (int row = 0; row < a.length; row++) {
			// print the first matrix
			for (int col = 0; col < a[row].length; col++){
				System.out.print(a[row][col] + " ");
			}
			System.out.print("\t");
			// print the second matrix
			for (int col = 0; col < b[row].length; col++){
				System.out.print(b[row][col] + " ");
			}
			System.out.print("\t");
			// print the sum
			for (int col = 0; col < c[row].length; col++){
				System.out.print(c[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	private static double[][] getMatrix() {
		// declare new matrix
		double[][] matrix = new double[3][3];
		// import the scanner
		java.util.Scanner input = new Scanner(System.in);
		// prompt the user for the values of a 3x3 matrix
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		// store the values in the array cells
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
		return matrix;
	}
}