import java.util.*;
public class whitespaces {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(str);
      System.out.println("the string after removal of whitespaces are: ");
      System.out.println(str.replaceAll(" ","")); 
    }
    
}
