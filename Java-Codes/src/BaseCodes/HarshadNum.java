package BaseCodes;
import java.util.Scanner;
public class HarshadNum {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		if(num%sumDigi(num)==0)
		{
			System.out.println(num+" is a Harshad Number");
		}
		else
		{
			System.out.println(num+" is NOT a Harshad Number");
		}
	}
	static int sumDigi(int n)
	{
		int temp, digi, sum = 0;
		temp = n;
		while(temp!=0) {
			digi = temp%10;
			sum = sum + digi;
			temp= temp/10;
		}
		return sum;


	}
}
