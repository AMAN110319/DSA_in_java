package aman;
import java.util.Scanner;

class student{
    public String name;
    public String section;
    public int rollnumber;
    student(String name, int rollnumber, String section){
        this.name = name;
        this.rollnumber = rollnumber;
        this.section = section;
    }
}




public class smart{
    public  void printstudents(student[] arr){ // array of objects is passed 
        for (int i = 0; i < arr.length; i++){
            System.out.println("the values for  "+i +"index student");
            System.out.println("name"+arr[i].name+"\n rollnumber"+arr[i].rollnumber+"\nsection"+arr[i].section);
            
 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student [] arr = new student[2];// array of students is created
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new student(null, i, null); // initialization
            System.out.println("enter the value for "+i +"index student");
            System.out.println("enter the rollnumber");
            arr[i].rollnumber=Integer.parseInt(sc.nextLine());
            System.out.println("enter the name");
            arr[i].name=sc.nextLine();
            System.out.println("enter the section");
            arr[i].section=sc.nextLine();

        }
        smart m = new smart();
        m.printstudents(arr);
        System.out.println("the number of students is the class are :"+arr.length);

    }
}