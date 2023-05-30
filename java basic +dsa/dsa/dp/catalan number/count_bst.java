import java.util.*;
public class count_bst {
    public static int count(int n){
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                //        left * right
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(count(n));
    }
}
