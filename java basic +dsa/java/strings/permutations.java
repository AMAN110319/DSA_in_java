import java.util.*;
public class permutations {
        public static String swap(String a,int i,int j){
            char[]b=a.toCharArray();
            char ch=b[i];
            b[i]=b[j];
            b[j]=ch;
            return String.valueOf(b);
        }
        static void genratepermutations(String s,int start,int end){
            if(start==end-1){
                System.out.println(s);
            }
            else{
                for(int i=start; i<end;i++){
                    s=swap(s,start,i);
                    genratepermutations(s,start+1,end);
                    s=swap(s,start,i);
                }
            }

        }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int l=str.length();
      System.out.println("the different types of permutations:");
      genratepermutations(str,0,l);
    }
}
