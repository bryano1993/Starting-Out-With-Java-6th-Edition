//18. Random Number Guessing Game Enhancement
//Enhance the program that you wrote for Programming Challenge 17 so it keeps a count
//of the number of guesses that the user makes. When the user correctly guesses the random
//number, the program should display the number of guesses.



package chapter4Problems;
import java.util.Random;
import java.util.Scanner;

public class Problem18 
{
	public static void main(String[] args) 
	{
		int randomNumber;
		int guessNumber;
		int count = 0;
		
		
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
			count ++;
		}
		
		while (guessNumber < randomNumber)
		{
			System.out.println("Too low, try again. ");
			guessNumber = keyboard.nextInt();	
			count ++;
		}
		
		if(guessNumber == randomNumber)
		{
			count ++;
			System.out.println("You win! ");
			System.out.println("The number of guesses it took you was: " + count);
		}
		
	}
}
