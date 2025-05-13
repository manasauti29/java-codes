package BaseCodes;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number with multiple digits");
		int num = input.nextInt();
		// getSum(num);
		int sum = getSum(num);
		System.out.println("Sum of digits is " + sum);
		
	}
//	static void getSum(int num){
//		int sum =0;
//		while (num!=0)
//		{
//			sum = sum + (num%10);
//			num = num / 10;
//		}
//				System.out.println("Sum of numbers is: "+sum);
//		
//		
//	}
	
// using RECURSION
	
	static int getSum(int num){
		if (num==0)
			return 0;
		return (num%10)+ getSum(num/10);
		
	}

}
