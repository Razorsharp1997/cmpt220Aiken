import java.util.Random;
import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {
	    String choice, choice1;
	    int num = 0;
	    Random r = new Random();
	    num = r.nextInt(3);
	    
	    // Enter either rock, paper, or scissor here
	    System.out.println("Choose: Rock, Paper or Scissors.");
	    Scanner userChoice = new Scanner(System.in);
	    choice1 = userChoice.next();
	    choice = choice1.toLowerCase();


	    // If rock is entered, shows the outcome of what the result on the computer may be
	    switch (num){
	    case 0:
	        String num1 = "rock";
	        System.out.println("System chose Rock"); 
	        if (choice.matches(num1)){
	            System.out.println("Its a tie!");

	            }
	        else if (choice.matches("paper")){
	            System.out.println("You win!");

	        }
	        else if (choice.matches("scissors")){
	            System.out.println("You lose!");
	        }
	        else {
	            System.out.println();
	            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
	        }
	    break;
	    
	    // If paper is entered, shows the outcome of what the result on the computer may be
	    case 1:
	        String num2 = "paper";
	        System.out.println("System chose Paper");
	        if (choice.matches(num2)){
	            System.out.println("Its a tie!");

	        }
	        else if (choice.matches("scissors")){
	            System.out.println("You win!");

	        }
	        else if (choice.matches("rock")){
	            System.out.println("You lose!");
	        }
	        else {
	            System.out.println();
	            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
	        }
	    break;
	    
	    // If scissors is entered, shows the outcome of what the result on the computer may be
	    case 2: 
	        String num3 = "scissors";
	        System.out.println("System chose Scissors");
	        if (choice.matches(num3)){
	            System.out.println("Its a tie!");

	        }
	        else if (choice.matches("rock")){
	            System.out.println("You win!");

	        }
	        else if (choice.matches("paper")){
	            System.out.println("You lose!");
	        }
	        else {
	            System.out.println();
	            System.out.println("ERROR: Please choose Rock, Paper or Scissors");
	        }
	    break;

	}

	}
}
