public class mergeLL{
    public static Node head =null;// created header  node pointer pointing to null value
    int size=0;

    // creation of a node
    class Node {
        int data;
        Node next;// node type pointer

        // CONSTRUCTOR

        Node(int data)
        {
           this.data = data;
           this.next = null; 
        }

    }

    // adding node
    public void addFirst(int i){
        Node newNode = new Node(i);// created a node 
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }
    // add last of a LL
    public void addLast(int i){
        Node newNode = new Node(i);// created a node 
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        // created a pointer which will move so that we can get the moving pointer
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // for displaying 
    public void printlist(){
        if(head == null){
            System.out.println("the list is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        System.out.println("size of node:"+size);
    }

    public Node getMid(Node head){
        Node slow=head;
        Node fast = head;
        while(fast.next !=null || fast.next.next !=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public Node merge(Node left, Node right){
        Node x=new Node(-1);
        Node temp=x;
        while( left != null && right != null){
            if(left.data <=right.data){
                temp.next = left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next = right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left!=null){
            temp.next = left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null){
            temp.next = right;
            right=right.next;
            temp=temp.next;
        }

        return x.next;
    }
    public Node mergesort(Node head){
        if(head==null ||head.next==null){
            return head;
        }

        // find mid
        Node mid = getMid(head);
        // merge sort parts are been called
        Node right =mid.next;
        mid.next = null;
        Node lefthead=mergesort(head);
        Node righthead=mergesort(right);
        // merge operation
        return merge(lefthead,righthead);

    }



    public static void main(String[] args) {
        mergeLL list = new mergeLL();
        list.addFirst(10);
        list.addFirst(234);
        list.addLast(34);
        list.addFirst(45);
        list.printlist();
        list.mergesort(head);
        list.printlist();
    }

}