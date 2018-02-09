public class A9dot7 {
	
	public static void main(String[] args) {
		Account ac1 = new Account(11122, 20000.00);
		ac1.setAnnualInterestRate(4.5);
		ac1.withdraw(2500.00);
		ac1.deposit(3000.00);
		System.out.printf("Balance = $%.2f%n", ac1.getBalance());
		System.out.printf("Monthly Interest = $%.2f%n", ac1.getMonthlyInterest());
		System.out.println("Account Created = " + ac1.getDateCreated());
		System.out.println();		
	}
}
