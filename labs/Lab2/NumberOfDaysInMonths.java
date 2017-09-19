import java.util.Scanner;

public class NumberOfDaysInMonths {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the month here
		System.out.println("Enter a month: ");
		// Variable for the month
		int month = input.nextInt();
		String monthString = null;
		
		// Enter the year here
		System.out.println("Enter a year: ");
		// Variable for the year
		int year = input.nextInt();
		
		// Variable for days
		int days = 0;
		
		// If the year inputed is a leap year, this piece of code will make sure that the  amount of days in February are 29 instead of 28
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0); 
		
		// Depending on what number is entered, the month that is tied to the number will be displayed
		switch (month) {
		case 1: monthString = "January";
			days = 31;
			break;
		case 2: monthString = "February";
			days = 28;
			break;
		case 3: monthString = "March";
			days = 31;
			break;
		case 4: monthString = "April";
			days = 30;
			break;
		case 5: monthString = "May";
			days = 31;
			break;
		case 6: monthString = "June";
			days = 30;
			break;
		case 7: monthString = "July";
			days = 31;
			break;
		case 8: monthString = "August";
			days = 31;
			break;
		case 9: monthString = "September";
			days = 30;
			break;
		case 10: monthString = "October";
			days = 31;
			break;
		case 11: monthString = "November";
			days = 30;
			break;
		case 12: monthString = "December";
			days = 31;
			break; 
			
			// If a number like 13 is entered then this message will display
		default: 
			System.out.println("Have a Look at what you've done and try again"); 
			System.exit(0);
		}
		
		// This message will display if the numbers 1-12 are entered and the year is entered
		System.out.println("There are " + days + " days in "+ monthString + " in the year of " + year + ".");
	}

}
