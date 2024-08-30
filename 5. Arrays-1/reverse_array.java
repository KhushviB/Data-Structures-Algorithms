import java.util.*;
public class reverse_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i =0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        reverse(num);

    }
    public static void reverse(int[] num){
        int start = 0;
        int end = num.length-1;
        while(start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
        for(int i =0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
