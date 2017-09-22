
public class PalindromeInteger {

	public static int reverse (int number) {

	    int reverse = 0;

	    while (number != 0) {

	      reverse = (reverse * 10) + number % 10;
	      number = number / 10; 
	   }

	    System.out.println(reverse + " is the reverse number.");
	    return (reverse);
	  }

	 public static boolean isPalindrome(int number) {
		 return (number == reverse(number)); 
	 }

	  public static void main(String[] args) {
	    System.out.print("Enter an integer: ");
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    int number = input.nextInt();

	    reverse(number);

	        if (number == reverse(number)) {
	             System.out.println(number + " is a palindrome");
	       } else {
	            System.out.println(number + " is not a palindrome");        
	        }

	  }
}
