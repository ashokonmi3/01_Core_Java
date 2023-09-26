package corejavapackage;

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
class Java_16_thisKeyWord {
	int a;
	int b;

	Java_16_thisKeyWord(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args) {
		Java_16_thisKeyWord obj = new Java_16_thisKeyWord(10, 20);
		obj.display();
	}
}

// ====================================

// Implement the
// inheritence and
// modify existing
// classes with this keyword
