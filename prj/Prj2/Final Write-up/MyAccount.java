import java.util.Date;

public class MyAccount {
		private int id = 0;
		private double balance = 0;
		private static double annualInterestRate = 0;
		private Date dateCreated;

		public MyAccount() {
			dateCreated = new Date();
		}
		
		public MyAccount(int id, double balance) {
			this();
			this.id = id;
			this.balance = balance;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		
		public String getDateCreated() {
			return dateCreated.toString();
		}
		
		public double getMonthlyInterestRate() {
			return (annualInterestRate / 12);
		}
		
		public void withdraw(double ammount) {
			balance -= ammount;
		}
		
		public void deposit(double ammount) {
			balance += ammount;
		}
}

