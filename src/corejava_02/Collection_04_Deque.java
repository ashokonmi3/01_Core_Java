package collectiontutorial;

import java.util.ArrayDeque;
import java.util.Deque;

// Queue, Deque interface
// ------------------
// 1) Prioroty Queue
// 2) Array Deque
// --------------------
// maintains the first-in-first-out order.
// It can be defined as an ordered list that is used to hold the elements which
// are about to be processed.
// There are various classes like PriorityQueue,
// Deque, and ArrayDeque which implements the Queue interface.
// ======
// PriorityQueue
// The PriorityQueue class implements the Queue interface.
// It holds the elements or objects which are to be processed by their
// priorities.
// PriorityQueue doesn't allow null values to be stored in the queue.
// Natural ordering 
// ===============
//public class Collection_04_Deque {
//	public static void main(String args[]) {
//
//		PriorityQueue<String> queue = new PriorityQueue<String>();
//		queue.add("z");
//		queue.add("v");
//		queue.add("a");
//		queue.add("s");
//		System.out.println("head:" + queue.element());
//		System.out.println("head:" + queue.peek());
//		System.out.println("iterating the queue elements:");
//		Iterator itr = queue.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		queue.remove();
//		queue.poll();
//		System.out.println("after removing two elements:");
//		Iterator<String> itr2 = queue.iterator();
//		while (itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//
//	}
//}
// ======================

// ===========================
// Dequeue
// Deque interface extends the Queue interface.
// In Deque, we can remove and add the elements from both the side.
// Deque stands for a double-ended queue which
// enables us to perform the operations at both the ends.
// ArrayDeque class implements the Deque interface. It facilitates us to use the
// Deque. Unlike queue, we can add or delete the elements from both the ends.

// ArrayDeque is faster than ArrayList and Stack and has no capacity
// restrictions.

//public class Collection_04_Deque {
//	public static void main(String[] args) {
//		// Creating Deque and adding elements
//		Deque<String> deque = new ArrayDeque<String>();
//		deque.add("Java");
//		deque.add("Python");
//		deque.add("Scala");
//		// Traversing elements
//		for (String str : deque) {
//			System.out.println(str);
//		}
//	}
//}
// =================

public class Collection_04_Deque {
	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Java");
		deque.add("Python");
		deque.add("Scala");
		deque.offer("c");
		deque.offer("cpp");
		deque.offerFirst("Golang");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
		System.out.println("*****************");

		deque.pollLast();
		deque.pollFirst();

		for (String str : deque) {
			System.out.println(str);
		}
	}
}
