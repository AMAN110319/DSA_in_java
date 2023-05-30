public class circularqueue {
    static class Queue{
        static int arr[];//declared an array
        static int size;
        static int rear =-1;
        static int front =-1;
        Queue(int size){
            this.size = size;
            arr= new int[size];//initialized an array with the specified size
        }
        static Boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        static Boolean isFull(){
            return (rear+1)%size==front; // modulo size is for the maintainance of the circularity in the code
        }
        //enqueue
        static void add(int data){
            if(isFull()){
                System.out.println("overflow...");
                return;
            }
            //when adding 1st element
        if(front==-1){
            front = 0;
        }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        

        //dequeue
        static int remove(){
            if(isEmpty()){
                return -1;
            }
            int val = arr[front];

            //for single element removal
            if(front==rear){
                rear=front=-1;
            }
            else{
            front=(front+1)%size;
            }
            return val;
        }


        //peek
        static int front(){
            if(isEmpty()){
                return -1;
            }
            int val = arr[front];
            return val;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);//parameterized constructor
        q.add(23);
        q.add(12);
        q.add(27);
        q.add(4);
        q.add(9);
        q.remove();
        q.add(13);
        //displaying elements
        while(!q.isEmpty()){
            System.out.println(q.front());
            q.remove();
        }

    }
}
