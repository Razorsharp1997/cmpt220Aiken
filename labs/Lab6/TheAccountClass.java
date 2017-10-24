
public class TheAccountClass {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.setAnnualInterestRate(4.5); // JA
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date Created: " + account.getDateCreated());
		System.out.printf("Monthly interest: $%.2f\n ",
				account.getMonthlyInterest());
		System.out.println("Balance " +
				account.getBalance());				
	}

}
