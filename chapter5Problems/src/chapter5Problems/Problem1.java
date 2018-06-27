//1. showChar Method
//Write a method named showChar. The method should accept two arguments: a reference to
//a String object and an integer. The integer argument is a character position within the
//String, with the first character being at position 0. When the method executes, it should
//display the character at that character position. Here is an example of a call to the method:
//showChar("New York", 2);
//In this call, the method will display the character w because it is in position 2. Demonstrate
//the method in a complete program.

package chapter5Problems;

public class Problem1 
{
	
	public static void showChar(String myString, int myInt)
	{
		
		System.out.println("The character at position " + myInt + " is " + myString.charAt(myInt) + " in string " + myString);
	}

	public static void main(String[] args) 
	{
		showChar("hello there", 3);
	}
}