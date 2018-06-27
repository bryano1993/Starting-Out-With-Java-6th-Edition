//7. Hotel Occupancy
//A hotel’s occupancy rate is calculated as follows:
//Occupancy rate 5 Number of rooms occupied 4 Total number of rooms
//Write a program that calculates the occupancy rate for each floor of a hotel. The program
//should start by asking for the number of floors in the hotel. A loop should then iterate once
//for each floor. During each iteration, the loop should ask the user for the number of rooms
//on the floor and the number of them that are occupied. After all the iterations, the program
//should display the number of rooms the hotel has, the number of them that are occupied,
//the number that are vacant, and the occupancy rate for the hotel.
//Input Validation: Do not accept a value less than 1 for the number of floors. Do not accept
//a number less than 10 for the number of rooms on a floor.

package chapter4Problems;
import java.util.Scanner;

public class Problem7 
{

	public static void main(String[] args) 
	{
		int floors;
		int rooms;
		int occupiedRooms;
		int totalRooms = 0;
		int totalOccupiedRooms = 0;
		int vacantRooms = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Hotel Occupancy");
		
		System.out.println("What are the number of floors in the hotel: ");
		floors = keyboard.nextInt();
		
		while (floors < 1)
		{
			System.out.println("Please enter a positive nonzero integer value for floors: ");
			floors = keyboard.nextInt();
		}
		
		for (int i = 1; i <= floors; i++)
		{
			System.out.println("How many rooms are on floor # " + i);
			rooms = keyboard.nextInt();
			
			totalRooms = totalRooms + rooms;
			
			System.out.println("How many of the rooms are occupied ");
			occupiedRooms = keyboard.nextInt();
			
			totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;

			vacantRooms = totalRooms - totalOccupiedRooms;			
		}
		
		System.out.println("The total rooms in the hotel is: " + totalRooms);
		System.out.println("The number of rooms occupied is: " + totalOccupiedRooms);
		System.out.println("The number of the rooms that are not occupied is: " + vacantRooms);
		
	}

}
