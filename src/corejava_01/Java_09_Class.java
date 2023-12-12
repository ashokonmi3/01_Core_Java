package corejava_01;

// class Box1 {
// double width;
// double height;
// double depth;
// }
//
// class Java_09_Class {
// public static void main(String args[]) {
// Box1 mybox = new Box1();
// // int abc[] = new int[4];
// // String s = new String("java");
// double vol;
// mybox.width = 10;
// mybox.height = 20;
// mybox.depth = 15;
// vol = mybox.width * mybox.height * mybox.depth;
// System.out.println("Volume is " + vol);
// }
// }

// ====================
// class Employee {
// String Name;
// int age;
// int salary;
// double experience;
// int projects;
// String[] projectName = new String[2];
// ArrayList<Integer> arrL = new ArrayList<Integer>(2);
//
// }
//
// class Java_09_Class {
// public static void main(String args[]) {
// Employee emp1 = new Employee();
// emp1.Name = "ashok";
// emp1.age = 30;
// emp1.salary = 10000;
// emp1.experience = 10;
// emp1.projects = 10;
// emp1.projectName[0] = "java";
// emp1.projectName[1] = "scala";
// emp1.arrL.add(1);
// emp1.arrL.add(2);
//
// int a;
// String Name;
// System.out.println("Salary is " + emp1.salary);
//
// }
// }

//// ===========================================
// class Box1 {
// double width;
// double height;
// double depth;
// }
//
// class Java_09_Class {
// public static void main(String args[]) {
// Box1 mybox1 = new Box1();
// Box1 mybox2 = new Box1();
// double vol; // assign values to mybox1's instance variables
// mybox1.width = 10;
// mybox1.height = 20;
// mybox1.depth = 15; // assign different values to mybox2's instance variables
// mybox2.width = 3;
// mybox2.height = 6;
// mybox2.depth = 9;
// vol = mybox1.width * mybox1.height * mybox1.depth; // compute volume of
// System.out.println("first box Volume is " + vol);
// vol = mybox2.width * mybox2.height * mybox2.depth; // compute volume of
// System.out.println("second box Volume is " + vol);
//
// }
// }
// =========================================
// Method:

// class Box1 {
//
// double width;
// double height;
// double depth;
//
// // display volume of a box
// public void volume() {
// System.out.println("volume is " + width * height * depth);
// }
// }
//
// class Java_09_Class {
// public static void main(String args[]) {
// Box1 mybox1 = new Box1();
// Box1 mybox2 = new Box1();
// mybox1.width = 10;
// mybox1.height = 20;
// mybox1.depth = 15;
// mybox2.width = 3;
// mybox2.height = 6;
// mybox2.depth = 9;
// mybox1.volume();
// mybox2.volume();
// }
// }

// ==================================================
// Returning a Value
// class Box1 {
// double width;
// double height;
// double depth;
//
// // compute and return volume
// double volume() {
// return width * height * depth;
// }
// }
//
// class Java_09_Class {
// public static void main(String args[]) {
// Box1 mybox1 = new Box1();
// double vol;
// // assign values to mybox1's instance variables
// mybox1.width = 10;
// mybox1.height = 20;
// mybox1.depth = 15;
// // get volume of first box
// vol = mybox1.volume();
// System.out.println("mybox1 Volume is " + vol);
// }
// }
// ===========================================
// Functions that takes parameter
// -------------------------

// class Box1 {
// double width;
// double height;
// double depth;
//
// // // compute and return volume
// double volume() {
// return width * height * depth;
// }
//
// // sets dimensions of box
// void setDim(double w, double h, double d) {
// width = w;
// height = h;
// depth = d;
// }
// }
//
// class Java_09_Class {
// public static void main(String args[]) {
// Box1 mybox1 = new Box1();
// Box1 mybox2 = new Box1();
// double vol;
// // // initialize each box
// mybox1.setDim(10, 20, 15);
// mybox2.setDim(1, 300, 25);
// // get volume of first box
// vol = mybox1.volume();
// System.out.println("Volume is " + vol);
// // get volume of second box
// vol = mybox2.volume();
// System.out.println("Volume is " + vol);
// }
// }
// ========================================
// Constructor
/*
 * Here, Box uses a constructor to initialize the dimensions of a box.
 */
//class Box1 {
//	double width;
//	double height;
//	double depth;
//
//	// This is the constructor for Box.
//	Box1() {
//		System.out.println("Constructing Box");
//		width = 10;
//		height = 10;
//		depth = 10;
//	}
//
//	// compute and return volume
//	double volume() {
//		return width * height * depth;
//	}
//}
//
////
//class Java_09_Class {
//	public static void main(String args[]) {
//		// declare, allocate, and initialize Box objects
//		Box1 mybox1 = new Box1();
//		double vol;
//		System.out.println("height is " + mybox1.height);
//		mybox1.height = 30;
//		vol = mybox1.volume();
//		System.out.println("Volume is " + vol);
//		// // get volume of second box
//	}
//}

//// ================================

/*
 * Here, Box uses a parameterized constructor to initialize the dimensions of a
 * box.
 */
//class Box1 {
//	double width;
//	double height;
//	double depth;
//
//	Box1(double w, double h, double d) {
//		width = w;
//		height = h;
//		depth = d;
//	}
//
//	double volume() {
//		return width * height * depth;
//	}
//}
//
//class Java_09_Class {
//	public static void main(String args[]) {
//		// // declare, allocate, and initialize Box objects
//		Box1 mybox1 = new Box1(10, 20, 15);
//		// Employee emp1 = new Employee("ashok", 30, "python");
//		Box1 mybox2 = new Box1(3, 6, 9);
//		double vol;
//		// // get volume of first box
//		vol = mybox1.volume();
//		System.out.println("Volume is " + vol);
//		// // get volume of second box
//		vol = mybox2.volume();
//		System.out.println("Volume is " + vol);
//	}
//}

// ========================

//class Employee {
//	Employee() {
//		System.out.println(" a Constructor now");
//
//	}
//}
//
//class Java_09_Class {
//	public static void main(String args[]) {
//		Employee emp = new Employee();
//
//	}
//}

// =====================
//class Employee {
//	void Employee() {// this is not constructor as it has return type
//		System.out.println("Constructor");
//	}
//}
//
//class Java_09_Class {
//	public static void main(String args[]) {
//		Employee emp = new Employee();// Doesn’t call method Employee with
//		// emp.Employee();
//
//	}
//}

// ============
//class Employee {
//	void Employee() {// this is not constructor as it has return type
//		System.out.println("Constructor");
//	}
//}
//
//class Java_09_Class {
//	public static void main(String args[]) {
//		Employee emp = new Employee();// Doesn’t call method Employee with
//		emp.Employee();
//
//	}
//}
// =============================
class Employee {
	public Employee() {
		System.out.println("A Constructor now with access modifier");

	}
}

class Java_09_Class {
	public static void main(String args[]) {
		Employee emp = new Employee();

	}
}

// ================
// A constructor must not define any return type. Instead, it creates
// and returns an object of the class in which it’s defined. If you define a
// return type for a constructor, it’ll no longer be treated as a constructor.
// Instead, it’ll be treated as a regular method, even though it shares the same
// name as its class
// ================
