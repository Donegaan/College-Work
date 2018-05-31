
public class TwelveDays {
	
	
	public static final String LINE_ONE = " Partridge in a Pear Tree.\n\n";
	public static final String LINE_2 = "Two Turtle Doves\nand ";
	public static final String LINE_3 = "Three French Hens,\n";
	public static final String LINE_4 = "Four Calling Birds,\n";
	public static final String LINE_5 = "Five Golden Rings,\n";
	public static final String LINE_6 = "Six Geese a Laying,\n";
	public static final String LINE_7 = "Seven Swans a Swimming,\n";
	public static final String LINE_8 = "Eight Maids a Milking,\n";
	public static final String LINE_9 = "Nine Ladies Dancing,\n";
	public static final String LINE_10 = "Ten Lords a Leaping,\n";
	public static final String LINE_11 = "Eleven Pipers Piping,\n";
	public static final String LINE_12 = "Twelve Drummers Drumming,\n";
	public static final int MAX_DAY = 12;
	
	public static void main(String[] args) {
		
		String day = "";
		for (int days = 1; (days <= MAX_DAY); days++)
		{
			switch (days)
			{
			case 12: 
				day = "twelfth";
				break;
			case 11:
				day = "eleventh";
				break;
			case 10:
				day = "tenth";
				break;
			case 9:
				day = "ninth";
				 break;
			case 8:
				day = "eighth";
				break;
			case 7:
				day = "seventh";
				break;
			case 6:
				day = "sixth";
				break;
			case 5:
				day = "fifth";
				break;
			case 4: 
				day = "fourth";
				break;
			case 3:
				day = "third";
				break;
			case 2:
				day = "second";
				break;
			default:
				day = "first";
				break;
			}
		System.out.println("On the " + day + " day of Christmas \nmy true love sent to me:");
			
			switch (days)
			{
			case 12: System.out.print(LINE_12);
			case 11: System.out.print(LINE_11);
			case 10: System.out.print(LINE_10);
			case 9: System.out.print(LINE_9);
			case 8: System.out.print(LINE_8);
			case 7: System.out.print(LINE_7);
			case 6: System.out.print(LINE_6);
			case 5: System.out.print(LINE_5);
			case 4: System.out.print(LINE_4);
			case 3: System.out.print(LINE_3);
			case 2: System.out.print(LINE_2);
			case 1: System.out.print(((days==1)?"A":"a") + LINE_ONE);
			}
		}
			
	}

}