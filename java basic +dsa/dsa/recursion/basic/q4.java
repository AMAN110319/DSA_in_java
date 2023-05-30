//fibonacci
public class q4 {
    static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
