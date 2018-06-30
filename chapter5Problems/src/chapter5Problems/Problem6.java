//6. Celsius Temperature Table
//The formula for converting a temperature from Fahrenheit to Celsius is
//C 5 5
//9
//(F 2 32)
//where F is the Fahrenheit temperature and C is the Celsius temperature. Write a method
//named celsius that accepts a Fahrenheit temperature as an argument. The method
//should return the temperature, converted to Celsius. Demonstrate the method by calling
//it in a loop that displays a table of the Fahrenheit temperatures 0 through 20 and their
//Celsius equivalents.

package chapter5Problems;

public class Problem6 
{
	public static double celcius(double f)
	{
		double celcius;
	
		celcius = ((double)5/ 9) * (f - 32);
		
		return celcius;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Fahrenheit     Celcius");
		System.out.println("------------------------");
		
		for(double fahrenheit = 0; fahrenheit  <= 20; fahrenheit ++)
		{
			double ctemp;
			
			ctemp = celcius(fahrenheit);
			System.out.println(fahrenheit + "\t\t" + ctemp);		
		}

	}

}
