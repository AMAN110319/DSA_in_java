import java.util.*;
public class heap_sort {
    public static void heapify(int i,int size,int arr[]){
        int left = 2*i+1;
        int right =2*i+2;
        int root = i;
        if(left<size && arr[left]>arr[root]){
            root = left;
        }
        if(right<size && arr[right]>arr[root]){
            root = right;
        }if(root != i){
            // swap
           int temp = arr[i];
           arr[i]=arr[root];
           arr[root]=temp;
           heapify(root,size,arr);
        }

    }

    public static void heapsort(int arr[]){
        // buildmaxheap
        int n= arr.length;

        // first time max heap is built
        
        for(int i=n/2;i>=0;i--){
            heapify(i,n,arr);
        }

        // push largest at end
        for(int i=n-1;i>0;i--){
            // swap
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(0,i,arr);
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
