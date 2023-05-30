import java.util.*;
public class word_dup {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        String[] words= str.split(" ");
        System.out.println("duplicate words are:");
        for(int i=0; i<words.length; i++) {
            int count=1;
            for(int j=i+1; j<words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count>1&& words[i]!="0"){
                System.out.println(words[i]);
            }
        }
    }
}
