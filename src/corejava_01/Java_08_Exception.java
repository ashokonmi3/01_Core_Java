package corejava_01;

import java.io.IOException;

/*
 * Imagine you’re about to board an airplane to Geneva to attend an important
 * confer- ence. At the last minute, you learn that the flight has been
 * cancelled because the pilot isn’t feeling well. Fortunately, the airline
 * quickly arranges for an alternative pilot, allowing the flight to take off at
 * its originally scheduled time. What a relief! This example illustrates how
 * exceptional conditions can modify the initial flow of an action and
 * demonstrates the need to handle those conditions appropriately. In Java, an
 * exceptional condition (like the illness of a pilot) can affect the normal
 * code flow (airline flight operation). In this context, the arrangement for an
 * alternative pilot can be compared to an exception handler.
 * 
 */
//public class Java_08_Exception {
//	public static void main(String[] args) {
//		int a = 10;
//		int b = a / 0;
//		System.out.println(b);
//		System.out.println("Java exception");// ArithmeticException: / by zero
//	}
//}
// =====================
//public class Java_08_Exception {
//	public static void main(String[] args) {
//		String s = null;
//		System.out.println(s.length());// NullPointerException
//		System.out.println("Java exception");
//	}
//}

// =========================
//public class Java_08_Exception {
//	public static void main(String[] args) {
//		String s = "123";
//		int y = Integer.parseInt(s);
//		System.out.println(y);// NumberFormatException }
//
//	}
//}
// =============================
//public class Java_08_Exception {
//	public static void main(String[] args) {
//		String s = "abc123";
//		int y = Integer.parseInt(s);
//		System.out.println(y);// NumberFormatException }
//		System.out.println("Java exception");
//
//	}
//}

// ================================
//public class Java_08_Exception {
//	public static void main(String[] args) {
//		int a[] = new int[5];
//		a[10] = 100;
//		System.out.println(a[10]);
//		System.out.println("Java exception");
//
//	}
//}
// ==========================

// Try catch

/// *

// =====================
//public class Java_08_Exception {
//
//	public static void main(String[] args) {
//
//		int a = 10;
//		int b = 0;
//		int result;
//		try {
//			result = a / b;
//			System.out.println(result);
//		} catch (Exception e) {
//			System.out.println("Divided by Zero Error");
//		}
//		System.out.println("Hello Java");
//		System.out.println("Hello Selenium");
//	}
//}

// =========================================

//public class Java_08_Exception {
//	public static void main(String[] args) {
//
//		int a = 10;
//		int b = 0;
//		int result;
//		int array1[] = new int[4];
//		try {
//			result = a / b;
//			System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println("Divided by Zero Error");
//		}
//		try {
//			array1[10] = 100;
//			System.out.println(array1[10]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Out of Bound Error");
//		}
//		System.out.println("Hello Java");
//		System.out.println("Hello Selenium");
//	}
//}

//// ============================
//public class Java_08_Exception {
//	public static void main(String[] args) {
//
//		try {
//			int data = 25 / 0;
//			System.out.println(data);
//		} catch (Exception e) {
//			System.out.println("abcd");
//			e.printStackTrace();
//		}
//		System.out.println("rest of the code...");
//	}
//}

//https://programming.guide/java/list-of-java-exceptions.html
// =========================
// Finally block cant be placed before catch block

//public class Java_08_Exception {
//	public static void main(String[] args) {
//		try {
//			// connect to data base
//			int data = 25 / 5;
//			System.out.println(data);
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("finally block is always executed");
//		}
//		System.out.println("rest of the code...");
//	}
//}
// ===========================
// Finally block will be executed even if we do not handle the particular
//// exception

//public class Java_08_Exception {
//	public static void main(String[] args) {
//		try {
//			int data = 25 / 0;
//			// db= connect("server", 'username' 'pass')
//			System.out.println(data);
//		} catch (Exception e) {
//			System.out.println("error");
//
//		} finally {
//			System.out.println("security threat closing connection");
//			// closeing datbase connection
//		}
//
//		System.out.println("rest of the code...");
//		System.out.println("rest of the code...");
//
//	}
//}
// ========================
//public class Java_08_Exception {
//	public static void main(String[] args) {
//		try {
//			int arr[] = new int[5];
//			arr[10] = 20;
//			// db= connect("server", 'username' 'pass')
//		} catch (ArithmeticException e) {
//			System.out.println("error");
//
//		} finally {
//			System.out.println("security threat closing connection");
//			// closeing datbase connection
//		}
//
//		System.out.println("rest of the code...");
//		System.out.println("rest of the code...");
//
//	}
//}
// ==================
// If both the catch and finally blocks define return statements,
// the calling method will receive a value from the finally block.

