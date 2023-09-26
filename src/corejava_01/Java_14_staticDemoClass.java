package corejavapackage;

//class Student {
//	int rollno;// instance variable
//	String name;
//	String college;
//
//	Student(int r, String n, String s) {
//		rollno = r;
//		name = n;
//		college = s;
//	}
//
//	// method to display the values
//	void display() {
//		System.out.println(rollno + " " + name + " " + college);
//	}
//}
//
//public class Java_14_staticDemoClass {// Test class to show the values of
//	// objects
//	public static void main(String args[]) {
//		Student s1 = new Student(111, "Karan", "IITB");
//		Student s2 = new Student(222, "Aryan", "IITB");
//		s1.display();
//		s2.display();
//
//	}
//}

// =================================
//class Student {
//	int rollno;// instance variable
//	String name;
//	static String college = "IITB";// static variable
//
//	Student(int r, String n) {
//		rollno = r;
//		name = n;
//
//	}
//
//	void display() {
//		System.out.println(rollno + " " + name + " " + college);
//	}
//}
//
//public class Java_14_staticDemoClass {// Test class to show the values of
//	public static void main(String args[]) {
//		Student s1 = new Student(111, "Karan");
//		Student s2 = new Student(222, "Aryan");
//		System.out.println("Before changing the college name");
//		s1.display();
//		s2.display();
//		// we can change the college of all objects by the single line of code
//		Student.college = "NIT";
//		System.out.println("After changing the college name");
//
//		s1.display();
//		s2.display();
//		// System.out.println(s1.college);
//		Student s3 = new Student(111, "Anusha");
//		s3.college = "IIM";
//		System.out.println("Again changing the college name");
//
//		s3.display();
//		s1.display();
//		s2.display();
//
//	}
//}

// ===============================
/// Java Program to demonstrate the use of an instance variable
// which get memory each time when we create an object of the class.
//class Java_14_staticDemoClass {
//	int count = 0;// will get memory each time when the instance is created
//
//	Java_14_staticDemoClass() {
//		++count;// incrementing value
//		System.out.println(count);
//	}
//
//	public static void main(String args[]) {
//		// Creating objects
//		Java_14_staticDemoClass c1 = new Java_14_staticDemoClass();
//		Java_14_staticDemoClass c2 = new Java_14_staticDemoClass();
//		Java_14_staticDemoClass c3 = new Java_14_staticDemoClass();
//	}
//}

// =====================================
//class Java_14_staticDemoClass {
//	static int count = 0;// will not get memory each time when the instance is
//
//	// created
//
//	Java_14_staticDemoClass() {
//		count++;// incrementing value
//		System.out.println(count);
//	}
//
//	public static void main(String args[]) {
//		// Creating objects
//		Java_14_staticDemoClass c1 = new Java_14_staticDemoClass();
//		Java_14_staticDemoClass c2 = new Java_14_staticDemoClass();
//		Java_14_staticDemoClass c3 = new Java_14_staticDemoClass();
//	}
//}

// ===============================
/*
 * static keyword in java static is a non-access modifier in Java which is
 * applicable for the following:
 * 
 * 1.blocks 2. variables 3 methods 4 nested classes To create a static
 * member(block,variable,method,nested class), precede its declaration with the
 * keyword static. When a member is declared static, it can be accessed before
 * any objects of its class are created, and without reference to any object.
 * For example, in below java program, we are accessing static method m1()
 * without creating any object of Test class.
 */
