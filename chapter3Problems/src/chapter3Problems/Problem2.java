//3. Body Mass Index
//Write a program that calculates and displays a person’s body mass index (BMI). The BMI is
//often used to determine whether a person with a sedentary lifestyle is overweight or underweight
//for his or her height. A person’s BMI is calculated with the following formula:
//BMI 5 Weight 3 703 / Height2
//where weight is measured in pounds and height is measured in inches. The program should
//display a message indicating whether the person has optimal weight, is underweight, or is
//overweight. A sedentary person’s weight is considered optimal if his or her BMI is between
//18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI
//value is greater than 25, the person is considered overweight.

package chapter3Problems;
import java.util.Scanner;

public class Problem2 
{

	public static void main(String[] args) 
	{
		double weight;
		double height;
		double bmi;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your weight in lbs: ");
		weight = keyboard.nextDouble();
		
		System.out.print("Please enter your height in inches: ");
		height = keyboard.nextDouble();
		
		bmi = (weight * 703) / (height * height);
		
		if (bmi < 18.5) 
		{
			System.out.print("You are underweight");
		}
		else if (bmi > 25)
		{
			System.out.print("You are overweight");
		}
		else if (bmi >= 18.5 && bmi <= 25 )
		{
			System.out.print("You are an optimal weight");
		}
		
	}

}
