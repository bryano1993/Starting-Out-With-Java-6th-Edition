//3. Personal Information
//Write a program that displays the following information, each on a separate line:
//• Your name
//• Your address, with city, state, and ZIP
//• Your telephone number
//• Your college major
//Although these items should be displayed on separate output lines, use only a single println
//statement in your program.


package chapter2Problems;

public class Problem3 
{

	public static void main(String[] args) 
	{
		String name,address,telephoneNumber,major;
		name = "Bryan O'Connor";
		address = "8102 Blythe Court";
		telephoneNumber = "8582325532";
		major = "Computer Science";
		
		System.out.println("name: " + name + "\naddress : " + address + "\nnumber: " + telephoneNumber + "\nmajor: " + major);
	
	}

}
