import java.util.*;
public class else_if {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are an Adult");
        } else if(age >= 13 && age <= 18){
            System.out.println("You are a Teenager");
        }else {
            System.out.println("You are still a child");
        }
    }
}
