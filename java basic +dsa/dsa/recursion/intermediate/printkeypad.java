public class printkeypad {
    public static String[]keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void combinations(String str,int idx, String combo){
        if(idx==str.length()){
            System.out.println(combo);
            return;
        }
        char currChar = str.charAt(idx);
        String map = keypad[currChar-'0'];
        for(int i=0;i<map.length();i++){
            combinations(str, idx+1, combo+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str ="23";
        combinations(str,0,"");
    }
}
