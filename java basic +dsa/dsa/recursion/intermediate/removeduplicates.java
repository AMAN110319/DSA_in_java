public class removeduplicates {
    public static boolean []map = new boolean[26];// boolean array for the array
   
    public static void removeduplicates(int idx,String str,String newstr){
        //base case
        if(str.length()==idx){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if((map[currChar-'a'])==false){
            newstr += currChar;
            map[currChar-'a'] =true;// [currchar - "a"]--> gives the index
            removeduplicates(idx+1, str, newstr);
        } 
        else{
            removeduplicates(idx+1, str, newstr);
        }
        
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        removeduplicates(0,str,""); 

    }
}
