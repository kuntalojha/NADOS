import java.util.Scanner;

public class gettingStarted_10_TakeInput {
    public static void main(String[] args) {
        // This one use for int 
        Scanner kuntal = new Scanner (System.in);
        int n = kuntal.nextInt();
        System.out.println("YOU ENTER "+n);

        // This one use for String
        System.out.println("ENTER YOUR NAME");
        Scanner kuntal = new Scanner (System.in);
        String k = kuntal.nextLine();
        System.out.println("YOU NAME "+k);
    }   
}
