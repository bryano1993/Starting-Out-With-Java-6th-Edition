//7. Sorted Names
//Write a program that asks the user to enter three names, and then displays the names sorted
//in ascending order. For example, if the user entered “Charlie”, “Leslie”, and “Andy”, the
//program would display:
//Andy
//Charlie
//Leslie


package chapter3Problems;

import java.util.Scanner;

public class Problem6 
{

	public static void main(String[] args) 
	{
		String firstName;
		String secondName;
		String thirdName;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		firstName = keyboard.nextLine();
		
		System.out.println("Enter the second name : ");
		secondName = keyboard.nextLine();
		
		System.out.println("Enter the third name : ");
		thirdName = keyboard.nextLine();
		
		if (firstName.compareTo(secondName) < 0 && firstName.compareTo(thirdName) < 0)
		{
			System.out.println(firstName);
			
			if (secondName.compareTo(thirdName) < 0)
			{
				System.out.println(secondName);
				System.out.println(thirdName);
			} 
			else
			{
				System.out.println(thirdName);
				System.out.println(secondName);
			}
				
		} 
		else if (secondName.compareTo(firstName) < 0 && secondName.compareTo(thirdName) < 0)
		{
			System.out.println(secondName);
			
			if (firstName.compareTo(thirdName) < 0)
			{
				System.out.println(firstName);
				System.out.println(thirdName);
			} 
			else
			{
				System.out.println(thirdName);
				System.out.println(firstName);
			}
			
		}
		else if (thirdName.compareTo(firstName) < 0 && thirdName.compareTo(secondName) < 0)
		{
			System.out.println(thirdName);
			
			if (firstName.compareTo(secondName) < 0)
			{
				System.out.println(firstName);
				System.out.println(secondName);
			} 
			else
			{
				System.out.println(secondName);
				System.out.println(firstName);
			}
		}
		

	}

}
