import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
			
// JA		System.out.println("This list is " + (isSorted(list) ? "already " : "not ") + "sorted" );
		}
		System.out.println("This list is " + (isSorted(list) ? "already " : "not ") + "sorted" );
	}

	private static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;
	}

}
