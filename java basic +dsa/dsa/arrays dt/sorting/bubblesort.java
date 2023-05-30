import java.util.*;

public class bubblesort{
    public static void main(String[] args) {
        int arr[]={3,5,2,7,4,98};//size=6
        // for passes -->size-1
        for(int i=0; i<arr.length-1; i++){
            // no of comparison or swaps
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}