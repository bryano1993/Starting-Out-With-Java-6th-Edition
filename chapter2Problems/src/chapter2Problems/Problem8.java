//8. Cookie Calories
//A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
//10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
//user enter the number of cookies he or she actually ate and then reports the number of total
//calories consumed.



package chapter2Problems;
import java.util.Scanner;


public class Problem8 
{

	public static void main(String[] args) 
	{
		double cookies, caloriesConsumed, servings;
		final double ONE_SERVING = 4;
		final double CALORIES_PER_SERVING = 300;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("There are 40 cookies in the bag. How many did you eat out of the 40? ");
		cookies = keyboard.nextDouble();
		
		servings = cookies / ONE_SERVING;
		caloriesConsumed = servings * CALORIES_PER_SERVING;
		
		System.out.println("Number of total calories consumed: " + caloriesConsumed);
	}

}
