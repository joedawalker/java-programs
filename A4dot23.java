/* A4dot23 Financial Application: Payroll
 * This program will collect a user's hours worked, pay rate and tax
 * withholdings in order to calculate their gross pay, deductions,
 * and net pay.
 * 
 * name <-- prompt user for name and store
 * hours <-- prompt user for hours worked and store
 * wage <-- prompt user for wage and store
 * fedRate & stateRate <-- promp user for tax rates and store
 * Calculate Gross Pay <-- hours multiplied by wage
 * Calculate Deductions:
 *		| Calculate Federal and State Withholdings and round
 *			~tax rate multiplied by gross pay
 *		| Calculate total deductions
 *			~Sum of federal and state withholdings
 * Calculate Net Pay <-- (Gross Pay - Deductions)
 * Print results of calculations in user console
 *******************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat;
public class A4dot23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.##");
		DecimalFormat p = new DecimalFormat("##.0");
		
		// get user input data
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		float hours = input.nextFloat();
		System.out.print("Enter hourly pay rate: ");
		float wage = input.nextFloat();
		System.out.print("Enter federal tax withholding rate: ");
		float fedRate = input.nextFloat();
		System.out.print("Enter state tax withholding rate: ");
		float stateRate = input.nextFloat();
		
		// print user information received
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + f.format(wage));
		
		// Compute grossPay, tax withholdings, deductions, and netPay
		float grossPay = hours * wage;
		float fedPercent = fedRate * 100;
		float statePercent = stateRate * 100;
		double fedWithheld = fedRate * grossPay;
		double stateWithheld = stateRate * grossPay;
		double deductions = fedWithheld + stateWithheld;
		double netPay = grossPay - deductions;
		
		// print the results of the above calculations
		System.out.println("Gross Pay: $" + f.format(grossPay));
		System.out.println("Deductions:\n"
						+ "\tFederal Withholding (" 
						+ p.format(fedPercent) + "%): $" + f.format(fedWithheld) + "\n"
						+ "\tState Witholding ("
						+ p.format(statePercent) + "%): $" + f.format(stateWithheld) + "\n"
						+ "\tTotal Deduction: $" + f.format(deductions));
		System.out.println("Net Pay: $" + f.format(netPay));
		
		
				
		input.close();
	}
}