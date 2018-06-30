//2. Retail Price Calculator
//Write a program that asks the user to enter an item’s wholesale cost and its markup percentage.
//It should then display the item’s retail price. For example:
//• If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
//item’s retail price is 10.00.
//• If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
//item’s retail price is 7.50.
//The program should have a method named calculateRetail that receives the wholesale
//cost and the markup percentage as arguments, and returns the retail price of the item.

package chapter5Problems;
import java.util.Scanner;

public class Problem2 
{
	
	
	
	
	public static void calculateRetail(double theCost, double theMarkupPercentage)
	{
		double retailPrice;
		
		theMarkupPercentage = theMarkupPercentage / 100;
		retailPrice = (theCost * theMarkupPercentage) + theCost;
		 
		System.out.printf("The retail price of the item is %.2f ", retailPrice);
	}
	
	public static void main(String[] args) 
	{
		
		double wholesaleCost;
		double markupPercentage;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Retial Price Calculator");
		
		System.out.println("Please enter an items wholesale cost:");
		wholesaleCost = keyboard.nextDouble();
		
		System.out.println("Please enter the items markup percentage:");
		markupPercentage = keyboard.nextDouble();
		
		calculateRetail(wholesaleCost, markupPercentage);
	}

}
