//3. Distance File
//Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it
//writes the report to a file instead of the screen. Open the file in Notepad or another text
//editor to confirm the output.

package chapter4Problems;
import java.util.Scanner;
import java.io.*;


public class Problem3 
{

	public static void main(String[] args) throws IOException
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
		
		PrintWriter outputFile = new PrintWriter("Problemtest.txt");
		outputFile.println("Hour    Distance Traveled");
		outputFile.println("------------------------");
		
		for (int i = 1; i <= hours; i++ )
		{
			distance = speed * i;
			
			outputFile.println(i + "\t\t" + distance);		
		}
		
		outputFile.close();
	}

}