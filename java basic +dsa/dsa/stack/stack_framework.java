import java.util.*;
public class stack_framework {
    public static void main(String []args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(7);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
