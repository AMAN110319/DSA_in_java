import java.util.*;
public class mcm_memoization {
    public static int matcmul(int arr[],int i,int j,int dp[][]){
        // base case
        if(i==j){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        // recursion
        for(int k=i;k<=j-1;k++){
            int cost1 = matcmul(arr,i,k,dp);
            int cost2 = matcmul(arr,k+1,j,dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalcost =cost1 + cost2 + cost3;
            ans = Math.min(ans,finalcost);
        }
        return dp[i][j]= ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n= arr.length;
        int dp[][]=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(matcmul(arr,1,n-1,dp));

    }
}

