import java.util.*;
public class prime {
    public static void main(String args[]){
        System.out.println(check_prime(15));
    }
    public static boolean check_prime(int n){
        //corner cases
        if(n == 2){
            return true;
        }

        for(int i =2; i<= n-1 ; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
