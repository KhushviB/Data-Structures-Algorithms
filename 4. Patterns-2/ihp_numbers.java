public class ihp_numbers {
    public static void main(String args[]){
        inverted_number_pyramid(5);
    }
    public static void inverted_number_pyramid(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
