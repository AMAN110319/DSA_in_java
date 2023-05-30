import java.util.*;
public class q1{

    // public static boolean getduplicates(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[j]==arr[i]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
// O(n) mein hoga
    public static void main(String[] args){
        int nums[]={1,2,3,1};
        boolean flag =false;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
        if(set.contains(nums[i])){
            flag=true;
        }
        else{
            set.add(nums[i]);
        }
        }
        if(flag){
            System.out.println("the array contains duplicates");
        }

    }
}