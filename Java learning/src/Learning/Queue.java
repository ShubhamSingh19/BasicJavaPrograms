package Learning;

import java.util.*;

public class Queue {
	public static void main(String[] args){
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		System.out.println("Adding data");
		q.offer("First");
		q.offer("Second");
		q.offer("Third");
		System.out.println(q);
		
		System.out.println("Element having most priority and will be removed first = "+q.peek());
		
		System.out.println("Removing data");
		q.poll();
		System.out.println(q);
	}

}
