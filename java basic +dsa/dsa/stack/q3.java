// it is the code to reverse the string and then check for the following

import java.util.Stack;
public class q3 {
    public static String reverse(String str){
        Stack<Character> stack = new Stack<Character>();
        int idx=0;
        // pushing the elements 
        while(idx<str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }
        // creating stringbuilder for savinng the same type of elements
        StringBuilder sb= new StringBuilder("");
        while(!stack.isEmpty()){
            char val =stack.pop();
            sb.append(val);
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("the reversed string is:"+reverse(str));
    }
}
