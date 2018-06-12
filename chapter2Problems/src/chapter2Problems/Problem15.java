//15. Stock Commission
//Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stockbroker
//a 2 percent commission for the transaction. Write a program that calculates and
//displays the following:
//• The amount paid for the stock alone (without the commission)
//• The amount of the commission
//• The total amount paid (for the stock plus the commission)

package chapter2Problems;

public class Problem15 
{

	public static void main(String[] args) 
	{
		double stock;
		double commission;
		double total;
		
		stock = 600 * 21.77;
		commission = stock * .02;
		total = stock + commission;
		
		System.out.println("The amount paid for the stock alone (without the commission): " + stock);
		System.out.println("The amount of the commission: " + commission);
		System.out.println("The total amount paid (for the stock plus the commission): " + total);
	}

}
