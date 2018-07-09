//11. Freezing and Boiling Points
//The following table lists the freezing and boiling points of several substances.
//Substance Freezing Point Boiling Point
//Ethyl Alcohol –173 172
//Oxygen –362 –306
//Water 32 212
//Design a class that stores a temperature in a temperature field and has the appropriate
//accessor and mutator methods for the field. In addition to appropriate constructors, the
//class should have the following methods:
//• isEthylFreezing. This method should return the boolean value true if the temperature
//stored in the temperature field is at or below the freezing point of ethyl alcohol.
//Otherwise, the method should return false.
//• isEthylBoiling. This method should return the boolean value true if the temperature
//stored in the temperature field is at or above the boiling point of ethyl alcohol.
//Otherwise, the method should return false.
//• isOxygenFreezing. This method should return the boolean value true if the temperature
//stored in the temperature field is at or below the freezing point of oxygen.
//Otherwise, the method should return false.
//• isOxygenBoiling. This method should return the boolean value true if the temperature
//stored in the temperature field is at or above the boiling point of oxygen. Otherwise,
//the method should return false.
//• isWaterFreezing. This method should return the boolean value true if the temperature
//stored in the temperature field is at or below the freezing point of water. Otherwise,
//the method should return false.
//• isWaterBoiling. This method should return the boolean value true if the temperature
//stored in the temperature field is at or above the boiling point of water. Otherwise,
//the method should return false.
//Write a program that demonstrates the class. The program should ask the user to enter a
//temperature, and then display a list of the substances that will freeze at that temperature
//and those that will boil at that temperature. For example, if the temperature is –20 the class
//should report that water will freeze and oxygen will boil at that temperature.

package chapter6Problems;

import java.util.Scanner;

public class Problem11 
{

	public static void main(String[] args) 
	{
		double input;
		
		Scanner keyboard = new Scanner(System.in);
		Problem11class temperature = new Problem11class();
		
		System.out.println("Please enter a temperature: ");
		input = keyboard.nextDouble();
		temperature.setTemperature(input);
		
		if (temperature.isOxygenFreezing())
		{
			System.out.println("Oxygen will freeze");
		}
		
		if (temperature.isEthylFreezing())
		{
			System.out.println("Ethyl will freeze");

		}
		
		if (temperature.isWaterFreezing())
		{
			System.out.println("Water will freeze");
		}
		
		
		if (temperature.isEthylBoiliing())
		{
			System.out.println("Ethyl will boil");
		
		}
		
		if (temperature.isOxygenBoiling())
		{
			System.out.println("Oxygen will boil");
		}
		
		if (temperature.isWaterBoiling())
		{
			System.out.println("Water will boil");
		}
		
	}

}
