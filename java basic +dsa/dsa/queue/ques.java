//creating queue via help of the 2 stacks
import java.util.*;
public class ques {
    static class queue{
        static Stack<Integer> s1= new Stack<Integer>();
        static Stack<Integer> s2= new Stack<Integer>();
        static Boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove 
        static int remove(){
            if(isEmpty()){
                System.out.println("empty queue...");
                return -1;
            }
            return s1.pop();

        }
        //peek
        static int peek(){
            if(isEmpty()){
                System.out.println("empty queue...");
                return -1;
            }
            
            return s1.peek();

        }

    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while (!q.isEmpty()){
            System.out.println(q.remove());
        } 

    }
}
