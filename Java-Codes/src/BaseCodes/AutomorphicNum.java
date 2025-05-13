package BaseCodes;

public class AutomorphicNum {
	public static void main(String[] args)
			{
				int num = 7;
				
				int lasDigSq, lasDigNum =0;
				int sqrNum = (num*num);
				lasDigSq = sqrNum%10;
				lasDigNum = num%10;
				
				if(lasDigNum==lasDigSq)
				{
					System.out.println(num + " is an Automorphic number");
				}
				else
					System.out.println(num + " is NOT an Automorphic number");
			}

}
