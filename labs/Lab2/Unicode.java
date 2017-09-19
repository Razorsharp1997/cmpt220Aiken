import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter a letter of the alphabet here.
		System.out.print("Enter a character here: ");
		
		// char c is the variable and charAt(0) is the character that is entered in the input.
		char c = input.next().charAt(0);
		
		// Transfers the letter into unicode.
		int x = (int) c;
		
	}

}

