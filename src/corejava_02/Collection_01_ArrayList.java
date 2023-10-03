package collectiontutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//class Collection_01_ArrayList {
//	public static void main(String args[]) {
//		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
//		list.add("Java");// Adding object in arraylist
//		list.add("Python");
//		list.add("scala");
//		list.add("c++");
//
//		System.out.println(list);
//		//
//		// System.out.println("Traversing list through List Iterator:");
//		// // Here, element iterates in reverse order
//		// ListIterator<String> list1 = list.listIterator(list.size());
//		// // while (list1.hasPrevious()) {
//		// // String str = list1.previous();
//		// // System.out.println(str);
//		// // }
//		System.out.println("Traversing list through for loop:");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//	}
//}
// =========================

class Collection_01_ArrayList {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial list of elements: " + al);
		// Adding elements to the end of the list
		al.add("Python");
		al.add("Java");
		al.add("Scala");
		System.out.println("Arralylist is " + al);
		// Adding an element at the specific position
		al.add(1, "CPP");
		System.out.println("After add(int index, E element) method: " + al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Django");
		al2.add("Golang");
		// // Adding second list elements to the first list
		al.addAll(al2);
		System.out.println("After addAll " + al);
		// ArrayList<String> al3 = new ArrayList<String>();
		// al3.add("Bigdata");
		// al3.add("Datascience");
		// // Adding second list elements to the first list at specific position
		// al.addAll(1, al3);
		// System.out.println("After invoking addAll : " + al);

	}
}
// ===========================
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Iterator;

// class Collection_01_ArrayList {
//
// public static void main(String[] args) {
// ArrayList<String> al = new ArrayList<String>();
// al.add("Python");
// al.add("Java");
// al.add("Scala");
// al.add("C");
// al.add("CPP");
// System.out.println("An initial list of elements: " + al);
// // Removing specific element from arraylist
//
// for (int i = 0; i < al.size(); i++) {
// System.out.println(al.get(i));
// }
//
// al.remove("C");
// System.out.println("After invoking remove(object) method: " + al);
// // Removing element on the basis of specific position
// al.remove(3);
// System.out.println("After invoking remove(index) method: " + al);
// // //
// // // // Creating another arraylist
// ArrayList<String> al2 = new ArrayList<String>();
// al2.add("Django");
// al2.add("React");
// // // Adding new elements to arraylist
// al.addAll(al2);
// System.out.println("Updated list : " + al);
// System.out.println("Is ArrayList Empty: " + al.isEmpty());
// System.out.println("Before update: " + al.get(1));
// // // Updating an element at specific position
// al.set(1, "Datascience");
// System.out.println("After update: " + al);
// // // // Removing all the new elements from arraylist
// al.removeAll(al2);
// System.out.println("After invoking removeAll() method: " + al);
// // //
// // // // Removing all the elements available in the list
// al.clear();
// System.out.println("After invoking clear() method: " + al);
// }
// }

// ====================================

public class Collection_01_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(100);
		myNumbers.add(115);
		myNumbers.add(20);
		myNumbers.add(25);
		int index = myNumbers.indexOf(20);
		System.out.println(index);
		index = myNumbers.indexOf(200);
		System.out.println(index);

		for (int i : myNumbers) {
			System.out.println(i);
		}
		Collections.sort(myNumbers); // Sort myNumbers
		System.out.println("After sorting ");
		//
		for (int j : myNumbers) {
			System.out.println(j);
		}
		System.out.println("Iterating");
		//
		Iterator itr = myNumbers.iterator();
		// System.out.println(itr.next());
		// System.out.println(itr.next());
		// System.out.println("Code inbetween perfome other operation");
		// System.out.println("iterator explaination");
		// System.out.println(itr.next());

		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("Code inbetween perfome other operation");
			System.out.println("iterator explaination");
			System.out.println(itr.next());

		}
	}
}
