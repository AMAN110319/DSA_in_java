import java.util.*;

public class automorphic {
    static boolean isAutomorphic(int n) {
        int sq = n * n;
        while (n > 0) {

            
            if (n % 10 != sq % 10) {
                return false;
            }


            n = n / 10;
            sq = sq / 10;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();
        boolean x = isAutomorphic(num);
        if (x) {
            System.out.println("the number is automorphic!");
        } else {
            System.out.println("the number is not automorphic!");
        }

    }
}
