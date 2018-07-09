package chapter6Problems;

import java.util.Scanner;

public class FishingGameTest 
{

	public static void main(String[] args) 
	{
		String decision;
		int scoreCount = 0;
		int rollValue;
		
		
		FishingGame fish = new FishingGame();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello would you like to continue fishing? (Y/N)");
		decision = keyboard.next();
		
		while (decision.contains("Y"))
		{	
			fish.roll();
			rollValue = fish.getValue();
			
			if(rollValue == 1)
			{
				System.out.println("thats a huge fish!!");
				scoreCount += 60;
			}
			else if(rollValue == 2)
			{
				System.out.println("eww an old shoe!");
				scoreCount += 1;
			}
			else if(rollValue == 3)
			{
				System.out.println("haha what a small fish!");
				scoreCount += 40;
			}
			else if(rollValue == 4)
			{
				System.out.println("Woah I think thats a shark!!");
				scoreCount += 100;
			}
			else if(rollValue == 5)
			{
				System.out.println("Is that the kraken?!!");
				scoreCount += 200;
			}
			else if(rollValue == 6)
			{
				System.out.println("Ahh seaweed!!");
				scoreCount += 10;
			}
				
		System.out.println("Hello would you like to continue fishing? (Y/N)");
		decision = keyboard.next();	
			}
		
		
		if (scoreCount <= 50)
		{
			System.out.println("You scored a total of " + scoreCount);
			System.out.println("What a noobie");
		}
		else if (scoreCount > 50 && scoreCount <= 100)
		{
			System.out.println("You scored a total of " + scoreCount);
			System.out.println("Not bad!");
		}
		else if (scoreCount > 100 && scoreCount <= 200)
		{
			System.out.println("You scored a total of " + scoreCount);
			System.out.println("Good job!");
		}
		else if (scoreCount > 300)
		{
			System.out.println("You scored a total of " + scoreCount);
			System.out.println("Amazing!");
		}
			

	}

}
