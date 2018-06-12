//6. Time Calculator
//Write a program that asks the user to enter a number of seconds.
//There are 60 seconds in a minute. If the number of seconds entered by the user is
//greater than or equal to 60, the program should display the number of minutes in that
//many seconds.
//There are 3,600 seconds in an hour. If the number of seconds entered by the user is
//greater than or equal to 3,600, the program should display the number of hours in
//that many seconds.
//There are 86,400 seconds in a day. If the number of seconds entered by the user is
//greater than or equal to 86,400, the program should display the number of days in
//that many seconds.

package chapter3Problems;
import java.util.Scanner;

public class Problem5 
{

	public static void main(String[] args) 
	{
		int seconds;
		int minutes;
		int hours;
		int days;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number in seconds: ");
		seconds = keyboard.nextInt();
		
		
		minutes = seconds / 60;
		hours = seconds / 3600;
		days = seconds / 86400;
		
		if (seconds >= 60 && seconds < 3600)
		{
			System.out.println("The number of minutes in that many seconds is: " + minutes);
		}
		else if (seconds >= 3600 && seconds < 86400)
		{
			System.out.println("The number of hours in that many seconds is: " + hours);
		}
		else if (seconds >= 86400)
		{
			System.out.println("The number of days in that many seconds is: " + days);
		}
	}

}
