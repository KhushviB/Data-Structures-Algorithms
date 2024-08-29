import java.util.*;
public class binomial_coefficient {
    public static int fact(int n){
        int fact = 1;
        for(int i = n; i >=1 ; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter r :");
        int r = sc.nextInt();
        int factOfn = fact(n);
        int factOfr = fact(r);
        int factOfnr = fact(n-r);
        double ans = factOfn / (factOfr * factOfnr);
        System.out.println("The binomial coeeficient is : " + ans);

    }
}
