//19. Stock Transaction Program
//Last month Joe purchased some stock in Acme Software, Inc. Here are the details of
//the purchase:
//• The number of shares that Joe purchased was 1,000.
//• When Joe purchased the stock, he paid $32.87 per share.
//• Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
//for the stock.
//Two weeks later Joe sold the stock. Here are the details of the sale:
//• The number of shares that Joe sold was 1,000.
//• He sold the stock for $33.92 per share.
//He paid his stockbroker another commission that amounted to 2% of the amount he
//received for the stock.
//Write a program that displays the following information:
//• The amount of money Joe paid for the stock.
//• The amount of commission Joe paid his broker when he bought the stock.
//• The amount that Joe sold the stock for.
//• The amount of commission Joe paid his broker when he sold the stock.
//• Display the amount of profit that Joe made after selling his stock and paying the two
//commissions to his broker. (If the amount of profit that your program displays is a
//negative number, then Joe lost money on the transaction.)


package chapter2Problems;

public class Problem19 
{

	public static void main(String[] args) 
	{
		double payment;
		double commisionPayment;
		double paymentTotal;
		double soldStock;
		double soldCommision;
		double soldTotal;
		double profit;
		
		payment = 32.87 * 1000;
		commisionPayment = payment * .02;
		paymentTotal = payment - commisionPayment;
		System.out.println("The amount of money Joe paid for the stock was " + payment);
		System.out.println("The amount of commission Joe paid his broker when he bought the stock was " + commisionPayment);
		
		
		soldStock = 33.92 * 1000;
		soldCommision = soldStock * .02;
		soldTotal = soldStock - soldCommision;
		System.out.println("The amount that Joe sold the stock for was " + soldStock);
		System.out.println("The amount of commission Joe paid his broker when he sold the stock was " + soldCommision);
		
		profit = soldTotal - paymentTotal;
		System.out.println("Profit made was " + profit);
		
	}

}
