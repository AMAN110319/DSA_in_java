import java.util.ArrayList;

public class stack_arrList {
    static class Stack {
        // arraylist
        static ArrayList<Integer> list = new ArrayList<Integer>();

        static Boolean  isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }
    public static void main(String []args){
        Stack s = new Stack();
        s.push(4);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
