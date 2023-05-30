import java.util.Scanner;
public class traversal{
    public static void main(String[] args) {
        int []arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.printf("the element %d is: %d ",i ,arr[i]);

        }
    }
}