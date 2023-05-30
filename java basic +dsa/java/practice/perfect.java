import java.util.*;
import java.lang.*;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        if(sqrt - Math.floor(sqrt)==0){
            System.out.println("the number is a perfect square...");
        }
        else{
            System.out.println("the number is not a perfect square...");
        }
    }
}
