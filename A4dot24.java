import java.util.Scanner;

public class A4dot24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String c1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String c2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String c3 = input.nextLine();

        string t;

        if (c1.compareTo(c2) > 0) {
            t = c1;
            c1 = c2;
            c2 = t;
        }
        if (c2.compareTo(c3) > 0) {
            t = c2;
            c2 = c3;
            c3 = t;
        }
        if (c1.compareTo(c2) > 0) {
            t = c1;
            c1 = c2;
            c2 = t;
        }
        System.out.print("the three cities in alphabetical order are "
                         + c1 + ", " + c2 + ", and " + c3);

        input.close();
    }
}
