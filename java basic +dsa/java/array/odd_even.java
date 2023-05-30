public class odd_even {
    public static void main(String[] args) {
      int []arr={1,3,56,334,32,57,78};
      System.out.println("the even number is the given array is:");
      for (int i = 0; i < arr.length; i++){
        if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
        }
        
      } 

      System.out.println("\nthe odd number is the given array is:");
      for (int i = 0; i < arr.length; i++){
        if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");
        }

      }  

    }
}
