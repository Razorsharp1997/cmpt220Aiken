import java.util.Scanner;

public class NumberOfYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		int years;
		int days; 
		
		years = (minutes / 525600);
		days = (minutes / 1440);
		int remainingdays = days % 365;
		System.out.println( + minutes + " minutes is appoximately " + years + " years and " + remainingdays + " days. ");

	}

}
