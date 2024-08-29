import java.util.*;
public class func_overload {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans1 = add(a, b);
        int ans2 = add(a,b,c);
        System.out.println("Ans 1 = " + ans1);
        System.out.println("Ans 2 = " + ans2);
    }
    public static int add(int a, int b){
        int ans = a+b;
        return ans;
    }
    public static int add(int a, int b, int c){
        int ans = a+b+b;
        return ans;
    }
}
