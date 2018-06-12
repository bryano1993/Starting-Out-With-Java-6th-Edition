//18. Word Game
//Write a program that plays a word game with the user. The program should ask the user to
//enter the following:
//• His or her name
//• His or her age
//• The name of a city
//• The name of a college
//• A profession
//• A type of animal
//• A pet’s name
//After the user has entered these items, the program should display the following story,
//inserting the user’s input into the appropriate locations:
//There once was a person named NAME who lived in CITY. At the age of AGE,
//NAME went to college at COLLEGE. NAME graduated and went to work as a
//PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
//happily ever after!


package chapter2Problems;

import java.util.Scanner;

public class Problem18 
{

	public static void main(String[] args) 
	{
		String name;
		String city;
		String college;
		String profession;
		String animal;
		String pet;
		int age;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		name = keyboard.nextLine();
		
		System.out.println("What is your age: ");
		age = keyboard.nextInt();
		
		keyboard.nextLine();
		
		System.out.println("What is the name of your city: ");
		city = keyboard.nextLine();

		System.out.println("What is the name of your college: ");
		college = keyboard.nextLine();
		
		System.out.println("What is the name of your profession: ");
		profession = keyboard.nextLine();
		
		System.out.println("Name a type of animal: ");
		animal = keyboard.nextLine();
		
		System.out.println("Name your pet: ");
		pet = keyboard.nextLine();
		
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n"
				+ name + " went to college at " + college + ". " + name + " graduated and went to work as a \n"
				+ profession +". Then, " + name + " adopted a(n) " + animal + " named " + pet + ". They both lived \n"
						+ "happily ever after!");
		
	}

}
