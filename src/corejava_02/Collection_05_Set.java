package collectiontutorial;

import java.util.Iterator;
import java.util.TreeSet;

// SET - It extends the Collection interface.
// 1) hashset
// 2) linked hashset
// 3) Treeset
// =========================
// It represents the unordered set of elements which doesn't allow us
// to store the duplicate items.
// We can store at most one null value in Set.
// Set is implemented by HashSet, LinkedHashSet, and TreeSet.
// It represents the collection that uses a hash table for storage. Hashing is
// used to store the elements in the HashSet. It contains unique items.
//class Collection_05_Set {
//	public static void main(String args[]) {
//		// Creating HashSet and adding elements
//		HashSet<String> set = new HashSet();
//		set.add("One");
//		set.add("Two");
//		set.add("Three");
//		set.add("Four");
//		set.add("Five");
//		set.add("Five");
//		Iterator<String> i = set.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
//	}
//}
// ========================
//class Collection_05_Set {
//	public static void main(String args[]) {
//		// Creating HashSet and adding elements
//		HashSet<String> set = new HashSet<String>();
//		set.add("Ravi");
//		set.add("Vijay");
//		set.add("Ravi");
//		set.add("Ajay");
//		// Traversing elements
//		Iterator<String> itr = set.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
//}

// ==============
//class Collection_05_Set {
//	public static void main(String args[]) {
//		HashSet<String> set = new HashSet<String>();
//		set.add("Ravi");
//		set.add("Vijay");
//		set.add("Arun");
//		set.add("Sumit");
//		System.out.println("An initial list of elements: " + set);
//		// Removing specific element from HashSet
//		set.remove("Ravi");
//		System.out.println("After invoking remove(object) method: " + set);
//		HashSet<String> set1 = new HashSet<String>();
//		set1.add("Ajay");
//		set1.add("Gaurav");
//		set.addAll(set1);
//		System.out.println("Updated List: " + set);
//		// Removing all the new elements from HashSet
//		set.removeAll(set1);
//		System.out.println("After invoking removeAll() method: " + set);
//		// Removing elements on the basis of specified condition
//		System.out.println("After invoking removeIf() method: " + set);
//		// Removing all the elements available in the set
//		set.clear();
//		System.out.println("After invoking clear() method: " + set);
//	}
//}

// ========================

//class Collection_05_Set {
//	public static void main(String args[]) {
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Ravi");
//		list.add("Vijay");
//		list.add("Ajay");
//		list.add("Ajay");
//		list.add("Ajay");
//
//		HashSet<String> set = new HashSet(list);
//		set.add("Gaurav");
//		Iterator<String> i = set.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
//	}
//}

// ===============================
//
//class EBook {
//	int id;
//	String name, author, publisher;
//	int quantity;
//
//	public EBook(int id, String name, String author, String publisher, int quantity) {
//		this.id = id;
//		this.name = name;
//		this.author = author;
//		this.publisher = publisher;
//		this.quantity = quantity;
//	}
//}
//
//public class Collection_05_Set {
//	public static void main(String[] args) {
//		HashSet<EBook> set = new HashSet<EBook>();
//		// Creating Books
//		EBook b1 = new EBook(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
//		EBook b2 = new EBook(102, "Data Communications & Networking", "Forouzan", "McGraw Hill", 4);
//		EBook b3 = new EBook(103, "Operating System", "Galvin", "Wiley", 6);
//		// Adding Books to HashSet
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		// Traversing HashSet
//		for (EBook b : set) {
//			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
//		}
//	}
//}

// ==================
// LinkedHashSet class represents the LinkedList implementation of Set
// Interface. It extends the HashSet class and implements Set interface. Like
// HashSet, It also contains unique elements. It maintains the insertion order
// and permits null elements.

//public class Collection_05_Set {
//	public static void main(String args[]) {
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		set.add("Ravi");
//		set.add("Vijay");
//		set.add("Ravi");
//		set.add("Ajay");
//		Iterator<String> itr = set.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//	}
//}

// ================
// TreeSet class implements the Set interface that uses a tree for storage. Like
// HashSet, TreeSet also contains unique elements. However, the access and
// retrieval time of TreeSet is quite fast. The elements in TreeSet stored in
// ascending order.
public class Collection_05_Set {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
