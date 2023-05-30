import java.util.*;
public class array_jumps{
    public static int minJumps(int arr[]){
        int n = arr.length;
        int dp[]=new int[n];
        // filled the array with a value of -1
        Arrays.fill(dp,-1);
        // initialized
        dp[n-1]=0;
        for(int i=n-2 ; i>=0;i--){
            int steps = arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps&&j<n;j++){
                //aage jaa sakte h ya nhi
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i]=ans;
            }
            else{
                dp[i]=-1;
            }
        }
        print(dp);
        return dp[0];
    }
    public static void print(int[] dp){
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(minJumps(arr));
    }
}