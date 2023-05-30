import java.util.*;
public class pair_sum{
    public static boolean foundpair(ArrayList<Integer> list, int target){
        int rp = list.size() - 1;
        int lp = 0;
        while(lp < rp){
            if(list.get(lp) + list.get(rp)== target){
                System.out.println(list.get(lp) + " " +list.get(rp));
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target=8;
        System.out.println(foundpair(list, target));
    }
}
