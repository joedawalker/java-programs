/* A5dot10, Find numbers divisible by 5 and 6
 * This function will print all of the numbers divisible by 5 and 6 between
 * 100 and 1000 by:
 * Loop through numbers 100 to 1000
 * Evalute if number is divisible by 5 and 6
 * Print the numbers that are found to be divisible by 5 and 6
 * Insert a line break every 10 numbers.
 */



public class A5dot10 {
	public static void main(String[] args) {
		// loop from 100 to 1000
		for (int count = 0, number = 100; number < 1001; number ++) {
			
			// evaluate if the number is divisible by 5 and 6
			if (number % 5 == 0 && number % 6 == 0) {
				System.out.print(number + " ");
				
				// insert a line break every ten numbers
				if (++count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}