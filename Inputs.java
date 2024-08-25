import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll no.: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is: "+ rollno);

        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println(name);

        System.out.print("Enter your marks in decimals for float representation: ");
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
