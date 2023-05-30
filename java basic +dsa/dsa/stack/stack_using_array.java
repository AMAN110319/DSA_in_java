public class stack_using_array{
        int top=-1;
        int maxsize=10;
        int []arr = new int[maxsize];//created an array of the specified size

        Boolean isEmpty(){
            return top <0;
        }
        Boolean isFull(){
            return top==maxsize-1;
        }
        public void push(int data){
            if(isFull()){
                System.out.println("Stack overflow..");

            }
            top++;
            arr[top]=data;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("underflow!");
                return -1;
            }
            int topval = arr[top];
            top--;
            return topval;
        }

        public void display(){
            System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.print(arr[i]+"\t");  
        }  
        System.out.println();   
        }

        public static void main(String []args){
            stack_using_array obj= new stack_using_array();
            obj.push(10);
            obj.push(12);
            obj.push(42);
            obj.push(52);
            obj.push(16);
            obj.display();
            int x= obj.pop();
            System.out.println(x);
            obj.display();
            
        }
    }

    
