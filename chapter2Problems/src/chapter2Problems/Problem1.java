//1. Name, Age, and Annual Income
//Write a program that declares the following:
//� a String variable named name
//� an int variable named age
//� a double variable named annualPay
//Store your age, name, and desired annual income as literals in these variables. The program
//should display these values on the screen in a manner similar to the following:
//My name is Joe Mahoney, my age is 26 and
//I hope to earn $100000.0 per year.

package chapter2Problems;

public class Problem1 {

	public static void main(String[] args) 
	{
		String name = "Bryan";
		int age = 24;
		double annualPay = 20000.00;
		
		System.out.println("My name is " + name + ", my age is " + age + " and");
		System.out.print("I hope to earn $" + annualPay + " per year.");
	}

}
