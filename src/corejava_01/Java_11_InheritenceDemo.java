package corejavapackage;

//class A1 {
//	int i, j;
//
//	void showij() {
//		System.out.println("i and j: " + i + " " + j);
//	}
//}
//
//class B1 extends A1 {
//	int k;
//
//	// int i, j;
//	void showk() {
//		System.out.println("k: " + k);
//	}
//
//	void sum() {
//		System.out.println("i+j+k: " + (i + j + k));
//	}
//	// void showij() {
//	// System.out.println("i and j: " + i + " " + j);
//	// }
//}
//
//class Java_11_InheritenceDemo {
//	public static void main(String args[]) {
//		B1 subOb = new B1(); // The superclass may be used by itself.
//		subOb.i = 10007;
//		subOb.j = 8;
//		subOb.k = 9;
//		System.out.println("Contents of B1 class object subOb: ");
//		subOb.showij();
//		subOb.showk();
//		System.out.println();
//		System.out.println("Sum of i, j and k in subOb:");
//		subOb.sum();
//	}
//}
// ========================================
// This program uses inheritance to extend Box.
//class Box {
//	double width;
//	double height;
//	double depth;
//
//	// construct clone of an object
//	Box(Box ob) { // pass object to constructor
//		width = ob.width;
//		height = ob.height;
//		depth = ob.depth;
//	}
//
//	// constructor used when all dimensions specified
//	Box(double w, double h, double d) {
//		width = w;
//		height = h;
//		depth = d;
//	}
//
//	// constructor used when no dimensions specified
//	Box() {
//		width = -1; // use -1 to indicate
//		height = -1; // an uninitialized
//		depth = -1; // box
//	}
//
//	Box(double len) { // constructor for BoxWeight
//
//		width = height = depth = len;
//	}
//
//	double volume() {// compute and return volume
//		return width * height * depth;
//	}
//
//}
//
//// Here, Box is extended to include weight.
//class BoxWeight extends Box {
//	double weight; // weight of box
//
//	BoxWeight(double m, double h, double d, double w) { // constructor
//		// forBoxWeight
//		width = w;
//		height = h;
//		depth = d;
//		weight = m;
//	}
//}
//
//class Java_11_InheritenceDemo {
//	public static void main(String args[]) {
//		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
//		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("Volume of mybox1 is " + vol);
//		System.out.println("Weight of mybox1 is " + mybox1.weight);
//		System.out.println();
//		vol = mybox2.volume();
//		System.out.println("Volume of mybox2 is " + vol);
//		System.out.println("Weight of mybox2 is " + mybox2.weight);
//	}
//}
// =================================

// A complete implementation of BoxWeight.
//class Box {
//	double width;
//	double height;
//	double depth;
//
//	Box(Box ob) { // pass object to constructor
//		width = ob.width;
//		height = ob.height;
//		depth = ob.depth;
//	}
//
//	Box(double w, double h, double d) {
//		width = w;
//		height = h;
//		depth = d;
//	}
//
//	Box() {
//		width = -1; // use -1 to indicate
//		height = -1; // an uninitialized
//		depth = -1; // box
//	}
//
//	Box(double len) {
//		width = height = depth = len;
//	}
//
//	double volume() {
//		return width * height * depth;
//	}
//}
//
////// BoxWeight now fully implements all constructors.
//class BoxWeight extends Box {
//	double weight; // weight of box
//
//	BoxWeight(BoxWeight ob) { // pass object to constructor
//		super(ob);// Box(ob)
//		// width = ob.width;
//		// height = ob.height;
//		// depth = ob.depth;
//		weight = ob.weight;
//	}
//
//	// constructor when all parameters are specified
//	BoxWeight(double w, double h, double d, double m) {
//		super(w, h, d); // call superclass constructor
//		// Box(double w, double h, double d) {
//		// width = w;
//		// height = h;
//		// depth = d;
//		// }
//		//
//		weight = m;
//	}
//
//	//
//	// // default constructor
//	BoxWeight() {
//		super();
//		// Box() {
//		// width = -1; // use -1 to indicate
//		// height = -1; // an uninitialized
//		// depth = -1; // box
//		// }
//		weight = -1;
//	}
//
//	// // constructor used when cube is created
//	BoxWeight(double len, double m) {
//		super(len);// width = height = depth = len;
//
//		weight = m;
//	}
//}
//
////
//////
//class Java_11_InheritenceDemo {
//	public static void main(String args[]) {
//		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
//		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
//		BoxWeight mybox3 = new BoxWeight(); // default
//		BoxWeight mycube = new BoxWeight(3, 2);
//		BoxWeight myclone = new BoxWeight(mybox1);
//		double vol;
//		vol = mybox1.volume();
//		System.out.println("Volume of mybox1 is " + vol);
//		System.out.println("Weight of mybox1 is " + mybox1.weight);
//		System.out.println();
//		vol = mybox2.volume();
//		System.out.println("Volume of mybox2 is " + vol);
//		System.out.println("Weight of mybox2 is " + mybox2.weight);
//		System.out.println();
//		vol = mybox3.volume();
//		System.out.println("Volume of mybox3 is " + vol);
//		System.out.println("Weight of mybox3 is " + mybox3.weight);
//		System.out.println();
//		vol = myclone.volume();
//		System.out.println("Volume of myclone is " + vol);
//		System.out.println("Weight of myclone is " + myclone.weight);
//		System.out.println();
//		vol = mycube.volume();
//		System.out.println("Volume of mycube is " + vol);
//		System.out.println("Weight of mycube is " + mycube.weight);
//		System.out.println();
//	}
//}
// =======================

////// Multilevel inheritence
class GrandParent {
	void fun1() {
		System.out.println("GrandParent...");
	}
}

class Parent extends GrandParent {
	void fun2() {
		System.out.println("Parent...");
	}
}

class Child extends Parent {
	void fun3() {
		System.out.println("child...");
	}
}

class Java_11_InheritenceDemo {
	public static void main(String args[]) {
		Child d = new Child();
		d.fun1();
		d.fun2();
		d.fun3();
	}
}
// ==============================
//
