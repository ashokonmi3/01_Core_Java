package corejava_01;

// "java"
// "111"
// "####"
//// "123JAvaselenium"
// public class Java_05_Strings {
// public static void main(String[] args) {
// String myTool = "Selenium"; // String Variable/literals
// String str1 = new String(" java selenium");// object
// System.out.println(myTool);// Selenium
// System.out.println(str1);// Selenium
// System.out.println("Hello Selenium"); // Hello Selenium is a String
// System.out.println('H');
// System.out.println("123");
// System.out.println("123*456 Hello $$$$ Selenium");
// }
// }
// ========================
// public class Java_05_Strings {
// public static void main(String[] args) {
// String a = "java";
// String b = "java";
// String c = "java1";
// String d = "JAVA";
// System.out.println(a == b);
// System.out.println(a == c);
// String e = new String("abc");
// String f = new String("abc");
// System.out.println(f == e);
// System.out.println("e equals(f) " + e.equals(f));// false
// System.out.println("a.equalsIgnoreCase(d) " + a.equalsIgnoreCase(d)); // true
//
// }
// }
// =========================
//// Main difference between .equals() method and == operator is that one is
//// method and other is operator.
//// We can use == operators for reference comparison (address comparison) and
// .equals() method for content comparison.
//// In simple words, == checks if both objects point to the same memory
//// location
//// whereas .equals() evaluates to the comparison of values in the objects
//
// ================================
// A String object is an individual instance of the java.lang.String class.
// All are valid, but have a slight difference. s1 will refer to an interned
// String object.
// This means, that the character sequence "abcde" will be stored at a central
// place, and whenever the same literal "abcde" is used again,
// the JVM will not create a new String object but use the reference of the
// cached String.
//

// ======================================
// public class Java_05_Strings {
// public static void main(String[] args) {
// System.out.println("Selenium" + "1");
// System.out.println("Selenium" + 1 + 1);
// System.out.println(1 + 1 + "Selenium");
// System.out.println("1" + 1 + "Selenium");
// System.out.println(1 + 1 + "Selenium" + 1 + 1);
// System.out.println(1 + "1" + "Selenium" + "java");
// System.out.println("Selenium" + (1 + 1));
//
// }
// }

//// =============================================================
// java
// 0123
// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = "abcdfg@gmail.com";
// String str2 = " Java";
// System.out.println("Length of string : " + str1.length()); // 8 (finding
//// length of the String)
// System.out.println("String contains Yahoo: " + str1.contains("yahoo"));//
//// false (finding sub string)
// System.out.println("String contains gmail : " + str1.contains("gmail"));//
//// true (finding sub string)
// char result = str1.charAt(4);
// System.out.println(result); // S
// str1 = str1.concat(str2);
// System.out.println(str1);
//
// }
// }
// ==============================
// Returning Sub Strings
// substring(staring index, ending index)
// it will print starting index to ending index-1

// a b c d f g @ g m a i l.com
// 0 1 2 3 4 5 6 7 8 9 10 11...
// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = "abcdfg@gmail.com";
// System.out.println(str1.substring(0, 4)); // gmail
// System.out.println(str1.substring(0, 8)); // gmail
// System.out.println(str1.substring(1, 3)); // gmail
// System.out.println(str1.substring(0)); //
// System.out.println(str1.substring(9)); // gmail.com
// System.out.println(str1.substring(0, 24)); // gmail
// }
// }
// =============================================================

// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = "selenium";
// if (str1 == "selenium") {
// System.out.println("found"); // false
// } else {
// System.out.println("not found"); // false
// }
// }
// }

// ===============
// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = new String("selenium");
// if (str1 == "selenium") {
// System.out.println("found"); // false
// } else {
// System.out.println("not found"); // false
// }
// }
// }
// ==================

// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = new String("selenium");
// if (str1.equals("selenium")) {
// System.out.println("found"); // false
// } else {
// System.out.println("not found"); // false
// }
// }
// }

// // -----------------------------------------------
//// 6) toUppercase Method (Converts values To Upper case)
// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = "selenium";
// String str2 = "SELEnium";
// String str3 = "SELENIUM";
// System.out.println(str1.toUpperCase());// String s=str1.toUpperCase()
// System.out.println(str3.toLowerCase()); // selenium
//
// }
// }
// ---------------------------------------------

