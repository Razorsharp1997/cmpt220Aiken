import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		double celsius; 
		double fahrenheit; 
		Scanner input; 
			
		System.out.print("Enter a degree in celsius here: ");
		input = new Scanner(System.in);
		celsius = input.nextDouble();
			
		
		fahrenheit = (9.0 / 5.0) *celsius + 32;
			
		System.out.print( celsius + " Celsus is " + fahrenheit + " Fahrenheit ");
	}
		

}
