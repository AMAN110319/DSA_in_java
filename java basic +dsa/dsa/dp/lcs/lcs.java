import java.util.*;
public class lcs{
    public static int count(String s1, String s2,int n,int m){
        // base case
        if(m==0||n==0){
            return 0;
        }


        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return count(s1,s2,n-1,m-1)+1;
        }
        else{
            int num1 = count(s1,s2,n-1,m);
            int num2 = count(s1,s2,n,m-1);
            return Math.max(num1,num2);
        }
    }


    //memoization
    public static int countMemoization(String s1, String s2,int n,int m,int dp[][]){
        // base case
        if(m==0||n==0){
            return 0;
        }

        // checking for answer exist or not 
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=countMemoization(s1,s2,n-1,m-1,dp)+1;
        }
        else{
            int num1 = countMemoization(s1,s2,n-1,m,dp);
            int num2 = countMemoization(s1,s2,n,m-1,dp);
            return dp[n][m]=Math.max(num1,num2);
        }
    }
    public static void main(String[] args) {
        String s1="abcde",s2="ace";
        int n=s1.length(),m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        System.out.println(count(s1,s2,n,m));
        System.out.println(countMemoization(s1,s2,n,m,dp));

    }
}