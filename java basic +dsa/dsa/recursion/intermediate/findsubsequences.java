// subsequences or subsets means the same but little difference is that subsequences are relatively ordered
public class findsubsequences {
    public static void subsequences(String str, int idx, String newstr) {
        if(str.length()==idx){
            System.out.println(newstr);
            return;
        }
        char c = str.charAt(idx);
        //to be 
        subsequences(str, idx+1, newstr+c);
        // not to be
        subsequences(str, idx+1, newstr);
    }
    public static void main(String[] args) {
        String str ="abc";
        subsequences(str,0,"");
    }
}
