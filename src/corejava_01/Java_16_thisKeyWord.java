package corejava_01;

//class Student1 {
//	int rollno;
//	String name;
//	float fee;
//
//	Student1(int rollno, String name, float fee) {
//		rollno = rollno;
//		name = name;
//		fee = fee;
//		// System.out.println(rollno + " " + name + " " + fee);
//
//	}
//
//	void display() {
//		System.out.println(rollno + " " + name + " " + fee);
//	}
//}
//
//class Java_16_thisKeyWord {
//	public static void main(String args[]) {
//		Student1 s1 = new Student1(111, "ankit", 5000);
//		Student1 s2 = new Student1(112, "sumit", 6000);
//		s1.display();
//		s2.display();
//	}
//}
// =============================
//class Student1 {
//	int rollno;
//	String name;
//	float fee;
//
//	Student1(int rno, String name1, float fees) {
//		rollno = rno;
//		name = name1;
//		fee = fees;
//		// System.out.println(rollno + " " + name + " " + fee);
//	}
//
//	void display() {
//		System.out.println(rollno + " " + name + " " + fee);
//	}
//}
//
//class Java_16_thisKeyWord {
//	public static void main(String args[]) {
//		Student1 s1 = new Student1(111, "ankit", 5000);
//		Student1 s2 = new Student1(112, "sumit", 6000);
//		s1.display();
//		s2.display();
//	}
//}

// =========================================
/* This key word refers to the current object */
//class Student1 {
//	int rollno;
//	String name;
//	float fee;
//
//	//
//	Student1(int rollno, String name, float fee) {
//		this.rollno = rollno;// s1.rollno=rollno
//		this.name = name;// s1.name=name
//		this.fee = fee;
//	}
//
//	void display() {
//		System.out.println(this.rollno + " " + this.name + " " + this.fee);
//	}
//}
//
////
//class Java_16_thisKeyWord {
//	public static void main(String args[]) {
//		Student1 s1 = new Student1(111, "ankit", 5000);
//		Student1 s2 = new Student1(112, "sumit", 6000f);
//		Student1 s3 = new Student1(110, "subhra", 7000f);
//		s1.display();
//		s2.display();
//		s3.display();
//	}
//}

// ===================================
// Java code for using 'this' keyword to
// refer current class instance variables
//class Java_16_thisKeyWord {
//	int a;
//	int b;
//
//	Java_16_thisKeyWord(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}
//
//	void display() {
//		System.out.println("a = " + a + " b = " + b);
//	}
//
//	public static void main(String[] args) {
//		Java_16_thisKeyWord obj = new Java_16_thisKeyWord(10, 20);
//		obj.display();
//	}
//}
//======================
class Person {
	private String name;
	private int age;
	private int sal;

	// Constructor using 'this' to differentiate between instance variables and
	// parameters
	public Person(String name, int age, int sal) {
		this.name = name; // 'this.name' refers to the instance variable 'name', 'name' refers to the
							// parameter
		this.age = age; // 'this.age' refers to the instance variable 'age', 'age' refers to the
						// parameter
		this.sal = sal;
	}

	// Method using 'this' to refer to the current instance
	public void printDetails() {
		System.out.println("Name: " + this.name); // Using 'this' to access instance variable 'name'
		System.out.println("Age: " + this.age); // Using 'this' to access instance variable 'age'
		System.out.println("Sal: " + this.sal); // Using 'this' to access instance variable 'age'

	}

	public Person() {
		this("John Doe", 30, 4000);
		System.out.println("Sal: "); // Using 'this' to access instance variable 'age'

	}

	public void increaseSalary() {
		this.sal = this.sal + 100;
		System.out.println("Sal: " + this.sal); // Using 'this' to access instance variable 'age'

	}

}

class Java_16_thisKeyWord {

	public static void main(String[] args) {
		Person person1 = new Person("Alice", 25, 5000);
		Person person2 = new Person();
		person2.printDetails(); // Output: Name: Alice, Age: 25
		person1.increaseSalary();
	}
}

// ====================================

// Implement the
// inheritence and
// modify existing
// classes with this keyword
