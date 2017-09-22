import java.util.Scanner;

public class n3IsLessThan12000 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int largestValue=0;
	    int n=0;

	while(Math.pow(n,3)<12000) {
	     if(n > largestValue)
	        largestValue = n;
	     	n++;

	}
	
	System.out.println(largestValue);

	}

}
