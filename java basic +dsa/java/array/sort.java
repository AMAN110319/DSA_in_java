public class sort {
    public static void main(String[] args) {
        int []arr={1,34,56,3,23,678,87,8};
        System.out.println("the original array");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                // // for ascending
                // if(arr[j]<arr[i]){
                //     // swapping the numbers 
                //     int temp = arr[j];
                //     arr[j] = arr[i];
                //     arr[i] = temp;
                // }

                // for descending
                if(arr[i]<arr[j]){
                    // swapping the numbers 
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("\n the sorted array is:");
        for (int i=0; i<arr.length;i++){ 
            System.out.print(arr[i]+" ");
        }
    }
}
