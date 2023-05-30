import java.util.*;

public class mcm{
    public static int matcmul(int arr[],int i,int j){
        // base case
        if(i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        // recursion
        for(int k=i;k<=j-1;k++){
            int cost1 = matcmul(arr,i,k);
            int cost2 = matcmul(arr,k+1,j);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalcost =cost1 + cost2 + cost3;
            ans = Math.min(ans,finalcost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        int n= arr.length;
        System.out.println(matcmul(arr,1,n-1));
    }
}