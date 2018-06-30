//10. Stock Profit
//The profit from the sale of a stock can be calculated as follows:
//Profit 5 ((NS 3 SP) 2 SC) 2 ((NS 3 PP) 1 PC)
//where NS is the number of shares, PP is the purchase price per share, PC is the purchase
//commission paid, SP is the sale price per share, and SC is the sale commission paid. If the
//calculation yields a positive value, then the sale of the stock resulted in a profit. If the calculation
//yields a negative number, then the sale resulted in a loss.
//Write a method that accepts as arguments the number of shares, the purchase price per
//share, the purchase commission paid, the sale price per share, and the sale commission
//paid. The method should return the profit (or loss) from the sale of stock. Demonstrate the
//method in a program that asks the user to enter the necessary data and displays the amount
//of the profit or loss.

package chapter5Problems;

import java.util.Scanner;

public class Problem10 
{
	public static double stockProfit(double ns, double pp, double pc, double sp, double sc)
	{
		double profit;
		
		profit = ((ns * sp) - sc) - ((ns * pp) + pc);
		
		return profit;
	}
	

	public static void main(String[] args) 
	{
		double ns;
		double pp;
		double pc;
		double sp;
		double sc;
		double stock;
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Please enter number of sales:  ");
		ns = keyboard.nextDouble();
		
		System.out.println("Please enter purchase price per share:  ");
		pp = keyboard.nextDouble();
		
		System.out.println("Please enter purchase commision paid:  ");
		pc = keyboard.nextDouble();
		
		System.out.println("Please enter the sale price per share:  ");
		sp = keyboard.nextDouble();
		
		System.out.println("Please enter the sale commission paid:  ");
		sc = keyboard.nextDouble();
		
		stock = stockProfit(ns, pp, pc, sp, sc);
		
		if (stock > 0)
		{
			System.out.println("You profit " + stock);
		}
		else if ( stock < 0)
		{
			System.out.println("Sorry you did not profit but instead lost " + stock);
		}

	}

}
