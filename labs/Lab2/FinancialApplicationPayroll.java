import java.util.Scanner;

public class FinancialApplicationPayroll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		
		String employee = input.next();
		
		// Enter employee's name
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		// Enter the hourly pay rate
		System.out.print("Enter hourly pay rate: ");
		double pay = input.nextDouble();
		double grosspay = pay * hours;
		
		// Enter the ftax withholding rate
		System.out.print("Enter federal tax withholding rate: ");
		double ftax = input.nextDouble();
		double ftaxrate = grosspay * (0.20 * 100) / 100.0;
		
		// Enter the stax withholding rate
		System.out.print("Enter state tax withholding rate: ");
		double stax = input.nextDouble();
		double staxrate = grosspay * (0.09 * 100.0) / 100.0;
		double deductions = ftaxrate + staxrate;
		double netpay = grosspay - deductions;
		
		// Displays all the information that was inputed above
		System.out.println("Employee name: " + employee);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + pay);
		System.out.println("Gross Pay: $" + grosspay);
		System.out.println("Deductions: ");
		System.out.println("Federal Withholding: $" + ftaxrate);
		System.out.println("State Withholding: $" + staxrate);
		System.out.println("Total Deduction: $" + deductions);
		System.out.println("Net Pay: $" + netpay);
	} 
}
