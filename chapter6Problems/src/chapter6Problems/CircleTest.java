//7. Circle Class
//Write a Circle class that has the following fields:
//• radius: a double
//• PI: a final double initialized with the value 3.14159
//The class should have the following methods:
//• Constructor. Accepts the radius of the circle as an argument.
//• Constructor. A no-arg constructor that sets the radius field to 0.0.
//• setRadius. A mutator method for the radius field.
//• getRadius. An accessor method for the radius field.
//• getArea. Returns the area of the circle, which is calculated as
//area = PI * radius * radius
//• getDiameter. Returns the diameter of the circle, which is calculated as
//diameter = radius * 2
//• getCircumference. Returns the circumference of the circle, which is calculated as
//circumference = 2 * PI * radius
//Write a program that demonstrates the Circle class by asking the user for the circle’s radius,
//creating a Circle object, and then reporting the circle’s area, diameter, and circumference.

package chapter6Problems;
import java.util.Scanner;

public class CircleTest 
{

	public static void main(String[] args) 
	{
		double radius;
		
		Scanner keyboard = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("Please enter the radius of your favorite circle");
		radius = keyboard.nextDouble();
		circle.setRadius(radius);
		
		System.out.println("The circle's area is: " + circle.getArea());
		System.out.println("The circle's diameter is: " + circle.getDiameter());
		System.out.println("The circle's circumference is: " + circle.getCircumference());
	}

}
