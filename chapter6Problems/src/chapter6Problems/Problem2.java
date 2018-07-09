//2. Car Class
//Write a class named Car that has the following fields:
//• yearModel. The yearModel field is an int that holds the car’s year model.
//• make. The make field references a String object that holds the make of the car.
//• speed. The speed field is an int that holds the car’s current speed.
//In addition, the class should have the following constructor and other methods.
//• Constructor. The constructor should accept the car’s year model and make as arguments.
//These values should be assigned to the object’s yearModel and make fields. The
//constructor should also assign 0 to the speed field.
//• Accessors. Appropriate accessor methods should get the values stored in an object’s
//yearModel, make, and speed fields.
//• accelerate. The accelerate method should add 5 to the speed field each time it is called.
//• brake. The brake method should subtract 5 from the speed field each time it is called.
//Demonstrate the class in a program that creates a Car object, and then calls the accelerate
//method five times. After each call to the accelerate method, get the current speed of the car
//and display it. Then call the brake method five times. After each call to the brake method,
//get the current speed of the car and display it.


package chapter6Problems;

public class Problem2 
{

	public static void main(String[] args) 
	{
		 Problem2class car = new Problem2class(2018, "Honda");
		 
		 System.out.println("The year model is " + car.getYearModel());
		 System.out.println("The model of the car is " + car.getMake());
		 
		 car.accelerate();
		 
		 System.out.println("Calling the accerate method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.accelerate();
		 
		 System.out.println("Calling the accerate method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.accelerate();
		 
		 System.out.println("Calling the accerate method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.accelerate();
		 
		 System.out.println("Calling the accerate method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.accelerate();
		 
		 System.out.println("Calling the accerate method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.brake();
		 
		 System.out.println("Calling the break method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.brake();
		 
		 System.out.println("Calling the break method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.brake();
		 
		 System.out.println("Calling the breake method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.brake();
		 
		 System.out.println("Calling the break method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
		 car.brake();
		 
		 System.out.println("Calling the break method");
		 System.out.println("Your speed is now " + car.getSpeed());
		 
	}

}
