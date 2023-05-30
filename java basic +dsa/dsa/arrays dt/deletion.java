import java.util.Scanner;
class delete{
    public int deletearr(int []arr,int index,int total , int size){
        int value=0;
        if(size<=0){
            System.out.println("underflow");
        }
        else{
            value = arr[index];
            for(int i=index;i<size;i++){
                arr[i]=arr[i+1];
            }
            size--;
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+"\t");
            }
        }
        return value;
    }
}
public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        delete obj = new delete();
        int []myarr=new int[100];
        int size =5;
        for(int i=0;i<size;i++){
            myarr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(myarr[i]+"\t");
        }
        int index =sc.nextInt();
        int x= obj.deletearr(myarr, index, 100, size);
        System.out.print("\nthe value is:"+x);
    }
}
