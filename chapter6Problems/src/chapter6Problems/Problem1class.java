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

public class Problem1class 
{
	private String name;
	private int idNumber;
	private String department;
	private String position;


	public Problem1class (String n, int id, String d, String p)
	{
		name = n;
		idNumber = id;
		department = d;
		position = p;
	}
	
	public Problem1class (String n, int id)
	{
		name = n;
		idNumber = id;
		department = "";
		position = "";
	}
	
	public Problem1class ()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setidNumber(int id)
	{
		idNumber = id;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	
	public void setPosition(String p)
	{
		position = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getidNumber()
	{
		return idNumber;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getPosition()
	{
		return position;
	}

}
