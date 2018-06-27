//17. Random Number Guessing Game
//Write a program that generates a random number and asks the user to guess what the
//number is. If the user’s guess is higher than the random number, the program should display
//“Too high, try again.” If the user’s guess is lower than the random number, the program
//should display “Too low, try again.” The program should use a loop that repeats until the
//user correctly guesses the random number.

package chapter4Problems;
import java.util.Random;
import java.util.Scanner;

public class Problem17 
{

	public static void main(String[] args) 
	{
		int randomNumber;
		int guessNumber;
		
		
		Random randomNumbers = new Random();
		randomNumber = randomNumbers.nextInt(11);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Random Number Guessing Game");
		
		System.out.println("Please guess what the random number is: ");
		guessNumber = keyboard.nextInt();
		
		while (guessNumber > randomNumber)
		{
			System.out.println("Too high, try again: ");
			guessNumber = keyboard.nextInt();	
		}
		
		while (guessNumber < randomNumber)
		{
			System.out.println("Too low, try again. ");
			guessNumber = keyboard.nextInt();	
		}
		
		if(guessNumber == randomNumber)
		{
			System.out.println("You win! ");
		}
		
	}

}
