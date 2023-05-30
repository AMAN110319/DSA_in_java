import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        int []arr={12,34,5,3,7,2};
        for (int i=0;i<arr.length-1;i++) {
            int smallest = i;
            for (int j=i+1;j<arr.length;j++){
                 if(arr[smallest]>arr[j]){
                    smallest = j;
                 }
            }
            // now swapping will be done
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
