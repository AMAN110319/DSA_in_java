public class duplicate{
    public static void main(String[] args) {
        String str="hi i  am aman tiwari";
        int count;
        // for the counting of each var
        char []str1= str.toCharArray();
        System.out.println("the duplicate characters are: ");
        for(int i=0; i<str.length(); i++) {
            count=1;
            for(int j=i+1; j<str.length();j++){
                if(str1[j]==str1[i]&&str1[i]!=' '){
                    count++;
                    str1[j]='0';// for not checking the already checked characters
                }
            }
            if(count>1 && str1[i]!='0'){
                System.out.println(str1[i]);
            }
        }

    }
}