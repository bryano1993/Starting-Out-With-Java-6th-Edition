//22. Slot Machine Simulation
//A slot machine is a gambling device that the user inserts money into and then pulls a lever
//(or presses a button). The slot machine then displays a set of random images. If two or more
//of the images match, the user wins an amount of money that the slot machine dispenses
//back to the user.
//Create a program that simulates a slot machine. When the program runs, it should do
//the following:
//• Asks the user to enter the amount of money he or she wants to enter into the slot machine.
//• Instead of displaying images, the program will randomly select a word from the
//following
//list:
//Cherries, Oranges, Plums, Bells, Melons, Bars
//To select a word, the program can generate a random number in the range of 0
//through 5. If the number is 0, the selected word is Cherries; if the number is 1, the
//selected word is Oranges; and so forth. The program should randomly select a word
//from this list three times and display all three of the words.
//• If none of the randomly selected words match, the program will inform the user that
//he or she has won $0. If two of the words match, the program will inform the user
//that he or she has won two times the amount entered. If three of the words match, the
//program will inform the user that he or she has won three times the amount entered.
//• The program will ask whether the user wants to play again.  If so, these steps are
//repeated. If not, the program displays the total amount of money entered into the slot
//machine and the total amount won.Decision Structures



package chapter4Problems;
import java.util.Random;
import java.util.Scanner;

public class Problem22 
{

	public static void main(String[] args) 
	{
		int randomNumber;
		int randomNumber1;
		int randomNumber2;
		int amount;
		int amountTimesTwo = 0;
		int amountTimesThree = 0;
		int count = 0;
		String selection1 = "none";
		String selection2 = "none";
		String selection3 = "none";
		char playAgain;
		String input;
		
		
		Random randomNumbers = new Random();
		randomNumber = randomNumbers.nextInt(6);
		randomNumber1 = randomNumbers.nextInt(6);
		randomNumber2 = randomNumbers.nextInt(6);
		
		
		Scanner keyboard = new Scanner(System.in);
		
		do
		{		
		System.out.println("Slot Machine Simulation");
		
		System.out.println("How much money would you like to put into the machine?");
		amount = keyboard.nextInt();
		
		
		
			
		if (randomNumber == 0)
		{
			selection1 = "Cherries";
		}
		else if (randomNumber == 1)
		{
			selection1 = "Oranges";
		}
		else if(randomNumber == 2)
		{
			selection1 = "Plums";
		}
		else if(randomNumber == 3)
		{
			selection1 = "Bells";
		}
		else if(randomNumber == 4)
		{
			selection1 = "Melons";
		}
		else if(randomNumber == 5)
		{
			selection1 = "Bars";
		}
		
		System.out.println(selection1);
		
		
		if (randomNumber1 == 0)
		{
			selection2 = "Cherries";
		}
		else if (randomNumber1 == 1)
		{
			selection2 = "Oranges";
		}
		else if(randomNumber1 == 2)
		{
			selection2 = "Plums";
		}
		else if(randomNumber1 == 3)
		{
			selection2 = "Bells";
		}
		else if(randomNumber1 == 4)
		{
			selection2 = "Melons";
		}
		else if(randomNumber1 == 5)
		{
			selection2 = "Bars";
		}
		
		System.out.println(selection2);
		
		
		if (randomNumber2 == 0)
		{
			selection3 = "Cherries";
		}
		else if (randomNumber2 == 1)
		{
			selection3 = "Oranges";
		}
		else if(randomNumber2 == 2)
		{
			selection3 = "Plums";
		}
		else if(randomNumber2 == 3)
		{
			selection3 = "Bells";
		}
		else if(randomNumber2 == 4)
		{
			selection3 = "Melons";
		}
		else if(randomNumber2 == 5)
		{
			selection3 = "Bars";
		}
		
		System.out.println(selection3);
		
		
		 amountTimesThree = amount * 3;
		
		if (selection1.equals(selection2) || selection1.equals(selection3) || selection2.equals(selection3) )
		{
			 amount = amount * 2;
			System.out.println("Congrats you earn two times the amount you put in " + amount);
		}
		else if (selection1.equals(selection2) && selection1.equals(selection3))
		{
			amount = amount * 3;
			System.out.println("Congrats you earn 3 times the amount you put in!!! " + amountTimesThree);
		}
		else
		{
			amount = 0;
			System.out.println("You won " + amount + " dollars");
		}
		
		count = count + amount;
		System.out.println("Your total is " + count);
		
		input = keyboard.nextLine();
		
		System.out.println("Would you like to play again? please type y or n");
		input = keyboard.nextLine();
		playAgain = input.charAt(0);
		
		} while (playAgain == 'y' || playAgain == 'Y');
		
	}

}
