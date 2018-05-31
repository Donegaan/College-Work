import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Write a program to calculate factorial of some number (i.e. number!).
 * For example 4! = 1*2*3*4 = 24
 */
public class Factorial {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Please input a whole number whose "
				+ "factorial you wish to calculate");
		Scanner inputScanner = new Scanner (input);
		
		int number = inputScanner.nextInt();
		
		int factorial = 1;
		
		for (int count = 2; (count <= number); count++)
		{
			factorial = factorial * count;
		}
		JOptionPane.showMessageDialog(null, "The factorial of " + number + " is " + factorial);
		
		inputScanner.close();
	}

}
