import java.util.*;

public class r_rotate {
   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 34, 45, 67 };
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("the original array is :");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      for (int i = 0; i < n; i++) {
         int last =arr[arr.length - 1],j;
         for (j=arr.length-1;j>0; j--) {
            arr[j]=arr[j-1];
         }
         arr[0]=last;
      }
System.out.println("\nthe array after the right rotation:");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
