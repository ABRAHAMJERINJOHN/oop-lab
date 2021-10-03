//labcycle 3rd pgm......
class multiplication extends Thread{
     public void run( ) {
        for(int i = 1; i <= 100; i++) {
           System.out.println(i + " X 5 =" + i*5 +"\n");
        }
        System.out.println("Exiting from Thread Multiplication ...");
     }
}

class primenumbers extends Thread {
    public void run( ) {
       
            prime_N(999); 
        
	}

static void prime_N(int N)
    {
        // Declaring the variables
        int x, y, flg;
 
        // Printing display message
        System.out.println(
            "All the Prime numbers within 1 and " + N
            + " are:");
 
        // Using for loop for traversing all
        // the numbers from 1 to N
        for (x = 1; x <= N; x++) {
 
            // Omit 0 and 1 as they are
            // neither prime nor composite
            if (x == 1 || x == 0)
                continue;
 
            // Using flag variable to check
            // if x is prime or not
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
 
            // If flag is 1 then x is prime but
            // if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print("Prime Number :" + x + "\n");
        }
    }
	
		
}


public class threadClassDemo {
    public static void main(String args[]) {
         multiplication a = new multiplication();
         primenumbers b = new primenumbers();
         a.start();
         b.start();
         System.out.println("From main thread... Multithreading is over ");
    }
}