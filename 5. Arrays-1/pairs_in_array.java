import java.util.*;
public class pairs_in_array {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i =0; i< num.length; i++){
            num[i] = sc.nextInt();
        }
        pairs(num);
    }
    public static void pairs(int[] num){
        for(int i =0; i< num.length; i++){
            for(int j = i+1; j < num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println("");
        }
    }
}
