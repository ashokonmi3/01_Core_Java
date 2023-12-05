package corejava_01;

// 1) Arithmetic
// 2) Assignment operator
// 3) logical operator
// 4) Increment decrement
// 5) Ternary operator
// 6) Bitwise operator
// Assignment operator
//
//public class Java_02_Operators {
//	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);// 20
//		a = a + 10;
//		System.out.println(a);// 20
//		a += 10;// a=a+10
//		System.out.println(a);// 20
//		a -= 10;// a=a-10
//		System.out.println(a);// 0
//		a *= 5;// a=a*5 multiplication
//		System.out.println(a);// 50
//		a /= 5;// a=a/5 multiplication
//		System.out.println(a);// 50
//
//	}
//}
// =================================
/*
 * Arithmetic Operators Arithmetic Operators return value based Result.
 * 
 * 1) Addition + (for Addition and String concatenation)
 * 
 * 2) Subtraction - (for Subtraction and negation)
 * 
 * 3) Multiplication *
 * 
 * 4) Division /
 * 
 * 5) Modules %
 * 
 * 6) Increment ++
 */
// Plus operator +
// ========================
//public class Java_02_Operators {
//	public static void main(String[] args) {
//		int a = 10, b = 5;
//		String c = "Selenium", d = " Testing";
//		System.out.println(a + b); // Addition of a, b
//		System.out.println(c + d); //
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.println(a % b);
//		System.out.println(5 % 3);// modulus reminder of division
//		System.out.println(17 % 3);
//		System.out.println(3 % 17);// if dividend is smaller than divisor than
//		// dividend will be reminder
//		System.out.println(133 % 1000);
//	}
//}

// ===============================================
// Increment --- ++ Decrement --
// int a =10
// ++a- pre inclrement
// a++ - post increment
// ===========================
//public class Java_02_Operators {
//	public static void main(String[] args) {
//		int a = 22;
//		System.out.println(a);
//		System.out.println(++a);// increment first and print later
//		System.out.println(a);
//	}
//}

// ===================
//public class Java_02_Operators {
//	public static void main(String[] args) {
//		int a = 22;
//		System.out.println(a++);// printing first increment later
//		System.out.println(a);
//	}
//}

// ===================
//public class Java_02_Operators {
//	public static void main(String[] args) {
//		int b = 0;
//		int a = 10;
//		System.out.println("before increment of a:" + a);
//		a = ++b;// increment first and assign later a=1
//		System.out.println("value of a: " + a);
//		System.out.println("value of b: " + b);
//	}
//}
// ========================
//public class Java_02_Operators {
//	public static void main(String[] args) {
//		int b = 0;
//		int a = 10;
//		a = b++;// post increment-- assign first increment later
//		// a=0;
//		System.out.println(a);
//		System.out.println(b);
//	}
//}
// =======================
// public class Java_02_Operators {
// public static void main(String[] args) {
// int b = 0;
// int a = 10;
// a = --b;// pre decrement--- decrement first assign after that
// System.out.println(a);
// System.out.println(b);
// }
// }
// ========================
// public class Java_02_Operators {
// public static void main(String[] args) {
// int b = 0;
// int a = 10;
// a = b--;// post decrement -- assign first and decrement later
// System.out.println(a);
// System.out.println(b);
// }
// }

// ====================
// class Java_02_Operators {
// public static void main(String[] args) {
//
// int a = 1;
// a = a++ + a + a-- - a-- + ++a;
// //.. 1..+ 2 + 2-- ...-1-- +.++0 left to right direction ---->
// System.out.println(a);
// }
// }

// ======================
//// ---------------------------------------------
// Relational operators return boolean or logical result (true or false)

