
		import java.util.Scanner;

		import javax.swing.JOptionPane;

		/*
		 * Write a program to read in the (integer) marks achieved by a class of students.  
		 * Determine the place each student came in the class.  For example, given
		 * 45, 98, 87, 60, 87 you should output "45(5th) 98(1st) 87(2nd) 60(4th) 87(2nd)".
		 * As part of your solution you must write and use the following routines:
		 * - howManyScoresAreAbove() which takes an array of scores and a particular score
		 *  and returns how many of the scores in the array are bigger than the passed score.
		 * - determinePlaces() which takes the array of scores and returns an array of place
		 *  numbers (1n where n is the number of students).  e.g. given 45, 98, 87, 60, 87 
		 *  returns 5, 1, 2, 3, 2 
		 * - determinePlacesString() which takes the place numbers and the scores, and returns
		 * the places string.  e.g. 45(5th) 98(1st) 87(2nd) 60(4th) 87(2nd)"
		 */
		public class Places1 {

			public static void main(String[] args) {
				int[] scores = null;
				String input = JOptionPane.showInputDialog("Enter marks for all students separated by spaces:");
				Scanner inputScanner = new Scanner( input );
				while (inputScanner.hasNextInt())
				{
					scores = extend(scores,inputScanner.nextInt());
				}
				inputScanner.close();
				int[] places = determinePlaces( scores );
				String placesString = determinePlacesString( places, scores );
				JOptionPane.showMessageDialog(null, "Places are " + placesString );
			}
			
			public static int[] extend( int[] array, int newElement )
			{
			  int[] newArray = new int[(array==null)?1:array.length+1];
			  if (array!= null)
			    System.arraycopy(array, 0, newArray, 0, array.length);
			  newArray[newArray.length-1] = newElement;
			  return newArray;
			}

			public static int howManyScoresAreAbove( int[] scores, int currentScore )
			{
				if (scores == null)
					return 0;
				int scoresAbove = 0;
				for (int index=0; index<scores.length; index++)
					if (scores[index] > currentScore)
						scoresAbove++;
				return scoresAbove;
			}
			
			public static int[] determinePlaces( int[] scores )
			{
				if (scores == null)
					return null;
				int[] places = new int[scores.length];
				for (int index=0; index<scores.length; index++)
					places[index] = howManyScoresAreAbove( scores, scores[index] ) + 1;
				return places;
			}
			
			public static String determinePlaceString( int place )
			{
				if (place/10 == 1)
					return (""+place+"th");
				switch (place%10)
				{
				case 1:
					return (""+place+"st");
				case 2:
					return (""+place+"nd");
				case 3:
					return (""+place+"rd");
				default:
					return (""+place+"th");
				}
			}
			
			public static String determinePlacesString( int[] places, int[] scores )
			{
				if (places == null)
					return "";
				String placesString = "";
				for (int index=0; index<places.length; index++)
					placesString += (index==0?"":" ") + scores[index] + "(" + determinePlaceString(places[index]) + ")";
				return placesString;
			}

		

	}


