//11. Running the Race
//Write a program that asks for the names of three runners and the time, in minutes, it took
//each of them to finish a race. The program should display the names of the runners in the
//order that they finished.

package chapter3Problems;
import java.util.Scanner;

public class Problem10 
{

	public static void main(String[] args) 
	{
		String firstRunner;
		String secondRunner;
		String thirdRunner;
		double firstTime;
		double secondTime;
		double thirdTime;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of the first runner: ");
		firstRunner = keyboard.nextLine();
		
		System.out.println("Enter the first runner's time in minutes: ");
		firstTime = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter the name of the second runner: ");
		secondRunner = keyboard.nextLine();
		
		System.out.println("Enter the second runner's time in minutes: ");
		secondTime = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Enter the name of the third runner: ");
		thirdRunner = keyboard.nextLine();
		
		System.out.println("Enter the third runner's time in minutes: ");
		thirdTime = keyboard.nextDouble();

		if (firstTime < secondTime && firstTime < thirdTime)
		{
			System.out.println(firstRunner);
			
			if (secondTime < thirdTime)
			{
				System.out.println(secondRunner);
				System.out.println(thirdRunner);
			}
			else
			{
				System.out.println(thirdRunner);
				System.out.println(secondRunner);
			}
		}
		else if (secondTime < firstTime && secondTime < thirdTime)
		{
			System.out.println(secondRunner);
			
			if (firstTime < thirdTime)
			{
				System.out.println(firstRunner);
				System.out.println(thirdRunner);
			}
			else
			{
				System.out.println(thirdRunner);
				System.out.println(firstRunner);
			}
		}
		else if (thirdTime < firstTime && thirdTime < secondTime)
		{
			System.out.println(thirdRunner);
			
			if (firstTime < secondTime)
			{
				System.out.println(firstRunner);
				System.out.println(secondRunner);
			}
			else
			{
				System.out.println(secondRunner);
				System.out.println(firstRunner);
			}
		}
		
	}

}
