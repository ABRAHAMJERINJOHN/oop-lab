import java.util.*;
import java.io.*;
import java.util.HashSet;
public class HashSetDemo
{
    public static void main(String[] args) {
        //Create hash set
          HashSet<Integer> hset = new HashSet<Integer>();
          //Add elements to hash set
          hset.add(100);
          hset.add(120);
          hset.add(150);
            hset.add(200);
              hset.add(500);
                hset.add(350);
          //Checking elements in hash set
          System.out.println("Hash set Elements are...");

          // set Iterator
      Iterator<Integer> p = hset.iterator();
    // Iterate the hash set
     while (p.hasNext())
      {
     System.out.println(p.next());
          }
          // Again Checking for the empty set
        System.out.println("Is the hashset empty: " + hset.isEmpty());
        //no:of elements in hash HashSet
        System.out.println("Size of the Hash Set: " + hset.size());
        // Clearing the set using clear() method
       hset.clear();
        System.out.println("after clearing the hash set");
         System.out.println("Is the hashset empty: " + hset.isEmpty());
}
}
