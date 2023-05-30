import java.util.*;

public class c{
    public static boolean checkPrime(int n){
        boolean flag =true;
        for(int i = 2; i < n; i++){
            if(n%i==0){ 
            flag= false;
            } 
        }
        return flag;
    }
   public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 2; i < 20; i++) {
            if (checkPrime(i) == true) {
                arr[i] = i;
            } 
    }
    int count=0;
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] !=0){
            count++;
            System.out.print(arr[i]+" ");
        }
    }
    System.out.println(count);
    int new_arr[]=new int[count];
    new_arr[0]=1;
    for(int i = 0,j=1;j<count && i < new_arr.length;j++,i++){
        if(arr[i] !=0){
            new_arr[j]=new_arr[j-1]+arr[i];
        }
    }

    for(int i = 0; i <count; i++){
        System.out.print(new_arr[i]+" ");
    }
}
}
