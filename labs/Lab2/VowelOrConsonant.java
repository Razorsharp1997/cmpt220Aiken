import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter a letter here
		System.out.print("Enter a character here: ");
		char ch = input.next( ).charAt(0);
		
		// Separates the values from the consonants. Basically specifies which letters are vowels.
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is a vowel."); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character "+ch+" is a consonent.");
		
		// If a character other than a letter is put in the code, then the code will not be valid.
		else
			System.out.println("# is an invalid input.");		
	}


}
