package corejava_01;

//class A {
//	int x;
//	double y;
//	String s;
//	boolean b;
//}
//
//class Java_10_OverloadDemo {
//	public static void main(String[] args) {
//		A ob = new A();
//		System.out.println("Result of ob.x: " + ob.x);
//		System.out.println("Result of ob.y: " + ob.y);
//		System.out.println("Result of ob.s: " + ob.s);
//		System.out.println("Result of ob.b: " + ob.b);
//
//	}
//}
// ==============================
class Overload {
	void test() {
		System.out.println("No parameters");
	}

	// Overload test for one integer parameter.
	void test(int a) {
		System.out.println("a: " + a);
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// Overload test for a double parameter
	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
}

class Java_10_OverloadDemo {
	public static void main(String[] args) {
		Overload ob = new Overload();
		double result;
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): " + result);
	}
}
// ====================
// Method can not called overloaded if they have different return type
// class Overload {
// //
// double calcAverage(int marks1, int marks2) { // Return type of method
// // calcAverage is double
//
// return (marks1 + marks2) / 2.0;
// }
//
// int calcAverage(int marks1, int marks2) { // Return type is int
//
// return (marks1 + marks2) / 2;
//
// }
// }
// =========================
// Method can not called overloaded by having different access modifier
// class Overload {
// public double calcAverage(int marks1, int marks2) { // Access—public
// return (marks1 + marks2) / 2.0;
// }
//
// private double calcAverage(int marks1, int marks2) {// Access—private
// return (marks1 + marks2) / 2.0;
// }
// }
// ==============================================
/*
 * OverloadDemo does not define test(int). Therefore, when test( ) is called
 * with an integer argument inside Overload, no matching method is found.
 * However, Java can automatically convert an integer into a double, and this
 * conversion can be used to resolve the call. Therefore, after test(int) is not
 * found, Java elevates i to double and then calls test(double). Of course, if
 * test(int) had been defined, it would have been called instead. Java will
 * employ its automatic type conversions only if no exact match is found.
 */

// =========================================
/*
 * Here, Box defines three constructors to initialize the dimensions of a box
 * various ways.
 */
// class BoxOverload {
// double width;
// double height;
// double depth;
//
// BoxOverload(double w, double h, double d) {// constructor used when all
// // dimensions specified
// width = w;
// height = h;
// depth = d;
// }
//
// BoxOverload() { // constructor used when no dimensions specified
// width = -1; // use -1 to indicate
// height = -1; // an uninitialized
// depth = -1; // box
// }
//
// BoxOverload(double len) {// constructor used when cube is created
// width = height = depth = len;
// }
//
// //
// double volume() {// compute and return volume
// return width * height * depth;
// }
// }
//
////
// class Java_10_OverloadDemo {
// public static void main(String args[]) { //
// // create boxes using the various constructors
// BoxOverload mybox1 = new BoxOverload(10, 20, 15);
// BoxOverload mybox2 = new BoxOverload();
// BoxOverload mycube = new BoxOverload(7);
// double vol; // // get volume of first box
// vol = mybox1.volume();
// System.out.println("Volume of mybox1 is " + vol); // // get
// // volume of second box
// vol = mybox2.volume();
// System.out.println("Volume of mybox2 is " + vol); // // get volume of cube
// vol = mycube.volume();
// System.out.println("Volume of mycube is " + vol);
// }
// }

// ============================================
// Objects may be passed to methods.
// class ObjectasParam {
// int a, b;
//
// ObjectasParam(int i, int j) {
// a = i;
// b = j;
// }
//
// boolean equalTo(ObjectasParam o) {// return true if o is equal to the
// invoking object
// if (a == o.a && b == o.b)// ob1.a==ob2.a && ob1.b==ob2.b
//
// return true;
// else
// return false;
// }
// }
//
// class Java_10_OverloadDemo {
// public static void main(String args[]) {
// ObjectasParam ob1 = new ObjectasParam(100, 22);
// ObjectasParam ob2 = new ObjectasParam(100, 22);
// ObjectasParam ob3 = new ObjectasParam(-1, -10);
// System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
// System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
// System.out.println("ob1 == ob3: " + ob3.equalTo(ob1));
//
// }
// }
// ===================================

// Here, Box allows one object to initialize another.
//
// class BoxOverload {
// double width;
// double height;
// double depth;
//
// BoxOverload(BoxOverload ob) { // Notice this constructor. It takes an object
// // of type Box. pass object to constructor
// width = ob.width;
// height = ob.height;
// depth = ob.depth;
// }
// // BoxOverload myclone = new BoxOverload(mybox1); // create copy of mybox1
//
// BoxOverload(double w, double h, double d) {// // constructor used when all
// // dimensions specified
// width = w;
// height = h;
// depth = d;
// }
//
// //
// // // // // constructor used when no dimensions specified
// BoxOverload() {
// width = -1; // use -1 to indicate
// height = -1; // an uninitialized
// depth = -1; // box
//
// }
//
// // constructor used when cube is created
// BoxOverload(double len) {
// width = height = depth = len;
// }
//
// // compute and return volume
// double volume() {
// return width * height * depth;
// }
// }
//
// class Java_10_OverloadDemo {
// public static void main(String args[]) { // create boxes using the various
// BoxOverload mybox1 = new BoxOverload(10, 20, 15);
// BoxOverload mybox2 = new BoxOverload();
// BoxOverload mycube = new BoxOverload(7);
// BoxOverload myclone = new BoxOverload(mybox1); // create copy of mybox1
// BoxOverload mycube1 = new BoxOverload(mycube);
// double vol; // get volumeof first box
// vol = mybox1.volume();
// System.out.println("Volume of mybox1 is " + vol); // get volume of second box
// vol = mybox2.volume();
// System.out.println("Volume of mybox2 is " + vol); // get volume of cube
// vol = mycube.volume();
// System.out.println("Volume of cube is " + vol); // getvolume of clone
// vol = myclone.volume();
// System.out.println("Volume of clone is " + vol);
// }
// }
