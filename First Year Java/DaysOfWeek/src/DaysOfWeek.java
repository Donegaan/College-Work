import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

public class DaysOfWeek {		// Some of this code for this function was taken from Ken's tutorial notes.
    public static boolean isLeapYear(int year)
    {
        return (year%4==0 && year%100!=0 || year%400==0);
    }
    public static int daysInMonth(int month, int year)	// Some of this code for this function was taken from Ken's tutorial notes.
    {
        switch (month)
        {
        case 2: 
            if (isLeapYear(year))
            {
                return DAYS_IN_FEBRUARY_IN_LEAP_YEAR;
            }
            else
            {
                return DAYS_IN_FEBRUARY_NORMALLY;
            }
        case 4:
        case 6:
        case 9:
        case 11:
            return DAYS_IN_APRIL_JUNE_SEPT_NOV;
        default:
            return DAYS_IN_MOST_MONTHS;
        }
    }
    
    public static boolean validDate (int day, int month, int year) // Some of this code for this function was taken from Ken's tutorial notes.
    {
        return ((year>=1 && (month >= 1) && (month <= NUMBER_OF_MONTHS) && (day >= 1) && (day <= daysInMonth(month, year))));
        
    }
    
    public static final int DAYS_IN_APRIL_JUNE_SEPT_NOV = 30;
    public static final int DAYS_IN_FEBRUARY_NORMALLY = 28;
    public static final int DAYS_IN_FEBRUARY_IN_LEAP_YEAR = 29;
    public static final int DAYS_IN_MOST_MONTHS = 31;
    public static final int NUMBER_OF_MONTHS = 12;
    
    public static void main(String[] args) {
        
        try
        {
            String dateInput = JOptionPane.showInputDialog(null,"Please enter date (dd/mm/yyyy)");
            Scanner input = new Scanner(dateInput);
            input.useDelimiter("/");
            int dayInput = input.nextInt();
            int monthInput = input.nextInt();
            int yearInput = input.nextInt();
            
            String date = dayInput +  numberEnding(dayInput);
            String month = monthName(monthInput);
            String day = dayOfTheWeek( dayInput, monthInput, yearInput);
            input.close();
            
            if (validDate(dayInput, monthInput, yearInput))
            {
                JOptionPane.showMessageDialog (null, day + ", " + date + " " + month + " " + yearInput);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"" + dayInput + "/" + monthInput + "/" + yearInput + " is not a valid date.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (NullPointerException exception)
        {
        }
        catch (java.util.NoSuchElementException exception)
        {
            JOptionPane.showMessageDialog(null,"Invalid date entered!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static String numberEnding (int dayInput)
    {
        int ending = (dayInput % 10);
        
        switch (ending)
        {
        case 1:
            if (dayInput == 11)
            {
                return ("th");
            }
            else
            {
                return ("st");
            }
        case 2:
            if (dayInput == 12)
            {
                return ("th");
            }
            else
            {
                return ("nd");
            }
        case 3:
            return ("rd");
        default:
            return  ("th");    
        }
    }    
    
    public static String monthName (int monthInput){
        
        return (monthInput == 1)?"January": (monthInput == 2)? "February": (monthInput == 3)? "March":(monthInput == 4)? "April": 
            (monthInput == 5)? "May": (monthInput == 6)? "June": (monthInput == 7)? "July": (monthInput == 8)? "August":
                (monthInput == 9)? "September": (monthInput == 10)? "October": (monthInput == 11)? "November": "December";
    }
    
    public static String dayOfTheWeek (int dayInput, int monthInput, int yearInput){
    
        int firstTwoNum =  yearInput;
       
        while (firstTwoNum >= 100)
        {
            firstTwoNum /= 10;
        }
        
        int lastTwoNum = ((monthInput == 1 || monthInput == 2)?yearInput-1:yearInput) % 100;
        
        int  dayNumber =(int) Math.abs((dayInput + Math.floor(2.6 * (((monthInput + 9) % 12) + 1) - 0.2) + lastTwoNum + 
                Math.floor(lastTwoNum/4) + Math.floor(firstTwoNum/4) - ( 2 * firstTwoNum)));
        
        dayNumber = 7-(dayNumber%7);	//Accounts for certain years that would produce incorrect day values.
        
        return (dayNumber == 0)? "Sunday": (dayNumber == 1)? "Monday": (dayNumber == 2)? "Tuesday": (dayNumber == 3)? "Wednesday":
            (dayNumber == 4)? "Thursday": (dayNumber == 5)? "Friday": "Saturday";
    }
}
