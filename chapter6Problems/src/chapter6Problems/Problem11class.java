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

public class Problem11class 
{
	private double temperature;
	
	public Problem11class(double t)
	{
		temperature = t;
	}
	
	public Problem11class()
	{
		temperature = 0;
	}
	
	public void setTemperature(double t)
	{
		temperature = t;
	}
	
	public double getTemperature()
	{
		return temperature;
	}
	
	public boolean isEthylFreezing() 
	{
		if (temperature <= -173)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isEthylBoiliing()
	{
		if (temperature >= 172)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isOxygenFreezing()
	{
		if (temperature <= -173)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isOxygenBoiling()
	{
		if (temperature >= -306)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isWaterFreezing()
	{
		if (temperature <= 32)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public boolean isWaterBoiling()
	{
		if (temperature >= 212)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
}
