import java.util.*;
   
   public class gettingStarted_21_ReverseNumber{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner kuntal = new Scanner(System.in);
     int x = kuntal.nextInt();
     while(x!=0)
     {
       System.out.println(x%10);
       x=x/10;
     }
    }
   }