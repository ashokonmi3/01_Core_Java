package corejavapackage;

/*
 * ========================================= Break Point-- by double clicking or
 * right click on line and toggle debug Execution will stop at break point Need
 * to run as debug as java application switch to debug prospective F8 to
 * continue F5 step in F6 step out watch variable right click , value can be
 * passed to function to test ============================
 */
//public class O0020Debug {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 20;
//		int arr1[] = { 12, 344, 56 };
//		System.out.println("Hello world");
//		System.out.println("Hello java");
//		System.out.println("Hello java1");
//		System.out.println(a);
//
//	}
//
//}

//public class O0020Debug {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 20;
//		System.out.println("Hello world");
//		add(a, b);
//		System.out.println("Hello java");
//		System.out.println("Hello java1");
//
//	}
//
//	static void add(int c, int d) {
//		int result = c + d;
//		System.out.println("result is " + result);
//	}
//
//}

/*
 * ============== Hit count
 */

//public class O0020Debug {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hello world");
//
//		}
//	}
//}

/*
 * ================== Watch point The watchpoint is a breakpoint set up on a
 * field or variable.It is the best feature of the Eclipse IDE.Each time the
 * targeted field or variable is accessed or changed,the execution of the
 * program will get stop and then you can debug
 * 
 */

public class A0020_Debugging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		System.out.println("Hello world");
		int result = add(a, b);
		System.out.println("result");
		result = result * 5;
		System.out.println("Hello java1");

	}

	static int add(int c, int d) {
		int result = c + d;
		System.out.println("result is " + result);
		return result;
	}

}
