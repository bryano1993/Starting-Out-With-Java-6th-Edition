//17. Ingredient Adjuster
//A cookie recipe calls for the following ingredients:
//• 1.5 cups of sugar
//• 1 cup of butter
//• 2.75 cups of flour
//The recipe produces 48 cookies with these amounts of the ingredients. Write a program
//that asks the user how many cookies he or she wants to make, and then displays the number
//of cups of each ingredient needed for the specified number of cookies.

package chapter2Problems;
import java.util.Scanner;

public class Problem17 
{

	public static void main(String[] args) 
	{
		double cookies;
		double sugarCount = 1.5;
		double butterCount = 1;
		double flourCount = 2.75;
		double cookiesCount = 48;
		
		double resultSugar;
		double resultButter;
		double resultFlour;
		double resultCount;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many cookies do you want to make: ");
		cookies = keyboard.nextDouble();
		
		resultSugar = ( cookies / cookiesCount) * sugarCount;
		resultButter =  ( cookies / cookiesCount) * butterCount;
		resultFlour = ( cookies / cookiesCount) * flourCount;
		
		System.out.println(resultSugar + " cups of sugar");
		System.out.println(resultButter + " cups of butter");
		System.out.println(resultFlour + " cups of flour");

	}

}
