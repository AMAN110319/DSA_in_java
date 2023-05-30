import java.util.*;
public class linked_hashmap{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
        lhm.put("India",120);
        lhm.put("Indonesia",20);
        lhm.put("US",60);
        lhm.put("china",150);


        // to create key set
        Set<String> keys = lhm.keySet();

        for(String key : keys){
            System.out.println("key:"+key+" value:" +lhm.get(key));
        }
    }
}