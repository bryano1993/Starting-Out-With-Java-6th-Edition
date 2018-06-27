//4. Pennies for Pay
//Write a program that calculates the amount a person would earn over a period of time if his
//or her salary is one penny the first day, two pennies the second day, and continues to double
//each day. The program should display a table showing the salary for each day, and then
//show the total pay at the end of the period. The output should be displayed in a dollar
//amount, not the number of pennies.
//Input Validation: Do not accept a number less than 1 for the number of days worked.

package chapter4Problems;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) 
	{
		int payPeriod;
		double salary = 0;
		double cents = .01;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Pennies for pay");
		
		System.out.println("How many days is your pay period: ");
		payPeriod = keyboard.nextInt();
		
		while (payPeriod < 1)
		{
			System.out.println("Please enter a positive nonzero integer value for the amount of days in your pay period: ");
			payPeriod = keyboard.nextInt();
		}
		
		System.out.println("Day    Salary for that Day");
		System.out.println("------------------------");
		
		for (int day = 1; day <= payPeriod; day++ )
		{
			salary = salary + cents;
			System.out.println(day + "\t\t" + salary);		
		}


	}

}
