import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * Write a program which takes in 3 numbers and computes their average
 * and standard deviation.
 */
public class StandardDeviation {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Please input 3 numbers");
		Scanner inputScanner = new Scanner (input);
		
		double num1 = inputScanner.nextDouble();
		double num2 = inputScanner.nextDouble();
		double num3 = inputScanner.nextDouble();
		
		double average = (num1 + num2 + num3)/3.0;
		double variance = ((num1 - average) * (num1- average)) + 
				((num2 - average) * (num2 - average)) + ((num3 - average) * (num3 - average));
		double standardDeviation = Math.sqrt(variance); 
		
		JOptionPane.showMessageDialog(null, "For numbers " + num1 + ", " + num2 + ", " + num3 + 
				", the average is " + average + " and the standard deviation is " 
					+ standardDeviation);
		
		
		inputScanner.close();
	}

}
