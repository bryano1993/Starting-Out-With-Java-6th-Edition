//9. Shipping Charges
//The Fast Freight Shipping Company charges the following rates:
//Weight of Package Rate per 500 Miles Shipped
//2 pounds or less $1.10
//Over 2 pounds but not more than 6 pounds $2.20
//Over 6 pounds but not more than 10 pounds $3.70
//Over 10 pounds $3.80
//The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is
//shipped 550 miles, the charges would be $2.20. Write a program that asks the user to enter
//the weight of a package and then displays the shipping charges.

package chapter3Problems;
import java.util.Scanner;

public class Problem8 
{

	public static void main(String[] args) 
	{
		double weight;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the weight of the package: ");
		weight = keyboard.nextDouble();
		
		if (weight <= 2)
		{
			System.out.println("The shipping charge is $1.10 ");
		} 
		else if (weight > 2 && weight <= 6)
		{
			System.out.println("The shipping charge is $2.20");
		}
		else if (weight > 6 && weight <= 10)
		{
			System.out.println("The shipping charge is $3.70");
		}
		else if (weight > 10)
		{
			System.out.println("The shipping charge is $3.80");
		}
		
		
	}

}
