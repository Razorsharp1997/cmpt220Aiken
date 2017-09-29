import java.util.Scanner;

public class DisplayMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x = input.nextInt();
		
		printMatrix(x);
	}
	
	public static void printMatrix(int x) {
		for (int rows= 0; rows < x; rows++) {
			for (int columns = 0; columns < x; columns++) {
				System.out.print((int)(Math.random() * 2));
			}
			
			System.out.println();
		}
	}

}
