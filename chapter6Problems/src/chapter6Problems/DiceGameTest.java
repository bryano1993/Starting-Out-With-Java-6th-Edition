//14. Dice Game
//Write a program that uses the Die class that was presented in this chapter to play a simple
//dice game between the computer and the user. The program should create two instances of
//the Die class (each a 6-sided die). One Die object is the computer’s die, and the other Die
//object is the user’s die.
//The program should have a loop that iterates 10 times. Each time the loop iterates, it should
//roll both dice. The die with the highest value wins. (In case of a tie, there is no winner for
//that particular roll of the dice.)
//As the loop iterates, the program should keep count of the number of times the computer
//wins, and the number of times that the user wins. After the loop performs all of its iterations,
//the program should display who was the grand winner, the computer or the user.


package chapter6Problems;

public class DiceGameTest 
{

	public static void main(String[] args) 
	{
		int playerWins = 0;
		int computerWins = 0;
		
		DiceGame diePlayer = new DiceGame();
		DiceGame dieComputer = new DiceGame();
		
		System.out.println("Welcome to the dice game!");
		
		for(int i = 0; i < 10; i ++ )
		{	
	
			int playerValue;
			int computerValue;
		
			diePlayer.roll();
			dieComputer.roll();
			playerValue = diePlayer.getValue();
			computerValue = dieComputer.getValue();
			
			if(playerValue > computerValue)
			{
				System.out.println("You win!");
				playerWins += 1;
			}
			else if (playerValue == computerValue)
			{
				System.out.println("Its a tie!");
			}
			else if (playerValue < computerValue)
			{
				System.out.println("You loose!");
				computerWins += 1;
			}
		}	
		
		System.out.println("Your total win count is: " + playerWins);
		System.out.println("The computer's total win count is : " + computerWins);
		
		if(playerWins > computerWins)
		{
			System.out.println("You're the grand winner");
		} 
		else if(playerWins == computerWins)
		{
			System.out.println("It's a grand tie");
		}
		else
		{
			System.out.println("The computer is the grand winner");
		}
		

	}

}
