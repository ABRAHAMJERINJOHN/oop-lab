import java.util.*;
class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
    super(a, b);
    }
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
class Square extends Figure {
    Square(double a, double b) {
    super(a, b);
    }
    double area() {
        System.out.println("Inside Area for Square.");
        return dim1 * dim2;
    }
}
class Circle extends Figure {
    Circle(double a, double b) {
    super(a, b);
    }
    double area() {
        System.out.println("Inside Area for Circle.");
        return dim1 * dim2 *3.14;
    }
}
class java_12_method_overriding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,l,b,r;
        System.out.println("Enter the dimentions of Rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the dimentions of Square : ");
        a=sc.nextInt();
        System.out.println("Enter the dimentions of Circle : ");
        r=sc.nextInt();
        Figure f=new Figure(a, b);
        Rectangle rec=new Rectangle(l, b);
        Square s=new Square(a, a);
        Circle c=new Circle(r, r);
        Figure fig;
        fig=rec;
        System.out.println("Area is " + fig.area());
        fig=s;
        System.out.println("Area is " + fig.area());
        fig=c;
        System.out.println("Area is " + fig.area());
        fig=f;
        System.out.println("Area is " + fig.area());
        sc.close();
    }
}