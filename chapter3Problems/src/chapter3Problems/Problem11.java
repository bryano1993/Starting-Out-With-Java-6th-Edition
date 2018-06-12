//12. The Speed of Sound
//The following table shows the approximate speed of sound in air, water, and steel:
//Medium Speed
//Air 1,100 feet per second
//Water 4,900 feet per second
//Steel 16,400 feet per second
//Write a program that asks the user to enter “air”, “water”, or “steel”, and the distance that
//a sound wave will travel in the medium. The program should then display the amount of
//time it will take. You can calculate the amount of time it takes sound to travel in air with
//the following formula:
//Time 5 Distance / 1,100
//You can calculate the amount of time it takes sound to travel in water with the following
//formula:
//Time 5 Distance / 4,900
//You can calculate the amount of time it takes sound to travel in steel with the following
//formula:
//Time 5 Distance / 16,400


package chapter3Problems;
import java.util.Scanner;

public class Problem11 
{

	public static void main(String[] args) 
	{
		String element;
		double distance;
		double time;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter air,water, or steel: ");
		element = keyboard.nextLine();
		
		System.out.println("Please enter the distance that a sound wave will travel in the medium: ");
		distance = keyboard.nextDouble();
		
		if (element.equals("air"))
		{
			time = distance / 1100;
			System.out.println("The amount of time it will take to travel this distance is: " + time);

		} 
		else if (element.equals("water"))
		{
			time = distance / 4900;
			System.out.println("The amount of time it will take to travel this distance is: " + time);
		}
		else if (element.equals("steel"))
		{
			time = distance / 16400;
			System.out.println("The amount of time it will take to travel this distance is: " + time);
		}
		

	}

}
