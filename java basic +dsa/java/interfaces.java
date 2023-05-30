package aman;
interface bicycle{
    int a=45;// attributes are final or static 
    void applybrake(int decreament);
    void speedup(int increament);
}
interface lighting{
    void light(String color);
    void powercontrol(int watt);
}
class speed implements bicycle,lighting{
    int speed = 100;
    public void applybrake(int decreament){
        System.out.println("the speed is decreasing by :"+(speed -decreament));
    }
    public void speedup(int increament){
        System.out.println("the speed is increasing by :"+(speed +increament));
    }
    public void light(String color){
        System.out.println("the color is :"+color);
    }
    public void powercontrol(int watt){
        System.out.println("the power consumptio of the following code is as follows:"+watt);
    }
}


public class interfaces {
    public static void main(String[] args) {
        speed obj = new speed();
        obj.speedup(45);
        obj.applybrake(78);
        obj.powercontrol(233);
        obj.light("yellow");
    }
}
