import java.util.*;
abstract class Shape{
    abstract void findArea();
}
class Rectangle extends Shape{
    double l;
    double b;
    Rectangle(double x,double y){
        l=x;
        b=y;
    }
    void findArea(){
        System.out.println("The area of Rectangle = "+l*b);
    }
}
class Square extends Shape{
    double a;
    Square(double x){
        a=x;
    }
    void findArea(){
        System.out.println("The area of Square = "+a*a);
    }
}
class Circle extends Shape{
    double r;
    Circle(double x){
        r=x;
    }
    void findArea(){
        System.out.println("The area of Circle = "+3.14*r*r);
	}
}
class java_13_Abstract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x,y;
        
        System.out.println("Enter the length and breadth of rectangle : ");
        x=sc.nextDouble();
        y=sc.nextDouble(); 
        Rectangle rec=new Rectangle(x, y);
        rec.findArea();
        System.out.println("Enter the length of square : ");
        x=sc.nextDouble();
        Square s=new Square(x);
        s.findArea();
        System.out.println("Ether the radius of circle : ");
        x=sc.nextDouble();
        Circle c=new Circle(x);
        c.findArea();
        sc.close();
    }    
}