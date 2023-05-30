public class q2 {
    static int printsum(int n){
        if(n==0 || n==1){
            return n;
        }
       return n +printsum(n-1);
    }
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
        int x = printsum(i);
        System.out.println(x);
        }

    }
    
}
