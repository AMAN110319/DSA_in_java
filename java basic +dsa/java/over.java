package aman;
class A{
    int x=9;
    public void run(){
        System.out.println("running");
    }
}
class B extends A{
    int y;
    @Override
    public void run(){
        System.out.println("running with pace"+x);
    }
}

public class over{
    public static void main(String[] args) {
        B obj = new B(); // overriding will run that code with 
        obj.run();
    }
}
