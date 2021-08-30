 import java.util.*;
class Complex{
    double real;
    double img;
    Complex(){
        real=0.0;
        img=0.0;
    }
    Complex(double rp){
        real=rp;
        img=0.0;
    }
    Complex(double rp,double ip){
        real=rp;
        img=ip;
    }
    Complex plus(Complex c){
        Complex sum=new Complex(real+c.real,img+c.img);
        return sum;
    }
    void getcomplex(){
        System.out.print("( "+real+"+"+img+"i )");
    }
} 
class java_7_Complex {
    public static void main(String[] args) {
        double rp,ip;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st complex number (real, img ): ");
        rp=sc.nextDouble();
        ip=sc.nextDouble();
        Complex c1=new Complex(rp,ip);
        System.out.println("Enter the 2nd complex number (real, img :) ");
        rp=sc.nextDouble();
        ip=sc.nextDouble();
        Complex c2=new Complex(rp,ip);
        Complex sum=new Complex();
        sum=c1.plus(c2);
        System.out.println("Sum of Complex Numbers is : ");
        c1.getcomplex();
        System.out.print(" + ");
        c2.getcomplex();
        System.out.print(" = ");
        sum.getcomplex();
    }
}