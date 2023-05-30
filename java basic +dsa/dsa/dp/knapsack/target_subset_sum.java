// dp tabulation approach that is it the iterative approach been used here 

import java.util.*;
public class target_subset_sum {
    
    public static void print(boolean dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean target_subsetsum(int arr[], int sum){
       boolean dp[][]=new boolean[arr.length+1][sum+1]; 
        // i --> items and j--> target sum
       for(int i=0;i<arr.length+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<sum+1;j++){
                // include
                if(arr[i-1]<=j && dp[i-1][j-arr[i-1]]==true){
                    dp[i][j]=true;
                }
                // exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        print(dp);
        // returning the last sum of the following
        return dp[arr.length][sum];
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,1,3};
        int sum = 10;

        System.out.println(target_subsetsum(arr, sum));
    }
}
