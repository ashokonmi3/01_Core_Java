package corejava_01;

// Definition-- define what a function has to do
// Function call-- executing that function

// <access modifier> returnType methodName(Parameters){Method body}
// public static void/int/string/float/double
// main/xyz/abc(String[]args/int/floast/string){}

// public
//
// modifier -It is optional, it defines access type of the method
//
// returnType - Method may retrun a value
//
// methodName - Name of the method.
//
// parameters - Parameters are optional, we can use mutiple parameters by
// separating with ,
//
// method body - set of statements define that what the method does.

// */
// ================================
// public class Java_07_Functions {
// public static void main(String[] args) {
// System.out.println("Before function");
// javaclass();
// System.out.println("after function");
// javaclass();
// pythonclass();
// javascript();
// }
//
// public static void javaclass() {
// System.out.println("I am learning java");
// }
//
// public static void pythonclass() {
// System.out.println("I am learning python");
// }
//
// public static void javascript() {
// System.out.println("I am learning javasrcipt");
// }
// }

// =================================
// public class Java_07_Functions {
// public static void main(String[] args) {
// printname("java");
// printname("python");
// printname("javascript");
// }
//
// public static void printname(String x) {
//
// System.out.println("I am learning " + x);
// }
//
// }
//// ================================

// public class Java_07_Functions {
// public static void main(String[] args) {
// double r = 10.0;
//// getArea(r);
//
// public static void getArea(double radius) {
//
// double area = radius * radius * 3.14;
// System.out.println("area is " + area);
//
// }
//
// }
// =============
// public class Java_07_Functions {
// public static void main(String[] args) {
// double r = 10.0;
// getArea(r);
// }
//
// public static void getArea(double radius) {
//
// double area = radius * radius * 3.14;
// System.out.println("area is " + area);
//
// }
// }
// =================================
// public class Java_07_Functions {
// public static void main(String[] args) {
// int r = 10;
// getArea(r);
// System.out.println("Price is " + (area * 10));
//
// }
//
// public static void getArea(int radius) {
// double area = radius * radius * 3.14;
// System.out.println("area is " + area);
//
// }
// }

// ======================
// public class Java_07_Functions {
//
// public static void main(String[] args) {
// int r = 2;
// int pricearea = getArea(10);
// System.out.println("pricearea is " + pricearea);
// int price = pricearea * 2000;
// System.out.println("Price is " + price);
//
// }
//
// public static int getArea(int radius) {
// int area = radius * radius * 2;
// return area;
//
// }
// }

// ================================

// public class Java_07_Functions {
// public static void main(String[] args) {
// int number = 10;
// String result = evenOdd(number);
// System.out.println("the result is : " + result);
// }
//
// public static String evenOdd(int number) {
// if (number % 2 == 0) {
// return "Even";
// } else {
// return "Odd";
// }
// }
// }
// ===================
//
// public class Java_07_Functions {
// public static void main(String[] args) {
// int c, d;
// c = add(5, 3);// 8
// d = add(100, 200);// 300
// System.out.println(c);
// System.out.println(d);
// }
//
// public static int add(int a, int b) {
// int result;
// result = a + b;
// return result;
// // System.out.println("after return");
// }
//
// }
// ===========================
// public class Java_07_Functions {
// public static void main(String[] args) {
// studentRank(1000);
// }
//
// public static void studentRank(int marks) {
// if (marks >= 600) {// (1000>=600)
// System.out.println("Rank:A1");
// } else if (marks < 500) {
// System.out.println("Rank:A2");
// } else {
// System.out.println("Rank:A3");
// }
//
// }
// }

// ===========================================
////
// public class Java_07_Functions {
// public static void main(String[] args) {
// String Rank = studentRank(1000);// r
// System.out.println(Rank);
// }
//
// public static String studentRank(int marks) {
// if (marks >= 600) {
// String r = "A1";
// return r;
// } else if (marks <= 500) {
// String r = "A2";
// return r;
// } else {
// String r = "A3";
// return r;
// }
// }
// }

// ====================

// public class Java_07_Functions {
// public static void main(String[] args) {
// String array[] = { "python", "java", "javascript" };
// PrintA(array);
// }
//
// public static void PrintA(String a[]) {
//
// System.out.println(a[0]);
//
// }
// }

// ====================================
/* Function Overloading */
// ---------------------------
// public class Java_07_Functions {
// public static void main(String[] args) {
// add(1000);
// System.out.println("after function execution");
// add(1000, 2000);
// int z = add(1000, 2000, 300);
// System.out.println("function out put with three parameter " + z);
// double a, b;
// a = 1000;
// b = 10000;
// add(a, b);
// add("python");
// }
//
// public static void add(int a) {
// int result;
// result = a + 10;
// System.out.println("function out put with one parameter " + result);
//
// }
//
// public static void add(String a) {// return type will not be function
// // overloading
// // int result;
// // result = a + "selenium";
// System.out.println("function out put with one parameter " + a);
//
// }
//
// public static int add(int a, int b, int c) {
// int result;
// result = a + b + c;
// return result;
// }
//
// public static void add(int a, int b) {
// int result;
// result = a + b;
// System.out.println("function out put with two parameter " + result);
//
// }
//
// public static void add(double a, double b) {
// double result;
// result = a + b;
// System.out.println("function out put with double parameter " + result);
//
// }
//
// }

//// ===================================
//// Create function of previous assignment
// ==========================================
//// public class Java_07_Functions {
// public static void main(String[] args) {
// int English = 60;
// int Maths = 50;
// int computer = 70;
// int history = 56;
// int sports = 80;
// grade(English, Maths, computer, history, sports);
//
// }
//
// public static void grade(int a, int b, int c, int d, int e) {
// int total = a + b + c + d + e;
// int perecntages = total * 100 / 500;
// if (perecntages >= 60) {
// System.out.println("Percentage is " + perecntages);
// System.out.println("First division");
// } else if (perecntages < 60 && perecntages > 50) {
// System.out.println("Second division");
// } else if (perecntages < 50 && perecntages > 40) {
// System.out.println("Third division");
// } else {
// System.out.println("Failed");
// }
// }
// }
//
// =========================
//
//// public class O7Functions {
//// public static void main(String[] args) {
//// int arr[] = { 1, 2, 3, 4, 500, 99 };
//// sum(arr);
//// int arr2[] = { 4444, 444, 4, 3, 2, 100, 200, 4000 };
//// sum(arr2);
//// }
////
//// public static void sum(int arr1[]) {
//// int sum = 0;
//// for (int i = 0; i < arr1.length; i++) {
//// sum = sum + arr1[i];
//// }
//// System.out.println("Sum of array element is : " + sum);
//// }
//// }
