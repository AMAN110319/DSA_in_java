import java.util.*;
public class tree_map {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
        tm.put("india",130);
        tm.put("aus",13);
        tm.put("pak",20);
        tm.put("indonesia",10);
        tm.put("Us",30);

        Set<String> set = tm.keySet();
        for (String key : set) {
            System.out.println(key+"-->"+tm.get(key));
        }
    }
}
