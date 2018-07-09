//1. Employee Class
//Write a class named Employee that has the following fields:
//• name. The name field references a String object that holds the employee’s name.
//• idNumber. The idNumber is an int variable that holds the employee’s ID number.
//• department. The department field references a String object that holds the name of
//the department where the employee works.
//• position. The position field references a String object that holds the employee’s
//job title.
//The class should have the following constructors:
//• A constructor that accepts the following values as arguments and assigns them to the
//appropriate fields: employee’s name, employee’s ID number, department, and position.
//• A constructor that accepts the following values as arguments and assigns them to the
//appropriate fields: employee’s name and ID number. The department and position
//fields should be assigned an empty string ("").
//• A no-arg constructor that assigns empty strings ("") to the name, department, and
//position fields, and 0 to the idNumber field.
//Write appropriate mutator methods that store values in these fields and accessor methods
//that return the values in these fields. Once you have written the class, write a separate program
//that creates three Employee objects to hold the following data:
//Name ID Number Department Position
//Susan Meyers 47899 Accounting Vice President
//Mark Jones 39119 IT Programmer
//Joy Rogers 81774 Manufacturing Engineer
//The program should store this data in the three objects and then display the data for each
//employee on the screen.


package chapter6Problems;

public class Problem1 
{

	public static void main(String[] args) 
	{
		 Problem1class firstEmployee = new Problem1class();
		 Problem1class secondEmployee = new Problem1class();
		 Problem1class thirdEmployee = new Problem1class();
		 
		 firstEmployee.setName("Susan Meyers");
		 firstEmployee.setidNumber(47899);
		 firstEmployee.setDepartment("Accounting");
		 firstEmployee.setPosition("Vice President");
		 
		 secondEmployee.setName("Mark Jones");
		 secondEmployee.setidNumber(39119);
		 secondEmployee.setDepartment("IT");
		 secondEmployee.setPosition("Programmer");
		 
		 thirdEmployee.setName("Joy Rogers");
		 thirdEmployee.setidNumber(81774);
		 thirdEmployee.setDepartment("Manufacturing");
		 thirdEmployee.setPosition("Engineer");

		 System.out.println("Name \t \t ID Number \t Department \t Position");
		 
		 System.out.println(firstEmployee.getName() + "\t"+ firstEmployee.getidNumber() + "\t \t" + firstEmployee.getDepartment() + "\t" + firstEmployee.getPosition());
		 System.out.println(secondEmployee.getName() + "\t"+ secondEmployee.getidNumber() + "\t \t" + secondEmployee.getDepartment() + "\t \t" + secondEmployee.getPosition());
		 System.out.println(thirdEmployee.getName() + "\t"+ thirdEmployee.getidNumber() + "\t \t" + thirdEmployee.getDepartment() + "\t" + thirdEmployee.getPosition());
		 
		 

	}

}
