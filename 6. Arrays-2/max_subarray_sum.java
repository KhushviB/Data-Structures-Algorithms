import java.util.*;
public class max_subarray_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i =0; i <num.length; i++){
            num[i] = sc.nextInt();
        }
        sum(num);

    }
    public static void sum(int[] num){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i <num.length; i++){
            int start = i;
            for(int j =i ; j <num.length; j++){
                int end = j;
                currSum=0;
                for(int k = start; k <= end; k++){
                    currSum = currSum + num[k];
                }
                System.out.println(currSum);
                if(max < currSum){
                    max = currSum;
                }
            }
        }
        System.out.println("The maximum sum of subarrays is : " + max);
    }
}
