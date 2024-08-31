import java.util.*;
public class print_subarrays {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        print_sa(num);
    }
    public static void print_sa(int[] num){
        for(int i =0; i<num.length; i++){
            int start = i;
            for(int j =i; j<num.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.print(", ");
            }
            System.out.println("");
        }
    }
}
