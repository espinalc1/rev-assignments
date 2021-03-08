package queueStuff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
		// Assignment 1 - Find the difference between LinkedList and PriorityArray (Both
		// Queue implementations)
		Object[] intArr = { 1, 3, null, 12, 34, null, 4363445, 2341, "stuff" };

		Queue<Object> aLL = new LinkedList<>();
		// interface <type> = new Class Implementation<>()
		// have to include an interface type...
		// to make the interface type more dynamic use the Object obj type
		for (Object obj : intArr) {
			aLL.add(obj);
		}

		System.out.println(aLL.toString());
		System.out.println((aLL instanceof LinkedList) + "\n");
		System.out.println("Printing objects in LinkedList\n");

		for (Iterator<Object> it = aLL.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}

		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// the above array will not work priority queue because it doesn't accept null

		/*
		 * Queue<Object> aPQ = new PriorityQueue<>(); for (Object obj : intArr) {
		 * aPQ.add(obj); }
		 * 
		 * System.out.println(aLL.toString()); System.out.println((aPQ instanceof
		 * PriorityQueue) + "\n\n");
		 */

		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// Assignment 2 - Conduct CRUD Operations on
		// Perform CRUD operations on Queue
		// create read update delete
		// Part 1 = PriorityQueue
		System.out.println("\n\nEntering CRUD Operations part of the assignment!\n");

		Object[] arr = { 1, 3, null, 12, 34, null, 4363445, 2341, 32 }; // will sort so objects have to be types that can be compared
		ArrayList<Object> objArrList = new ArrayList<>();

		for (Object obj : arr) {
			if (obj == null) {
				continue;
			} else {
				objArrList.add(obj);
			}
		}

		Queue<Object> test1q = new PriorityQueue<>(); // does natural order according to a comparator method

		// create
		test1q.addAll(objArrList);

		// read
		System.out.println("Creation and Reading of Priority Queue Data Structure: \n" + test1q.toString() + "\n");

		// Update
		test1q.add(Integer.valueOf(200));
		System.out.println("Updated array: " + test1q.toString() + "\n");

		// Delete
		for (Iterator<Object> it = test1q.iterator(); it.hasNext();) {
			Object curr = it.next();
			if ((Integer) curr > Integer.valueOf(2000)) { // here is an example of Object casting
				it.remove();
			}
		}
		System.out.println("Updating Priority Queue by Filtering Items that are larger than 2000: \n"
				+ test1q.toString() + "\n\n");

		// Part 2 = LinkedList
		Queue<Object> aLL2 = new LinkedList<>();

		// Clone
		aLL2.addAll(objArrList);

		// Read
		System.out.println("LinkedList \n" + aLL2.toString() + "\n");

		// Update
		aLL2.add(Integer.valueOf(200));
		System.out.println("Updated LinkedList \n" + aLL2.toString() + "\n");

		// Delete
		for (Iterator<Object> it3 = aLL2.iterator(); it3.hasNext();) {
			Object curr = it3.next();
			if ((Integer) curr > Integer.valueOf(2000)) {
				it3.remove();
			}
		}

		System.out.println("Filtered LinkedList. No numbers above 2000. \n" + aLL2.toString());

	}
}
