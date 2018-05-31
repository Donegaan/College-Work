
public class TriangularStars {
	public static boolean isStarNumber (int number)
	{
		int indexNum = (int) (Math.sqrt(24*number + 12)+ 6)/12; //Using minus B formula taken from star formula.
		return (number == determineStarNumber(indexNum));
	}
	public static int determineStarNumber(int indexNumber)
	{
		return (6*indexNumber)*(indexNumber - 1) + 1;
	}
		
	public static void main(String[] args) {
		
		int triangleNum = 0;
		int index = 0;
		
		
		
		for (int lastTriNum = 0; (lastTriNum < Integer.MAX_VALUE - index);)
		{
			if (isStarNumber (triangleNum))
			{
				System.out.print (triangleNum + ", ");
			}
			lastTriNum = triangleNum;
			triangleNum += ++index;
		}
		
		System.out.print("are simultaneously star numbers and triangle numbers.");
	
	}

}

