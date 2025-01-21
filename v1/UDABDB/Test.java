package UDABDB;


/**
 * Shape
 */
abstract class Shape {
    abstract public double perimeter();
    abstract public double area();

}

class Rectangle extends Shape {
    double l;
    double b;


    public double perimeter(){
        return 2*(l+b);
    }

    public double area(){
        return l*b;
    }


}

public class Test{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.l = 99;
        r.b = 77;

        System.out.println(r.area() + " " + r.perimeter());
        Shape s = r;
        System.out.println(s.area() + " " + s.perimeter());
    }
    
    
}