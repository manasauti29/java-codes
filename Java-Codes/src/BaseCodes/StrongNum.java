package BaseCodes;

public class StrongNum {
	public static void main(String[]args)
	{
	     int num = 155;

	     if (isStrong (num))
	         System.out.println (num + " is Strong Number");
	     else
	         System.out.println (num + " is not a Strong Number");
	}
	static int facto(int n)
	{
		int fact = 1;
		for(int i =1;i<=n;i++)
		{
			fact = fact * i;
		}
		return fact;
		
	}
	
	
	static boolean isStrong(int num)
	{
		int dig, sum = 0;
		int temp = num;
		boolean flag = false;
		
		while(temp!=0)
		{
			dig = temp %10;
			sum = sum + facto(dig);
			temp = temp /10;
		}
		if (sum==num)
			flag =true;
		else
			flag = false;
		return flag;
		
		
	}

}
