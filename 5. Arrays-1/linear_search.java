import java.util.*;
public class linear_search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i =0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter digit to search");
        int search = sc.nextInt();
        int ans = search(search, numbers);
        if(ans == -1){
            System.out.println(search + " not found!!");
        } else {
            System.out.println(search + " found!!");
        }
    }
    public static int search(int key, int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return numbers[i];
            }
        }
        return -1;
    }
}
