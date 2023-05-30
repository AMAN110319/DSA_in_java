import java.util.*;
public class lcs_tabulation {
    public static void print(int dp[][]){
        for(int i=0; i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int lcs_tab(String s1,String s2,int n,int m,int dp[][]){
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        } 
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1 =dp[i-1][j];
                    int ans2 =dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
   public static void main(String[] args) {
    String s1="abcde",s2="ace";
        int n=s1.length(),m=s2.length();
        int dp[][]=new int[n+1][m+1];

        System.out.println(lcs_tab(s1, s2, n, m, dp));
   } 
}
