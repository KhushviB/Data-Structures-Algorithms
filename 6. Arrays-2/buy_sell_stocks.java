public class buy_sell_stocks {
    public static void main(String arg[]){
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(stock(prices));
    }
    public static int stock(int[] prices){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0; i< prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
}
