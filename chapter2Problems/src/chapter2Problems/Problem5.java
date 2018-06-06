//5. Sales Prediction
//The East Coast sales division of a company generates 62 percent of total sales. Based on
//that percentage, write a program that will predict how much the East Coast division will
//generate if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to
//represent
//62 percent.

package chapter2Problems;

public class Problem5 
{

	public static void main(String[] args) 
	{
		double eastCoastSales, totalSales, eastCoastRevenue;
		
		eastCoastSales = 0.62; 
		totalSales = 4600000.00;
		eastCoastRevenue = totalSales * eastCoastSales;
		
		System.out.println("The East Coast division will generate: " + eastCoastRevenue);
	}

}
