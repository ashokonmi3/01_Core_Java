package corejava_01;
/*
 * Consider we want to start a service like "makemytrip.com" or "expedia.com",
 * where we are responsible for displaying the flights from various flight
 * service company and place an order from customer. Lets keep our service as
 * simple as, Displaying flights available from vendors like "airasia",
 * "british airways" and "emirates". Place and order for seat to respective
 * vendor.
 * 
 * How should we design our application considering interfaces and abstract
 * class? In this scenario, interface is useful or abstract class?
 * 
 * Remember, In this application, we don't own any flight. we are just a middle
 * man/aggregator and our task is to first enquire "airasia", then enquire
 * "british airways" and at last enquire "emirates" about the list of flights
 * available and later if customer opts for booking then inform the respective
 * flight vendor to do booking.
 * 
 * For this, first we need to tell "airasia", "british airways" and "emirates"
 * to give us list of flights, internally how they are giving the list that we
 * don't care. This means I only care for method "getAllAvailableFlights()"
 * 
 * "getAllAvailableFlights()" from "airasia" may have used SOAP service to
 * return list of flights. "getAllAvailableFlights()" from "british airways" may
 * have used REST service to return list of flights. "getAllAvailableFlights()"
 * from "emirates" may have used CORBA service to return list of flights.
 * 
 * but we don't care how it is internally implemented and what we care is the
 * contract method "getAllAvailableFlights" that all the flight vendor should
 * provide and return list of flights.
 * 
 * Similarly, for booking I only care for method "booking()" that all vendors
 * should have, internally how this vendors are doing booking that I don't care.
 * 
 */

// ==========================

//interface webdriver {
//	void geturl(String s);
//
//	void maximize();
//
//	void minimize();
//
//	void close();
//}
//
//class Google implements webdriver {
//	// Implement Callback's interface
//	public void geturl(String s) {
//		System.out.println("Chrome Launching the URL " + s);
//	}
//
//	public void maximize() {
//		System.out.println("Maximizing the browser for Chrome");
//	}
//
//	public void minimize() {
//		System.out.println("Minimize the browser for Chrome");
//	}
//
//	public void close() {
//		System.out.println("closeing the browser for Chrome");
//	}
//
//}
//
////
//class firefox implements webdriver {
//
//	public void geturl(String s) {
//		System.out.println("FireFox Launching the URL " + s);
//	}
//
//	public void maximize() {
//		System.out.println("Maximizing the browser for FireFox");
//	}
//
//	public void minimize() {
//		System.out.println("Minimize the browser for FireFox");
//	}
//
//	public void close() {
//		System.out.println("closeing the browser for FireFox");
//	}
//
//}
//
//class IE implements webdriver {
//	// Implement Callback's interface
//
//	public void geturl(String s) {
//		System.out.println("IE Launching the URL " + s);
//	}
//
//	public void maximize() {
//		System.out.println("Maximizing the browser for IE");
//	}
//
//	public void minimize() {
//		System.out.println("Minimize the browser for IE");
//	}
//
//	public void close() {
//		System.out.println("closeing the browser for IE");
//	}
//
//}
//
//class Interface {
//	public static void main(String args[]) {
//		webdriver ff = new firefox();
//		ff.geturl("abc");
//
//		webdriver ch = new Google();
//
//		ch.geturl("abc");
//	}
//}

// =========================

//class Interface {
//	public static void main(String args[]) {
//		webdriver driver = new ChromeDriver();
//		webdriver driver = new Firefoxdriver();
//		webdriver driver = new IeDriver();
//	}
//}

// ====================
//interface Mywebsite {
//	void getAllAvailableFlights();
//}
//
//class Airasia implements Mywebsite {
//	// Implement Callback's interface
//	public void getAllAvailableFlights() {
//		System.out.println("Flight is available in europe ");
//	}
//}
//
//class BritishAirways implements Mywebsite {
//	// // // // Implement Callback's interface
//	public void getAllAvailableFlights() {
//		System.out.println("Flight is not available in europe");
//		//
//	}
//}
//
//class Emirates implements Mywebsite {
//	// Implement Callback's interface
//	public void getAllAvailableFlights() {
//		System.out.println("Flight is available in europe but via US ");
//	}
//}
//
//class Java_17_interface {
//	public static void main(String args[]) {
//		Mywebsite web = new Airasia();
//		web.getAllAvailableFlights();
//		Mywebsite ob = new BritishAirways();
//		ob.getAllAvailableFlights();
//		Mywebsite emirateObject = new Emirates();
//		emirateObject.getAllAvailableFlights();
//	}
//}
// ===============================

// Interface can be extended
//interface Ainterface {
//	void meth1();
//
//	void meth2();
//}
//
//// B now includes meth1() and meth2() -- it adds meth3().
//interface Binterface extends Ainterface {
//	void meth3();
//	// meth1()
//	// meth2()
//}
//
//// This class must implement all of A and B
//class MyClass implements Binterface {
//	 public void meth1() {
//	 System.out.println("Implement meth1().");
//	 }
//
//	public void meth2() {
//		System.out.println("Implement meth2().");
//	}
//
//	public void meth3() {
//		System.out.println("Implement meth3().");
//	}
//}
//
//class Java_17_interface {
//	public static void main(String arg[]) {
//		MyClass ob = new MyClass(); // String s = new String()
//		ob.meth1();
//		ob.meth2();
//		// ob.meth3();
//	}
//}

