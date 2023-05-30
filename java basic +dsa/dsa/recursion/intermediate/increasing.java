public class increasing {
    public static boolean isSorted(int arr[],int idx){
        if(arr.length-1==idx){// -1 because array out of bound
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7};
        if(isSorted(arr,0)){
            System.out.println("the array is strictly sorted");
        }
        else{
            System.out.println("the array is not strictly sorted");
        }
    }
}
