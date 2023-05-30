import java.util.*;
public class vowels {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine(); 
       int countv=0,countc=0,counts=0;
       for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
            countv++;
        }
        else if(str.charAt(i) == ' '){
            counts++;
        }
        else{
            countc=str.length()-counts-countv;
        }
       }
       System.out.println("consonants:"+countc+"\nvowels:"+countv);
    }
}
