//21. Dice Game
//Write a program that plays a simple dice game between the computer and the user. When
//the program runs, a loop should repeat 10 times. Each iteration of the loop should do the
//following:
//• Generate a random integer in the range of 1 through 6. This is the value of the
//computer’s
//die.
//• Generate another random integer in the range of 1 through 6. This is the value of the
//user’s die.
//• The die with the highest value wins. (In case of a tie, there is no winner for that
//particular
//roll of the dice.)
//As the loop iterates, the program should keep count of the number of times the computer
//wins, and the number of times that the user wins. After the loop performs all of its iterations,
//the program should display who was the grand winner, the computer or the user.

package chapter4Problems;

import java.util.Random;

public class Problem21 
{

	public static void main(String[] args) 
	{
		int randomComputerNumber;
		int randomUserNumber;
		int computerWinCount = 0;
		int userWinCount = 0;
		
		Random randomNumbers = new Random();
		
		System.out.println("Dice Game");
		
		for(int i  = 0; i < 10; i ++)
		{
			randomComputerNumber = randomNumbers.nextInt(6) + 1;
			randomUserNumber = randomNumbers.nextInt(6) + 1;
			
			if (randomComputerNumber > randomUserNumber)
			{
				System.out.println("The computer rolled a " + randomComputerNumber + ".You rolled a " + randomUserNumber + ".The computer's roll was higher. The computer wins this round :(");
				computerWinCount ++;
			}
			else if (randomComputerNumber == randomUserNumber)
			{
				System.out.println("The computer rolled a " + randomComputerNumber + ".You rolled a " + randomUserNumber +   ". Its a tie!");
			}
			else
			{
				System.out.println("The computer rolled a " + randomComputerNumber + ".You rolled a " + randomUserNumber +   ". Your roll was higher. You win this round!");
				userWinCount ++;
			}
		}
		
		if (computerWinCount > userWinCount)
		{
			System.out.println("The grand winner is the computer! The computer won" + computerWinCount + "rounds. and you won " + userWinCount + " Sorry you lost.");
		}
		else if (computerWinCount == userWinCount) 
		{
			System.out.println("Its a tie! You won " + userWinCount + " rounds. and the computer won " + computerWinCount);

		}
		else
		{
			System.out.println("The grand winner is you!! You won " + userWinCount + " rounds. and the computer won " + computerWinCount);
		}

	}

}
