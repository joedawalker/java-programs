import java.io.*;
import java.util.*;

public class A12dot15 {
	public static void main(String[] args) {
		try {
			File file = new File("Data.txt");
			writeData(file);
			int[] myList = readData(file);
			Arrays.sort(myList);
			printData(myList);
		} catch (Exception e) {
			System.out.println("Error with file");
		}
	}
	
	private static void printData(int[] myList) {
		for (int i = 0; i < 100; i++) {
			System.out.print(myList[i] + " ");
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}
	
	private static int[] readData(File file) throws Exception {
		try (Scanner input = new Scanner(file)) {
			
			int[] myList = new int[100];
			for (int i = 0; input.hasNext() && i < myList.length; i++) {
				myList[i] = input.nextInt();
			}
			return myList;
		}
		
	}
	
	private static void writeData(File file) throws Exception {
		try (PrintWriter output = new PrintWriter(file)) {
			int [] myList = new int[100];
			for (int i = 0; i < 100; i++) {
				output.print((int) (Math.random() * 100) + " ");
			}
		}
	}
}