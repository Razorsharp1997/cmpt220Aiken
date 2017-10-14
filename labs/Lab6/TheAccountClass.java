
public class TheAccountClass {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.setAnnualInterestRate(5);
		account.withdraw(45000);
		account.deposit(100000);
		
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date Created: " + account.getDateCreated());
		System.out.printf("Monthly interest: $%.2f\n ",
				account.getMonthlyInterest());
	}

}
