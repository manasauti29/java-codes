package BaseCodes;

public class FibonacciNth {

	public static void main(String[] args) {
		
		int n = 5;
		//first 2 terms -- 0 and 1
		int a = 0;
		int b = 1;
		
		System.out.print(a + " , " + b + " , ");
		int nextTerm;
		
		//rest of the terms
		for(int i =2;i<n;i++)
		{
			nextTerm= a+b;
			a=b;
			b=nextTerm;
			System.out.print(nextTerm+" , ");
		};
		
	}

}
