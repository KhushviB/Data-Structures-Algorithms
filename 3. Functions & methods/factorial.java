import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit to find its factorial");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("The factorial is : " + fact);
    }
    public static int fact(int n){
        int fact = 1;
        for(int i = n; i >=1 ; i--){
            fact = fact*i;
        }
        return fact;
    }
}
