public class queue_array{
    static class Queue{
        static int arr[];//declared an array
        static int size;
        static int rear =-1;
        Queue(int size){
            this.size = size;
            arr= new int[size];//initialized an array with the specified size
        }
        
        static Boolean isEmpty(){
            return rear == -1;
        }
        static Boolean isFull(){
            return rear==size-1;
        }
        //enqueue
        static void add(int data){
            if(isFull()){
                System.out.println("overflow...");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue
        static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }


        //peek
        static int front(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            return front;
        }

    }

    
    public static void main(String[] args) {
        Queue q = new Queue(10);//parameterized constructor
        q.add(23);
        q.add(12);
        q.add(27);
        //displaying elements
        while(!q.isEmpty()){
            int x=q.remove();
            System.out.println(x);
        }

    }
}