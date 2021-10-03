// importing the FileWriter class
import java.io.FileWriter;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
//labcycle 6th program
class Filedemo3 {
  public static void main(String args[]) {

    // creates a multiline string using + operator
   
    String program = "HAI HAI HAI \n" +
     "Welcome \n" +
     "hellllllloooooo";
     try {
       // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("JavaFile1.java");

       // Writes the program to file
       output.write(program);
       System.out.println("Data is written to the file.");

       // Closes the writer
       output.close();
       
       FileWriter output1 = new FileWriter("JavaFile1.java",true);
       output1.write(program);
      output1.close();
       
       
       // Creates a FileInputStream
      FileInputStream file = new FileInputStream("JavaFile1.java");

      // Creates a BufferedInputStream
      BufferedInputStream input = new BufferedInputStream(file);

      // Reads first byte from file
      int i = input.read();

      while (i != -1) {
        System.out.print((char) i);

        // Reads next byte from the file
        i = input.read();
      }
       System.out.println();
      input.close();
       
       
       
     }
     catch (Exception e) {
        System.out.print("File operation Error"+ e);
     }
  }
}