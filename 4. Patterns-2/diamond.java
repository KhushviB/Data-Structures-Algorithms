public class diamond {
    public static void main(String args[]){
        pattern(10, 10);
    }
    public static void pattern(int r, int c){
        int space = c/2;
        for(int i = 1; i <= r/2; i++){
            for(int j = space; j > 0; j--){
                System.out.print(" ");
            }
            space--;
            for(int k1 = 1; k1 <= i ; k1++){
                System.out.print("*");
            }
            for(int k2 = 2; k2 <= i ; k2++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = r/2; i >= 1; i--){
            for(int j = 0; j <= space; j++){
                System.out.print(" ");
            }
            space++;
            for(int k1 = i; k1 >= 1 ; k1--){
                System.out.print("*");
            }
            for(int k2 = i; k2 >= 2 ; k2--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
