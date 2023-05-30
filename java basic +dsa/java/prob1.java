package aman;
class circle{
    public int radius;
    circle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        this.height = h;
    }
    public double sarea(){
        return 2*Math.PI*this.radius*this.height + 2*Math.PI*this.radius*this.radius;
    }
}


public class prob1 {
    public static void main(String[] args) {
        // problem1
        cylinder cy = new cylinder(10,12);
       System.out.println(cy.sarea());
        System.out.println(cy.area());
    }
}
