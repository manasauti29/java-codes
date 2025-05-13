package BaseCodes;

public class PowerNum {
	public static void main(String[]args)
	{
		int num = 2;
		int pow = 3;
		int result = power(num,pow);
		System.out.println(result);
	}

//	static int power(int n,int p)
//	{	
//		int res = 1;
//		while(p!=0)
//		{
//			res = res *n;
//			p = p-1;
//		}
//		return res;
//	}
	
//	static int power(int n, int p)
//	{
//		int res = 1;
//		for (int i=1;i<=p;i++)
//		{
//			res = res *n;
//		}
//		return res;
//	}
	
	static int power(int n, int p)
	{
		if(n==1 || p==0)
		{
			return 1;
		}
		else if(n==0)
		{
			return 0;
		}
		return n * power(n,p-1);
	}
}
