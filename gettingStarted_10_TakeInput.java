import java.util.Scanner;

public class gettingStarted_10_TakeInput {
    public static void main(String[] args) {
        Scanner kuntal = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = Integer.parseInt(kuntal.nextLine()); // int n = kuntal.nextInt();
        System.out.println("YOU ENTER "+n);

        // This one use for String
        System.out.println("ENTER YOUR NAME");
        // Scanner kunta = new Scanner (System.in);
        String k = kuntal.nextLine();
        System.out.println("YOU NAME "+k);
    }   
}
