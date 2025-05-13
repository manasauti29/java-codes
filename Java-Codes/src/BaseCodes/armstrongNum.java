package BaseCodes;
import java.util.Scanner;

public class armstrongNum {
	
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int len = 0;
		//int num = 407;
		len = order(num);
		
		if(isArmstrong(num,len))
		{
			System.out.print(num + " is an armstrong");
		}
		else
			System.out.print(num + " is not an armstrong");
	}
	static int order(int x)
	{	
		int len = 0;
		while(x!=0)
		{
			len++;
			x = x/10;
		};
		return len;
	}
	
	static boolean isArmstrong(int num, int len)
	{
		int temp, digit, sum = 0;
		temp = num;
		while(temp!=0)
		{
			digit = temp%10;
			sum = sum + (int)Math.pow(digit, len);
			temp  = temp /10;
			
		};
		return num==sum;
		
	}
}
