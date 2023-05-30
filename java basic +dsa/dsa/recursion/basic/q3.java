import java.util.*;
public class q3 {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int x= fact(6);
        System.out.println(x);
    }
}
