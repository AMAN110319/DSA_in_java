import java.util.*;
public class counting_elements{
    public static void main(String[] args) {
        int nums[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> counts = new HashSet<Integer>();
        for (int i = 0; i <nums.length; i++){
            // if(!counts.contains(nums[i])){
            //     counts.add(i);
            // }
            counts.add(nums[i]);
        }
        System.out.println("size: "+counts.size());
    }
}