// 8) trim Method (removes spaces from both sides of a String)
// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = " Selenium java ";
// String str2 = " SELEnium";
// String str3 = "SELENIUM ";
// System.out.println(str1);
// System.out.println(str1.trim());
// System.out.println(str2.trim());
// System.out.println(str3.trim());
// }
// }
////
//// ---------------------------------------------
// ------------------------------------------------
// 10) endsWith Method (ends with specified suffix)
////
// public class Java_05_Strings {
// public static void main(String[] args) {
// String str1 = "Selenium Testing";
// System.out.println(str1.endsWith("Testing"));// true
// System.out.println(str1.endsWith("ing"));// true
// System.out.println(str1.endsWith("Selenium"));// false
//
// }
// }
// =================================
// The StringBuilder Class StringBuilder objects are like String objects,
// except that they can be modified.Internally, these objects are treated
// like variable- length arrays that contain a sequence of characters.
// At any point, the length and content of the sequence can
// be changed through method invocations.
// Strings should always be used unless string builders offer an advantage in
// terms of simpler code (see the sample program at the end of this section) or
// better
// performance. For example, if you need to concatenate a large number of
// strings, appending to a StringBuilder object is more efficient.// public
// ===============================
//
// class Java_05_Strings {
// public static void main(String[] args) {
// String s1 = "java selenium";// immutable data type
// s1[0] = "j";
// s1 = "python";
// System.out.println(s1);
//
// }
// }
// ======================
// class Java_05_Strings {
//
// public static void main(String[] args) {
// StringBuilder s2 = new StringBuilder("python");
// s2.append("selenium");
// System.out.println("StringBuilder: " + s2);
// StringBuffer s3 = new StringBuffer("python");
//
// StringBuffer s4 = s3.append("two");
// s3.append("selenium");
// System.out.println("StringBuffer: " + s4);
// }
// }
// ====================
// class Java_05_Strings {
//
// public static void main(String[] args) {
// StringBuilder s2 = new StringBuilder("java selenium classes");
// System.out.println(s2);// true
// s2.reverse();
// System.out.println("StringBuilder: " + s2);
//
// }
// }

// =================
// class Java_05_Strings {
//
// public static void main(String[] args) {
// StringBuilder s2 = new StringBuilder("java selenium is awsome");
// System.out.println(s2);// true
// s2.insert(1, "AAAA");// insert and increase the length of string
// System.out.println("StringBuilder: " + s2);
//
// }
// }
//// ===================

// class Java_05_Strings {
//
// public static void main(String[] args) {
// StringBuilder s2 = new StringBuilder("java selenium is awsome");
// System.out.println(s2);// true
// s2.replace(0, 4, "AAAA");
// System.out.println("StringBuilder: " + s2);
//
// }
// }
// =======================
// class Java_05_Strings {
// //
// public static void main(String[] args) {
// String s2 = new String("java selenium is awsome");
// int count = 0;
// for (int i = 0; i < s2.length(); i++) {
// if (s2.charAt(i) == ' ')
// count = ++count;
// }
// System.out.println(count);// true
//
// }
// }
// ========================
// class Java_05_Strings {
// public static void main(String[] args) {
// String s2 = new String("java selenium is awsome");
// int count = 0;
// String s = s2.replaceAll(" ", "");
// System.out.println(s);// true
//
// }
// }
// =================================
// if you change string a lot (add, remove, change, replace characters)
// because it's more efficient. If you do simply operation you should use
// string.
//
// The problem with string is that it's immutable, so operatrion
//
// string text = myStringVariable + "new string"
// causes that the new instance of the text variable will be created. If you do
// many operation on string class then you will have many instances of string
// objects.

// If a string is going to remain constant throughout the program, then use
// String class object because a String object is immutable.
// If a string can change (example: lots of logic and operations in the
// construction of the string) and will only be accessed from a single thread,
// using a StringBuilder is good
// enough.
// If a string can change, and will be accessed from multiple threads, use a
// StringBuffer because StringBuffer is synchronous so you have thread-safety.
// helloworld

// Assignements 1)Write a Java program to get the character at the given index
// within the String. 2.Write a Java program to get the character ( at the given
// index within the String. 3) Write a java program to count a character of a
// String. 4)Write a java program to compare two strings . 5) Write a Java
// program to concatenate a given string to the end of another string. 6) Write
// a Java program to test if a given string contains the specified sequence of
// char values. 7) Write a java program to get the length of a given string.
// 8)Write a Java program to convert all the characters in a string to
// lowercase. 9) Write a Java program to convert all the characters in a string
// to uppercase 10) Write a program to reverse a string

// public class O5JavaStrings {
// public static void main(String args[]) {
//
// String str = "javaprogram";
// int cnt = 0;
// char[] inp = str.toCharArray();
// System.out.println("Duplicate Characters are:");
// for (int i = 0; i < str.length(); i++) {
// for (int j = i + 1; j < str.length(); j++) {
// if (inp[i] == inp[j]) {
// System.out.println(inp[j]);
// cnt++;
// break;
// }
// }
// }
// }
// }

// class NoOfOccurenceOfCharacters {
// static final int MAX_CHAR = 256;
//
// static void getOccuringChar(String str) {
// // Create an array of size 256 i.e. ASCII_SIZE
// int count[] = new int[MAX_CHAR];
//
// int len = str.length();
//
// // Initialize count array index
// for (int i = 0; i < len; i++)
// count[str.charAt(i)]++;
//
// // Create an array of given String size
// char ch[] = new char[str.length()];
// for (int i = 0; i < len; i++) {
// ch[i] = str.charAt(i);
// int find = 0;
// for (int j = 0; j <= i; j++) {
//
// // If any matches found
// if (str.charAt(i) == ch[j])
// find++;
// }
//
// if (find == 1)
// System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" +
// count[str.charAt(i)]);
// }
// }
//
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = "geeksforgeeks";
// getOccuringChar(str);
// }
// }
