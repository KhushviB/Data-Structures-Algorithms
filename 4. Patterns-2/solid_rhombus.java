public class solid_rhombus {
    public static void main(String args[]){
        rhombus(5,5);
    }
    public static void rhombus(int r, int c){
        int spaces = c-1;
        for(int i = 1; i <= r; i++){
            for(int k = spaces; k >= 1; k--){
                System.out.print(" ");
            }
            spaces--;
            for(int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
