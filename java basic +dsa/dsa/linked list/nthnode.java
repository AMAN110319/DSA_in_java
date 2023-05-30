public class nthnode {
    class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next =null;
        }
    }
    public Node removeNode(Node head,int n){
        if(head.next == null){
            return null;
        }
        
        int size =0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(size ==n){
            return head.next;
        }
        int indextosearch = size-n;
        Node prev =head;
        int i=1;
        while(i<indextosearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
