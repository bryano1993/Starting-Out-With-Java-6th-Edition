//12. Bar Chart
//Write a program that asks the user to enter today’s sales for five stores. The program should
//display a bar chart comparing each store’s sales. Create each bar in the bar chart by displaying
//a row of asterisks. Each asterisk should represent $100 of sales. Here is an example of
//the program’s output:
//Enter today's sales for store 1: 1000 [Enter]
//Enter today's sales for store 2: 1200 [Enter]
//Enter today's sales for store 3: 1800 [Enter]
//Enter today's sales for store 4: 800 [Enter]
//Enter today's sales for store 5: 1900 [Enter]
//SALES BAR CHART
//Store 1: **********
//Store 2: ************
//Store 3: ******************
//Store 4: ********
//Store 5: *******************

package chapter4Problems;
import java.util.Scanner;

public class Problem12 
{

	public static void main(String[] args) 
	{
		int store1;
		int store2;
		int store3;
		int store4;
		int store5;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Bar Chart");
		
		System.out.println("Enter today's sales for store 1: ");
		store1 = keyboard.nextInt();
		
		System.out.println("Enter today's sales for store 2: ");
		store2 = keyboard.nextInt();
		
		System.out.println("Enter today's sales for store 3: ");
		store3 = keyboard.nextInt();
		
		System.out.println("Enter today's sales for store 4: ");
		store4 = keyboard.nextInt();
		
		System.out.println("Enter today's sales for store 5: ");
		store5 = keyboard.nextInt();
		
		System.out.println("SALES BAR CHART");
		
		System.out.print("Store 1:");
		
		for(int firstStore = 0; firstStore < store1; firstStore += 100) 
		{
			System.out.print("*");
		}
		
		System.out.println("");
		
		System.out.print("Store 2:");
			
		for(int secondStore = 0; secondStore < store2; secondStore += 100) 
		{
			System.out.print("*");
		}
		
		System.out.println("");
		
		System.out.print("Store 3:");
		
		for(int thirdStore = 0; thirdStore < store3; thirdStore += 100) 
		{
			System.out.print("*");
		}
		
		System.out.println("");
		
		System.out.print("Store 4:");
		
		for(int fourthStore = 0; fourthStore < store4; fourthStore += 100) 
		{
			System.out.print("*");
		}
		
		System.out.println("");
		
		System.out.print("Store 5:");
		
		for(int fifthStore = 0; fifthStore < store5; fifthStore += 100) 
		{
			System.out.print("*");
		}

	}

}
