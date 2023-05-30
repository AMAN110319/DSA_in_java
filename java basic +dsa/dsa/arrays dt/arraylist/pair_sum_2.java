import java.util.*;
public class pair_sum_2{
    public static boolean pairsum2(ArrayList<Integer> list,int target){
        int pivot = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                    pivot =i;
                    break;
            }

        }
        int lp = pivot+1;
        int rp = pivot;
        while(lp != rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(list.get(lp)+" " +list.get(rp));
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%list.size();
            }
            else{
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target =16;
        System.out.println(pairsum2(list, target));
    }
}