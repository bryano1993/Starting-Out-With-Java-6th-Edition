//5. Letter Counter
//Write a program that asks the user to enter a string, and then asks the user to enter a character.
//The program should count and display the number of times that the specified character
//appears in the string.

package chapter4Problems;
import java.util.Scanner;

public class Problem5 
{

	public static void main(String[] args) 
	{
		String aString;
		String aChar;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("The great Letter Counter!");
		
		System.out.println("Please enter an awesome string: ");
		aString = keyboard.nextLine();
		
		System.out.println("Please enter a character: ");
		aChar= keyboard.nextLine();

	}

}
