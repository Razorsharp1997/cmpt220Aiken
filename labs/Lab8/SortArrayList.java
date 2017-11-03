import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<Integer>();

		System.out.print("Enter 5 numbers: ");

		for (int i = 0; i < 5; i++) {
			numList.add(input.nextInt());
		}

		sort(numList);
		System.out.println(numList.toString());
	}

	public static void sort(ArrayList<Integer> list) {
		list.sort(null);		
	}
}