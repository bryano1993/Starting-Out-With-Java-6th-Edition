//5. Mass and Weight
//Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the
//amount of mass that an object has, you can calculate its weight, in Newtons, with the following
//formula:
//Weight 5 Mass 3 9.8
//Write a program that asks the user to enter an object’s mass, and then calculate its weight.
//If the object weighs more than 1,000 Newtons, display a message indicating that it is too
//heavy. If the object weighs less than 10 Newtons, display a message indicating that the
//object is too light.



package chapter3Problems;
import java.util.Scanner;

public class Problem4 
{

	public static void main(String[] args) 
	{
		double mass;
		double weight;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter an object's mass in kilograms: ");
		mass = keyboard.nextDouble();
		
		weight = mass * 9.8;
		
		if(weight > 1000)
		{
			System.out.println("This object is to heavy");
		}
		else if (weight < 10)
		{
			System.out.println("This object is too light");
		}
		else 
		{
			System.out.printf("The object weighs %.2f newtons",weight );
		}
	}

}
