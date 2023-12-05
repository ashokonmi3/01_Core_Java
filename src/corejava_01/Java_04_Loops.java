package corejava_01;

/*
 * Print 1 to 10 Numbers one counter should be taken initialization:once
 * condition:Will be checked*every time increment/decrement:every
 */
////
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 0; i <= 5; i = i + 1) {
//			System.out.println("java");
//		}
//	}
//}

// initialization
// condition
// body of loop
// increment
// ================
////
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i = i + 1) {
//			System.out.println("java : " + i);
//		}
//	}
//}
// ======================================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 10; i >= 1; --i) {
//			System.out.println(i);
//		}
//	}
//}
// ========================================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			if (i != 7) {
//				System.out.println(i);
//			}
//		}
//		System.out.println("out of loop");
//	}
//}
// ================================
// Print 1 to 10 Numbers except 4th number and 7th Number

//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			if ((i != 4) && (i != 7)) {
//				System.out.println(i);
//			}
//		}
//	}
//}

// ==========================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 10; i++) {
//			if ((i != 4) && (i != 7)) {
//				System.out.println(i);
//			} else {
//				System.out.println("I am from else part " + i);
//
//			}
//		}
//	}
//}
// ========================================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		int i = 2;// initialization
//		while (i <= 10) {// condition
//			System.out.println(i);// body of loop
//			i++;// increment
//		}
//		// initialization condition increment
//		for (int j = 2; j <= 10; j++) {
//			System.out.println(j);// body of loop
//
//		}
//	}
//}

//// ===================
//// Print 10 to 1 Numbers
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		int i = 10;
//		while (i >= 1) {
//			System.out.println(i);
//			i--;
//		}
//	}
//}

// ====================
//
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		int i = 1000;// initialization
//		do {// body of loop
//			System.out.println("i value is : " + i);
//			i++;// increment
//		} while (i <= 10);// condition
//	}
//}

// ===============================
//// break
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			if (i == 6) {
//				System.out.println("this is inside break :" + i);
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("Out side the loop");
//	}
//}
// ==========================================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		for (int i = 1; i <= 10; i++) {
//			if (i == 7) {
//				continue;
//			}
//			System.out.println(i);
//			System.out.println("With out continue");
//			System.out.println("this will not executed in continue");
//
//		}
//		System.out.println("Out side the loop");
//	}
//}
// ===================================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		int i = 0;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//
//	}
//}
// ===========================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		int i = 1;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//
//	}
//}
// =========================
// public class Java_04_Loops {
// public static void main(String[] args) {
// int i = 2;
// for (int j = 1; j <= 3; j++) {
// System.out.println(i + " " + j);
// }
//
// }
// }
//// ==================================
//public class Java_04_Loops {
//	public static void main(String[] args) {
//		int i = 0;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//		i = 1;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//		i = 2;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//		i = 3;
//		for (int j = 1; j <= 3; j++) {
//			System.out.println(i + " " + j);
//		}
//
//	}
//}
// =====================
// public class Java_04_Loops {
// public static void main(String[] args) {
// int i = 3;
// for (int j = 1; j <= 3; j++) {
// System.out.println(i + " " + j);
// }
//
// }
// }

// =======================
public class Java_04_Loops {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {// i=3
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
	}
}
//
// =====================================
// Loop labeling
//
// public class Java_04_Loops {
// public static void main(String[] args) {
// // Using Label for outer and for loop
// outerloop: for (int i = 1; i <= 3; i++) {
// innerloop: for (int j = 1; j <= 3; j++) {
// if (i == 2 && j == 2) {
// break outerloop;
// }
// System.out.println(i + " " + j);
// }
// }
// System.out.println(" i am out side of outerloop");
//
// }
// }

// ==============================
// public class Java_04_Loops {
// public static void main(String[] args) {
// outerloop: for (int i = 1; i <= 3; i++) {
// innerloop: for (int j = 1; j <= 3; j++) {
// if (i == 2 && j == 2) {
// break innerloop;
// }
// System.out.println(i + " " + j);
// }
// System.out.println(" i am out side of innerloop");
//
// }
// System.out.println(" i am out side of outerloop");
//
// }
// }

//// ==================================
// public class Java_04_Loops {
// public static void main(String[] args) {
// int n = 4;
// // for (int j = 1; j <= n; j++) {
// // System.out.print("*");
// // }
//
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= n; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
//
// }
//
// }

// // for (int j = 1; j <= 2; j++) {
// // System.out.print("*");
// // }
// }

// =================================
// public class Java_04_Loops {
// public static void main(String[] args) {
// // Using no condition in for loop
// for (;;) {
// //
// System.out.println("infinitive loop");
// //
// }
// }
// }

// ================
// public class Java_04_Loops {
// public static void main(String[] args) {
//
// for (int ctr = 0; ctr < 5; ++ctr) {
// System.out.println(ctr);
// }
// System.out.println(ctr);
// }
// }

// loop variables aren’
// t accessible
// outside the
// loop body:
// ======================
// # ***********For loop**********
// # 1) Write a program to find the factorial value of any number entered
// through the keyboard.
// # 2) Two numbers are entered through the keyboard. Write a program to find
// the value of one number raised to the power
// # of another.
// # 3) Write a program to enter the numbers till the user wants and
// # at the end it should display the count of positive, negative and
// # zeros entered.

// public class O4_Loops {
// public static void main(String[] args) {
// // Using no condition in for loop
// // int num = 321;
// int sum = 0;
// int lastdigit = 0;
// int array1[] = { 188, 288, 389, 49, 995 };
// for (int i = 0; i < array1.length; i++) {
//
// while (array1[i] > 0) {
// lastdigit = array1[i] % 10;
// System.out.println("last digit is " + lastdigit);
//
// sum = sum + lastdigit;
// System.out.println("sum is " + sum);
//
// array1[i] = array1[i] / 10;
// System.out.println("array[i] is " + array1[i]);
// System.out.println("=================");
//
// }
//
// System.out.println("addition is " + sum);
//
// }
// }
// }

// class O0004_Loops {
// public static void main(String[] args) {
//
// String[] programmers = { "Outer", "Inner" };
// for (String outer : programmers) {
// for (String inner : programmers) {
// if (inner.equals("Inner"))
// break;
// System.out.print(inner + ":");
// }
// }
//
// }
// }

// public class O0004_Loops {
// public static void main(String[] args) {
// int i = 2;// initialization
// while (true) {// condition
// System.out.println(i);// body of loop
// i++;// increment
// if (i == 7) {
// break;
// }
// }
// }
// }