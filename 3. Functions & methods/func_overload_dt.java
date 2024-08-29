import java.util.*;

public class func_overload_dt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        int sum1 = sum(a,b);
        double sum2 = sum(a,c);
        System.out.println("Sum 1 = " + sum1);
        System.out.println("Sum 2 = " + sum2);

    }

    public static int sum(int a, int b){
        int ans = a+b;
        return ans;
    }
    public static double sum(int a, double b){
        double ans = a+b;
        return ans;
    }
}
