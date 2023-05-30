// to be used in  the stack calls to be log n 
public class q6 {
    static int calcpower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //recursive case
        if(n%2==0){
            return calcpower(x,n/2)*calcpower(x, n/2);
        }
        else{
            return calcpower(x,n/2)*calcpower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(calcpower(4,4));
    }
}
