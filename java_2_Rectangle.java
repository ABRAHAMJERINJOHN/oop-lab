 class Rectangle
{
    double length;
    double breadth;
    void setData(double l,double b)
    {
        length=l;
        breadth=b;
    }
    double getArea()
    {
        double  area;
        area=length*breadth;
        return area;
    }
}
class java_2_Rectangle
{
    public static void main(String args[])
    {
        double Area;
        Rectangle R1=new Rectangle();
        R1.setData(12.4,13);
        Area=R1.getArea();
        System.out.println("Area of Rectangle,R1 = "+Area);
        Rectangle R2=new Rectangle();
        R2.setData(10.5,9);
        Area=R2.getArea();
        System.out.println("Area of Rectangle,R2 = "+Area);
        Rectangle R3=new Rectangle();
        R3.setData(13,14);
        Area=R3.getArea();
        System.out.println("Area of Rectangle,R3 = "+Area);
    }}