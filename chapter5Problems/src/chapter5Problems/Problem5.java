//5. Falling Distance
//When an object is falling because of gravity, the following formula can be used to determine
//the distance the object falls in a specific time period:
//d 5 ½ gt2
//The variables in the formula are as follows: d is the distance in meters, g is 9.8, and t is the
//amount of time, in seconds, that the object has been falling.
//Write a method named fallingDistance that accepts an object’s falling time (in seconds) as
//an argument. The method should return the distance, in meters, that the object has fallen
//during that time interval. Demonstrate the method by calling it in a loop that passes the
//values 1 through 10 as arguments, and displays the return value.

package chapter5Problems;

public class Problem5 
{
	public static double fallingDistance(double fallingTime)
	{
		double distance;
		
		distance = ((double)1 / 2) * 9.8 *  Math.pow(2, fallingTime);
		
		return distance;
	}
	

	public static void main(String[] args) 
	{
		for(double currentTime = 1; currentTime < 10; currentTime ++)
		{
			System.out.println(fallingDistance(currentTime));
		}

	}
	
}
