//8. Software Sales
//A software company sells a package that retails for $99. Quantity discounts are given
//according to the following table:
//Quantity Discount
//10–19 20%
//20–49 30%
//50–99 40%
//100 or more 50%
//Write a program that asks the user to enter the number of packages purchased. The program
//should then display the amount of the discount (if any) and the total amount of the
//purchase after the discount.

package chapter3Problems;
import java.util.Scanner;

public class Problem7
{
	public static void main(String[] args) 
	{
		int amount;
		double total;
		double price;
		double discount20;
		double discount20Result;
		double discount30;
		double discount30Result;
		double discount40;
		double discount40Result;
		double discount50;
		double discount50Result;
		

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of packages to be purchased: ");
		amount = keyboard.nextInt();
		
		
		if (amount >= 10 && amount <= 19)
		{	
			total = amount * 99;
			discount20 = total * .20;
			discount20Result = total - discount20;
			System.out.println("Each package retails for $99 but you get a 20% discount. ");
			System.out.printf("The total amount of the purchase after the discount is: %.2f", discount20Result);
		}
		else if (amount >= 20 && amount <= 49)
		{
			total = amount * 99;
			discount30 = total * .30;
			discount30Result = total - discount30;
			System.out.println("Each package retails for $99 but you get a 30% discount. ");
			System.out.printf("The total amount of the purchase after the discount is:  %.2f", discount30Result);
		}
		else if (amount >= 50 && amount <= 99)
		{
			total = amount * 99;
			discount40 = amount * 99 * .40;
			discount40Result = total - discount40;
			System.out.println("Each package retails for $99 but you get a 40% discount. ");
			System.out.printf("The total amount of the purchase after the discount is: %.2f ", discount40Result);
		}
		else if (amount >= 100)
		{
			total = amount * 99;
			discount50 = amount * 99 * .50;
			discount50Result = total - discount50;
			System.out.println("Each package retails for $99 but you get a 50% discount. ");
			System.out.printf("The total amount of the purchase after the discount is: %.2f ", discount50Result);
		}
		else 
		{	price = amount * 99;
			System.out.printf("Each package retails for $99. Sorry no discount: %.2f", price);
		}
		
		
		
	}
	
}
