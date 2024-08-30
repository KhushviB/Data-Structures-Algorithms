public class binary_decimal {
    public static void main(String args[]){
        binToDec(101);
    }
    public static void binToDec(int binNum){
        int num = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum/=10;
        }
        System.out.println("Your Decimal Number is : " + decNum + " of binary number " + num);
    }
}
