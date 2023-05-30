public class q3 {
        public int maxProfit(int[] prices) {
            int maxprofit = 0;
            int buyprice = Integer.MAX_VALUE;
            for(int i=0;i<prices.length;i++){
    //             and jab price jyada hai toh sell kar diya
                if(buyprice<prices[i]){
                   int profit = prices[i]-buyprice;
                    maxprofit = Math.max(profit,maxprofit);
                }
                
    //             jab price sasti h tab buy kar liya 
                else{
                    buyprice = prices[i];
                }
            }
            return maxprofit;
        }
    }
