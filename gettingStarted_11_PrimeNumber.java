import java.util.*;
  
  public class gettingStarted_11_PrimeNumber{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       // write ur code here
       int t = scn.nextInt();
       for(int i=0; i<t;i++)
       {
         int n = scn.nextInt();
         int count=0;
         for(int j=2; j<n ; j++)
         {
           if(n%j==0)
           {
             count++;
             break;
           }
         }
         if(count==0)
         {
           System.out.println("prime");
         }
         else {
           System.out.println("not prime");
         }
       }
   }
  }