//2. Name and Initials
//Write a program that has the following String variables: firstName, middleName, and
//lastName. Initialize these with your first, middle, and last names. The program should also
//have the following char variables: firstInitial, middleInitial, and lastInitial. Store
//your first, middle, and last initials in these variables. The program should display the contents
//of these variables on the screen.

package chapter2Problems;

public class Problem2 {

	public static void main(String[] args) 
	{
		String firstName, middleName, lastName;
		char firstInitial, middleInitial, lastInitial;

		firstName = "Bryan";
		middleName = "Joseph";
		lastName = "O'Connor";
		firstInitial = 'B';
		middleInitial = 'J';
		lastInitial = 'O';
		
		System.out.println("First Name: " + firstName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Last Name: " + lastName);
		System.out.println("First Initial: " + firstInitial);
		System.out.println("Middle Initial: " + middleInitial);
		System.out.println("Last Initial: " + lastInitial);
	}

}
