//9. Miles-per-Gallon
//A car’s miles-per-gallon (MPG) can be calculated with the following formula:
//MPG = Miles driven / Gallons of gas used
//Write a program that asks the user for the number of miles driven and the gallons of gas
//used. It should calculate the car’s miles-per-gallon and display the result on the screen.

package chapter2Problems;
import javax.swing.JOptionPane;

public class Problem9 
{

	public static void main(String[] args) 
	{
		String inputMilesDriven;
		String inputGallonsOfGas;
		double milesDriven;
		double gallonsOfGas;
		double milesPerGallon;
		
		inputMilesDriven = JOptionPane.showInputDialog("How many miles did you drive today?");
		
		milesDriven = Double.parseDouble(inputMilesDriven);
		
		inputGallonsOfGas = JOptionPane.showInputDialog("How many gallons of gas did you use?");
		
		gallonsOfGas = Double.parseDouble(inputGallonsOfGas);
		
		milesPerGallon = milesDriven / gallonsOfGas;
		
		JOptionPane.showMessageDialog(null, "Miles-per-gallon: " + milesPerGallon);

		System.exit(0);
	}

}
