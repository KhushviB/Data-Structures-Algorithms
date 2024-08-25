import java.util.*;

public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are an Adult");
        } else {
            System.out.println("You ar not an Adult");
        }

    }
}
