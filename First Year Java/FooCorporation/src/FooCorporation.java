import java.util.Scanner;
import java.text.DecimalFormat;
public class FooCorporation {
	public static final double FORTHY_HOURS_PAY = 7.50;
	public static final double OVERTIME_PAY = 8.20;
	public static void main(String[] args) {
		System.out.print("Please input the number of hours worked.");
		Scanner inputScanner = new Scanner (System.in);
		
		int hours = inputScanner.nextInt();
		
		DecimalFormat rounder = new DecimalFormat ("#0.00");
	
		if (hours <= 40 )
		{
			double pay = FORTHY_HOURS_PAY * hours;
			System.out.print ("Your total pay is $" + rounder.format(pay));
		}
		else if (hours > 40 && hours <= 60)
		{
			double pay = OVERTIME_PAY * hours;
			System.out.print ("Your total pay is $" + rounder.format(pay));
		}
		else
		{
			System.out.println ("Error, Foo corp does not allow employees to "
					+ "work more than 60 hours a week");
		}
	inputScanner.close();
	}

}
