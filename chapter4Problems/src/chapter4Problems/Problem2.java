//2. Distance Traveled
//The distance a vehicle travels can be calculated as follows:
//Distance 5 Speed * Time
//For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
//120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the
//number of hours it has traveled. It should use a loop to display the distance a vehicle has
//traveled for each hour of a time period specified by the user. For example, if a vehicle is
//traveling at 40 mph for a three-hour time period, it should display a report similar to the
//one that follows:
//Input Validation: Do not accept a negative number for speed and do not accept any value
//less than 1 for time traveled.


package chapter4Problems;
import java.util.Scanner;

public class Problem2 
{

	public static void main(String[] args) 
	{
		int speed;
		int hours;
		int distance;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Distance traveled");
		
		System.out.println("How fast is your car going (mph):");
		speed = keyboard.nextInt();
		
		while (speed < 0)
		{
			System.out.println("Please enter a positive integer value for speed: ");
			speed = keyboard.nextInt();
		}
		
		System.out.println("How many hours did you travel for: ");
		hours = keyboard.nextInt();
		
		while (hours < 1)
		{
			System.out.println("Please enter a positive nonzero integer value for hours: ");
			hours = keyboard.nextInt();
		}
		
		System.out.println("Hour    Distance Traveled");
		System.out.println("------------------------");
		
		for (int i = 1; i <= hours; i++ )
		{
			distance = speed * i;
			
			System.out.println(i + "\t\t" + distance);		
		}

	}

}
