//12. SavingsAccount Class
//Design a SavingsAccount class that stores a savings account’s annual interest rate and balance.
//The class constructor should accept the amount of the savings account’s starting
//balance. The class should also have methods for subtracting the amount of a withdrawal,
//adding the amount of a deposit, and adding the amount of monthly interest to the balance.
//The monthly interest rate is the annual interest rate divided by twelve. To add the monthly
//interest to the balance, multiply the monthly interest rate by the balance, and add the result
//to the balance.
//Test the class in a program that calculates the balance of a savings account at the end of a
//period of time. It should ask the user for the annual interest rate, the starting balance, and
//the number of months that have passed since the account was established. A loop should
//then iterate once for every month, performing the following:
//a. Ask the user for the amount deposited into the account during the month. Use the
//class method to add this amount to the account balance.
//b. Ask the user for the amount withdrawn from the account during the month. Use the
//class method to subtract this amount from the account balance.
//c. Use the class method to calculate the monthly interest.
//After the last iteration, the program should display the ending balance, the total amount of
//deposits, the total amount of withdrawals, and the total interest earned.

package chapter6Problems;
import java.util.Scanner;

public class Problem12 
{

	public static void main(String[] args) 
	{
		double annualInterestRate;
		double startingBalance;
		double months;
		double deposit;
		double withdraw;
		
		Scanner keyboard = new Scanner(System.in);
		Problem12class savings = new Problem12class();
		
		
		System.out.println("SavingsAccount Class");
		
		System.out.println("Please enter your annual interest rate");
		annualInterestRate = keyboard.nextDouble();
		savings.setAnnualInterestRate(annualInterestRate);
		
		System.out.println("Please enter your starting balance");
		startingBalance = keyboard.nextDouble();
		savings.setBalance(startingBalance);
		
		System.out.println("Please enter the amount of months that have passed since the account was established");
		months = keyboard.nextDouble();
		
		for (int i = 1; i <= months; i++)
		{
			System.out.println("Please enter the amount deposited into the account this month");
			deposit = keyboard.nextDouble();
			savings.desposit(deposit);
			
			System.out.println("Please enter the amount withdrawn from the account this month");
			withdraw = keyboard.nextDouble();
			savings.withdraw(withdraw);
			
			savings.monthlyInterestRate();	
		}
		
		System.out.println("The ending balance is " + savings.getBalance());
		System.out.println("The total amount of interest earned is " + savings.monthlyInterestRate());
	}

}
