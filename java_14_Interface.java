import java.util.*;
interface myInterface{
    void area();
    void perimeter();
}
class Circle implements myInterface{
    double r;
    Circle(double x){
        r=x;
    }
    public void area(){
        System.out.println("The area of Circle = "+3.14*r*r);
    }
    public void perimeter()
    {
        System.out.println("The perimeter of Circle = "+3.14*r*2);
    }
}
class Rectangle implements myInterface{
    double l;
    double b;
    Rectangle(double x,double y){
        l=x;
        b=y;
    }
    public void area(){
        System.out.println("The area of Rectangle = "+l*b);
    }
    public void perimeter(){
        System.out.println("The perimeter of Rectangle = "+(2*(l+b)));
    }
}
class java_14_Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        double x,y,r;
        System.out.println("Enter the length and breadth of rectangle : ");
        x=sc.nextDouble();
        y=sc.nextDouble(); 
        Rectangle rec=new Rectangle(x, y);
        System.out.println("Ether the radius of circle : ");
        r=sc.nextDouble();
        Circle c=new Circle(r);
        System.out.println("1. Area of circle and rectangle");
        System.out.println("2. Perimeter of circle and rectangle");
        System.out.println("3. Quit");
        while(ch!=3){
            System.out.println("Enter the choice : ");
            ch=sc.nextInt();           
            switch (ch) {
                case 1:
                    rec.area();
                    c.area();
                    break;
                case 2:
                    rec.perimeter();
                    c.perimeter();
                    break;
                case 3:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;
            }
            
        }
        sc.close();
    }
}