import java.util.*;
public class all_substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l=str.length();
        int temp=0;
        String[] substrings = new String[l*(l+1)/2];
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                substrings[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        for(int i=0;i<substrings.length;i++){
            System.out.println( substrings[i]) ;      
         }
    }
}
