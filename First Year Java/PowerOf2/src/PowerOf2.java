import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Using integers for the computations, write a program to calculate the �power-of� function.
 *   i.e. base^exponent.
 * For example 2^5 = 2*2*2*2*2 = 32
 * You MUST cope with all possible errors:
 *  - Input errors 
 *  - Cancelled input (NullPointerException)
 *  - Invalid exponent values
 *  - Out of range result values
 */
public class PowerOf2 {

	public static void main(String[] args) {
		try
		{
			String input = JOptionPane.showInputDialog(null, "Please enter in the base");
			Scanner inputScanner = new Scanner (input);
			double base = inputScanner.nextDouble();
			
			input = JOptionPane.showInputDialog(null, "Please enter in the exponent");
			inputScanner = new Scanner (input);
			double exponent = inputScanner.nextDouble();
		}
		catch (NullPointerException exception)
		{
		 
		}
		
		

	}

}
