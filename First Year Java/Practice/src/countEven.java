
public class countEven {

	public static void main(String[] args) {
		int [] nums = {2,11};

		int numOfEven = 0;
		for (int index = 0; index < nums.length; index++)
		{
			int number = nums[index];
			if ((number % 2) == 0);
			{
			numOfEven++;
			}
		}
		System.out.print (numOfEven);
	}
}

