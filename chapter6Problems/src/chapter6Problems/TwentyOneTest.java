//10. A Game of Twenty-One
//For this assignment, you will write a program that lets the user play against the computer in
//a variation of the popular blackjack card game. In this variation of the game, two six-sided
//dice are used instead of cards. The dice are rolled, and the player tries to beat the computer’s
//hidden total without going over 21.
//Here are some suggestions for the game’s design:
//• Each round of the game is performed as an iteration of a loop that repeats as long as
//the player agrees to roll the dice, and the player’s total does not exceed 21.
//• At the beginning of each round, the program will ask the user whether or not he or
//she wants to roll the dice to accumulate points.
//• During each round, the program simulates the rolling of two six-sided dice. It rolls the
//dice first for the computer, and then it asks the user whether he or she wants to roll.
//(Use the Die class that was shown in Code Listing 6-14 to simulate the dice.)
//• The loop keeps a running total of both the computer’s and the user’s points.
//• The computer’s total should remain hidden until the loop has finished.
//• After the loop has finished, the computer’s total is revealed, and the player with the
//most points, without going over 21, wins.

package chapter6Problems;
import java.util.Scanner;

public class TwentyOneTest {

	public static void main(String[] args) 
	{	
		int playerCount = 0;
		int computerCount = 0;
		String decision = null;
	
		TwentyOne diePlayer1 = new TwentyOne();
		TwentyOne diePlayer2 = new TwentyOne();
		TwentyOne dieComputer1 = new TwentyOne();
		TwentyOne dieComputer2 = new TwentyOne();
		
		Scanner keyboard = new Scanner(System.in);
			
			int playerValue1;
			int playerValue2;
			int computerValue1;
			int computerValue2;
			int computerScore;
			int playerScore;
				
			System.out.println("Welcome to a game of 21!");
			do
			{
			
			for(int i = 0; i < 1; i ++ )
			{	
				dieComputer1.roll();
				dieComputer2.roll();
				computerValue1 = dieComputer1.getValue();
				computerValue2 = dieComputer2.getValue();
				computerScore = computerValue1 + computerValue2;
				computerCount += computerScore;
				System.out.println("The computer rolled a 2 6 sided dices.");
				
				System.out.println("Would you like to roll a 2 6 sided dices? ( Y or N)");
				decision = keyboard.next();	
				
			if (decision.contains("Y"))
			{
				diePlayer1.roll();
				diePlayer2.roll();			
				playerValue1 = diePlayer1.getValue(); 
				playerValue2 = diePlayer2.getValue();
				playerScore = playerValue1 + playerValue2;
				playerCount += playerScore;
				System.out.println("You rolled a " + playerValue1 + " and a " + playerValue2 + " which adds up to be " + playerScore);
				System.out.println("Your total is " + playerCount);
			} 
			else if( (decision.contains("N")))
			{
				System.out.println("The computer rolled a total of " + computerCount);
				System.out.println("You rolled a total of " + playerCount);
				
				if (playerCount > 21 )
				{
					System.out.println("You lose");
				}	
				else if(computerCount > 21)
				{
					System.out.println("You win!");
				}
				
				else if(playerCount > 21 && computerCount > 21  )
				{
					System.out.println("You both lose");
				}
				else if(playerCount > computerCount && playerCount <= 21)
				{
					System.out.println("You win!");
				}
				else if (playerCount == computerCount)
				{
					System.out.println("The game is a draw");
				}
				else if (playerCount < computerCount && computerCount <= 21)
				{
					System.out.println("You lose!");
				}
			}
		}
	
		} while(playerCount <= 21 && decision.contains("Y"));
			
		if (playerCount > 21)
		{
			System.out.println("You lose!");
		}
	}

}
