import java.util.LinkedList;
public class zig_zag {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static Node head ;
    public static void zigzag() {
        if(head==null){
            return;
        }
        // find mid
        Node slow = head;
        Node fast = head.next;
        Node mid;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        // todna hai
        mid.next = null;

        Node prev =null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }

        Node left =head , right = prev;
        Node nextL, nextR;
        while(left != null && right != null) {
            nextL = left.next;
            right = left.next;
            nextR = right.next;
            right.next= nextL;
            // update
            left = nextL;
            right = nextR;
        }

    }
    public static void main(String[] args) {
        LinkedList <Integer> LL = new LinkedList<Integer>();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4); 
        LL.addLast(5); 
        for (int i = 0; i<LL.size(); i++) {
            System.out.print
             (LL.get(i)+"->");
        }
        System.out.println("Null");
        zigzag();
        for (int i = 0; i<LL.size(); i++) {
            System.out.print
             (LL.get(i)+"->");
        }
        System.out.println("Null"); 
    }
}
