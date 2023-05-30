import java.util.*;
public class sparse_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr=new int[3][3];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]==0){
                    count++;
                }
            }
            System.out.println();
        }
        if(count>(3*3)/2){
            System.out.println("the matrix is sparse");
        }
        else{
            System.out.println("the matrix is not sparse");
        }

    }
}
