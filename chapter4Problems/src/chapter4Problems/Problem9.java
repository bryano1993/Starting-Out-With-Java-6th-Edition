//9. Population
//Write a program that will predict the size of a population of organisms. The program
//should ask for the starting number of organisms, their average daily population increase
//(as a percentage), and the number of days they will multiply. For example, a population
//might begin with two organisms, have an average daily increase of 50 percent, and will be
//allowed to multiply for seven days. The program should use a loop to display the size of
//the population for each day.
//Input Validation: Do not accept a number less than 2 for the starting size of the population.
//Do not accept a negative number for average daily population increase. Do not accept a
//number less than 1 for the number of days they will multiply.

package chapter4Problems;
import java.util.Scanner;

public class Problem9 
{

	public static void main(String[] args) 
	{
		double organisms;
		double populationIncrease;
		double days;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Population");
		
		System.out.println("Please enter the starting number of organisms: ");
		organisms = keyboard.nextDouble();
		
		while (organisms < 2)
		{
			System.out.println("Please enter a number greater than 1: ");
			organisms = keyboard.nextDouble();
		}
		
		System.out.println("Please enter the organisms average daily population increase (as a perctenage): ");
		populationIncrease = keyboard.nextDouble();
		
		while (populationIncrease < 0)
		{
			System.out.println("Please enter a positive value: ");
			populationIncrease = keyboard.nextDouble();
		}
		
		populationIncrease = populationIncrease / 100;
		
		System.out.println("Please enter the number of days they will multiply for: ");
		days = keyboard.nextInt();
		
		while (days < 1)
		{
			System.out.println("Please enter a number greater than 0: ");
			days = keyboard.nextInt();
		}
		
		System.out.println("Day    Size Of Population");
		System.out.println("------------------------");
		
		for(int day = 1; day <= days; day ++)
		{
			organisms = organisms * populationIncrease;
			
			System.out.println(day + "\t\t" + organisms);		
		}
		
	}

}
