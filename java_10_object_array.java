import java.util.*;
class Person{
    String Name;
    String Gender;
    String Address;
    int Age;
    Person(String name,String gender,String address,int age){
        Name=name;
        Gender=gender;
        Address=address;
        Age=age;
    }
}
class Employee extends Person{
    String Empid;
    String Company_name;
    String Qualification;
    double Salary;
    Employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,double salary){
        super(name, gender, address, age);
        Empid=empid;
        Company_name=company_name;
        Qualification=qualification;
        Salary=salary;
    }
}
class Teacher extends Employee{
    String Subject;
    String Department;
    String Teacherid;
    Teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,double salary,String subject,String department,String teacherid){
        super(name, gender, address, age, empid, company_name, qualification, salary);
        Subject=subject;
        Department=department;
        Teacherid=teacherid;
    }
    void display(){
        
        System.out.println("Name : "+Name);
        System.out.println("Gender : "+Gender);
        System.out.println("Address : "+Address);
        System.out.println("Age : "+Age);
        System.out.println("Employee ID : "+Empid);
        System.out.println("Collage Name : "+Company_name);
        System.out.println("Qualification : "+Qualification);
        System.out.println("Salary : "+Salary);
        System.out.println("Subject : "+Subject);
        System.out.println("Department : "+Department);
        System.out.println("Teacher ID : "+Teacherid);
    }
}
class java_10_object_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,gend,addr,eid,cname,quali,sub,dept,tid,temp;
        int age,n;
        double salary;
        Teacher t[]=new Teacher[10];

        System.out.println("Enter the number of Teachers : ");
        n=sc.nextInt();
        temp=sc.nextLine();
        for(int i=0;i<n;i++){
            int m=i+1;
            System.out.println("Enter the details of Teacher:"+m);
            System.out.println();
            System.out.println("Enter the Name :");
            name=sc.nextLine();
            System.out.println("Enter the Gender :");
            gend=sc.nextLine();
            System.out.println("Enter the Address :");
            addr=sc.nextLine();
            System.out.println("Enter the Age :");
            age=sc.nextInt();
            temp=sc.nextLine();
            System.out.println("Enter the Employee ID :");
            eid=sc.nextLine();
            System.out.println("Enter the Company Name :");
            cname=sc.nextLine();
            System.out.println("Enter the Qualification :");
            quali=sc.nextLine();
            System.out.println("Enter the Salary :");
            salary=sc.nextDouble();
            temp=sc.nextLine();
            System.out.println("Enter the Subject :");
            sub=sc.nextLine();
            System.out.println("Enter the Department :");
            dept=sc.nextLine();
            System.out.println("Enter the Teacher ID :");
            tid=sc.nextLine();
            System.out.println();
            t[i]=new Teacher(name, gend, addr, age, eid, cname, quali, salary, sub, dept, tid);
        }
        for(int i=0;i<n;i++)
        {
            int m=i+1;
            System.out.println();
            System.out.println("Teacher Details"+m);
            t[i].display();
            System.out.println();
        }

        sc.close();
    }
}