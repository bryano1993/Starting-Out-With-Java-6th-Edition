//4. RetailItem Class
//Write a class named RetailItem that holds data about an item in a retail store. The class
//should have the following fields:
//• description. The description field references a String object that holds a brief
//description of the item.
//• unitsOnHand. The unitsOnHand field is an int variable that holds the number of units
//currently in inventory.
//• price. The price field is a double that holds the item’s retail price.
//Write a constructor that accepts arguments for each field, appropriate mutator methods
//that store values in these fields, and accessor methods that return the values in these fields.
//Once you have written the class, write a separate program that creates three RetailItem
//objects and stores the following data in them:
//The Personal
//Information
//Class Problem
//VideoNote
//Description Units on Hand Price
//Item #1 Jacket 12 59.95
//Item #2 Designer Jeans 40 34.95
//Item #3 Shirt 20 24.95

package chapter6Problems;

public class Problem4 
{

	public static void main(String[] args) 
	{
		Problem4class item1 = new Problem4class("Jacket", 12, 59.95);
		Problem4class item2 = new Problem4class("Designer Jeans", 40, 34.95);
		Problem4class item3 = new Problem4class("Shirt", 20, 24.95);
		
		 System.out.println("\t \t Description \t Units on Hand \t Price");
		 System.out.println("Item #1 \t " + item1.getDescription() + "\t \t" + item1.getUnitsOnHand() + "\t \t" + item1.getPrice());
		 System.out.println("Item #1 \t " + item2.getDescription() + "\t " + item2.getUnitsOnHand() + " \t \t" + item2.getPrice());
		 System.out.println("Item #1 \t " + item3.getDescription() + "\t \t" + item3.getUnitsOnHand() + "\t \t" + item3.getPrice());
		
	}

}
