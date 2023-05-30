public class copy_arr{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println("the original array is :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int []arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr2[i] = arr[i];
        }

        System.out.println("the copied array is :");
        for(int i =0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

    }
}