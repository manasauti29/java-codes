import java.util.Scanner;

public class StrPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String og_str = str;


        String revstr = "";

        for(int i=str.length()-1;i>=0;i--)
            revstr = revstr + str.charAt(i);
        
        if(revstr.equals(og_str))
        {
            System.out.println(og_str +" is a palindrome");
        }
        else{
            System.out.println(og_str +" is not a palindrome");
        }
    }
}