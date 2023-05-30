// it is also a variation of unbounded knapsack 
// we need to focus on the building dp
import java.util.*;
public class rod_cutting {
    public static int max_profit(int length[],int prices[],int W,int dp[][]){
        // initialize
        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        // now main code 
        for(int i=1;i<prices.length+1;i++){
            for(int j=1;j<W+1;j++){
                // valid case
                if(length[i-1]<=j){
                    dp[i][j]=Math.max(prices[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                }
                // invalid
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        print(dp);
        return dp[prices.length][W];
    }

    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int length[]={1,2,3,4,5,6,7,8};
        int prices[]={1,5,8,9,10,17,17,20};
        int rodLength=8;
        int dp[][]=new int[prices.length+1][rodLength+1];
System.out.println(max_profit(length, prices,rodLength,dp));
    }
}
