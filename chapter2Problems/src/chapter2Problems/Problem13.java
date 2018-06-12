//13. Restaurant Bill
//Write a program that computes the tax and tip on a restaurant bill. The program should ask
//the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
//The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
//amount, tip amount, and total bill on the screen.


package chapter2Problems;
import java.util.Scanner;

public class Problem13 
{
	public static void main(String[] args) 
	{
		double priceOfMeal;
		double tax;
		double tip;
		double total;
		final double TAX = 0.0675;
		final double TIP = 0.20;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the charge for the meal: ");
		priceOfMeal = keyboard.nextDouble();
		
		tax = priceOfMeal * TAX;
		tip = priceOfMeal * TIP;
		total = priceOfMeal + tax + tip;
		
		System.out.println("Charge of meal: " + priceOfMeal);
		System.out.println("Tax amount: " + tax);
		System.out.println("Tip amount: " + tip);
		System.out.println("Total bill: " + total);
	}
	

}
