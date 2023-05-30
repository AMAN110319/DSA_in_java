public class queue_ll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    static class queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        // enqueue
        public static void add(int data){
            Node newNode = new Node(data);
           // for the first node
            if(head == null || tail == null){
                tail=head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //dequeue
        public static int remove(){
            if(tail == null){
                System.out.println("underflow");
                return -1;
            }
            int headval = head.data;
            if(head == tail){
                head =tail = null;
            }
            else{
                head = head.next;
            }
            return headval;
        }
        //peek
        public static int peek(){
            if(tail == null){
                System.out.println("underflow");
                return -1;
            }
            int headval = head.data;
            return headval;
        }
    }



    public static void main(String[] args) {
        queue q= new queue();
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        while(!q.isEmpty()) {
            int x = q.remove();
            System.out.println(x);
        }
        // System.out.println(q.remove());
    }
}
