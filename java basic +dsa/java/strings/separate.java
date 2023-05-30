import java.util.*;
public class separate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // str=str.replace(""," ");
        // System.out.println(str);

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
