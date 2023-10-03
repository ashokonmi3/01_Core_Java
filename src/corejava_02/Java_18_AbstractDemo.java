package corejavapackage;

/*
 * A class which is declared with the abstract keyword is known as an abstract
 * class in Java. It can have abstract and non-abstract methods (method with the
 * body).Abstraction is a process of hiding the implementation details and
 * showing only functionality to the user. It needs to be extended and its
 * method implemented. It cannot be instantiated.
 * 
 */
// A Simple demonstration of abstract.
//abstract class AforAbstraction {
//	abstract void callme();
//
//	abstract void add();
//
//	// concrete methods are still allowed in abstract classes
//	void callmetoo() {
//		System.out.println("This is a concrete method.");
//	}
//}
//
//class BforAbstraction extends AforAbstraction {
//	void callme() {
//		System.out.println("B's implementation of callme.");
//	}
//
//	void add() {
//		System.out.println("B's implementation of callmetoo.");
//	}
//
//}
//
//class Java_18_AbstractDemo {
//	public static void main(String args[]) {
//		BforAbstraction b = new BforAbstraction();
//		b.callme();
//		b.callmetoo();
//		b.add();
//
//	}
//}

// ===========================================
// Using abstract methods and classes.
abstract class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	// area is now an abstract method
	abstract double area();

}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	// override area for rectangle
	double area() {
		System.out.println("Inside Area for Rectangle.");
		return dim1 * dim2;
	}
}

//
class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	// override area for right triangle
	double area() {
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2;
	}
}

class Java_18_AbstractDemo {
	public static void main(String args[]) {
		// Figure f = new Figure(10, 10); // illegal now
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figref; // this is OK, no object is created
		figref = r;
		System.out.println("Area is " + figref.area());
		figref = t;
		System.out.println("Area is " + figref.area());
	}
}

// ===============================================
// abstract class Shape {
// abstract void draw();
// }
//
//// In real scenario, implementation is provided by others i.e. unknown by
//// end user
// class Rectangle extends Shape {
// void draw() {
// System.out.println("drawing rectangle");
// }
// }
//
////
// class Circle1 extends Shape {
// void draw() {
// System.out.println("drawing circle");
// }
// }
//
////
////// In real scenario, method is called by programmer or user
// class Java_18_AbstractDemo {
// public static void main(String args[]) {
// Shape s = new Circle1();// In a real scenario, object is provided through
// // method, e.g., getShape()
// // method
// s.draw();
// Shape r = new Rectangle();
// r.draw();
// }
// }

// ==================================
//
// abstract class BankBase {
// abstract int getRateOfInterest();
//
// int gethouseloanrate() { // this function can also be overriden
// System.out.println("This is a concrete method.");
// int roi = 7;
// // return 7;
// return roi;
// }
// }
//
// class SBIabs extends BankBase {
// int getRateOfInterest() {
// int roi = 7;
// // return 7;
// return roi;
// }
//
// int gethouseloanrate() {
// System.out.println("This is a concrete method.");
// int roi = 18;
// // return 7;
// return roi;
// }
// }
//
// class PNB123 extends BankBase {
// int getRateOfInterest() {
// return 8;
// }
// }
//
// class Java_18_AbstractDemo {
// public static void main(String args[]) {
// BankBase b;
// b = new SBIabs();
// System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
// System.out.println("SBI house loan Rate of Interest is: " +
// b.gethouseloanrate() + " %");
//
// b = new PNB123();
// System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
// System.out.println("PNB houseloan rate of Interest is: " +
// b.gethouseloanrate() + " %");
//
// }
// }

// ==============================