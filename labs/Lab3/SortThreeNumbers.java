import java.util.Scanner;

public class SortThreeNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = input.nextDouble();	
		System.out.println("Enter the second number: ");
		double num2 = input.nextDouble();
		System.out.println("Enter the third Number: ");
		double num3 = input.nextDouble();
		System.out.println("Displaying sorted numbers:  ");
		displaySortedNumbers(num1, num2, num3);
	}
		
	public static void displaySortedNumbers( 
	double num1, double num2, double num3) {

		if ((num1<num2) && (num1<num3)) {
			System.out.print(num1 + " ");
			if (num2<num3)
				System.out.print(num2 + " " + num3);
			else
				System.out.print(num3 + " " + num2);
			
		} else if ((num2<num1 && num2<num3)) {
				System.out.print(num2 + " ");
				if (num1<num3)
					System.out.print(num1 + " " + num3);
				else
					System.out.print(num3 + " " + num1);
				
		} else if ((num3<num1 && num3<num2)) {
				System.out.print(num3 + " ");
				if (num1<num2)
					System.out.print(num1 + " " + num2);
				else
					System.out.print(num2 + " " + num1);
		}
	}
}
