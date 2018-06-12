//1. Roman Numerals
//Write a program that prompts the user to enter a number within the range of 1 through 10.
//The program should display the Roman numeral version of that number. If the number is
//outside the range of 1 through 10, the program should display an error message.

package chapter3Problems;
import java.util.Scanner;

public class Problem1 
{

	public static void main(String[] args) 
	{
		double aNumber;
		
		Scanner keyboard = new Scanner(System.in);
		 
		
		System.out.print("Please enter a number within the range of 1 through 10: ");
		aNumber = keyboard.nextDouble();
		
		if (aNumber == 1)
		{
			System.out.println("I");
		}
		else if (aNumber == 2)
		{
			System.out.println("II");
		}
		else if (aNumber == 3)
		{
			System.out.println("III");
		} 
		else if (aNumber == 4)
		{
			System.out.println("IIII");
		}
		else if (aNumber == 5)
		{
			System.out.println("V");
		}
		else if (aNumber == 6)
		{
			System.out.println("VI");
		}
		else if (aNumber == 7)
		{
			System.out.println("VII");
		}
		else if (aNumber == 8)
		{
			System.out.println("VIII");
		}
		else if (aNumber == 9)
		{
			System.out.println("VIIII");
		}
		else if (aNumber == 10)
		{
			System.out.println("X");
		}
		else 
		{
			System.out.println("Error");
		}
	}
}

