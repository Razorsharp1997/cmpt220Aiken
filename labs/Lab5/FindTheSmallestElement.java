import java.util.Scanner;

public class FindTheSmallestElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.println("The minimum number is: " + min(numbers));

	}

	private static double min(double[] array) {
		double min = array[0];
		for (double i: array) {
			if (i < min)
				min = 1; // JA: min = i;
	}
		return min;
	}
}
