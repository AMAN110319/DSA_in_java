// public class reverse {
//     public static void main(String[] args) {
//         int []arr ={1,2,3,5,4};
//         int arr2[]=new int[arr.length];
//         for(int i=0; i<arr.length; i++){
//             int temp = arr[i];
//             arr2[i]=arr[arr.length-i-1];
//             arr2[arr.length-i-1]=temp;
//         }
//         for(int i=0; i<arr2.length; i++){
//             System.out.print(arr2[i]+" ");
//         }
//     }
    
// }


// 2nd method ---> simpler code
public class reverse{
    public static void main(String[] args) {
        int []arr={1,2,34,34,78,34,88,34,34,67};
        for(int i=arr.length-1; i>=0; i--){
             System.out.println(arr[i]+" ");
        }
    }
}