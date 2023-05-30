import java.util.*;
public class catalan{
//     public static int catalanrec(int n){
//         // base case
//         if(n==0||n==1) return 1;
//         // recursive case
//         int ans =0;
//         for(int i=0;i<n;i++){
//         ans +=catalanrec(i)*catalanrec(n-i-1);
//     }
//     return ans;
// }



//     public static int catalanrecMem(int n){
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         // base case
//         if(n==0||n==1) return 1;

//         if(dp[n] !=-1){
//             return dp[n];
//         }
//         // recursive case
//         int ans =0;
//         for(int i=0;i<n;i++){
//         ans +=catalanrecMem(i)*catalanrecMem(n-i-1);
//     }
//     dp[n]=ans;
//     return dp[n];
// }



public static int catalanTab(int n){
    int dp[]=new int[n+1];
    dp[0]=dp[1]=1;
    for(int i=2;i<=n;i++){
        for(int j=0;j<=i-1;j++){
            dp[i] += dp[j]*dp[i-j-1];

        }
    }
    return dp[n];
}
public static void main(String[] args) {
    int n=4;
    System.out.println(catalanTab(n));
}
}