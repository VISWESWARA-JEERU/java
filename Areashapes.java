
public class Areashapes {
    public static void  main(String args[]){
    
       Circle c = new Circle(10);
       Rectangle r = new Rectangle(15,25);
       Triangle t = new Triangle(3,4,5);
       c.Area();
       r.Area();
       t.Area();
    }
}
abstract class shapes{
    
    abstract void Area();
}
class Circle extends shapes{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    void Area(){
        System.out.println(3.14*radius*radius);
    }
}
class Rectangle extends shapes{
    double length,breadth;
    Rectangle(double length,double breadth){
          this.length = length;
          this.breadth = breadth;
    }
    @Override
    void Area(){
        System.out.println(length*breadth);
    }
}
class Triangle extends shapes{
    double a,b,c;
    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
        void Area(){
            double s = (a+b+c)/2;
          System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        }
    
}

