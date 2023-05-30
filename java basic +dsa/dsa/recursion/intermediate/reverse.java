public class reverse {
    static void rev(String str, int len){
        if(len<0){
            return;
        }
        System.out.print(str.charAt(len)+"");
        rev(str, len-1);  
    }
    public static void main(String[] args) {
            String s= "abcd";
            rev(s,s.length()-1);
    }
}
