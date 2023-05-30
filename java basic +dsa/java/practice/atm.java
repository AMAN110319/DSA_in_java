import java.util.*;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current balance in your account...");
        int balance = sc.nextInt();
        boolean x = true;
        while (x) {
            System.out.println("\nWelcome to your account details....");
            System.out.println("\n1) Check your balance...");
            System.out.println("\n2) withdraw money...");
            System.out.println("\n3) deposit money in your account...");
            System.out.println("\n4) exit...");
            System.out.println("\n Enter you choice...");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("the current balance of your account is:" + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdraw...");
                    int amount = sc.nextInt();
                    balance -= amount;
                    System.out.println(balance);
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited...");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println(balance);
                    break;
                case 4:
                    x=false;
                    break;
                default:
                    System.out.println("enter a valid option...");
                    break;
            }
            
        }
        System.out.println("thank you ! enjoy");
    }
}
