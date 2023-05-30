public class stack_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{ 
        public static Node head;
        public static Boolean isEmpty(){
            return head ==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top =head.data;
            head=head.next;
            return top;
        }
        //looking onto the values 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top =head.data;
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
