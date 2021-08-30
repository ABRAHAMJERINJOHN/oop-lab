
import java.io.*;
class StringAndStringBuffer
 {
	public static void main(String[] args)
	{
	StringBuffer s = new StringBuffer("parvathy");
		int p = s.length();
		int q = s.capacity();
		System.out.println("Length of string parvathy=" + p);
		System.out.println("Capacity of string parvathy=" + q);
    s.append(" A B Nair");
    System.out.println("After Appending="+s);
    s.insert(11, "-");
    System.out.println("After inserting - @possition 9="+s);
    s.reverse();
    System.out.println("After reversing ="+s);
    s.delete(0, 2);
            System.out.println("After deteting the array from 0 to 2 possition="+s);
            s.deleteCharAt(1);
            System.out.println("After deteting a character @1 possition="+s);
            s.replace(0,5,"a");
            System.out.println("After replacing with 'a' from 0th to 5th possition ="+s);

            String s1="welcome to java programming ";//creating string by Java string literal
          char ch[]={'s','t','r','i','n','g','s'};
          String s2=new String(ch);//converting char array to string
          String s3=new String("hello");//creating Java string by new keyword
          System.out.println("string s2="+s2);
          System.out.println("string s3="+s3);
          System.out.println("string s1="+s1);
          char c=s1.charAt(5);/*returns the char value at the 2th index of string "welcome to java programming" */
           System.out.println("returning the char value at the 5th index of string s1= "+c);
           System.out.println("string length of s1: "+s1.length());
           s1=s1.concat(" ... let's crack it");
           System.out.println("After concatenation with string s1 ="+s1);
           String s4="JAVA HELLO stRIng";
String s1lower=s4.toLowerCase();
System.out.println("lower case of string 4 is"+s1lower);
String s5="hello string";
String s1upper=s5.toUpperCase();
System.out.println("upper case of string 5 is"+s1upper);
String s6="  hello string   ";
System.out.println("without trimming:");
System.out.println(s6+"welcome");//without trim()
System.out.println("with trimming:");
System.out.println(s6.trim()+"welcome");//with trim()
}
}
