import java.util.Scanner;

public class FutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the current day
		System.out.println("Enter today's day (0 - 6): ");
		int day = input.nextInt();
		
		// Enter the number of days that have passed from the current day
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		
		String dayAsString = null;
		String futureDayString = null;
		
		// Displays the current day depending on what number is inputed
		switch(day) {
		case 0: 
			dayAsString = "Sunday";
			break;
		case 1: 
			dayAsString = "Monday";
			break;
		case 2: 
			dayAsString = "Tuesday";
			break;
		case 3: 
			dayAsString = "Wednesday";
			break;
		case 4: 
			dayAsString = "Thursday";
			break;
		case 5: 
			dayAsString = "Friday";
			break;
		case 6: 
			dayAsString = "Saturday";
			break;
		}
		
		// Displays the elapsed day from the current day of the number that was inputed
		switch(day + elapsed) {
		case 0: 
			futureDayString = "Sunday";
			break;
		case 1: 
			futureDayString = "Monday";
			break;
		case 2: 
			futureDayString = "Tuesday";
			break;
		case 3: 
			futureDayString = "Wednesday";
			break;
		case 4: 
			futureDayString = "Thursday";
			break;
		case 5: 
			futureDayString= "Friday";
			break;
		case 6: 
			futureDayString = "Saturday";
			break;
		}
		
		// Displays the days
		System.out.println("Today is " + dayAsString + " and the future day is " + futureDayString + ".");
	}
	
}
