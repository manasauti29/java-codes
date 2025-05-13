package BaseCodes;
import java.util.Scanner;
public class SumNumInGivenInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uplim =0;
		int lolim =0;
		int sum = 0 ;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter upper limit: ");
		uplim = input.nextInt();
		System.out.println("Enter lower limit: ");
		lolim = input.nextInt();
		
		for (int i=lolim;i<=uplim;i++)
			sum+=i;
		System.out.println("Sum of numbers in given limit is: "+sum);
			
		
		
	}

}
