// the next greater by the help of stack


// similar questions
// next greater on the left side
// next smaller on the right side
// next smaller on the left side
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};
        int nextgreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        // stack stores index of the largest element
        // starts from last or from last 
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i] = -1;
            }
            else{
                nextgreater[i] = arr[s.peek()];
            }

            s.push(i);
        }
        for(int i = 0; i <nextgreater.length; i++){
            System.out.print(nextgreater[i]+"  ");
        }

    }
}
