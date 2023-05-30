
// package aman;

public class Student1{
    static int count=0;
    Student1(){
        count++;
    }
    
    public static void main(String[] args) {

        // creating an array of objects

        Student1 []arr=new Student1[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Student1();
        }


        // Student1 obj1 = new Student1();
        // Student1 obj2 = new Student1();
        // Student1 obj3 = new Student1();
        // Student1 obj4 = new Student1();
        System.out.println("the number of students are:"+Student1.count);
    }
}
