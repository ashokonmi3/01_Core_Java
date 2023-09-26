package corejava_01;

import java.util.Arrays;

/*
 * Java Array is an object that holds a fixed number of values of a single data
 * type. The length of an Array is established when the Array is created. Array
 * length is fixed, Java Array has Zero based index.
 * 
 * type<int/float/String> nameOfArray [] int array1 [] String s [] /* int
 * intArray[]; int x[]; int[] intArray; byte byteArray[]; short shortsArray[];
 * boolean booleanArray[]; long longArray[]; float floatArray[]; double
 * doubleArray[]; char charArray[]; Declaring Array var-name = new type [size];
 */

//
// int rollno=1222;
// int rollno2=1221;
// String a="sujeeth";
// String b= " ruchira";
// String c= "ashok";

// maths english science
// int rollno= new int[100]
//// String subject= new string[3]
//public class Java_06_Arrays {
//	public static void main(String[] args) {
//		// // int x[]; // declaring array
//		// // <type> nameOfArray []
//		// // x = new int[10]; // allocating memory to array
//		// // String name [];
//		// // name= new String[30];
//		// // Number a[];
//		int a[] = new int[3];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		System.out.println(a[0]);
//		System.out.println(a[1]);// 50
//		System.out.println(a[2]);// 50
//	}
//}

// ====================================== // 50
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		char abc[] = { 'A', 'B', 'Z' }; // Array of Characters
//		int[] xyz = { 10, 20, 30, 40 }; // Array of Integers
//		String[] a = { "UFT", "Selenium", "RFT" }; // Array of Strings
//		boolean[] b = { true, false, false, true }; // Array of Boolean values
//		float[] abc1 = { 10.0f, 20.1f, 30.9f, 40.99f }; // Array of Integers
//		System.out.println(abc[1]);// B
//		System.out.println(xyz[3]);
//		System.out.println(a[1]);
//		System.out.println(b[2]);
//	}
//}
// =================
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		int array1[] = { 188, 288, 389, 49, 995 };
//		System.out.println(array1.length);
//		String s = "java Selenium";
//		System.out.println(s.length());
//
//	}
//}

// ====================
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		int array1[] = { 188, 288, 389, 49, 995 };
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//		}
//
//	}
//}
// =============================
// copying arrary
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		int array1[] = { 1, 2, 3, 4, 5 };
//		int array2[] = array1;
//		System.out.println(array2 == array1);
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
//
//	}
//}

// ====================================
/* copying the array */
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		int array1[] = { 11, 22, 33, 44, 55 };
//		int array2[] = new int[array1.length];
//		for (int i = 0; i < array1.length; i++) {
//			array2[i] = array1[i];
//			System.out.println(array2[i]);
//
//		}
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
//		System.out.println(array2 == array1);
//
//	}
//}
// ==============/
// Parameters:src - the source array.srcPos - starting position in the source
// array.dest - the destination
// data.length - the number of array elements to be copied.
//public class Java_06_Arrays {
//	public static void main(String[] args) {
//		int array1[] = { 1, 2, 130, 4, 5 };
//		int array2[] = { 100, 200, 13, 8, 9, 10 };
//		System.arraycopy(array1, 2, array2, 2, 3);
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
//	}
//}

// ===================================
// Enhanced loop
//public class Java_06_Arrays {
//
//	public static void main(String[] args) {
//
//		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
//		System.out.println(vowels);
//
//		for (char x : vowels) {
//			System.out.println(x);
//		}
//	}
//}

// =====================
//public class Java_06_Arrays {
//
//	public static void main(String[] args) {
//
//		String[] s = { "java", "python", "scala", "ruby", "pearl" };
//
//		for (String x : s) {
//			System.out.println(x);
//		}
//	}
//}
// ==========================

