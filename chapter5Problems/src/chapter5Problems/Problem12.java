//12. Kinetic Energy
//In physics, an object that is in motion is said to have kinetic energy. The following formula
//can be used to determine a moving object’s kinetic energy:
//KE 5 ½ mv2
//The variables in the formula are as follows: KE is the kinetic energy, m is the object’s mass
//in kilograms, and v is the object’s velocity, in meters per second.
//Write a method named kineticEnergy that accepts an object’s mass (in kilograms) and
//velocity (in meters per second) as arguments. The method should return the amount of
//kinetic energy that the object has. Demonstrate the method by calling it in a program that
//asks the user to enter values for mass and velocity.

package chapter5Problems;

import java.util.Random;
import java.util.Scanner;

public class Problem12 
{
	public static double kineticEnergy(double mass, double velocity)
	{
		double ke;
		
		ke = ((double) 1/2) * mass * Math.pow(velocity, 2);
		
		return ke;
	}
	
	public static double mass()
	{
		double mass;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Please enter an objects mass (in kilograms): ");
		mass = keyboard.nextDouble();
		
		return mass;
	}
	
	public static double velocity()
	{
		
		double velocity;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Please enter an objects velocity (in meters per second): ");
		velocity = keyboard.nextDouble();
		
		return velocity;
	}
	
	
	

	public static void main(String[] args) 
	{
		double theMass = mass();
		double theVelocity = velocity();
		double result = kineticEnergy(theMass, theVelocity);
		
		System.out.println("The Kinetic energy is " + result);

	}

}
