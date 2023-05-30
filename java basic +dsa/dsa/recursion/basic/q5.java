//printing x^n
public class q5 {
    static int calcpower(int x, int n){
        //base case
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*calcpower(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcpower(0,0));
    }
}
