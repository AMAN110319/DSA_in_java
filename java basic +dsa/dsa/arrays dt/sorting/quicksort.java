public class quicksort {
    public static int partition(int []arr, int low, int high){
        int pivot = arr[high];//last element as pivot

        int i = low-1;//it tells how much space we create 
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;//khali jagah badh gyi--> for storing smaller elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }   
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp; 
        return i; //pivot index
    }

    public static void quickSort(int arr[],int low,int high){
        if(low<high){//always low pointer should be lesser than 
            int pindx = partition(arr,low,high);// returns the correct  index of pivot
            // sub arrays
            quickSort(arr,low,pindx-1);
            quickSort(arr,pindx,high);
        }
    } 
   public static void main(String[] args) {
    int []arr={6,3,9,1,5,2,8};
    int n = arr.length;
    quickSort(arr,0,n-1);
    //print
    System.out.println("the sorted array...");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + "\t");
    }
   } 
}
