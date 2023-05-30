import java.util.Scanner;
public class swap_bitwise {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        System.out.println(a+" "+b);
        // now swapping
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
   } 
}
