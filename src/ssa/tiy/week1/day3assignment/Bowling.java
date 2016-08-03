package ssa.tiy.week1.day3assignment;

public class Bowling 
{

	public static void main(String[] args) 
	{
		int throwsPerFrame = 2;
		int frames = 10;
		int pins = 10;
		int pinsLeft = 10;
		int totalPins = 10;
		int finalScore = 0;
		
		
		for (int i = 0; i < frames; i++) 
		{

		
			for (int i1 = 0; i1 < 1; i1++) 
			{
				int bowlThrow = (int) ((Math.random() * pins) + 1);
				System.out.println("Your first throw knocked down: " + bowlThrow + " pins.");
			
				pinsLeft = (10 - bowlThrow);
				System.out.println("There are: " + pinsLeft + " pins left.");
		
		
				for (int i11 = 0; i11 < 1; i11++) 
				{
					int bowlThrowTwo = (int) ((Math.random() * pinsLeft) + 1);
					System.out.println("Your second throw knocked down: " + bowlThrowTwo + " pins.");
			
					totalPins = (bowlThrow + bowlThrowTwo);
			
					System.out.println("You knocked down a total of: " + totalPins + " pins\n");
			
					if (bowlThrow + bowlThrowTwo == 10)
					{
						System.out.println("\nCongratualtions you got a spare!\n");
					}
					else if(bowlThrow == 10)
					{
						System.out.println("\nCongratulations you got a strike!\n");
					}
					int score = (bowlThrow + bowlThrowTwo);
					finalScore = finalScore + score;
				}
		
			}
			
			System.out.println("Your final score is: " + finalScore);
		
		}

	}
	
}
