import java.util.*;
public class largest_from_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i =0; i< num.length; i++){
            num[i] = sc.nextInt();
        }
        int ans = find(num);
        System.out.println("The largest number from array is " + ans);
    }
    public static int find(int[] num){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }
}
