package BaseCodes;
import java.util.Scanner;
public class PrimeNum {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num = input.nextInt();
		checkPrime(num);
	}
		
		private static void checkPrime(int num)
		{
			int count  = 0;
			if (num<2)// as negatives, 0 and 1 are not prime numbers
				System.out.println(num +" is NOT a prime number");
			
			for (int i=1;i<=num;i++)
				if (num%i==0)
					{count+=1;}
			
			if (count>2)
				System.out.println(num +" is NOT a prime number");
			else
				System.out.println(num +" is a prime number");
				
			
		}
	
}
