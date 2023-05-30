import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5,6};
        System.out.println("enter the number of rotation");
        int n = sc.nextInt();
        System.out.println("the original array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < n; i++) {
            int first = arr[0],j;
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println("\narray after rotation is:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
