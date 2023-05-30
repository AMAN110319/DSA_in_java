
abstract class base{
    public base(){
        System.out.println("hi i am a constructor");
    }
    public void hello(){
        System.out.println("hello how are you");
    }
    public abstract void hey();//the childs can change these methods as per there requirement.....
}


class child extends base{
    @Override
    public void hey(){
        System.out.println("ni haao maa...");
    }
    public void aman(){
        System.out.println("it's you boy aman");
    }
}

public class basic{
    public static void main(String[] args) {
        // error cause abstract class ke objects nhi bann sakte ...very very important
        child obj = new child();
        obj.hey();
    }
}
