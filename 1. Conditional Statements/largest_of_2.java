import java.util.*;
public class largest_of_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is largest");
        } else {
            System.out.println(num2 + " is largest");
        }
    }
}
