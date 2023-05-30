public class PERMUTATIONS{
    public static void printprem(String str,String permutation){
        // base case: 
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
     for(int i=0;i<str.length();i++){
      // loop for getting value at index and getting all permutations
      char currChar = str.charAt(i);
      String newSubstr = str.substring(0,i)+str.substring(i+1);
      printprem(newSubstr,permutation+currChar);
     }    
    }
    public static void main(String[] args) {
        String str="123";
        printprem(str, "");
    }
}