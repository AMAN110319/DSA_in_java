import java.util.*;
public class palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         str=str.toLowerCase();// to make it uniform
         boolean flag = true;
         for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag = false;
                break;
            }
         }
         if(flag){
            System.out.println("the string is palindrome..");
         }
         else{
            System.out.println("the string is not a palindrome..");
         }
    }
}
