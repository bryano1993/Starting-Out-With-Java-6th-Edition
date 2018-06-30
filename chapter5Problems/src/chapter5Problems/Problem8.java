//8. Conversion Program
//Write a program that asks the user to enter a distance in meters. The program will then present
//the following menu of selections:
//1. Convert to kilometers
//2. Convert to inches
//3. Convert to feet
//4. Quit the program
//The program will convert the distance to kilometers, inches, or feet, depending on the user’s
//selection. Here are the specific requirements:
//• Write a void method named showKilometers, which accepts the number of meters as
//an argument. The method should display the argument converted to kilometers. Convert
//the meters to kilometers using the following formula:
//kilometers = meters * 0.001
//• Write a void method named showInches, which accepts the number of meters as an
//argument. The method should display the argument converted to inches. Convert the
//meters to inches using the following formula:
//inches = meters * 39.37
//• Write a void method named showFeet, which accepts the number of meters as an
//argument. The method should display the argument converted to feet. Convert the
//meters to feet using the following formula:
//feet = meters * 3.281
//• Write a void method named menu that displays the menu of selections. This method
//should not accept any arguments.
//• The program should continue to display the menu until the user enters 4 to quit the
//program.
//• The program should not accept negative numbers for the distance in meters.
//• If the user selects an invalid choice from the menu, the program should display an
//error message.

package chapter5Problems;

import java.util.Scanner;

public class Problem8 
{
	
	public static void showKilometers(double meters)
	{
		double kilometers;
		
		kilometers = meters * 0.001;
		System.out.println(meters + " meters is " + kilometers + " kilometers.");
		
		menu();
	}
	
	public static void showInches(double meters)
	{
		double inches;
		
		inches = meters * 39.37;
		System.out.println(meters + " meters is " + inches + " inches.");
		
		menu();
	}
	
	public static void showFeet(double meters)
	{
		double feet;
		
		feet = meters * 3.281;
		System.out.println(meters + " meters is " + feet + " feet.");
		
		menu();
	}
	
	public static void menu()
	{
		double meters;
		double options;
		double kilometers;
		double inches;
		double feet;
		
		Scanner keyboard = new Scanner(System.in);
		
	
		do 
		{
			System.out.println("Enter a distance in meters:  ");
			meters = keyboard.nextDouble();
		}while (meters < 0);
		
		System.out.println("Please enter 1,2,3,4 as options:  ");
		System.out.println("1. Convert to kilometers ");
		System.out.println("2. Convert to inches ");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
		options = keyboard.nextDouble();
		
		if (options == 1)
		{
			showKilometers(meters);
		}
		else if (options == 2)
		{
			showInches(meters);
		}
		else if (options == 3)
		{
			showFeet(meters);
		}
		else if (options == 4 )
		{
			System.exit(0);
		}
		else if (options > 4)
		{
			System.out.println("Error re run the program again");
		}
		
		
	}

	public static void main(String[] args) 
	{
		double meters;
		double options;
		double kilometers;
		double inches;
		double feet;
		
		Scanner keyboard = new Scanner(System.in);
		
	
		do 
		{
			System.out.println("Enter a distance in meters:  ");
			meters = keyboard.nextDouble();
		}while (meters < 0);
		
		System.out.println("Please enter 1,2,3,4 as options:  ");
		System.out.println("1. Convert to kilometers ");
		System.out.println("2. Convert to inches ");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
		options = keyboard.nextDouble();
		
		
		if (options == 1)
		{
			showKilometers(meters);
		}
		else if (options == 2)
		{
			showInches(meters);
		}
		else if (options == 3)
		{
			showFeet(meters);
		}
		else if (options == 4 )
		{
			System.exit(0);
		}
		else if (options > 4)
		{
			System.out.println("Error re run the program again");
			menu();
		}
		

	}

}