// ====================

// We need to implement all the methods this is mandatory
//interface Ainterface {
//	void meth1();
//
//	void meth2();
//}
//
//// B now includes meth1() and meth2() -- it adds meth3().
//interface Binterface extends Ainterface {
//	void meth3();
//	// meth1()
//	// meth2()
//}
//
//// This class must implement all of A and B
//class MyClass implements Binterface {
//
//	public void meth2() {
//		System.out.println("Implement meth2().");
//	}
//
//	public void meth3() {
//		System.out.println("Implement meth3().");
//	}
//}
//
//class Java_17_interface {
//	public static void main(String arg[]) {
//		MyClass ob = new MyClass(); // String s = new String()
//		ob.meth1();
//		ob.meth2();
//		// ob.meth3();
//	}
//}

// ========================

/*
 * Multiple inheritence - If a class implements multiple interfaces, or an
 * interface extends multiple interfaces i.e. known as multiple inheritance.
 */
//
//interface makeMytrip {
//	void print();
//}
//
//interface Goibibo {
//	void show();
//}
//
//class airaisa implements makeMytrip, Goibibo {
//	public void print() {
//		System.out.println("Hello");
//	}
//
//	public void show() {
//		System.out.println("Welcome");
//	}
//
//}
//
//class Java_17_interface {
//	public static void main(String args[]) {
//		airaisa obj = new airaisa();
//		obj.print();
//		obj.show();
//	}
//}
// ====================
// We can not have 2 same name of function in 2 different interface

//interface makeMytrip {
//	void show();
//
//	void print();
//
//}
//
//interface Goibibo {
//	int show();
//
//	void printName();
//
//}
//
//class airaisa implements makeMytrip, Goibibo {
//	public void show() {
//		System.out.println("Hello");
//		// return 1;
//	}
//
//	public void printName() {
//		System.out.println("Hello");
//	}
//
//	public void print() {
//		System.out.println("Hello world");
//	}
//
//}
//
//class Java_17_interface {
//	public static void main(String args[]) {
//		airaisa obj = new airaisa();
//		obj.show();
//	}
//}
// ======================
//interface makeMytrip {
//	void show();
//}
//
//interface Goibibo {
//	void show1();// need to implement all the function
//
//	void print();
//
//}
//
//class airaisa implements makeMytrip, Goibibo {
//	public void show() {
//		System.out.println("1 paramter");
//	}
//
//	public void print() {
//		System.out.println("No parameter");
//	}
//
//}
//
//class Java_17_interface {
//	public static void main(String args[]) {
//		airaisa obj = new airaisa();
//		obj.show();
//
//	}
//}
//====================
//interface makeMytrip {
//	void show();
//}
//
//interface Goibibo {
//	void show(int a);// need to implement all the function
//
//	void print();
//
//}
//
//class airaisa implements makeMytrip, Goibibo {
//	public void show() {
//		System.out.println("1 paramter");
//	}
//
//	public void show(int a) {
//		System.out.println("1 paramter");
//	}
//
//	public void print() {
//		System.out.println("No parameter");
//	}
//
//}
//
//class Java_17_interface {
//	public static void main(String args[]) {
//		airaisa obj = new airaisa();
//		obj.show();
//
//	}
//}
//======================
interface MyInterface {
	// Constant variables (implicitly public, static, and final)
	int NUMBER = 10;
	String NAME = "Interface";

	// Method signature (abstract method)
	void myMethod();
}

class Java_17_interface implements MyInterface {
	public void myMethod() {
		System.out.println("Implementing abstract method in MyInterface");
	}

	public static void main(String[] args) {
		System.out.println("Value of NUMBER: " + MyInterface.NUMBER);
		System.out.println("Value of NAME: " + MyInterface.NAME);
		// Attempting to modify the constant (will result in a compilation error)
		// MyInterface.NUMBER = 20; // Compilation error: Cannot assign a value to final
		// variable 'NUMBER'

		Java_17_interface obj = new Java_17_interface(); // Creating an object of the implementing class
		obj.myMethod(); // Invoking myMethod using the object

	}
}

// ==================
// interface MyInterface {
// // Constant variables (implicitly public, static, and final)
// int NUMBER = 10;
// String NAME = "Interface";
//
// // Method signature (abstract method)
// void myMethod();
// }
//
// class MyClass implements MyInterface {
// public void myMethod() {
// System.out.println("Implementing abstract method in MyInterface");
// }
// }
//
// class Java_17_interface {
//
// public static void main(String[] args) {
// System.out.println("Value of NUMBER: " + MyInterface.NUMBER);
// System.out.println("Value of NAME: " + MyInterface.NAME);
//
// // Attempting to modify the constant (will result in a compilation error)
// // MyInterface.NUMBER = 20; // Compilation error: Cannot assign a value to
// final
// // variable 'NUMBER'
// }
// }

// ======================================
/*
 * As we have explained in the inheritance chapter, multiple inheritance is not
 * supported in case of class because of ambiguity. But it is supported in case
 * of interface because there is no ambiguity as implementation is provided by
 * the implementation class. For example:
 */

//// =============================