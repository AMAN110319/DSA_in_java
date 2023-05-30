public class LL {
    Node head =null;// created header  node pointer pointing to null value
    int size=0;

    // creation of a node
    class Node {
        String data;
        Node next;// node type pointer

        // CONSTRUCTOR

        Node(String data)
        {
           this.data = data;
           this.next = null; 
        }

    }

    // adding node
    public void addFirst(String data){
        Node newNode = new Node(data);// created a node 
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }
    // add last of a LL
    public void addLast(String data){
        Node newNode = new Node(data);// created a node 
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


    //DELETION
    // delete first

    public void deleteFirst(){
        if(head == null){
            System.out.println("underflow ! can't delete..");
            return;
        }
        size--;
        head = head.next;

    }
    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("underflow ! can't delete..");
            return;
        }
        //case of one node 
        size--;
        if(head.next == null){
            head =null;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next =null;
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




    public static void main(String[] args) {
        // now creation of linked list of nodes
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.addFirst("this");
        list.printlist();
        list.deleteLast();
        list.printlist();
    }

}