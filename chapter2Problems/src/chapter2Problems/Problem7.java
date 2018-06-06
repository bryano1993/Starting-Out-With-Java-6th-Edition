//7. Sales Tax
//Write a program that will ask the user to enter the amount of a purchase. The program
//should then compute the state and county sales tax. Assume the state sales tax is 4 percent
//and the county sales tax is 2 percent. The program should display the amount of the purchase,
//the state sales tax, the county sales tax, the total sales tax, and the total of the sale
//(which is the sum of the amount of purchase plus the total sales tax). Hint: Use the value
//0.02 to represent 2 percent, and 0.04 to represent 4 percent.

package chapter2Problems;
import java.util.Scanner;

public class Problem7 
{

	public static void main(String[] args) 
	{
		double purchase,stateSalesTax, countySalesTax, totalSalesTax, total;
		final double STATE_SALES_TAX = 0.04;
		final double COUNTY_SALES_TAX = 0.02;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the amount of the purchase: ");
		purchase = keyboard.nextDouble();
		
		stateSalesTax = purchase * STATE_SALES_TAX;
		countySalesTax = purchase * COUNTY_SALES_TAX;
		totalSalesTax = stateSalesTax + countySalesTax;
		total = purchase + totalSalesTax;
		
		System.out.println("The amount of the purchase is: " + purchase );
		System.out.println("State sales tax: " + stateSalesTax);
		System.out.println("County sales tax: " + countySalesTax);
		System.out.println("Total sales tax: " + totalSalesTax);
		System.out.println("Total of the sale: " + total);
		
	}

}
