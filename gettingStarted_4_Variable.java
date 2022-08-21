public class gettingStarted_4_Variable {
    public static void main(String[] args) {
        int x =10;
        int y = 15;
        int sum = x+y;
        System.out.println("Sum of "+ x + " and "+y+" is "+ sum);
        int prd = x*y;
        System.out.println("Product of "+x+ " and "+y+ " is " + prd);
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        int exp = x * y / x + y; // 15 
        System.out.println(exp);
    }
}
