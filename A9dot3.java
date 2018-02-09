/* A9dot3
 * print out the date for the different times ellapsed
 * create a loop to iterate through each elapsed time.
 */

public class A9dot3 {
	public static void main(String[] args) {
		// get date
		java.util.Date date = new java.util.Date();
		// iterate through each elapsed time and print
		for (long i = 10000; i <= 100000000000L; i *= 10) {
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}