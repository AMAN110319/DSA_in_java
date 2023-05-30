import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.printf("the sum of first %d natural number is :%d",n,sum);
    }
}
