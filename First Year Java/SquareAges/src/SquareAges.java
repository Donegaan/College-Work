import javax.swing.JOptionPane;
import java.util.Calendar;

public class SquareAges {
public static final int MAX_AGE = 123;
public static final int MIN_AGE = 0;

    public static void main(String[]args) {
        
    	Calendar Cal = Calendar.getInstance();
    	int year = Cal.get(Calendar.YEAR);
        
        for ( int age = MIN_AGE; (age <=MAX_AGE); age++)
        {
            int minYear = year - MAX_AGE;
            int maxYear = year + MAX_AGE;
            
            boolean squareAge = ( year + ( MAX_AGE - age) >= age * age 
                    && age * age >= minYear && age * age <= maxYear);
            if (squareAge)
            {
            JOptionPane.showMessageDialog(null, "A person who is " + age +" in the year " + age * age +
                    " will be alive in a year that is the square of their age."); 
            }
        }
    }
}