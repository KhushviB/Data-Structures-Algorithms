import java.util.*;
public class basics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
