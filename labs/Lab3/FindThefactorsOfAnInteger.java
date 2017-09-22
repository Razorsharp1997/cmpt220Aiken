import java.util.Scanner;

public class FindThefactorsOfAnInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input integer here: ");
		int integer = input.nextInt();
		
		for(int i=2; i <= integer; i++){
            while(integer % i == 0) {
            	System.out.println(i);
                integer = integer / i;
            }
	    }
	}
}
