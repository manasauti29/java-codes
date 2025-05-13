package BaseCodes;
import java.util.Scanner;

public class GreatestOf2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =0;
		int n2=0;
		int max =0;
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter number 1: ");
		n1 = input.nextInt();
		System.out.println("Enter number 2: ");
		n2 = input.nextInt();
		
//		using IF loop		
		if (n1>n2)
			System.out.println(n1+" is greater than "+n2);
		else
			System.out.println(n2+" is greater than "+n1);
			
// 		using MAX function
//		if (n1==n2)
//			System.out.println("Both are equal");
//		else
//		System.out.println(Math.max(n1, n2)+" is greater");
//		
		

	}

}
