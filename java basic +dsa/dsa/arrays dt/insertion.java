import java.util.*;
class insert{
    public void insertArr(int []arr, int size,int total , int num, int index){
        if(size>=total){
            System.out.println("overflow");
        }
        else{
            for(int i=size-1;i>=index;i--){
                arr[i+1] = arr[i];
            }
            arr[index]=num;
        }
    }
}
public class insertion{
    // static void insertArr(int []arr, int size,int total , int num, int index){
    //     if(size>=total){
    //         System.out.println("overflow");
    //     }
    //     else{
    //         for(int i=size-1;i>index;i--){
    //             arr[i+1] = arr[i];
    //         }
    //         arr[index]=num;
    //     }
    // }
    static void displayArr(int []arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 10;
        int []myarr=new int[total];
        int size = 6;
        for(int i=0; i<size;i++){
            myarr[i] = sc.nextInt();
        }
        displayArr(myarr,size);
        int num = sc.nextInt();
        int index = sc.nextInt();
        insert obj =new insert();
        obj.insertArr(myarr,size,total,num,index);
        size++;
        displayArr(myarr,size);
    }
}