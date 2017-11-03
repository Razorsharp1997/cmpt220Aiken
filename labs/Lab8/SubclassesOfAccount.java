public class SubclassesOfAccount {
	public static void main(String[] args) {

		Account account = new Account(4545, 40000);
		SavingsAccount savings = new SavingsAccount(4546, 25000);
		CheckingAccount checking = new CheckingAccount(4547, 25000, -100);
		
		account.setAnnualInterestRate(10.5);
		savings.setAnnualInterestRate(10.5);
		checking.setAnnualInterestRate(10.5);

		account.withdraw(1000);
		savings.withdraw(0);
		checking.withdraw(3000);

		account.deposit(0);
		savings.deposit(10000);
		checking.deposit(4500);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}