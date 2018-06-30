//7. Test Average and Grade
//Write a program that asks the user to enter five test scores. The program should display
//a letter grade for each score and the average test score. Write the following methods in
//the program:
//• calcAverage—This method should accept five test scores as arguments and return the
//average of the scores.
//• determineGrade—This method should accept a test score as an argument and return a
//letter grade for the score, based on the following grading scale:
//Score Letter Grade
//90–100 A
//80–89 B
//70–79 C
//60–69 D
//Below 60 F

package chapter5Problems;
import java.util.Scanner;

public class Problem7 
{
	public static double calcAverage(double score1, double score2, double score3, double score4, double score5)
	{
		double average;
		
		average = (score1 + score2 + score3 + score4 + score5) / 5;
		
		return average;
	}
	
	public static char determineGrade(double score)
	{
		
		char theScore = ' ';
		
		if (score < 60)
		{
			theScore = 'F';
		}
		else if (score >= 60 && score <= 69)
		{
			theScore = 'D';
		}
		else if (score >= 70 && score <= 79)
		{
			theScore = 'C';
		}
		else if (score >= 80 && score <= 89)
		{
			theScore = 'B';
		}
		else if ( score >= 90 && score <= 100)
		{
			theScore = 'A';
		}
		
		return theScore;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		double score1 = 80;
		double score2 = 90;
		double score3 = 80.50;
		double score4 = 70;
		double score5 = 50;

		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first test score: ");
		score1 = keyboard.nextDouble();
		
		System.out.println("That is a " +  determineGrade(score1));
		
		System.out.println("Please enter the second test score: ");
		score2 = keyboard.nextDouble();
		
		System.out.println("That is a " +  determineGrade(score2));
		
		System.out.println("Please enter the third test score: ");
		score3 = keyboard.nextDouble();
		
		System.out.println("That is a " +  determineGrade(score3));
		
		System.out.println("Please enter the fourth test score: ");
		score4 = keyboard.nextDouble();
		
		System.out.println("That is a " +  determineGrade(score4));
		
		System.out.println("Please enter the fifth test score: ");
		score5 = keyboard.nextDouble();
		
		System.out.println("That is a " +  determineGrade(score5));
		
		System.out.println("The average score is " + calcAverage(score1, score2, score3, score4, score5));
		
		
		

	}

}
