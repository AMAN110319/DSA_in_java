import java.util.*;
public class queue_reversal {
    public static void reverse(Queue<Integer> q) {
        Stack <Integer> s = new Stack<Integer>();
        while(!q.isEmpty()) {
            // int e =q.remove();
            // s.push(e);
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            int e=s.pop();
            q.add(e);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while(!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
