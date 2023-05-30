public class print_no_consequetive_cases {
    public static void binarystring(int n, int lastplace ,String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // recursive case or kaam 
        if(lastplace==0){
            binarystring((n-1),0,str + '0');
            binarystring((n-1),1,str+'1');
        }
        else{
            binarystring((n-1),0,str+'0');
        }
    }
	public static void main(String[] args) {
		
		binarystring(3,0,"");
	}
}
