// climbing the stairs using the recursion
import java.util.*;
public class climbing_stairs{
    public static int ways(int n){
        // base or corner cases
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        // ways for the climbing of the 1 ,2,or 3 steps

        return ways(n-1)+ways(n-2)+ways(n-3);
    }


    // memoized code for climbing stairs
    public static int ways(int n,int f[]){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(f[n]!=0){
            return f[n];
        }

        f[n]=ways(n-1,f)+ways(n-2,f);
        return f[n];
    }

    public static int ways_tabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
            dp[i]=dp[i-1];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }



     
    public static void main(String[] args) {
        int n=5;
        int []f= new int[n+1];
        System.out.println(ways(n));
        System.out.println(ways_tabulation(n));
    }
}