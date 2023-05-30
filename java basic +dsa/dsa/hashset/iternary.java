import java.util.*;
public class iternary {
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<String,String>();
        HashMap<String,String> revMap = new HashMap<String,String>();
        tickets.put("chennai","bengaluru");
        tickets.put("Mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        // the key which is not present in the rev keyset
        String start ="";
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                start= key;
               break;
            }
        }
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start= tickets.get(start);// updation of the ticket start position
        }
        System.out.println();
    }
}
