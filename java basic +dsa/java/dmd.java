class phone{
    public void greet(){
        System.out.println("good morning");

    }
    public void meth(){
        System.out.println("this is meth2 of the phone...");
    }
}
class smartphone extends phone{
     public void swagat(){
        System.out.println("hi this is aman...");
     }
     public void meth(){
        System.out.println("this is meth in the derived class...");
     }
}

public class dmd {
   public static void main(String[] args) {
    phone obj = new phone();//phone obj
    smartphone sobj = new smartphone();//smartphone
    sobj.meth();

    //dynamic method dispatch 
    //by the help of reference of superclass we call the subclass object ---> SYNTAX:
    // superclass ref = new subclass();

    phone dmdobj= new smartphone();//smartphone


    dmdobj.meth();
    // error because doesn't know about these methods
    // dmdobj.swagat();

    // it is an error
    // smartphone not = new phone();

   } 
}
