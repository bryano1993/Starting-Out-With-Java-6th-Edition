//17. Rock, Paper, Scissors Game
//Write a program that lets the user play the game of Rock, Paper, Scissors against the computer.
//The program should work as follows.
//1. When the program begins, a random number in the range of 1 through 3 is generated. If
//the number is 1, then the computer has chosen rock. If the number is 2, then the computer
//has chosen paper. If the number is 3, then the computer has chosen scissors. (Don’t
//display the computer’s choice yet.)
//2. The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard. (You
//can use a menu if you prefer.)
//3. The computer’s choice is displayed.
//4. A winner is selected according to the following rules:
//• If one player chooses rock and the other player chooses scissors, then rock wins. (The
//rock smashes the scissors.)
//• If one player chooses scissors and the other player chooses paper, then scissors wins.
//(Scissors cuts paper.)
//• If one player chooses paper and the other player chooses rock, then paper wins. (Paper
//wraps rock.)
//• If both players make the same choice, the game must be played again to determine
//the winner.
//Be sure to divide the program into methods that perform each major task.

package chapter5Problems;
import java.util.Scanner; 
import java.util.Random; 
public class Problem17 
{
	public static String computerSelection()
	{
		double randomNumber;
		String selection = "blank";
		
		
		Random randomNumbers = new Random();
		
		 
		 randomNumber = randomNumbers.nextInt(3) + 1;
		 
		 if(randomNumber == 1)
		 {
			 selection = "rock";
		 }
		 else if (randomNumber == 2)
		 {
			 selection = "paper";
		 }
		 else if (randomNumber == 3)
		 {
			 selection = "scissors";
		 }
		
		return selection;
	}
	
	public static String playerSelection()
	{
		double one;
		double two;
		double three;
		String selection;
	

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Please type one of the following  “rock”, “paper”, or “scissors”  ");
		selection = keyboard.nextLine();
		
		return selection;
	}
	
	public static String gameRules(String computer, String user)
	{
		String decision = "";
		
		if (user.equals("rock") && computer.equals("scissors"))
		{
			decision = "You win!";
		}
		else if (computer.equals("rock") && user.equals("scissors"))
		{
			decision = "You lose!";
		}
		else if (computer.equals("rock") && user.equals("rock"))
		{
			decision = "tie";
		}
		else if ( user.equals("scissors") && computer.equals("paper"))
		{
			decision = "You win!";
		}
		else if ( computer.equals("scissors") && user.equals("paper"))
		{
			decision = "You loose!";
		}
		else if ( computer.equals("scissors") && user.equals("scissors"))
		{
			decision = "tie";
		}
		else if ( user.equals("paper") && computer.equals("rock"))
			
		{
			decision = "You win!";
		}
		else if ( computer.equals("paper") && user.equals("rock"))
		{
			decision = "You Loose!";
		}
		else if ( computer.equals("paper") && user.equals("paper"))
		{
			decision = "tie";
		}
		

		
		return decision;
	}
	
	

	public static void main(String[] args) 
	{
		String decision = "blank";
		
		do
		{
		String user = playerSelection();
		String computer = computerSelection();
		System.out.println("The computer chose: " + computer);
		decision = gameRules(computer, user);
		System.out.println(decision);
		}
		while (decision.equals("tie"));
		
	}

}
