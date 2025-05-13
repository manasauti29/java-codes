package BaseCodes;
import java.util.Scanner;

public class EvenOdd{
	public static void main(String[]args) {
		System.out.println("Enter a number: ");
		int num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if (num>=0)
			if (num % 2 == 0)
				System.out.println(num+ " is an EVEN number");
			else 
				System.out.println(num+" is an ODD number");
		else 
			System.out.println("given is not a valid number");
	}
}