import java.util.Scanner;

public class FinancialApplication {

	public static void main(String[] args) {
		double subtotal; 
		double gratuity;
		double total;
		Scanner input; 
			
		System.out.print("Enter the subtotal and gratuity rate: ");
		input = new Scanner(System.in);
		subtotal = input.nextDouble();
		gratuity = input.nextDouble();
		
		total = subtotal * (gratuity / 100);
			
			
		System.out.print("The gratuity is " + gratuity + " and the total is " + total);

	}

}
