// last occurence - 1st occurrence +1
public class count{

    public static int countTotal(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=searchIndex(nums,target,true);
        ans[1]=searchIndex(nums,target,false);

        return ans[1]-ans[0]+1;
    }
    
    
    
    
    public static int searchIndex(int[] nums,int target,boolean isStartIndex){
        int n=nums.length;
        int left=0;
        int right=n-1;
        //default ans would be -1
        int ans=-1;
        //applying binary search
        while(left<=right){
            //find the middle 
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                //possible ans
                ans=mid;
                //if true search for start in leftSpace else search for end in rigthSpace
                if(isStartIndex)
                    right=mid-1;
                else
                    left=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int []arr={2,4,10,10,10,18,20};
        System.out.println(countTotal(arr,10));
    }
}