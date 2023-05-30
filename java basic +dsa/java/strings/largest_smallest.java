import java.util.*;
public class largest_smallest {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int l=0;
       String word="",small="",largest="";
       String []words = new String[100];//created a string
       str = str+" ";
       for(int i=0;i<str.length();i++){
        if(str.charAt(i) !=' '){
            word = word +str.charAt(i);
        }
        else{
            words[l]=word;
            l++;
            word="";// to make the word as zero and restarts
        
        }
       }
       small = largest = words[0];
       for(int i=0;i<l;i++){
        if(small.length()>words[i].length()){
            small = words[i];
        }
        if(largest.length()<words[i].length()){
            largest=words[i];
       }

    }
    System.out.println(largest+" "+small);
}
}
