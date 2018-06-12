//10. Fat Gram Calculator
//Write a program that asks the user to enter the number of calories and fat grams in a food
//item. The program should display the percentage of the calories that come from fat. One
//gram of fat has 9 calories; therefore:
//Calories from fat 5 Fat grams * 9
//The percentage of calories from fat can be calculated as follows:
//Calories from fat 4 Total calories
//If the calories from fat are less than 30 percent of the total calories of the food, it should
//also display a message indicating the food is low in fat.


package chapter3Problems;

import java.util.Scanner;

public class Problem9 
{

	public static void main(String[] args) 
	{
		double calories;
		double calories30Percent;
		double fat;
		double caloriesFromFat;
		double percentageFromFat;
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of calories in grams in a food item: ");
		calories = keyboard.nextDouble();
		
		System.out.println("Please enter the number of fat in grams in a food item: ");
		fat = keyboard.nextDouble();

		caloriesFromFat = fat * 9;
		percentageFromFat = caloriesFromFat / calories;
		
		calories30Percent = calories * .30;
		
		if (caloriesFromFat < calories30Percent)
		{
			System.out.println("The percentage of calories that come from fat is: " + percentageFromFat);
			System.out.println("This food is also low if fat");
		}
		else if (caloriesFromFat > calories)
		{
			System.out.println("Error, the input value is invalid");
		}
		else
		{
			System.out.println("The percentage of calories that come from fat is: " + percentageFromFat);
		}
		
		
	}

}
