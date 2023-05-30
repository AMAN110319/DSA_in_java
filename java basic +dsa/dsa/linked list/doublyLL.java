public class doublyLL {
    Node head=null;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    void insertatbegnning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        newNode.prev=null;
        head.prev=newNode;
        head = newNode;
    }



    void addatlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
        newNode.next=null;
    }

    void addatindex(int data,int index){
        Node newNode=new Node(data);
        Node curr=head;
        int size=1;
        while(size<=index){
            size++;
            curr = curr.next;
        }
        newNode.next=curr.next;
        curr.next.prev=newNode;
        newNode.prev=curr;
        curr.next=newNode;
        }


    void printlist(){
        if(head==null){
            System.out.println("the list is empty..");
        }
        Node curr=head;
        while(curr !=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        doublyLL obj = new doublyLL();
         obj.insertatbegnning(80);
         obj.insertatbegnning(90);
         obj.insertatbegnning(30);
         obj.insertatbegnning(50);
         obj.addatlast(68);
         obj.addatindex(45, 2);
         obj.printlist();
    }
}
