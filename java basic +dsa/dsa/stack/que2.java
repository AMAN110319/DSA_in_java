import java.util.*;
public class que2 {

        public static void pushatbottom(int data,Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top =s.pop();
            pushatbottom(data,s);
            s.push(top);
        }
        public static void reverse(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top = s.pop();
            reverse(s);
            pushatbottom(top,s);

        }
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            Stack<Integer> s = new Stack<Integer>();
            s.push(1);
            s.push(4);
            s.push(5);
            reverse(s);
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
    }
    }

