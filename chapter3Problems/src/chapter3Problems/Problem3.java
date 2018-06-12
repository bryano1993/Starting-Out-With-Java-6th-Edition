//4. Test Scores and Grade
//Write a program that has variables to hold three test scores. The program should ask the
//user to enter three test scores and then assign the values entered to the variables. The program
//should display the average of the test scores and the letter grade that is assigned for
//the test score average. Use the grading scheme in the following table:
//Test Score Average Letter Grade
//90–100 A
//80–89 B
//70–79 C
//60–69 D
//Below 60 F


package chapter3Problems;
import java.util.Scanner;

public class Problem3 
{

	public static void main(String[] args) 
	{
		double score1;
		double score2;
		double score3;
		double average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the first test score: ");
		score1 = keyboard.nextDouble();
		
		System.out.print("Please enter the second test score: ");
		score2 = keyboard.nextDouble();
		
		System.out.print("Please enter the third test score: ");
		score3 = keyboard.nextDouble();
		
		average = (score1 + score2 + score3) / 3;
		
		if (average < 60)
		{
			System.out.print("Your average test score is " + average + " which is an F");
		}
		else if (average >= 60 && average <= 69)
		{
			System.out.print("Your average test score is " + average + " which is a D");
		}
		else if (average >= 70 && average <= 79)
		{
			System.out.print("Your average test score is " + average + " which is a C");
		}
		else if ( average >= 80 && average <= 89)
		{
			System.out.print("Your average test score is " + average + " which is a B");
		}
		else if ( average >= 90 && average <= 100)
		{
			System.out.print("Your average test score is " + average + " which is a A");
		}
		else 
		{
			System.out.print("Error score out of score range");
		}
	}

}