//class Java_08_Exception {
//
//	public static void main(String args[]) {
//		Java_08_Exception var = new Java_08_Exception();
//		System.out.println(var.getInt());
//	}
//
//	int getInt() {
//		try {
//			String[] students = { "Harry", "Paul" };
//			System.out.println(students[5]);
//		} catch (Exception e) {
//			System.out.println("catch");
//			return 10;
//		} finally {
//			System.out.println("finally");
//			return 20;
//		}
//	}
//
//}
// ===================

//class Java_08_Exception {
//	public static void main(String args[]) {
//		String name = null;
//		try {
//			System.out.println("Try block : open resource 1");
//			System.out.println("Try block : open resource 2");
//			System.out.println("in try : " + name.length());
//			System.out.println("Try block : close resources");
//		} finally {
//			System.out.println("finally : close resources");
//		}
//		System.out.println("after finally block ");// this will not executed
//
//	}
//}
// =======================
public class Java_08_Exception {
	public static void main(String[] args) {
		try {
			int age = 10;
			if (age < 18) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			int age = 10;
			if (age < 18) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		try {
			throw new IOException();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

// ================================
// public class Java_08_Exception {
//
// public static void main(String[] args) {
//
// try {
// validate(10);
// } catch (ArithmeticException e) { //
// e.printStackTrace();
// // System.out.println(e);
//
// System.out.println("welcome to exception");
// }
// }
//
// static void validate(int age) {
// if (age < 18)
// throw new ArithmeticException("not valid");
// else
// System.out.println("welcome to vote");
// }
// }

// ==============================
//
// class Java_08_Exception {
// public static void main(String args[]) {
// try {
// int a = 1;
// System.out.println("a = " + a);
// int b = 42 / a;
// int c[] = { 1 };
// c[42] = 99;
// } catch (ArithmeticException e) {
// System.out.println("Divide by 0: " + e);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Array index oob: " + e);
// }
// System.out.println("After try/catch blocks.");
// }
// }

// ======================================
// The Java throws keyword is used to declare an exception. It gives an
// information to the programmer
// that there may occur an exception so it is better for
// the programmer to provide the exception handling code so that normal flow can
// be maintained.
// We can use throws keyword to delegate the responsibility of exception
// handling to the caller (It may be a method or JVM) then caller method is
// responsible to handle that exception.
// throws

// throws is a keyword in Java which is used in the signature of method to
// indicate that this method might throw
// one of the listed type exceptions. The caller to these methods has to handle
// the exception using a try-catch block.

// Java program to illustrate error in case
// of unhandled exception
// class O8Exception {
// public static void main(String[] args) {
// Thread.sleep(10000);
// System.out.println("Hello world");
// }
// }

// Explanation : In the above program, we are getting compile time error because
// there is a chance of exception if
// the main thread is going to sleep, other threads get the chance to execute
// main() method which will cause InterruptedException.

// ---------------------
class Java_08_Exception {
	public static void main(String[] args) {

		System.out.println("Hello selenium");
		try {
			run();

		} catch (InterruptedException e) {
			System.out.println("Exception occured");

		}
	}

	public static void run() throws InterruptedException {
		System.out.println("Hello java");
		Thread.sleep(10000);
	}
}

// ====================
// class MyClass extends Thread {
// public void run() {
// try {
// for (int i = 0; i < 5; i++) {
// System.out.println("Child Thread executing");
//
// // Here current threads goes to sleeping state
// // Another thread gets the chance to execute
// Thread.sleep(1000);
// }
// } catch (InterruptedException e) {
// System.out.println("InterruptedException occur");
// }
// }
// }
//
////
class Java_08_Exception {
	public static void main(String[] args) throws InterruptedException {
		MyClass thread = new MyClass();
		thread.start();

		// main thread calls interrupt() method on
		// child thread
		thread.interrupt();

		System.out.println("Main thread execution completes");
	}
}
// =====================
// class Java_08_Exception {
// public void finalize() {
// System.out.println("finalize called");
// }
//
// public static void main(String[] args) {
// Java_08_Exception f1 = new Java_08_Exception();
// Java_08_Exception f2 = new Java_08_Exception();
// f1 = null;
// f2 = null;
// System.gc();
// }
// }
// =====================

/*
 * You can't enter code between try and catch clause. Here line 7 causes the
 * failure. So the answer is E, if you remove line 7 then code will compile fine
 * and provide output as error so in that case answer would be D
 */