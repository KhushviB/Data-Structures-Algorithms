public class inverted_half_pyramid {
    public static void main(String args[]){
        half_pyramid(5);
    }
    public static void half_pyramid(int n){
        int spaces = n-1;
        for(int i = 1; i <= n; i++){
            for(int k = spaces; k > 0; k-- ){
                System.out.print(" ");
            }
            spaces--;
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
