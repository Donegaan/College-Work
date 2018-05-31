import java.util.Scanner;
import java.text.DecimalFormat;
public class Sentence {

	public static void main(String[] args) {
		boolean quit = true;
		while (quit)
		{
			String sentence= "";
			System.out.print("Enter a sentence or type 'quit' to exit.");
			Scanner inputScanner = new Scanner (System.in);
			if (inputScanner.hasNextLine()){
				sentence = inputScanner.nextLine();
			}
			if (sentence == "quit")
			{
				quit = false;
			}
			else 
			{
				DecimalFormat round = new DecimalFormat ("#.##");
				char [] charArray = sentence.toCharArray();
				String inOrder = wordsInAlphaveticalOrder (charArray);
				double averageLength = averageWordLength (charArray);
				char [] longest = longestWord (charArray);
				String biggestWord = new String (longest);
				/*System.out.println(biggestWord);
				System.out.println(averageLength);
				System.out.println(inOrder);*/
				//System.out.print(inOrder + ", has an average length of " + round.format(averageLength) + " letters and '" + biggestWord + "' "
						//+ "is the longest word in the sentence.");
			}
			inputScanner.close();
		}

	}
	
	public static String wordsInAlphaveticalOrder (char [] charArray){
		char newLetter = 0;
		char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',	'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z'};
		int tempIndex = 0;
		for (int index =0; index<alphabet.length;index++)
		{
			if (charArray[0]==alphabet[index]){
				tempIndex =index;
			}
		}
		for (int index = 1; index<charArray.length;index++)
		{
			if (charArray[index] == ' '){
				newLetter = charArray[index+1];
			}
			for (int index2 = 0; index2<alphabet.length;index2++){
				if (newLetter==alphabet[index2]){
					if (tempIndex>= alphabet[index2]){
						return ("The words in this sentence are not in alphabetical order");
					}
				}
			}
		}
		return ("The words in this sentence are in alphabetical order");
	}
	
	public static double averageWordLength(char [] charArray){
		
		double letterCount = 0.0;
		double wordCount = 1.0;	// Set it to one as it doesn't include the last word otherwise.
		for (int index =0;index<charArray.length;index++){
			if (charArray[index] == ' '){
				wordCount++;
			}
			else{
				letterCount++;
			}
		}
		double average = letterCount/wordCount;
		return average;
	}
	
	public static char [] longestWord (char [] charArray){
		
		int letterCount =0;
		int tempCount =0;
		int currentIndex =0;
		for (int index =0; index<charArray.length;index++){
			if (charArray[index] == ' '){
				if (tempCount > letterCount){
					letterCount =tempCount;
					currentIndex = index-1; //gives index of last letter in word.
				}
			}
			else
			{
				tempCount++;
			}
		}
		char [] biggestWord = new char [letterCount];
		for (int index = letterCount-1; index >=0; index--){
			biggestWord[index] = charArray[currentIndex];
			currentIndex--;
		}
		return biggestWord;
	}
}
