import java.io.*;

//labcycle pgm 2
class inputValidation extends Exception {
     
     public inputValidation(String msg) {
      super(msg);
     }
    }
    
class exception{
 public static void main(String[] args) throws IOException {
  
   int n,a;
   int sum = 0;
   float avg;
   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
   System.out.println(" Enter Total number of Elements:");
   n = Integer.parseInt(br.readLine());
   
   System.out.println(" Enter Elements:");
   try {
    for(int i = 0; i < n; i++) {
         a = Integer.parseInt(br.readLine());
   
         if(a < 0)
         throw new inputValidation("Please enter a positive Number");
         else
         sum = sum + a;
         }
        avg= sum/n;
        System.out.println("Average:" + avg);
      
       }
       catch (inputValidation ex) {
       System.out.print(ex + "\n");
       }
        
 }
}