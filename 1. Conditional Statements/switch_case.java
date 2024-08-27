import java.util.*;
public class switch_case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your order : ");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Fries");
        System.out.println("4. Sandwich");
        System.out.println("5. Coke");
        System.out.println("6. MilkShake");
        System.out.println("Enter your order no. : ");
        int order = sc.nextInt();
        switch(order){
            case 1:
            System.out.println("Pizza is ordered");
            break;
            case 2:
            System.out.println("Burger is ordered");
            break;
            case 3:
            System.out.println("Fries is ordered");
            break;
            case 4:
            System.out.println("Sandwich is ordered");
            break;
            case 5:
            System.out.println("Coke is ordered");
            break;
            case 6:
            System.out.println("Milkshake is ordered");
            break;
            default:
            System.out.println("Please enter between 1 to 6 only");
        }
    }
}
