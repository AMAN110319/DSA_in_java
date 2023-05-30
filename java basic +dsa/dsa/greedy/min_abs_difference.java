// greedy approach--> require such that the value is equal to min
import java.util.*;
public class min_abs_difference {
    public static void main(String[] args) {
        int A[]={4,1,8,7};
        int B[] = {2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int sum =0;
        for (int i=0; i<A.length; i++){
           sum =sum + Math.abs((A[i] - B[i]));
        }

        System.out.println("the min difference sum is:"+sum);
    }
}
