package datastructure;

import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> u = new LinkedList<>();

		for (int i=0; i<11; i++)
			u.add(i);
		System.out.println("Elements of queue:" + u);

		int remove = u.remove();
		System.out.println("Removed queue:" + remove);

		System.out.println("New queue:" + u);

		int head = u.peek();
		System.out.println("Head of queue:" + head);
	}

}
