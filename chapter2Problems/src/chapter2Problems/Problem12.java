//12. String Manipulator
//Write a program that asks the user to enter the name of his or her favorite city. Use a String
//variable to store the input. The program should display the following:
//• The number of characters in the city name
//• The name of the city in all uppercase letters
//• The name of the city in all lowercase letters
//• The first character in the name of the city

package chapter2Problems;
import java.util.Scanner;

public class Problem12 
{

	public static void main(String[] args) 
	{
		String favoriteCity;
		String capitalizeCity;
		String lowerCaseCity;
		char firstLetter;
		int stringSize;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the name of your favorite city: ");
		favoriteCity = keyboard.nextLine();
		
		stringSize = favoriteCity.length();
		capitalizeCity = favoriteCity.toUpperCase();
		lowerCaseCity = favoriteCity.toLowerCase();
		firstLetter = favoriteCity.charAt(0);
		
		System.out.println("The number of characters in the city name: " + stringSize);
		System.out.println("The name of the city in all uppercase letters: " + capitalizeCity);
		System.out.println("The name of the city in all lowercase letters: " + lowerCaseCity);
		System.out.println("The first character in the name of the city: " + firstLetter);
	}

}
