import java.util.*;
public class split {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string :");
       String str=sc.nextLine();
       int l=str.length();
       System.out.println("enter the number of divisions:");
       int n = sc.nextInt();
       int temp=0,chars=l/n;
       String[]s1=new String[n];
       if(l%n!=0){
        System.out.println("sorry the string can't be divided in the given parts");
       }
       else{
        for(int i=0;i<l;i=i+chars){
            String part=str.substring(i,i+chars);
            s1[temp]=part;
            temp++;
        }
        System.out.println(n+"equals part of string");
        for(int i=0;i<temp;i++){
         System.out.println(s1[i]);
       }
       }    }
}
