/*
this  is a variation question of unbounded knapsack and this question contains changes of the coin and have to 
be checked against
and the time complexity of the code is O(N*SUM)
--> here we find total  number of ways to calculate
 */
import java.util.*;
public class coin_change {
    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int totalways(int coins[],int sum, int dp[][]){
        for(int i = 0; i < dp.length; i++){
            dp[i][0]=1;
        }
        for(int i = 1; i <coins.length+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(coins[i-1]<=j){
                    //          include              exclude
                    dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[coins.length][sum];
    }
    public static void main(String[] args) {
        int coins[]={2,3,5,6};
        int sum = 10;
        int dp[][]=new int[coins.length+1][sum+1];


        System.out.println(totalways(coins,sum,dp));
    }
}
