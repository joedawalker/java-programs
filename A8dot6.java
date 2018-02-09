import java.util.*;

public class A8dot6 {
	
	public static void main(String[] args) {
		double[][] a = getMatrix();
		double[][] b = getMatrix();
		double[][] c = multiplyMatrices(a, b);
		printMatrices(a, b, c);
		
	}
	
	private static double[][] multiplyMatrices(double[][] a, double [][] b) {
		double[][] matrix = new double[3][3];
		for (int row = 0; row < matrix.length; row++) {
			for ( int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = a[row][0] * b[0][col] + a[row][1] * b[1][col] + a[row][2] * b[2][col];
			}
		}
		return matrix;
	}
	
	private static void printMatrices(double[][] a, double[][] b, double[][] c) {
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++){
				System.out.print(a[row][col] + " ");
			}
			System.out.print("     ");
			
			for (int col = 0; col < b[row].length; col++){
				System.out.print(b[row][col] + " ");
			}
			System.out.print("     ");
			
			for (int col = 0; col < c[row].length; col++){
				System.out.print(c[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	private static double[][] getMatrix() {
		
		double[][] matrix = new double[3][3];
		
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
		return matrix;
	}
}