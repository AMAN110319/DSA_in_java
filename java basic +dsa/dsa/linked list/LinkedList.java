class LinkedList {
 
        static Node head;
     
        static class Node {
     
            int data;
            Node next;
     
            Node(int d)
            {
                data = d;
                next = null;
            }
        }
     
        // add last of a LL
    public void addLast(int d){
        Node newNode = new Node(d);// created a node 
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



    // recursive reversal;
    public Node reverseRecursive(Node head){
        
        //corner cases
        if(head ==null || head.next==null){
            return head;
        }
        Node newhead = reverseRecursive(head.next);//recursive call
        
        head.next.next=head;
        head.next=null;


        return newhead;
    }


        /* Function to reverse the linked list */

        // 3 pointers


        // Node reverse(Node node)
        // {
        //     Node prev = null;
        //     Node current = node;
        //     Node next = null;
        //     while (current != null) {
        //         next = current.next;
        //         current.next = prev;
        //         prev = current;
        //         current = next;
        //     }
        //     node = prev;
        //     return node;
        // }

        public void reverseIterate(){
            if(head == null || head.next==null){
                return;
            }

            Node prevNode =head;
            Node current =head.next;
            while(current !=null){
                Node nextNode = current.next;
                current.next = prevNode;
                
                // updation
                prevNode = current;
                current = nextNode;
            }
            head.next=null;
            head = prevNode;

        }
     
        // prints content of double linked list
        // void printList(Node node)
        // {
        //     while (node != null) {
        //         System.out.print(node.data + " ");
        //         node = node.next;
        //     }
        // }
     
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

        }

        public static void main(String[] args)
        {
            LinkedList list = new LinkedList();


            // created nodes
            // list.head = new Node(85);
            // list.head.next = new Node(15);
            // list.head.next.next = new Node(4);
            // list.head.next.next.next = new Node(20);



            list.addLast(14);
            list.addLast(12);
            list.addLast(23);
            list.addLast(45);

            System.out.println("Given Linked list");
            // list.printList(head);
            list.printlist();


            // head = list.reverse(head);
            // list.reverseIterate();
            head = list.reverseRecursive(head);

            System.out.println("");
            System.out.println("Reversed linked list ");
            // list.printList(head);
            list.printlist();
        }
    }

