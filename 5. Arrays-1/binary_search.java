import java.util.*;
public class binary_search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Enter in sorted manner");
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the digit to search");
        int find = sc.nextInt();
        int ans = search(find, 0, num.length, num);
        if(ans == -1){
            System.out.println("Element not found!!!");
        } else {
            System.out.println("Element Found!!!");
        }

    }

    public static int search(int key, int start, int end, int[] num){
        
        while(start <= end){
            int mid = (start+end)/2;
            if(mid == key){
                return 1;
            }
            else if(mid > key){
                end = mid-1;
                search(key, start, end, num);
            }
            else if(mid < key){
                start = mid + 1;
                search(key, start, end, num);
            }
        }
        return -1;
    }
}
