import java.util.Scanner;

public class A10dot7 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100.00);
		}
		
		int id = 0;
		do {
			System.out.println("Please enter an id or -1 to ext: ");
			id = input.nextInt();
			if (id >= 0 && id < accounts.length) {
				drawMenu(accounts[id]);
			}
			else if (id > 0) {
				System.out.println("Please enter a valid account");
			}
			
		} while (id >= 0);
	}
	
	private static void drawMenu(Account account) {
		int choice = 0;
		do {
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.print("Enter a choice: ");
			choice = input.nextInt();
			double amount;
			switch (choice) {
				case 1:	System.out.printf("The balance is $%.2f%n", account.getBalance());
						break;
				case 2: System.out.print("Please enter amount: ");
						amount = input.nextDouble();
						account.withdraw(amount);
						break;
				case 3: System.out.println("Please enter amount: ");
						amount = input.nextDouble();
						account.deposit(amount);
						break;
				case 4: break;
				default: System.out.println("invalid option");
			}
			
		} while (choice != 4);
	}
}