import java.util.Scanner;

public class AverageOfPositiveAndNegativeNumbers {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int positive = 0;
			int negative = 0;
			int total = 0;
			int value;
			double average = 0.0;
			int number =0;
			
			System.out.print("Enter an integer, the input end if it is 0: ");
			
			do {
				value = input.nextInt();
				
				if (value > 0) { 
					positive++;
					number++;
					total += number; // JA: this should be value
				
				} else if (value < 0) {
					negative++;
					number++;
					total += value;
				}
				} while (value !=0);
				
				// JA: For this to work you need to enclose in ()
				average = total / (number * 1.0); 
				
				System.out.println("The number of positives is " + positive);
				System.out.println("The number of negatives is " + negative);
				System.out.println("The total is " + total);
				System.out.println("The average is " + average);	
	}
}


