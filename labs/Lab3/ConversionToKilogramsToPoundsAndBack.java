import java.util.Scanner;

// JA: You had to print the full table with the conversions
// JA: You need a for loop with two indices
public class ConversionToKilogramsToPoundsAndBack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter kilogram values here: ");
		double kilograms = input.nextDouble();
		
		System.out.print("Enter pound values here: ");
		double pounds = input.nextDouble();
		
		kilograms = pounds * 0.45;
		pounds = kilograms * 2.20462262;
		
		System.out.println(pounds + " lbs" + "   ||   " + kilograms + " kg");
		

	}

}
