public class butterfly_pattern {
    public static void main(String args[]){
        pattern(8,8);
    }
    public static void pattern(int r, int c){
        int spaces = (c/2);
        for(int i = 1; i <= r/2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = (spaces*2)-2; k >= 0; k--){
                System.out.print(" ");
            }
            spaces--;
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = r/2; i >=1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            for(int k=0; k <= (spaces*2); k++){
                System.out.print(" ");
            }
            spaces++;
            for(int l = i; l >= 1; l--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
