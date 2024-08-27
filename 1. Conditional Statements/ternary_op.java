import java.util.*;
public class ternary_op {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = (num1 > num2)?num1:num2;
        System.out.println("The largest  is : " + ans);
    }
}
