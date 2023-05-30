/*
 There is an integer array nums sorted in ascending order (with distinct values)
 .Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length) 
  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).  
   For   example, [0,1,2,4,5,6,7] might        be        rotated       
    at        pivot        index 3   and become [4,5,6,7,0,1,2].
    Given the array nums after the possible rotation and an integer target,
     returnthe index oftarget if it is in nums, or -1   if it is not in nums.
     You must write an algorithm with O(log n) runtime complexity.
     Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], 
     target = 0 
     Output:   4 

     Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], 
     target = 3
     Output:   -1 

 */
// search in a rotated and sorted array an implementation of binary search



public class q2 {
    public static int binarysrc(int[] arr,int key){
        int si = 0;
        int ei= arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==key){return mid;}
            // check wether left sorted
            if(arr[si]<=arr[mid]){
                if(arr[si]<=key && arr[mid]>=key){
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
            // right side sorted of array 
            else{
                if(arr[mid]<=key && arr[ei]>=key){
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int key = 2;
        System.out.println(binarysrc(arr,key));
    }

}
