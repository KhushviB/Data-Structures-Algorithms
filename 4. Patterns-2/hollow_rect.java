public class hollow_rect {
    public static void main(String args[]){
        hollowRect(4,4);
    }

    public static void hollowRect(int r, int c){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}