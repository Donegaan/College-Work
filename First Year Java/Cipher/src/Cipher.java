import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Cipher {
	public static char [] createCipher(char []randomArray){
		if (randomArray != null)
		{
			Random generator = new Random();
			for (int index=0; index<randomArray.length; index++ )
			{
				 int newIndex = generator.nextInt(randomArray.length);
				 char temp = randomArray[index];
				 randomArray[index] = randomArray[newIndex];
				 randomArray[newIndex] = temp;
			}
			return randomArray;oo
		}
		else
		{
			return null;
		}
	}
	
	public static String encrypt(char [] randomArray, char[] inputArray, char [] letterArray){
		randomArray = createCipher (randomArray);
		if (inputArray != null)
		{
			for (int index = 0; index < inputArray.length; index++)
			{
				//System.out.print (inputArray[index] + ",");
				for (int index2 = 0; index2 < letterArray.length; index2++)
				{
					//System.out.print (inputArray[index]); //+ "," + letterArray[index2] + " ");
					/*if (inputArray [index]==letterArray [index2])
					{*/
						//System.out.print (inputArray[index] + ",");
						inputArray [index] = randomArray [index2];
						//System.out.print(randomArray[index2] + ", ");
					//}
				}
			}
			String encrypt = new String (inputArray);
			return encrypt;
		}
		else
		{
			return ("There was no message to encrypt.");
		}
	}
	
	public static String decrypt(char [] letterArray, char [] encryptedArray, char [] randomArray){
		
		if (encryptedArray != null)
		{
			for (int index = 0; index < encryptedArray.length; index++)
			{
				for (int index2 = 0; index2 < randomArray.length; index2++)
				{
					//System.out.print (encryptedArray[index]+ "," + encryptedArray[index] + " ");
					/*if (encryptedArray [index]==randomArray[index2])
					{*/
						//System.out.print (encryptedArray[index] + "," + encryptedArray[index] + " ");
						encryptedArray [index] = letterArray[index2];
					//}
				}
			}
			String decrypted = new String (encryptedArray);
			return decrypted;
		}
		else
		{
			return ("There was no message to decrypt.");
		}
	}
	
	public static void main(String[] args) {
		try
		{
			char[] letterArray ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
					'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
			char[] randomArray = Arrays.copyOf(letterArray, letterArray.length);
			String input = JOptionPane.showInputDialog(null, "Please input the letters/words you would like to be encrypted:");
			Scanner inputScanner = new Scanner (input);
			if (inputScanner.hasNextInt())
			{
				JOptionPane.showMessageDialog (null, "Invalid input, please enter a letter or word:" , "Error", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				String inputChar = inputScanner.next();
				String lowerCase = inputChar.toLowerCase();
				char[] inputArray = lowerCase.toCharArray();
				//randomArray = createCipher (randomArray);
				/*for (int index = 0; index<inputArray.length;index++)
				{
				//System.out.print (randomArray[index] + "," + letterArray[index] + " ");
					System.out.print (inputArray[index]);
				}*/
				String encryptedMessage = encrypt (randomArray, inputArray, letterArray);
				/*for (int index = 0; index<inputArray.length;index++)
				{
				//System.out.print (randomArray[index] + "," + letterArray[index] + " ");
					System.out.print (inputArray[index]);
				}*/
				JOptionPane.showMessageDialog(null, encryptedMessage, "Encrypted Message", JOptionPane.INFORMATION_MESSAGE);
			
				int wantToDecrypt = JOptionPane.showConfirmDialog (null, "Would you like to decypt this?", "Decrypt", 
						JOptionPane.YES_NO_OPTION);
				if ( wantToDecrypt == JOptionPane.YES_OPTION)
				{
					char [] encryptedArray = encryptedMessage.toCharArray();
					String decryptedMessage = decrypt (letterArray, encryptedArray, randomArray );
					JOptionPane.showMessageDialog(null, decryptedMessage);
				}
				else if (wantToDecrypt == JOptionPane.NO_OPTION || wantToDecrypt == JOptionPane.CANCEL_OPTION)
				{
					JOptionPane.showMessageDialog(null, "Goodbye");
				}
			}
			inputScanner.close();
		}
		catch (NullPointerException exception)
		{	
		}
		catch (java.util.NoSuchElementException exception)
		{
			JOptionPane.showMessageDialog(null, "No letters/words entered.");
		}
	}
}
