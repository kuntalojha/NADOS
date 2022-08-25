import java.lang.Math;
import java.util.*;
public class gettingStarted_13_PrimeTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner kuntal = new Scanner (System.in);
        int low = kuntal.nextInt();
        int high = kuntal.nextInt();
        for(int i=low ;i<=high;i++)
        {
            int count = 0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {   count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(i);

        }
    }
}