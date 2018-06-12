//10. Test Average
//Write a program that asks the user to enter three test scores. The program should display
//each test score, as well as the average of the scores.

package chapter2Problems;
import javax.swing.JOptionPane;


public class Problem10 
{

	public static void main(String[] args) 
	{
		String inputTestOne;
		String inputTestTwo;
		String inputTestThree;
		double testOne;
		double testTwo;
		double testThree;
		double average;
		
		
		inputTestOne = JOptionPane.showInputDialog("Enter Test Score One");
		
		testOne = Double.parseDouble(inputTestOne);
		
		inputTestTwo = JOptionPane.showInputDialog("Enter Test Score Two");
		
		testTwo = Double.parseDouble(inputTestTwo);
		
		inputTestThree = JOptionPane.showInputDialog("Enter Test Score Three");
		
		testThree = Double.parseDouble(inputTestThree);
		
		average = (testOne + testTwo + testThree) / 3;

		JOptionPane.showMessageDialog(null, "test score one: " + testOne + "\n" + "test score two: " + testTwo + "\n" +
									   "test score three: " + testThree + "\n" + "average test score: " + average);
		
		System.exit(0);
	}

}
