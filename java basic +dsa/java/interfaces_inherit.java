package aman;
interface papainterface{
    void meth1();
    void meth2();
}
//interitance in interfaces
interface childin extends papainterface{
    void meth3();
    void meth4();
}
class child implements childin{
    public void meth1(){
        System.out.println("hi i am meth1");
    }
    public void meth2(){
        System.out.println("hi i am meth2");
    }
    public void meth3(){
        System.out.println("hi i am meth3");
    }
    public void meth4(){
        System.out.println("hi i am meth4");
    }
}
public class interfaces_inherit {
    public static void main(String[] args) {
        child obj = new child();
        obj.meth1();
    }
}
