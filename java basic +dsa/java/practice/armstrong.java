import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    static void isArmstrong(int n){
        int temp,sum =0,digits=0,last=0;
        temp =n;
        // for getting number pf digits
        while(n>0){
            n=n/10;
            digits++;
        }
        n=temp;
        while(n>0){
            last= n%10;
            sum += (Math.pow(last, digits));
            n=n/10;
        }
        if(sum==temp){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not armstrong");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmstrong(n);
    }
}