// 1) a==b
//
// 2) !=
//
// 3) >
//
// 4) >=
//
// 5) <
//
// 6) <=
// ===================================
// public class Java_02_Operators {
// public static void main(String[] args) {
// int a = 20, b = 10, c = 20;
// System.out.println("a > b is " + (a > b));// if a is greater than b- True
// System.out.println("a >= c is " + (a >= c)); // if a is greater than or equal
// // to c- true
// System.out.println("a < b is " + (a < b));
// System.out.println("a <= b is " + (a <= b));
// System.out.println("a == b is " + (a == b));
// System.out.println("a != b is " + (a != b));
// }
// }
// ===============================================================
// Logical operator
// 1) Logical Not operator !
//
// 2) Logical And Operator &&
//
// 3) Logical Or operator ||
// --------------------------------
// Result Criteria for Not operator
// Operand 1 Operand 2 Result
// ----------------------------------------
// true true false
// true false true
// false true true
// false false true
// -----------------------------------------
// Result Criteria for And operator
// Operand 1 Operand 2 Result
// ----------------------------------------
// true true true
// true false false
// false true false
// false false false
// -----------------------------------------
// Result Criteria for Or operator
// Operand 1 Operand 2 Result
// ----------------------------------------
// true true true
// true false true
// false true true
// false false false
// -----------------------------------------
// public class Java_02_Operators {
// public static void main(String[] args) {
// boolean a = true, b = false;
// System.out.println((a && b));// and operator all should be true
// System.out.println((a || b));// or operator one condition is true the result
// // is true
// }
// }
//// ======================
// public class Java_02_Operators {
// public static void main(String[] args) {
// boolean a = true, b = true;
// System.out.println((a && b));
// System.out.println((a || b));
// }
// }
//// =======================
// public class Java_02_Operators {
// public static void main(String[] args) {
// boolean a = true, b = false, c = true;
// System.out.println((a && b && c));
// System.out.println((a || b || c));
// }
// }
////// ==================
// public class Java_02_Operators {
// public static void main(String[] args) {
// int a = 100, b = 500, c = 700;
// System.out.println((a > b) && (a > c));// false && false
// System.out.println((a < b) || (a > c));// true||false
// }
// }

// =================================
// ASCII value
// $ % ^=44 &=34 A = 65, B = 66 .... a= 97
// public class Java_02_Operators {
// public static void main(String[] args) {
// char grade = 'A'; // 65
// char smalla = 'a';
// int a = 10;
// System.out.println(grade == 'A');// 65
// System.out.println(a == 10);
// System.out.println(a == 11);
// System.out.println(grade == 'X');
// System.out.println(grade == 65);// A 65 , B= 66, C = 67, a= 97 b = 98 , c= 99
// d =100
// System.out.println(smalla == 'a');
// System.out.println(smalla == 97);
// System.out.println(grade);// 65
//
// String worldcup_winner = "Australia";
//
// System.out.println(worldcup_winner == "Australia");
// System.out.println(worldcup_winner == "India");
//
// }
// }
//================
public class Java_02_Operators {
	public static void main(String[] args) {

		String worldcup_winner = "Australia";

		System.out.println(worldcup_winner == "Australia");// true
		System.out.println(worldcup_winner != "Australia");// false

		System.out.println(worldcup_winner == "India");// False
		System.out.println(worldcup_winner != "India"); // True

	}
}

// ====================================
// Ternary operator
// false
////
// condition? (block1) : block2
// condition ? expression1 : expression2;

// true
//

//
// public class Java_02_Operators {
//
// public static void main(String[] args) {
// int number = 10;
// String result;
//
// // Using the ternary operator to assign a value to 'result'
// result = (number % 2 == 0) ? "Even" : "Odd";
// // condition ? expression1 : expression2;
//
// System.out.println("The number is " + result);
// }
// }

// =================
// public class Java_02_Operators {
// public static void main(String[] args) {
// int num1, num2;
// num1 = 1500;
// num2 = (num1 == 500) ? 100 : 200;
// System.out.println(num2);
//
// String s = "Selenium";
//
// System.out.println(s);
//
// System.out.println("Java Selenium");
//
// }
// }
// =============================
// public class Java_02_Operators {
// public static void main(String[] args) {
// int num1 = 100;
// System.out.println((num1 == 100) ? 100 : 200);
// System.out.println((num1 > 500) ? 100 : 400);
//
// }
// }

// ====================
/// * Assignment*****
// 1. Write a Java program to print the sum of two numbers and 2 strings.(user
// input)
// 2. Take 2 number as input and perform all arithmetic/logical operation on
// that
// a=10
// b=20
// a+b, a-b, a*b, a/b, a%b
// a>b, a<b, a==b, a>=b, a<=b
// =====================

// public class Java_02_Operators {
// public static void main(String[] args) {
// int mychar = 97, yourchar = 98;
// int age = 20;
// System.out.println((char) mychar + (char) yourchar);
// System.out.println((float) (age));
// String s = null;
// s += " java";
// System.out.println(s);
// }
// }