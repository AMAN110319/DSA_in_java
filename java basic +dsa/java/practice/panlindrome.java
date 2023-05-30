import java.util.Scanner;
public class panlindrome {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp=n,sum = 0;
      while(n>0){
        int r = n%10;
        sum = sum*10+r;
        n=n/10;
      }
      if(sum==temp){
        System.out.println("the number is panlindrome..");
      }
      else{
        System.out.println("the number is not panlindrome");
      }

    }
}
