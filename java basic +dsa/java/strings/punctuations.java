import java.util.*;
public class punctuations {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++) {
        if(str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)==','||str.charAt(i)=='!'||str.charAt(i)==':'||str.charAt(i)=='#'||str.charAt(i)=='$'||str.charAt(i)=='\''||str.charAt(i)=='\"'||str.charAt(i)=='-'||str.charAt(i)=='^'){
            count++;
        }
        }
        System.out.println("thenumber of punctuations in the given string is:"+count);
    }
}
