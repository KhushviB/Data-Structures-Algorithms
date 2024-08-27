import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String ch = sc.next();
        switch(ch){
            case "+":
            System.out.println(num1+num2);
            break;
            case "-":
            System.out.println(num1-num2);
            break;
            case "*":
            System.out.println(num1*num2);
            break;
            case "/":
            System.out.println(num1/num2);
            break;
            default:
            System.out.println("Enter only +,-,*,/  No other operators");
        }
    }
}
