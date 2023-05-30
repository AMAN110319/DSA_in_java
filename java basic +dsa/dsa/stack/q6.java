import java.util.*;
public class q6 {
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack <Character>();
        for(int i=0;i<str.length();i++){
// closing 
            int count =0;
            if(str.charAt(i)==')'){
                while(s.pop() != '('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
            else{
                s.push(str.charAt(i));
            }
        }
        return false;
    }
   public static void main(String[] args) {
    String str ="(a+b)";
    System.out.println(isDuplicate(str));
   } 
}
