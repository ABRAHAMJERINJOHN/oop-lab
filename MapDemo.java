import java.util.*;
import java.io.*;
class MapDemo
 {
	public static void main(String args[])
	{
		// Default Initialization of Map
		Map<Integer, String> hm1 = new HashMap<>();
	// Inserting the Elements
		hm1.put(1, "hello");
		hm1.put(2, "welcome ");
		hm1.put(3, "java");
    	hm1.put(4, "programming");
System.out.println("Initial map:"+hm1);
hm1.put(2, "world");
System.out.println("Updated Map:" + hm1);
hm1.remove(4);
  System.out.println("After removing 4th element,Updated Map:"+hm1);

	}
}
