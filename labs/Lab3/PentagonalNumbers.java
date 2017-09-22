import java.util.Scanner;

public class PentagonalNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The first 100 pentagonal numbers, ten per line: ");
		for (int numbers = 1; numbers <= 100; numbers++) {
			if (numbers % 10 == 0)
				System.out.printf("%7d/n", + getPentagonalNumber(numbers));
			else 
				System.out.printf("%7d", getPentagonalNumber(numbers));
		}
		
	}
	
	public static int getPentagonalNumber(int numbers) {
		return numbers * (3 * numbers - 1) / 2;
	}

}
