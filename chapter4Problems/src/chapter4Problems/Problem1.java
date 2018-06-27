//1. Sum of Numbers
//Write a program that asks the user for a positive nonzero integer value. The program should
//use a loop to get the sum of all the integers from 1 up to the number entered. For example,
//if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50.

package chapter4Problems;
import java.util.Scanner;

public class Problem1 
{

	public static void main(String[] args) 
	{
		int input = 3;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a positive nonzero integer value: ");
		input = keyboard.nextInt();
		
		while (input < 1)
		{
			System.out.println("Please enter a positive nonzero integer value: ");
			input = keyboard.nextInt();
		}
		
		
		for (int number = 1; number <= input; number++ )
		{
			sum = sum + number;
		}
		
		System.out.println("The sum of " + input + " is: " + sum);
		
	}

}
