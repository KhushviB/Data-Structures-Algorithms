public class hollow_rhombus {
    public static void main(String args[]){
        hollow(5,5);
    }
    public static void hollow(int r, int c){
        int spaces = c-1;
        for(int i = 1; i <= r; i++){
            for(int k = spaces; k >= 1; k--){
                System.out.print(" ");
            }
            spaces--;
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
