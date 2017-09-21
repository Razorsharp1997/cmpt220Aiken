import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter SSN here
		System.out.print("Enter your SSN in this format (DDD-DD-DDDD): ");
		String ssn = input.nextLine();

		boolean correct = true;
		
		// These if statements allow for the code to function properly
		if (ssn.length() != 11) {
			correct = false;
		} else {
			
			if (!('0' <= ssn.charAt(0) && ssn.charAt(0) <= '9')) {
				correct = false;
		      }
		      if (!('0' <= ssn.charAt(1) && ssn.charAt(1) <= '9')) {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(2) && ssn.charAt(2) <= '9')) {
		        correct = false;
		      }
		      if (ssn.charAt(3) != '-') {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(4) && ssn.charAt(4) <= '9')) {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(5) && ssn.charAt(5) <= '9')) {
		        correct = false;
		      }
		      if (ssn.charAt(6) != '-') {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(7) && ssn.charAt(7) <= '9')) {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(8) && ssn.charAt(8) <= '9')) {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(9) && ssn.charAt(9) <= '9')) {
		        correct = false;
		      }
		      if (!('0' <= ssn.charAt(10) && ssn.charAt(10) <= '9')) {
		        correct = false;
		      }
		    }
			
			// These statements either show if the SSN isvalid or not
		    if (correct == true) {
		      System.out.println(ssn + " is a valid Social Security Number.");
		    } else {
		      System.out.println(ssn + " is an ivalid Social Security Number.");
		    }
	}
}


