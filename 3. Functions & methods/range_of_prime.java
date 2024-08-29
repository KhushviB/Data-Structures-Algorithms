public class range_of_prime {
    public static void main(String args[]){
        print_range(20);
    }
    public static boolean check_prime(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
    public static void print_range(int n){
        for(int i=2;i<=n;i++){
            if(check_prime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