// -------------------------------------
// = boolean : false int : 0 double : 0.0 String
// :
// * null User Defined Type : null // =============================
// */
// ================================
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		System.out.println("String array default values:");
//		String str[] = new String[5];
//		for (String s : str)
//			System.out.print(s + " ");
//		System.out.println("\n\nInteger array default values:");
//		int num[] = new int[5];
//		for (int val : num)
//			System.out.print(val + " ");
//		System.out.println("\n\nDouble array default values:");
//		double dnum[] = new double[5];
//		for (double val : dnum)
//			System.out.print(val + " ");
//		System.out.println("\n\nBoolean array default values:");
//		boolean bnum[] = new boolean[5];
//		for (boolean val : bnum)
//			System.out.print(val + " ");
//		System.out.println("\n\nReference Array default values:");
//		Java_06_Arrays ademo[] = new Java_06_Arrays[5];
//		for (Java_06_Arrays val : ademo)
//			System.out.print(val + " ");
//	}
//}
// ================================ARRAY LIST=================
/* ........... Normal Array............. */
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		int[] arr = new int[3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 2;
//		arr[3] = 2;
//		System.out.print("array index ");
//
//	}
//}
// ============================================
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		String[] arr1 = { "UFT", "Selenium", "RFT", "SilkTest" };
//		arr1[4] = "python";
//	}
//}

// ==================================
//class Java_06_Arrays {
//	public static void main(String[] args) {// System.out.println(arr[0]);
//		ArrayList<Integer> arrL = new ArrayList<Integer>(2);
//		// int arr[] = new int[3];
//		arrL.add(1);
//		arrL.add(2);
//		arrL.add(33);
//		arrL.add(20);
//		arrL.add(233);
//		System.out.println(arrL.get(4));
//		System.out.println(arrL);
//		System.out.println(arrL.size());
//
//	}
//}
// ==========================================
////
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		int a[];
//		a = new int[5];
//		a[1] = 10;
//		a[3] = 20;
//		System.out.println(a[2]);
//	}
//}
// ===========================================

// ==================================
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		// Sorting of an array
//		int a[] = { 100, 20, 105, 101 };
//		Arrays.sort(a);// util
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//	}
//}
// =========================
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		// Sorting of an array
//		String a[] = { "abc", "def", "ghi", "jkl", "acd" };
//		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//			System.out.print(" ");
//
//		}
//	}
//}

// ======================================
// no< capital letter< small letter
//class Java_06_Arrays {
//	public static void main(String[] args) {
//		String arr1[] = { "1212z", "x", "c", "d", "A", "222" };
//		Arrays.sort(arr1);
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//	}
//}
// =====================================
class Java_06_Arrays {
	public static void main(String[] args) {
		int a[];
		a = new int[5];
		Arrays.fill(a, 1111);// fill the values by 10
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
// =============================

// ================================

// Write a Java program to sum values of an array.
// Write a Java program to find max value of an integer array.
// Write a Java program to find min value of an integer array.
// Write a Java program to calculate the average value of array elements.
//
// Write a Java program to test if an array contains a specific value.
//
// Write a Java program to find the index of an array element.
//
// Write a Java program to remove a specific element from an array.
//
// Write a Java program to reverse an array of integer values
//
// Write a Java program to find the duplicate values of an array of integer
// values.
//

// value=10 arr={1,,3,4,16,67,10}for(i=0;i<arr.lenght;i++){if arr[i]=value}

// Comparing array
// class O6_JavaArrays {
// public static void main(String[] args) {
// int[] arrayone = { 2, 5, 6, 7, 8 };
// // int[] arraytwo;
// int[] arraytwo = { 2, 5, 9, 7, 8 };//
// // arraytwo = arrayone;
// boolean same = false;
// // System.out.println(arrayone == arraytwo);
// // // System.out.println(arrayone);
// // // System.out.println(arraytwo);
// // //
// for (int i = 0; i < arrayone.length; i++) {
// if (arrayone[i] == arraytwo[i]) {
// same = true;
// } else {
// // System.out.println("different");
// same = false;
// break;
// }
// // //
// }
// if (same) {
// System.out.println("same array");
// } else {
// System.out.println("different");
// // //
// }
// // System.out.println(Arrays.equals(arrayone, arraytwo));
// } //
// }
////
// ==========================

// class O6_JavaArrays {
// public static void main(String[] args) {
//
// // int[] array1 = { 1, 2, 3, 4, 5 };
// // int[] array2 = new int[array1.length];
// int[] array2 = { 3, 4, 5, 6, 7 };
// //// // //
// String[] names = { "abc", "sys", "xyz", "ashok" };
//
// for (int i = 0; i < names.length; i++) {
// if (names[i].startsWith("a")) {
// System.out.println(names[i]);
// }
//
// }
// }
// }
// ========================
// class O6_JavaArrays {
//
// public static void main(String[] args) {
//
// int[] a = { 1, 2, 3, 4, 5, 6 };
// int i = a.length;
//
// while (i >= 1) {
// System.out.print(a[i]);
// i--;
// }
// }
// }

/*****************************
 * Length of array "a" is 6, so the value of the variable i is 6. Execution of
 * while loop will try to print array element reverse as variable "i" has
 * initial value 6 , So trying to access element with index position 6 will
 * cause ArrayIndexOutOfBoundsException since the array positions start with0.
 * Hence the correct option is D.
 */

// class O6_JavaArrays {
// public static void main(String[] args) {
// int a[] = {};
// System.out.print(a instanceof Object);
// }
// }
//
// class O6_JavaArrays {
// public static void main(String[] args) {
// int a[] = { 1, 2, 053, 4 };
// int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
// System.out.print(a[3] == b[0][2]);
// System.out.print(" " + (a[2] == b[2][1]));
// }
// }
/*
 * Indexing of array elements begin with zero. So [1] refers to the second
 * element of an array. So here a[3] refers to the fourth element of array a.
 * It's value is 4 and we have assigned 4 to b[0][2]. We have assigned octal
 * value to a[2] so the value of element is 43 in decimals. And we have assigned
 * 43 in decimal to b[2][1]. So both will print true. According to above reasons
 * A, B and C are incorrect. E is incorrect as code compiles fine.
 */
