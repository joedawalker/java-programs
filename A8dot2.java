/* A8dot2 Sum the major diagonal in a matrix
 * get 4x4 matrix from user
 * 		~create two for loops to store the data in a two dimensional array
 * add the values stored in the diagonal coordinates of the matrix
 * print the sum
 */

import java.util.*;

public class A8dot2 {
		
		public static void main(String[] args) {
			
			// run getMatrix and addDiagonal and store them
			double[][] a = getMatrix();
			double sum = addDiagonal(a);
			
			// print the sum
			System.out.println("Sum of the elements in the major diagonal is " + sum);
			
		}
		
		private static double[][] getMatrix() {
			// declare the new array to store the matrix
			double[][] matrix = new double[4][4];
			
			// input scanner and prompt the user for the matrix values
			java.util.Scanner input = new Scanner(System.in);
			System.out.println("Enter a 4-by-4 matrix row by row: ");
			
			// store the matrix values
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					matrix[row][col] = input.nextDouble();
				}
			}
			return matrix;
		}
		
		private static double addDiagonal(double[][] a) {
			
			// add all of the values along the diagonal coordinates
			double sum = a[0][0] + a[1][1] + a[2][2] + a[3][3];
			
			return sum;
		}
}