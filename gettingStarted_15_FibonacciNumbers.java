import java.lang.Math;
import java.util.*;
public class gettingStarted_15_FibonacciNumbers{
    public static void main(String[] args) {
        // write your code here
        Scanner kuntal = new Scanner (System.in);
        int Numbers = kuntal.nextInt();
        int a=0, b=1,c=0;
        for(int i=1 ;i<=Numbers;i++)
        {
            System.out.println(c);
            c=a+b;
            b=a;
            a=c;
        }
    }
}