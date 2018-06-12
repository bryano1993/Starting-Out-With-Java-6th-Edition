//11. Circuit Board Profit
//An electronics company sells circuit boards at a 40 percent profit. If you know the retail
//price of a circuit board, you can calculate its profit with the following formula:
//Profit = Retail price × 0.4
//Write a program that asks the user for the retail price of a circuit board, calculates the
//amount of profit earned for that product, and displays the results on the screen.

package chapter2Problems;
import java.util.Scanner;

public class Problem11 
{

	public static void main(String[] args) 
	{
		double retailPrice;
		double profit;
		final double PROFIT_PERCENTAGE = 0.4;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the retail price of the circuit board? ");
		retailPrice = keyboard.nextDouble();

		profit =retailPrice * PROFIT_PERCENTAGE;
		
		System.out.println("The amount of profit earned for the product is: " + profit);
	}

}
