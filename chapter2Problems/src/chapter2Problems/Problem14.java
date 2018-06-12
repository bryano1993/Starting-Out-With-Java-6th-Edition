//14. Male and Female Percentages
//Write a program that asks the user for the number of males and the number of females registered
//in a class. The program should display the percentage of males and females in the class.
//Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class.
//The percentage of males can be calculated as 8 4 20 5 0.4, or 40%. The percentage of
//females can be calculated as 12 4 20 5 0.6, or 60%.

package chapter2Problems;
import java.util.Scanner;

public class Problem14 
{

	public static void main(String[] args) 
	{
		double maleStudent;
		double femaleStudent;
		double total;
		double malePercentage;
		double femalePercentage;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of male students in the class: ");
		maleStudent = keyboard.nextDouble();
		
		System.out.println("Please enter the number of female students in the class: ");
		femaleStudent = keyboard.nextDouble();

		total = maleStudent + femaleStudent;
		malePercentage = (maleStudent / total) * 100;
		femalePercentage = (femaleStudent / total) * 100;
		
		System.out.println("The percentage of male that are in the class are: " + malePercentage);
		System.out.println("The percentage of female that are in the class are: " + femalePercentage);
	}

}
