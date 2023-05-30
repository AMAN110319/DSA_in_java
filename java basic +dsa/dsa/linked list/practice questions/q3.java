public class q3 {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void swapvalues(int x,int y){
        if(x==y){return;}
        Node prevX = null,currX=head;
        while(currX!=null && currX.data !=x){
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null,currY=head;
        while(currY!=null && currY.data !=y){
            prevY = currY;
            currY = currY.next;
        }
        // now pointer change ka khela hobe 
        // base case
        if(currX==null || currY==null){
            return;
        }

        if(prevX != null){
            prevX.next= currY;
        }
        else{
            head = currY;
        }

        if(prevY != null){
            prevY.next= currX;
        }
        else{
            head = currX;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next = temp;
    }
    public static void addFirst(int new_data){
        Node newNode=new Node(new_data);
        if(head==null){
            head =newNode;
            return;//this is important else will find an endless loop
        }
        newNode.next =head;
        head=newNode;

    }
    public static void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        addFirst(7);
        addFirst(6);
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        printlist();
        swapvalues(3,6);
        printlist();
    }
}
