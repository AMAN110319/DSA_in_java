import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr=new int[2][2];
        for (int i=0; i<2; i++) {
            for (int j=0; j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int counte=0,counto=0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<2;j++){
               if(arr[i][j]%2==0){
                counte++;
               }
               else{
                counto++;
               }
            }
        }
        System.out.println("odd elements no:"+counto+"\nevent elements no:"+counte);
        
    }
}
