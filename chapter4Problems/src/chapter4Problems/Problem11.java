//11. Celsius to Fahrenheit Table
//Write a program that displays a table of the Celsius temperatures 0 through 20 and
//their Fahrenheit equivalents. The formula for converting a temperature from Celsius to
//Fahrenheit is
//F 5 95
//C 1 32
//where F is the Fahrenheit temperature and C is the Celsius temperature. Your program must
//use a loop to display the table.

package chapter4Problems;

public class Problem11 
{

	public static void main(String[] args) 
	{
		double fahrenheit;
		
		System.out.println("Celsius    Fahrenheit");
		System.out.println("------------------------");
		
		for(double celsius = 0;celsius  <= 20; celsius ++)
		{
			fahrenheit = (((double)9 / 5) * celsius) + 32;
			
			System.out.println(celsius + "\t\t" + fahrenheit);		
		}
		
	}

}
