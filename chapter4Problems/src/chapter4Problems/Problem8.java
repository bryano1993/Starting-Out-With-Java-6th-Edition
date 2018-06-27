//8. Average Rainfall
//Write a program that uses nested loops to collect data and calculate the average rainfall
//over a period of years. First the program should ask for the number of years. The outer loop
//will iterate once for each year. The inner loop will iterate 12 times, once for each month.
//Each iteration of the inner loop will ask the user for the inches of rainfall for that month.
//After all iterations, the program should display the number of months, the total inches of
//rainfall, and the average rainfall per month for the entire period.
//Input Validation: Do not accept a number less than 1 for the number of years. Do not
//accept negative numbers for the monthly rainfall.


package chapter4Problems;
import java.util.Scanner;

public class Problem8
{

	public static void main(String[] args)
	{
		int years;
		int months;
		int rainfall = 0;
		int totalMonths = 0;
		int totalRainfall = 0;
		int month = 1;
		int averageRainFall;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Average Rainfall");
		
		System.out.println("Please enter the number of years: ");
		years = keyboard.nextInt();
		
		while (years < 1)
		{
			System.out.println("Please enter a positive nonzero integer value for years: ");
			years = keyboard.nextInt();
		}

		for (int year = 1; year <= years; year++ )
		{
			

			for(month = 1; month <= 12; month ++) 
			{
				
				
				if (month == 1)
				{
					System.out.println("Please enter inches of rainfall for Janurary: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 2)
				{
					System.out.println("Please enter inches of rainfall for Feburary: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 3)
				{
					System.out.println("Please enter inches of rainfall for March: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 4)
				{
					System.out.println("Please enter inches of rainfall for April: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 5)
				{
					System.out.println("Please enter inches of rainfall for May: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 6)
				{
					System.out.println("Please enter inches of rainfall for June: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 7)
				{
					System.out.println("Please enter inches of rainfall for July: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 8)
				{
					System.out.println("Please enter inches of rainfall for August: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 9)
				{
					System.out.println("Please enter inches of rainfall for September: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 10)
				{
					System.out.println("Please enter inches of rainfall for October: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 11)
				{
					System.out.println("Please enter inches of rainfall for November: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				else if(month == 12)
				{
					System.out.println("Please enter inches of rainfall for  December: ");
					rainfall = keyboard.nextInt();
					while (rainfall < 0)
					{
					System.out.println("Please enter a positive integer value for rainfall in inches: ");
					rainfall = keyboard.nextInt();
					}
				}
				
				totalMonths = totalMonths + 1;
				totalRainfall = totalRainfall + rainfall;
				
			}
		}
		
		averageRainFall = totalRainfall / totalMonths;
		System.out.println("The total amount of months were: " + totalMonths);
		System.out.println("The total amount of rainfall in inches were: " + totalRainfall);
		System.out.println("The average amount of rainfall was: " + averageRainFall);
		
	}

}
