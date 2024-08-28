public class StringReversal {
   public static void main(String[] args) {
       String message = "Hello this is a reversal program";
       String Rmess = "";

       for (int i=message.length()-1;i>=0;i--)
            Rmess+=message.charAt(i);
        System.out.println(Rmess);
   }
}