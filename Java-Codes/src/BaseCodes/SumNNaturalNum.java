package BaseCodes;
import java.util.Scanner;

public class SumNNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		System.out.println("Enter N: ");
		Scanner input = new Scanner(System.in);
		n =input.nextInt();
		
//		using For Loop
		for (int i=1; i<=n;i++)
			sum+=i;
			System.out.println("Sum of first "+n+" Natural Numbers is: "+sum);
			
//		using sum of nTH term formula
//		System.out.println("sum is " + n*(n+1)/2);
			
		
		

	}

}
