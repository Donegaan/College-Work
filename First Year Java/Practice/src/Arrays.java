import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		System.out.print("Please input the number of arrays you want");
		Scanner inputScanner = new Scanner (System.in);
		
		int arrayNum = inputScanner.nextInt();
		for (int count = 0; count < arrayNum; count++)
		{
			System.out.print("Please input the number of numbers");
			inputScanner = new Scanner (System.in);
			
			int arrayLength = inputScanner.nextInt();
			int [] sumArray = new int [arrayLength];
			//System.out.print("Please input your number.");
			for (count = 0; count < sumArray.length; count++)
			{
				System.out.print("Please input your number.");
				inputScanner = new Scanner (System.in);
				int number = inputScanner.nextInt();
				sumArray [count] = number;
			
			}
			for (count = 0; count < sumArray.length; count++)
			{
				System.out.print(sumArray[count] + ", ");
			}
			inputScanner.close();
		}
	}

}
