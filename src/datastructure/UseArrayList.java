package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		//Adding and Removing
		ArrayList<String> ulist = new ArrayList<String>();
		ulist.add("Urooj");
		ulist.add("Nayeem");
		ulist.add("Arif");

		System.out.println("Original:" + ulist);

		ulist.add("Munsur");

		System.out.println("After Added:" + ulist);

		ulist.remove("Nayeem");

		System.out.println("After Removed:" + ulist);

		//Using Iteration
		ArrayList<String> nlist = new ArrayList<String>();
		nlist.add("Mira");
		nlist.add("Emil");
		nlist.add("Anthony");

		for(String str:nlist)
			System.out.println("New Names:" + str);
	}

}
