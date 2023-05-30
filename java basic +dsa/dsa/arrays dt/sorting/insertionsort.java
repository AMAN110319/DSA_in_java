import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        int []arr={23,1,34,3999,14,45};
        // insertion sort
        for (int i=1; i<arr.length; i++){
            int current= arr[i];
            // here we are moving backwards and checking it hence we need to check for it 
            for (int j=i-1; j>=0; j--){
                //  checking that whether the current number is smaller than the given  
                if(current<arr[j]){
                    arr[j+1]=arr[j];// here we push backside 
                    arr[j]=current;// here the khali space will be filled with the current elements
                }
            }
        }


        // for displaying the elements
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
