package BaseCodes;

public class armstrongNuminRange {
	
	public static void main(String[]args)
	{
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number: ");

		int len = 0;
		int lower = 2;
		int upper = 1000;
		
		for(int i=lower;i<upper;i++)
		{	
			len = order(i);
			if (isArmstrong(i,len))
			{
				System.out.println(i);
			}
			
		}
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