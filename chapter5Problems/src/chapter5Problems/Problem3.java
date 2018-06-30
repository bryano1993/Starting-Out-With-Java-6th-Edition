//3. Rectangle Area—Complete the Program
//If you have downloaded the book’s source code from www.pearsonhighered.com/gaddis,
//you will find a partially written program named AreaRectangle.java in this chapter’s
//source code folder. Your job is to complete the program. When it is complete, the program
//will ask the user to enter the width and length of a rectangle, and then display the rectangle’s
//area. The program calls the following methods, which have not been written:
//• getLength—This method should ask the user to enter the rectangle’s length, and then
//return that value as a double.
//• getWidth—This method should ask the user to enter the rectangle’s width, and then
//return that value as a double.
//• getArea—This method should accept the rectangle’s length and width as arguments, and
//return the rectangle’s area. The area is calculated by multiplying the length by the width.
//• displayData—This method should accept the rectangle’s length, width, and area as
//arguments, and display them in an appropriate message on the screen.

package chapter5Problems;
import java.util.Scanner;

public class Problem3 
{
	public static double getLength()
	{
		double length;
		 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the rectangle's length");
		length = keyboard.nextDouble();
		
		return length;
	}
	
	public static double getWidth()
	{
		double width;
		 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the rectangle's width");
		width = keyboard.nextDouble();
		
		return width;
	}
	
	
	public static double getArea(double length, double width)
	{
		double area;
		
		area = length * width;
		
		return area;
	}
	
	public static void displayArea(double length, double width, double area)
	{	 
		System.out.println("The length is " + length);
		System.out.println("The width is " + width);
		System.out.println("The area is " + area);
	}
	
	
	public static void main(String[] args) 
	{
		double length;
		double width;
		double area;
		
		length = getLength();
		width = getWidth();
		area = getArea(length, width);
		displayArea(length, width, area);	
	}

}
