import java.util.Scanner;
import javax.xml.bind.annotation.adapters.*;

public class A5dot41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 
		System.out.print("Please enter numbers followed by 0: ");
		int number = input.nextInt();
		int max = number;
		int count = 1;
		
		while(number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
			else if (number == max) {
				count++;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);
		
		input.close();
	}
}