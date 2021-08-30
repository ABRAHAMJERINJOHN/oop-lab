import java.util.*;
class overload{
    void area(int a){
        System.out.println("The area of square = "+a*a);
    }
    void area(double l,double b){
        System.out.println("The area of Rectangle = "+l*b);
    }
    void area(double r){
        System.out.println("The area of circle = "+3.14*r*r);
    }
}
class java_9_method_overloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        overload o=new overload();
        int a;
        double x,y;
        System.out.println("Enter the length of square : ");
        a=sc.nextInt();
        o.area(a);
        System.out.println("Enter the length and breadth of rectangle : ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        o.area(x,y);
        System.out.println("Ether the radius of circle : ");
        x=sc.nextDouble();
        o.area(x);
        
        sc.close();
    }
}