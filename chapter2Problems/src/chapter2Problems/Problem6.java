//6. Land Calculation
//One acre of land is equivalent to 43,560 square feet. Write a program that calculates the
//number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the
//tract of land by the size of an acre to get the number of acres.

package chapter2Problems;

public class Problem6 
{

	public static void main(String[] args) 
	{
		int acreOfLand, tractOfLand, numberOfAcres;
		
		acreOfLand = 43560;
		tractOfLand = 389767;
		numberOfAcres = tractOfLand / acreOfLand;
		
		System.out.println("Number of acres in a tract of land is: " + numberOfAcres);

	}

}
