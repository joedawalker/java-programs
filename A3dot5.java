/* Program A3dot5 (find the day of the week): This program will
 * prompt the user for the day of the week and days elapsed to
 * find the future day of the week. */

import java.util.Scanner;

public class A3dot5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt the user for the day of the week (0-6)
        System.out.print("Enter today's day: ");
        double today = input.nextDouble();

        // prompt the user for amount of days in the future
        System.out.print("Enter the number of days elapsed since today: ");
        double daysElapsed = input.nextDouble();

        // calculate the future day
        double futureDay = (today + daysElapsed) % 7;

        // Print the day today and the day in the future
        System.out.print("Today is ");
        dayOfTheWeek(today);
        System.out.print(" and the future day is ");
        dayOfTheWeek(futureDay);
        System.out.print("\n");

        input.close();
    }

    // dayOfTheWeek evaluates the day of the week (0-6) and
    // prints the day the number represents as a string value
    public static void dayOfTheWeek(double day) {
        if (day == 0) {
            System.out.print("Sunday");
        }
        else if (day == 1) {
            System.out.print("Monday");
        }
        else if (day == 2) {
            System.out.print("Tuesday");
        }
        else if (day == 3) {
            System.out.print("Wednesday");
        }
        else if (day == 4) {
            System.out.print("Thursday");
        }
        else if (day == 5) {
            System.out.print("Friday");
        }
        else {
            System.out.print("Saturday");
        }
    }
}