//
public class Java_14_staticDemoClass {
	static void m1() {
		System.out.println("from static function m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
}
// =============================

/*
 * Static blocks
 * 
 * If you need to do computation in order to initialize your static variables,
 * you can declare a static block that gets executed exactly once, when the
 * class is first loaded. Consider the following java program demonstrating use
 * of static blocks. //
 */
// class staticDemoClass
//
// {
// // static variable
// static int a = 10;
// static int b;
//
// // static block
// static {
// System.out.println("Static block initialized.");
// b = a * 4;
// }
//
// public static void main(String[] args) {
// System.out.println("from main");
// System.out.println("Value of a : " + a);
// System.out.println("Value of b : " + b);
// }
// }

// ==============================

/*
 * Static variable When a variable is declared as static, then a single copy of
 * variable is created and shared among all objects at class level. Static
 * variables are, essentially, global variables. All instances of the class
 * share the same static variable. Important points for static variables :-
 * 
 * We can create static variables at class-level only. See here static block and
 * static variables are executed in order they are present in a program. Below
 * is the java program to demonstrate that static block and static variables are
 * executed in order they are present in a program.
 */
//
// class staticDemoClass {
// // static variable
// static int a = m1();
// static int b;
//
// // static block
// static {
// System.out.println("Inside static block");
// b = 10;
// }
//
// //
// // static method
// static int m1() {
// System.out.println("from m1");
// return 20;
// }
//
// // static method(main !!)
// public static void main(String[] args) {
// System.out.println("Value of a : " + b);
// System.out.println("from main");
// }
//
// }
// ==========================

/*
 * When a method is declared with static keyword, it is known as static method.
 * The most common example of a static method is main( ) method.As discussed
 * above, Any static member can be accessed before any objects of its class are
 * created, and without reference to any object.Methods declared as static have
 * several restrictions:
 * 
 * They can only directly call other static methods. They can only directly
 * access static data. They cannot refer to this or super in any way. Below is
 * the java program to demonstrate restrictions on static methods. //java
 * program to demonstrate restriction on static methods
 */
// class staticDemoClass {
// // static variable
// static int a = 10;
//
// // instance variable
// int b = 20;
//
// // static method
// static void m1() {
// a = 20;
// System.out.println("from m1");
//
// // Cannot make a static reference to the non-static field b
// b = 10; // compilation error
//
// // Cannot make a static reference to the
// // non-static method m2() from the type Test
// m2(); // compilation error
//
// // Cannot use super in a static context
// System.out.println(super.a); // compiler error
// }
//
// // instance method
// void m2() {
// System.out.println("from m2");
// }
//
// public static void main(String[] args) {
// // main method
// }
// }
// ===============================================

/*
 * When to use static variables and methods?
 * 
 * Use the static variable for the property that is common to all objects. For
 * example, in class Student, all students shares the same college name. Use
 * static methods for changing static variables.
 * 
 * Consider the following java program, that illustrate the use of static
 * keyword with variables and methods.
 * 
 * // A java program to demonstrate use of // static keyword with methods and
 * variables
 * 
 * // Student class
 */
// class Student {
// String name;
// int rollNo;
// static String cllgName; // static variabl
// static int counter = 0; // static counter to set unique id
//
// public Student(String name1) {
// name = name1;
// rollNo = setRollNo();
// }
//
// static int setRollNo() {// getting unique rollNo through static
// // variable(counter)
// counter++;
// return counter;
// }
//
// static void setCllg(String name) {
// cllgName = name;
// }
//
// // instance method
// void getStudentInfo() {
// System.out.println("name : " + name);
// System.out.println("rollNo : " + rollNo);
// // accessing static variable
// System.out.println("cllgName : " + cllgName);
// }
// }
//
// public class staticDemoClass {
// public static void main(String[] args) {
// // calling static method
// // without instantiating Student class
// Student.setCllg("XYZ");
// Student.cllgName = "abc";
// Student s1 = new Student("Alice");
// Student s2 = new Student("Bob");
// s1.getStudentInfo();
// s2.getStudentInfo();
// Student s3 = new Student("Sushma");
// s3.getStudentInfo();
//
// }
// }
// ================

// class staticDemoClass {
//
// static Integer i;
//
// public static void main(String[] args) {
// try {
// // System.out.println(i.compareTo(0));
// System.out.println(i);
// } catch (ArithmeticException | NullPointerException e) {
// System.out.println("Exception");
// }
// }
// }