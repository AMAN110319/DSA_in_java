import java.util.*;
public class sliding_window{
    public static void main(String[] args) {
        int arr[] ={2,5,1,8,2,9,1};
        int k=3;
        int i=0,j=0;
        int sum = 0;
        int ans = 0;

        while(j<arr.length){
            sum = sum +arr[j];
            
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                ans = Math.max(sum,ans);
                sum = sum -arr[i];
                i++;
                j++; 
            }
        }

        System.out.println(ans);
        

    }
}