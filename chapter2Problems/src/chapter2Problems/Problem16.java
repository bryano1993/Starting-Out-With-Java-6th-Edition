//16. Energy Drink Consumption
//A soft drink company recently surveyed 12,467 of its customers and found that approximately
//14 percent of those surveyed purchase one or more energy drinks per week. Of those
//customers who purchase energy drinks, approximately 64 percent of them prefer citrusflavored
//energy drinks. Write a program that displays the following:
//• The approximate number of customers in the survey who purchase one or more
//energy drinks per week
//• The approximate number of customers in the survey who prefer citrus-flavored
//energy drinks


package chapter2Problems;
import javax.swing.JOptionPane;

public class Problem16 
{

	public static void main(String[] args) 
	{
		double customerOneOrMore;
		double customerCitrusFlavor;
		
		customerOneOrMore = 12467 * .14;
		customerCitrusFlavor = customerOneOrMore * .64;
	
		JOptionPane.showMessageDialog(null, "The approximate number of customers in the survey who purchase one or more: " + customerOneOrMore + "\n" +
		"The approximate number of customers in the survey who prefer citrus-flavored energy drinks: " + customerCitrusFlavor );
		
		System.exit(0);
	}

}
