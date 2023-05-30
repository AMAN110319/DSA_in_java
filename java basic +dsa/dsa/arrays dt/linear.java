import java.util.Scanner;
class linearsrc{
    public int srh(int []arr,int size,int key){
        int idx=0;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("the element is found...");
                idx=i;  
                return idx;
            }
            
        }
        System.out.println("the element is not found");
        return -1;
    }
    
}
public class linear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr={12,34,5,67,78,32};
        int size =6;
        int key = scanner.nextInt();
        linearsrc obj = new linearsrc();
        int x=obj.srh(arr,size,key);
        if(x>0){
            System.out.println("element found at index " + x);
        }
        else{
            System.out.println("element not found index is:"+x);
        }
    }
}
