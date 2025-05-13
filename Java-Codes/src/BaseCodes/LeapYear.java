package BaseCodes;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year u want to check: ");
		int year = input.nextInt();
		
//		if (year%400==0 || year%4==0 && year%100!=0)
//			System.out.println("Given year is a Leap Year");
//		else
//			System.out.println("Given year is NOT a Leap Year");
		boolean leap;
		if (year%400 == 0 || year%4==0 && year%100!=0)
			leap = true;
		else
		    leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

	}

}
