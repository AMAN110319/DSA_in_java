
class base{
    base(){
        System.out.println("i am a constructor in base");
    }
    base(int a){
        System.out.println("i am a overloaded constructor in base"+a);
    }

    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base{
    derived(){
        super(5);
        System.out.println("i am in derived");
    }
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class a{// because public class should have same name 
    
    public static void main(String[] args) {
        derived d= new derived();
    }
}