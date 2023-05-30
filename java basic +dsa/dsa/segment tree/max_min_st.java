public class max_min_st {
    static int tree[];
    public static void build(int n){
        tree=new int[4*n];
    }
    // creation of the tree
    public static void createST(int i,int arr[],int si,int sj){
        if(si==sj){
            // if leaf node then tree will be equal to the start node 
            tree[i]=arr[si];
            return;
        }
        int mid=(si+sj)/2;
        createST(2*i+1, arr, si,mid);
        createST(2*i+2, arr,mid+1,sj);
        tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
    }

// queries on them 
public static int  getMaxUtil(int i, int si,int sj,int qi,int qj){
// no overlap
    if(si>qj||sj<qi){
        return Integer.MIN_VALUE;
    }
    // complete overlap
    if(si>=qi&& sj<=qj){
        return tree[i];
    }
    // partial overlap
    int mid=(si+sj)/2;
    int left=getMaxUtil(2*i+1,si,mid,qi,qj);
    int right=getMaxUtil(2*i+2,mid+1,sj,qi,qj);

    return Math.max(left,right);
}
public static int getMax(int arr[],int qi, int qj){
    int n=arr.length;
    return getMaxUtil(0,0,n-1,qi,qj);
}





// updation---------------------------------------

public static void updateUtil(int i,int si, int sj, int idx,int newVal){
    if(idx<si||idx>sj){
        return;
    }
    tree[i]=Math.max(tree[i],newVal);
    if(si!=sj){
    int mid=(si+sj)/2;
    updateUtil(2*i+1, si, mid, idx, newVal);
    updateUtil(2*i+2,mid+1,sj,idx, newVal);
    }
}

public static void update(int arr[],int idx,int newVal){
    arr[idx]=newVal;
    int n=arr.length;
    updateUtil(0,0,n-1,idx,newVal);
}



    public static void main(String[] args) {
        int arr[]={6,8,-1,17,1,3,2,4};
        int n=arr.length;
        build(n);
        createST(0,arr, 0,n-1);

        // for(int i=0;i<tree.length;i++){
        //     System.out.print(tree[i]+" ");
        // }

        System.out.println(getMax(arr, 0, 2));
        update(arr,2,20);
        System.out.println(getMax(arr, 0, 2));
    }
}
