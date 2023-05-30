// stock span problem
import java.util.*;
public class q4{
    public static void stock_span(int []stocks, int []span){
        Stack <Integer> s = new Stack <Integer>();
        // to store the index of the prev high



        span[0]=1;// this is toh fixed
        s.push(0);
        for(int i=0;i<stocks.length;i++){
            int currPrice = stocks[i];
           while(!s.empty() && currPrice > stocks[s.peek()]){
            s.pop();
           } 
           if( s.isEmpty() ){
            span[i]=i+1;
           }
           else{
            int previous = s.peek();
            span[i] = i - previous;
           }

           s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]= new int[stocks.length];
        stock_span(stocks, span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
}