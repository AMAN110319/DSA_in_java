
import java.util.*;
public class frequent {
    public static int most_count(ArrayList<Integer> list,int key) {
        int answer=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <list.size()-1;i++){
            if(list.get(i)==key){
                map.put(list.get(i+1),map.getOrDefault(list.get(i+1),0)+1);
            }
        }
        // to get the maximum value of the elements
        int ans = Collections.max(map.values());
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//  we are getting the key corresponding to the max value key
            if (entry.getValue() == ans) {
                     answer=entry.getKey();
            }
    }
    return answer;
}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(5);
        int key =2;
        System.out.println(most_count(list,key));

}
}
