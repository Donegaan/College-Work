import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/*
 * Write a program which gets the radius of a circle from the user
 * and then computes the diameter, area and circumference.  Input
 * should be obtained and results should be displayed using
 * dialog boxes.
 */
public class CircleMetrics {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Input the radius of the circle" );
		Scanner inputScanner = new Scanner (input);
		double radius = inputScanner.nextDouble();
		double diameter = 2 * radius;
		double area = Math.PI * (radius * radius);
		double circumference = 2 * (Math.PI * radius);
		
		DecimalFormat rounder = new DecimalFormat("#0.00");
		
		JOptionPane.showMessageDialog(null, "The diameter is " + rounder.format(diameter) 
			+ ", the area is " +rounder.format(area) + ", the circumference is " 
				+ rounder.format(circumference));
		
		inputScanner.close();

	}

}
