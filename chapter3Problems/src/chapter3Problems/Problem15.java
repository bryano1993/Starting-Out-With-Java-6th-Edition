//15. Bank Charges
//A bank charges a base fee of $10 per month, plus the following check fees for a commercial
//checking account:
//$.10 each for less than 20 checks
//$.08 each for 20–39 checks
//$.06 each for 40–59 checks
//$.04 each for 60 or more checks
//Write a program that asks for the number of checks written for the month. The program
//should then calculate and display the bank’s service fees for the month.


package chapter3Problems;

import java.util.Scanner;

public class Problem15 
{

	public static void main(String[] args) 
	{
		final double BASE_FEE = 10;
		double checksWritten;
		double fee;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your checks written for the month: ");
		checksWritten = keyboard.nextInt();
		
		if (checksWritten < 20)
		{
			fee = .10 * checksWritten + BASE_FEE;
			System.out.println("The bank's service fee for the month is: " + fee);
		}
		else if (checksWritten >= 20 && checksWritten <= 39)
		{
			fee = .08 * checksWritten + BASE_FEE;
			System.out.println("The bank's service fee for the month is: " + fee);
		}
		else if (checksWritten >= 40 && checksWritten <= 59)
		{
			fee = .06 * checksWritten + BASE_FEE;
			System.out.println("The bank's service fee for the month is: " + fee);
		}
		else if (checksWritten >= 60)
		{
			fee = .04 * checksWritten + BASE_FEE;
			System.out.println("The bank's service fee for the month is: " + fee);
		}

	}

}
