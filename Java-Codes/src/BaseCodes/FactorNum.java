package BaseCodes;

public class FactorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		factors(num);
		//System.out.println(result);

	}
	static void factors(int n)
	{
		for(int i =1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" ");
			}
		}
		System.out.println(n);
	}

}
