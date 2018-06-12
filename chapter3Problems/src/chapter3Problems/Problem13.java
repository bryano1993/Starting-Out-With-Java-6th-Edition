//13. Internet Service Provider
//An Internet service provider has three different subscription packages for its customers:
//Package A: For $9.95 per month 10 hours of access are provided. Additional hours
//are $2.00 per hour.
//Package B: For $13.95 per month 20 hours of access are provided. Additional hours
//are $1.00 per hour.
//Package C: For $19.95 per month unlimited access is provided.
//Write a program that calculates a customer’s monthly bill. It should ask the user to enter
//the letter of the package the customer has purchased (A, B, or C) and the number of hours
//that were used. It should then display the total charges.



package chapter3Problems;

import java.util.Scanner;

public class Problem13 
{

	public static void main(String[] args) 
	{
		
		String internetPackage;
		double hours;
		double bill;
		double additionalHours;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Your monthly internet bill options ");
		System.out.println("Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour. ");
		System.out.println("Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour. ");
		System.out.println("Package C: For $19.95 per month unlimited access is provided. ");
		
		System.out.println("Please enter which package you want by entering its character identifier (A,B,C) ");
		internetPackage = keyboard.nextLine();
		
		System.out.println("Please enter the number of hours that were used ");
		hours = keyboard.nextDouble();
		
		if (internetPackage.equals("A"))
		{
			if(hours <= 10)
			{
				System.out.println("Your total charge is 9.95 per month ");
			}
			else if ( hours > 10)
			{
				additionalHours = ((hours - 10) * 2.00) + 9.95;
				System.out.println("Your total charge is " + additionalHours + " per month");
			}
		}
		else if (internetPackage.equals("B"))
		{
			if (hours <= 20)
			{
				System.out.println("Your total charge is 13.95 per month");
			}
			else if (hours > 20)
			{
				additionalHours = ((hours - 20) * 1.00) + 13.95;
				System.out.println("Your total charge is " + additionalHours + " per month");
			}
		}
		else if (internetPackage.equals("C"))
		{
			System.out.println("Your total charge per month is 19.95 ");
		}

	}

}
