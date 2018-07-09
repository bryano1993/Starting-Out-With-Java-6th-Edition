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

import java.util.Random;

public class DiceGame 
{
	private int value;
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void roll()
	{
		Random rand = new Random();
		
		value = rand.nextInt(6) + 1; 
	}
	
	
}
