import java.util.*;
public class anagram{
    // anagram in which the digits are common
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean flag=true;


        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("the string is not an anagram string....");
        }
        // for conversion to lower case
        else{
            char []a1=s1.toCharArray();
            char []a2=s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            for(int i=0; i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    flag = false;
                }
 
            }
            if(flag){
                System.out.println("the two strings are anagram..");
            }
            else{
                System.out.println("the two strings are not anagram..");
            }
        }
    }
}