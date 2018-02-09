/* Program A3dot11 (find the amount of days in a month): This
 * program will prompt the user for a given month and year
 * then calculate and print how many days there are in that month.*/

import java.util.Scanner;

public class A3dot11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt the user for a month of the year (0-12)
        System.out.print("Enter a month of the year: ");
        double month = input.nextDouble();

        // prompt the user for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Call the days of the week function to find how many
        // days are in the given month.
        daysOfTheMonth(month, year);

        input.close();
    }

    // daysOfTheMonth evaluates month and year to determine
    // how many days are in that month.
    public static void daysOfTheMonth(double month, int year) {
        if (month == 1) {
            System.out.print("January " + year + " has 31 days.\n");
        }
        else if (month == 2) {
            if ((year % 4 ) == 0 && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.print("February " + year + " has 29 days.\n");
            }
            else {
                System.out.print("February " + year + " has 28 days.\n");
            }
        }
        else if (month == 3) {
            System.out.print("March " + year + " has 31 days.\n");
        }
        else if (month == 4) {
            System.out.print("April " + year + " has 30 days.\n");
        }
        else if (month == 5) {
            System.out.print("May " + year + " has 31 days.\n");
        }
        else if (month == 6) {
            System.out.print("June " + year + " has 30 days.\n");
        }
        else if (month == 7) {
            System.out.print("July " + year + " has 31 days.\n");
        }
        else if (month == 8) {
            System.out.print("August " + year + " has 31 days.\n");
        }
        else if (month == 9) {
            System.out.print("September " + year + " has 30 days.\n");
        }
        else if (month == 10) {
            System.out.print("October " + year + " has 31 days.\n");
        }
        else if (month == 11) {
            System.out.print("Novemeber " + year + " has 30 days.\n");
        }
        else {
            System.out.print("December " + year + " has 31 days.\n");
        }
    }
}
