/* A6dot7 Finance App 
 * This program will create a table showing the future value of an investment
 * according to its annual interest rate.
 *
 * The program will prompt the user for the investment amount
 * The program will prompt the user for the annual interest rate
 * The program will convert the annual interest rate into a monthly rate.
 * The program will then start a loop
 *		^The loop will then find the future value for a given year by calling the 
 *        futureInvesmentValue method:
 *			|-futureValue = investmentAmount * (1.0 + monthlyInterestRate) ^ (years * 12)
 * 		^It will then print out the year and its corresponding future value
 * 		^The loop will increment the year and repeat up to 30 years
 */

import java.util.Scanner;
import java.text.*;

public class A6dot7 {

	public static void main(String[] args) {
    // set output format
    DecimalFormat df = new DecimalFormat("#.##");

		Scanner input = new Scanner(System.in);

		// prompt the user for the investment amount
		System.out.print("The Amount invested: ");
		double investmentAmount = input.nextInt();
    // prompt the user for the interest rate
    System.out.print("Annual interest rate: ");
    double annualInterestRate = input.nextDouble();
    // convert the annual rate to a monthly rate
    double monthlyInterest = annualInterestRate / 12 / 100;
    // print the table header
    System.out.println("Years\t\tFuture Value");
    
    for (int years = 1; years < 31; years++) {
        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterest, years);
        
        System.out.println(years + "\t\t" + df.format(futureValue));
    }
    
				input.close();
}


    public static Double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
            // calculate the future value.
            double futureValue = investmentAmount * Math.pow(1.0 + monthlyInterestRate, years * 12);
            return futureValue;
    }
}
