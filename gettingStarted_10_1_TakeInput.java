import java.util.Scanner;

public class gettingStarted_10_1_TakeInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        scn.nextLine(); // This one use for make work string ( next line)
        String name = scn.nextLine();
        System.out.println("Dear "+ name+ " Here is the counting.");
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }   
}
