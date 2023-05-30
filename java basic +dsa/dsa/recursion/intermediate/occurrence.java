public class occurrence {
    public static int first =-1;
    public static int last  =-1;
   public static void element_of_occurrence(String str,char x,int idx){
    if(idx == str.length()){
        System.out.println(first);
        System.out.println(last);
    }
    //recuresive case
    char currentChar =str.charAt(idx);
    if(currentChar==x){
        if(first == -1){
        first =idx;
        }
        else{
            last =idx;
        }
    }
    element_of_occurrence(str, x, idx+1);
   }
   public static void main(String[] args) {
    String str="axadaeda";
    char x='a';
    element_of_occurrence(str, x,0);
   }
}
