
import java.util.Scanner;
public class HighScores {
	public static boolean higherThan (int [] highScores, int firstValue)
	{
		boolean biggerThan = false;
			for (int index = 0; index < highScores.length; index++)
			{
				
				if (firstValue > highScores [highScores.length -1])
				biggerThan = true;
			}
			return biggerThan;		
	}
	
	public static void printHighScores (int [] highScores, int firstValue)
	{
		
		System.out.println("Your High Scores are:  ");
		 
		 for( int index = 0; index < highScores.length;index++)
		 {
			 if(index == highScores.length-1)
			 {
				 System.out.print(highScores[index]);
			 }
			 else
			 {
				 System.out.print(highScores[index] + ", ");
			 }
		 }	  
	}
	
	public static void initialiseHighScores (int [] highScores)
	{
		if (highScores != null)
		{
			for(int index = 0; index < highScores.length; index++)
			{
				highScores[index] = 0;
			}
		}
	}
	
	public static void insertScore (int [] highScores, int newScore)
	{
		int newPosition = 0;
		for(int index=(highScores.length-1);index>=0; index--)
		{
			if (newScore > highScores [index])
			{
				newPosition = index;
			}
		}			
		
		for(int index=(highScores.length-1); index>newPosition;index--)	
		 {
			highScores[index]=highScores[index-1];
		 }
		 highScores[newPosition] = newScore;		
	
	
	
		 for (int index = 0; index<highScores.length; index++)
		 {
		
		int firstIndex = index;
		for (int index2 = index + 1; index2<highScores.length; index2++)
		{
			int secondIndex = index2;
			if (highScores [firstIndex] < highScores [secondIndex])
			{
				int temp = highScores[index];
			      highScores[index] = highScores[index2];
			      highScores[index2] = temp;
			      
			}
		}
	}
}
	
	public static void main(String[] args) {
		
		System.out.print("Enter number of high scores you want to keep.");
		Scanner inputScanner = new Scanner (System.in);
		
		if (inputScanner.hasNextInt())
		{
			int arrayLength = inputScanner.nextInt();
			
			if (arrayLength > 0)
			{
				int[] highScores = new int [arrayLength];
				initialiseHighScores (highScores);
				boolean quit = false;
				while (!quit)
				{
					System.out.print("\nPlease enter in a high score or type 'quit' to exit.\n ");
					inputScanner = new Scanner (System.in);
					int newScore = 0;
					if (inputScanner.hasNext("quit"))
					{
						System.out.print("Goodbye.");
						quit = true;	
					}
					else if (inputScanner.hasNextInt())
					{
						newScore = inputScanner.nextInt();
						if( higherThan (highScores, newScore))
						{
							insertScore (highScores, newScore);
						}
						printHighScores (highScores, newScore);
					}
					else 
					{
						System.out.print("Error, please enter a whole number.");
					}
					}
			}
		}
		inputScanner.close();
	}
}
