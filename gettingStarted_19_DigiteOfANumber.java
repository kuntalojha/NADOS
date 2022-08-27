import java.util.*;
import java.lang.Math;
public class gettingStarted_17_Count_In_A_Number {
  	public static void main(String[] args) {
      Scanner kuntal = new Scanner (System.in);
      int n = kuntal.nextInt();
      int count=0;
      for(;n>0;n=n/10)
       {
        count++;
       }
      int x = (int)Math.pow(10,count-1);
      while(x!=0){

      }
      System.out.println(count);
	}
}


