public class decimal_binary {
    public static void main(String args[]){
        decToBin(10);
    }
    public static void decToBin(int decNum){
        int num = decNum;
        int pow =0;
        int binNum =0;
        while(decNum>0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("You binary number is : " + binNum + " of decimal number " + num);
    }
}
