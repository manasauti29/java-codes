package BaseCodes;
import java.util.Scanner;

public class AbundantNum {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
	
		int num = input.nextInt();
		int sumOfFactors = sumFact(num);
		if(num<sumOfFactors)
		{
			System.out.println("As " +num+ " is less than  "+ sumOfFactors+ "," +num + " is a Abundant Number");
		}
		else
			System.out.println(num+" is NOT a Abundant Number");
	}
	static int sumFact(int n)
	
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("factor is " + i);
				sum =sum+i;
			}
		}
		System.out.println("Their Sum is "+sum);
		return sum;
	}

}
