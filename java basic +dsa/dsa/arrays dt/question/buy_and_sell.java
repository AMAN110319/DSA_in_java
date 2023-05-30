import java.util.*;
public class buy_and_sell {
    public static int max_profit(int []prices){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i = 0; i < prices.length; i++){
            int curr = prices[i];//curr or selling prices
            if(buyprice<curr){
                int profit = curr - buyprice;
                maxprofit = Math.max(maxprofit, profit);

            }
            else{
                buyprice = curr;
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int x=max_profit(prices);
        System.out.println(x);
    }
}
