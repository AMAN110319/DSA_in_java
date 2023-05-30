// works on divide and conquer technique
//  O(nlogn) --> time complexity

public class mergesort {
    // O(n)
    public static void conquer(int[]arr,int si,int mid,int ei){
        int []merged_arr = new int[ei-si+1];
        int i=si;//tracking the first array elements
        int j=mid+1; // tracking the second array elements
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                merged_arr[k] = arr[i];
                k++;
                i++;
            }
            else{
                merged_arr[k] = arr[j];
                k++;
                j++;
            }
        }
        // jab traversal ke baad still elements of  1st half left
        while(i<=mid){
            merged_arr[k] = arr[i];
            k++;
            i++;
        }
        // jab traversal of 2nd half is left
        while(j<=ei){
            merged_arr[k] = arr[j];
            k++;
            j++;
        }


        // for copying the elements into the array
        for(int z=0,a=si; z<merged_arr.length;z++,a++){
            arr[a]=merged_arr[z];
        }
    }

    public static void divide(int []arr,int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        // recursive wala part hai 
        int mid = si +(ei-si)/2;//(si+ei)/2
        divide(arr,si,mid); // 1st half
        divide(arr,mid+1,ei); //2nd half
        conquer(arr,si,mid,ei); //merged them
    }
    public static void main(String[] args) {
        int []arr={6,3,9,5,2,8};
        int n= arr.length;
        int si=0,ei=n-1;
        divide(arr,si,ei);
        // printing array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


// time complexity = O(n*logn)
