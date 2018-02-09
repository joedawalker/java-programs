/* A6dot8 Conversion Charts for Celsius and Fahrenheit 
 * This program will create a table showing the conversion of celsius to fahrenheit
 * and fahrenheit to celius.
 * The program will print the table header
 * The program will then start a loop
 *		^Each time the loop is ran the current celsius and fahrenheit will be
 *		 converted using seperate methods:
 *			|-celsiusToFahrenheit: fahrenheit = (9.0 / 5) * celsius + 32;
 *			|-FahrenheitToCelsius: celsuis = (5.0 / 9) * (fahrenheit -32);
 * 		^It will then print out the conversions
 * 		^Celsius will decrease by 1 degree
 *		^Fahrenheit will decrease by 10 degrees
 */

import java.text.*;

public class A6dot8 {
	public static void main(String[] args) {
		// set output formatting for newCelsius and newFahrenheit
		DecimalFormat dfc = new DecimalFormat("##.#");
		DecimalFormat dff = new DecimalFormat("##.##");
		// print table header
		System.out.println("\bCelsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
		System.out.println("_______________________________________________________________");
		
		// set starting values
		double celsius = 40.0;
		double fahrenheit = 120.0;
		
		// loop through degrees Celsius(40-31) and degrees Fahrenheit(120-30)
		// making then printing each conversion
		while (celsius >= 31 && fahrenheit >= 30) {
			double newFahrenheit = celsiusToFahrenheit(celsius);
			double newCelsius = fahrenheitToCelsius(fahrenheit);
			System.out.print(celsius + "\t\t" + dfc.format(newFahrenheit) + "\t\t|\t");
			System.out.println(fahrenheit + "\t\t" + dff.format(newCelsius));
			
			// decrement the values for the next loop conditions
			celsius--;
			fahrenheit -= 10;
									
		}
		
	}
	
	// converts Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	// converts Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsuis = (5.0 / 9) * (fahrenheit -32);
		return celsuis;
	}


}