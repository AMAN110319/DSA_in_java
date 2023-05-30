import java.util.*;
public class longest_common_perfix{
    public static void main(String[] args) {
        String [] words = new String[]{"flowing","flow","flower"};
        String prefix = words[0];
        for(int i = 0; i < words.length; i++){
            while(words[i].indexOf(prefix)!= 0){
                prefix =prefix.substring(0, prefix.length()-1);

            }
        }
        if(!prefix.equals("")){
            System.out.println(prefix);
        }
        else{
            System.out.println("");
        }
    }
}