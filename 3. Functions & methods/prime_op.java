import java.util.*;
public class prime_op {
    public static void main(String args[]){
        System.out.println(check_prime(23));
    }
    public static boolean check_prime(int n){
        if(n==2){
            return true;
        }

        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
