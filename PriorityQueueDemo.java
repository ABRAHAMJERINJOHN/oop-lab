import java.io.*;
import java.util.*;
class PriorityQueueDemo {
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
    pQueue.add(90);
    pQueue.add(50);
  System.out.println("iterating the PriorityQueue elements:");
Iterator itr=pQueue.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

		// Printing the top element of PriorityQueue
		System.out.println("top element of priority queue is "+pQueue.peek());
}
}
