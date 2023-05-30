import java.util.*;
public class fractionalKnapsack2 {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int capacity =50;
        // a 2d matrix for the comaprator
        double [][] ratio = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/weight[i];
        }
        // sorting in ascending order on the basis of ratio
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int profit =0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                profit = profit + val[idx];
                capacity = capacity-weight[idx];
            }
            else{
                profit = profit + (int)(ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("the maximum profit is :"+profit);
    }
}
