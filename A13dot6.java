import java.util.*;

public class A13dot6 {
	
	public static void main(String[] args) {
		double radius1;
		double radius2;
		java.util.Scanner input = new Scanner(System.in);
		System.out.print("Enter the the length of the radius of the first cirlce: ");
		radius1 = input.nextDouble();
		System.out.print("Enter the the length of the radius of the second cirlce: ");
		radius2 = input.nextDouble();
		
		ComparableCircle cir1 = new ComparableCircle(radius1);
		ComparableCircle cir2 = new ComparableCircle(radius2);
		
		int max = cir2.compareTo(cir1);
		
		if (max == 1) {
			System.out.println("The second circle is bigger");
		}
		else if (max == -1) {
			System.out.println("The first circle is bigger");
		}
		else {
			System.out.println("They are the same size");
		}
		
	}
}