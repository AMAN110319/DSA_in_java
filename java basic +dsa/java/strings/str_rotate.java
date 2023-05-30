public class str_rotate {
    public static void main(String[] args) {
        String str1="abcde",str2="deabc";
        if(str1.length()!=str2.length()){
            System.out.println("second string is not the rotation");
        }
        else{
            str1=str1.concat(str1);
            if(str1.indexOf(str2)!=-1){
                System.out.println("second string is the rotation of first");
            }
            else{
                System.out.println("second string is not the rotation");  
            }
        }
    }
}
