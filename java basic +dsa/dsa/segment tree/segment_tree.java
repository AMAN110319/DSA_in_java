// calculating the subarray sum and range quieries 

import java.util.*;
public class segment_tree{
    static int tree[];
    public static void init(int n){
        tree =new int[4*n];
    }
    public static int build(int []arr,int i,int si,int ei){
        if(si==ei){
            tree[i]=arr[si];
            return tree[i];
        }
        int mid = (si+ei)/2;
        int leftsum=build(arr, 2*i+1, si, mid);
        int rightsum = build(arr, 2*i+2, mid+1, ei);
        tree[i]=leftsum+rightsum;
        return tree[i];
    }




// updation on segment tree
public static void updateUtil(int i, int si, int sj,int idx, int diff){
    if(idx>sj||idx<si){
        return;
    }
    tree[i]+=diff;
    if(si!=sj){
        // non leaf
        int mid=(si+sj)/2;
        updateUtil(2*i+1,  si, mid, idx, diff);
        updateUtil(2*i+2, mid+1,sj, idx, diff);
    }
}

public static void update(int arr[],int idx, int newVal){
    int n=arr.length;
    int diff= newVal-arr[idx];
    arr[idx]=newVal;

    updateUtil(0,0,n-1,idx,diff);
}
      


    // query on segment tree

    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if(qj<=si|| qi>=sj){
            return 0;
        }
        if(qj>=sj && qi<=si){
            return tree[i];
        }
        else{
        int mid = (si+sj)/2;
        return getSumUtil(2*i+1,si,mid,qi,qj)+getSumUtil(2*i+2,mid+1,sj,qi,qj);
        }
    }
    public static int getSum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumUtil(0, 0, n-1, qi, qj);
    }
    
    
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        build(arr, 0, 0, n-1);
        // for(int i=0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }
        System.out.println(getSum(arr, 2, 5));
        update(arr, 3, 10);
        System.out.println(getSum(arr, 2, 5));
        
    }
}