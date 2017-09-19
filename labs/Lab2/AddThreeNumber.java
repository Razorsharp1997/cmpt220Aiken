import java.util.Scanner;

public class AddThreeNumber {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
			
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Asks the question that the user needs to solve
		System.out.print("What is " + number1 +  " + " + number2 + " + " + number3 + "? ");
		int answer =input.nextInt();
		
		// If the answer is wrong then this message will display
		while (number1 + number2 + number3 != answer) {
			System.out.print("Wrong answer. Try again. " 
					+ "What is " + number1 + " + " + number2 + " + " + number3 + "? ");	
			answer = input.nextInt();
		}
		
		// If the answer is correct then this message will display
		System.out.println("You got it!");
	}

}
