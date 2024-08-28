import java.util.Scanner;

class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        int og_num = num;
        
        while(num!=0)
        {
            rev=rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);
        if(rev==og_num)
        {
            System.out.println("Is a Palindrome");
        }
        else
        {
            System.out.println("Is not a Palindrome");
        }
                
    }
}