package BaseCodes;

public class PalinedromeNum {
	
	
	public static void main(String[]args)
	{
		int num = 121;
		System.out.println("Original is "+num);
		checkPalindrome(num);
	}
	public static int reverser(int num)
	{
		int reverse = 0;
		while (num!=0)
		{
			int last = num%10;
			reverse = reverse*10+last;
			num = num / 10;
		}
		return reverse;
	}
	static void checkPalindrome(int num)
	{
		int reversedNum = reverser(num);
				
		if (reversedNum==num)
		{
			System.out.println("The given digits are a Palindrome");
		}
		else
		{
			System.out.println("The given digits are NOT a Palindrome");
		}
		
		
	}
}


