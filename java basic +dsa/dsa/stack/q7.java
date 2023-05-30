// hard question and important one so shall solve it later
// maximum area calculations 
import java.util.*;
public class q7 {
        public int largestRectangleArea(int[] heights) {
            int maxArea =0;
            int nxtr [] = new int[heights.length];
            int nxtl [] = new int[heights.length];
           
    //         next smaller right 
             Stack <Integer> s = new Stack<Integer>();
            for(int i=heights.length-1;i>=0;i--){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nxtr[i] = heights.length;
                }
                else{
                    nxtr[i]=s.peek();
                }
                s.push(i);
            }
            s = new Stack<>();//khali kiya hai stack ko
    //         next smaller left
            for(int i=0;i<heights.length;i++){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nxtl[i] = -1;
                }
                else{
                    nxtl[i]=s.peek();
                }
                s.push(i);
            }
    //         current area
            for(int i=0;i<heights.length;i++){
                int currArea = heights[i]*(nxtr[i]-nxtl[i]-1);
                maxArea = Math.max(currArea,maxArea);
            }
          return maxArea;  
        }
    public static void main(String[] args) {
        
    }
    }

