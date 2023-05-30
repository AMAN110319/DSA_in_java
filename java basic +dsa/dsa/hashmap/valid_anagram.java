import java.util.*;
public class valid_anagram{
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        // hashmap 
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        // now traverse t and by removing each element get the answer
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
        }
       return map.isEmpty();
    }
    public static void main(String[] args) {
        String s="race";
        String t="care";
        System.out.println(isAnagram(s,t));
    }
}