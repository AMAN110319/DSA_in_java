import java.util.*;
public class cannonical_coin_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Integer coins[]={ 1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Collections.reverseOrder());
        // for(int i=0; i<coins.length; i++) {
        //     System.out.println(coins[i]);
        // }
        int count =0;
        int amount = sc.nextInt();
        ArrayList <Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<coins.length; i++) {
            if(coins[i]<=amount){
                // now how many times the conditions to be checked
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println("the total no of coins used are:"+count);
        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
