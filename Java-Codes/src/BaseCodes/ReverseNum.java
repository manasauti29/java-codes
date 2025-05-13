package BaseCodes;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456;
//		int reverse=0;
//		int last;
		
//using WHILE loop
//		while (num!=0)
//		{
//			last = num%10;
//			reverse = reverse*10 + last;
//			num = num /10;
//			
//		};
//		System.out.println("The reversed digits is: "+reverse);
//
	
//using FOR loop
//		for (;num!=0;num=num/10)
//		{
//			last = num%10;
//			reverse = reverse*10 + last;
//		}
//		System.out.println("The reversed digits is: "+reverse);
		
//making a function called getReversed for reversing the digits.
		getWhileReversed(num);
		getForReversed(num);
	}
	
	static void getWhileReversed(int num)
	{
		int reverse=0;
		int last;
		while (num!=0) {
			last = num%10;
			reverse = reverse*10+last;
			num = num /10;
		};
		System.out.println("The reversed digits using While loop are: "+reverse);
	}
	
	static void getForReversed(int num)
	{
		int reverseFor=0;
		int last;
		for(;num!=0;num=num/10)
		{
			last = num %10;
			reverseFor = reverseFor*10 + last;			
		}
		System.out.println("The reversed digits using For loop are: "+reverseFor);
	}
	
}
