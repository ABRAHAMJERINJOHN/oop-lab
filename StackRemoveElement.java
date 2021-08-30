// Java code to illustrate remove() when position of
// element is passed as parameter
import java.io.*;
import java.util.*;

public class StackRemoveElement {
	public static void main(String args[])
	{

		// Creating an empty Stack
		Stack<String> stk = new Stack<String>();

		// Use add() method to add elements in the Stack
		stk.add("parvathy");
    	stk.add("hello");
      	stk.add("welcome to");
		stk.add("java");
		stk.add("programming");
		stk.add("10");
		stk.add("20");

		// Output the Stack
		System.out.println("Stack elements are: " + stk);

		// Remove the element using remove()
		String rem_ele = stk.remove(4);

		// Print the removed element
		System.out.println("Removed element: "	+ rem_ele);

		// Print the final Stack
		System.out.println("Final Stack elements are: "	+ stk);
	}
}
