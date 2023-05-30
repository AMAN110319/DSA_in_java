import java.util.*;
public class loop_removal{
    static Node head;
    static class Node{
        int val;
        Node next;
        Node(int data){
            this.val = data;
            this.next = null;
        }
    }
    public static boolean isCycle(){
        Node slow =head;
        Node fast =head;
        if(head ==null){
            return false;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    
    public static void removeCycle(){
        // detect cycle
        Node slow =head;
        Node fast =head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        // find meeting
        slow = head;
        Node prev =null;
        while(slow !=fast){
            prev =fast;
            slow = slow.next;
            fast =fast.next;
        }
        // remove cycle
        prev.next = null;
    }
    
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->1
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }

}