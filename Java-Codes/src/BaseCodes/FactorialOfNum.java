package BaseCodes;

public class FactorialOfNum {
	public static void main(String[]args)
	{
		int num = 4;
		int result = facto(num);
		System.out.println(result);		
	}
	static int facto(int n)
	{
		int res = 1;
		for (int i = 2;i<=n;i++)
		{
			res = res * i;
		}
		return res;
	}
	
//	public static void main(String[]args)
//	{
//		int num = 4;
//		int result = factorial(num);
//		System.out.println(result);
//	}
//	static int factorial(int n)
//	{
//		if (n==0 ||n==1)
//		{
//			return 1;
//		}
//		return n *p factorial(n-1);
//	}

}
