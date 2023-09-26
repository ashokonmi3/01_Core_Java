package corejavapackage;

// class A2 {
// int i, j;
//
// A2(int a, int b) {
// i = a;
// j = b;
// }
//
// // display i and j
// void show() {
// System.out.println("I am in A2 parent class");
// System.out.println("i and j: " + i + " " + j);
// }
// }
//
////
// class B2 extends A2 {
// int k;
//
// B2(int a, int b, int c) {
// super(a, b);
// k = c;
// }
//
// // display k – this overrides show() in A
// void show() {
// System.out.println("I am in B2 child class");
//
// System.out.println("k: " + k);
// }
// }
//
// class Java_12_Override {
// public static void main(String args[]) {
// A2 A2supOb = new A2(6, 7);
// B2 B2subOb = new B2(1, 2, 3);
// B2subOb.show(); // this calls show() in B
// A2supOb.show();
// }
// }
// ======================
// class A2 {
// int i, j;
//
// A2(int a, int b) {
// i = a;
// j = b;
// }
//
// // display i and j
// void show() {
// System.out.println("I am in A2 parent class");
// System.out.println("i and j: " + i + " " + j);
// }
//
// void show(int a) {
// System.out.println("I am in A2 parent class");
// System.out.println("value of a: " + a);
// }
// }
//
////
// class B2 extends A2 {
// int k;
//
// B2(int a, int b, int c) {
// super(a, b);
// k = c;
// }
//
// // display k – this overrides show() in A
// void show() {
// System.out.println("I am in B2 child class");
//
// System.out.println("k: " + k);
// }
// }
//
// class Java_12_Override {
// public static void main(String args[]) {
// A2 A2supOb = new A2(6, 7);
// B2 B2subOb = new B2(1, 2, 3);
// B2subOb.show(10); // this calls show() in B
// A2supOb.show(10);
// A2supOb.show();
// }
// }
// ==============================

/* final to prevent inheritence */
// class A2 {
// final void meth() {
// System.out.println("This is a final method.");
// }
// }
//
// class B2 extends A2 {
// void meth() { // ERROR! Can't override.
// System.out.println("Illegal!");
// }
// }
// ===================
// class A2 {
// final void meth() {
// System.out.println("This is a final method.");
// }
// }
//
// class B2 extends A2 {
// void meth(int a) { // No ERROR! Can override.
// System.out.println("Illegal!");
// }
// }
// ===================
// class A2 {
// final void meth() {
// System.out.println("This is a final method.");
// }
// }
//
// class B2 extends A2 {
// int meth() { // ERROR! Can't override.
// System.out.println("Illegal!");
// return 1;
// }
// }

// =================================
// class Bank {
// int getRateOfInterest() {
// return 0;
// }
// }
//
//// Creating child classes.
// class SBI extends Bank {
// int getRateOfInterest() {
// return 8;
// }
// }
//
// class ICICI extends Bank {
// int getRateOfInterest() {
// return 7;
// }
// }
//
// class AXIS extends Bank {
// int getRateOfInterest() {
// return 9;
// }
// }
//
//// Test class to create objects and call the methods
// class Java_12_Override {
// public static void main(String args[]) {
// SBI s = new SBI();
// ICICI i = new ICICI();
// AXIS a = new AXIS();
// Bank b = new Bank();
// System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
// System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
// System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
// System.out.println("Default Rate of Interest: " + b.getRateOfInterest());
//
// }
// }

// ===================

// class Java_12_Override {
// public static void main(String args[]) {
// String str1 = "i am in java selenium and java class";
// String arr[] = str1.split(" ");
// // for (int i = 0; i < arr.length; i++) {
// // System.out.println(arr[i]);
// // }
// // String word = "java";
// Map wordCount = new HashMap();
// // wordCount.put("abc", 1);
// // System.out.println(wordCount.get("xyz"));
//
// int count = 0;
// for (String j : arr) {
// if (wordCount.get(j) != null) {
// count = (int) (wordCount.get(j));
// count = count + 1;
// wordCount.put(j, count);
//
// } else {
// wordCount.put(j, 1);
// }
// // if (j.equals(word)) {
// // count = count + 1;
// // }
// // System.out.println(j);
// }
// System.out.println(" Count of word is : " + wordCount);
//
// }
//
// }
// ===================

// {2,4,8,10,1,5}:6

// class Java_12_Override {
// public static void main(String args[]) {
//
// int arr[] = { 2, 4, 8, 10, 1, 5 };
// for (int i = 0; i < arr.length; i++) {
//
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] + arr[j] == 6) {
// System.out.print(arr[i]);
// System.out.println(arr[j]);
//
// }
// }
//
// }
// }
// }
// ================
// class Java_12_Override {
// public static void main(String args[]) {
// String str1 = "silent";
// String str2 = "listen";
// Map wordCount = new HashMap();
// int count = 1;
// for (int i = 0; i < str1.length(); i++) {
// if (wordCount.get(str1.charAt(i)) != null) {
// count = (int) (wordCount.get(i));
// count = count + 1;
// wordCount.put(str1.charAt(i), count);
// } else {
// wordCount.put(str1.charAt(i), count);
// }
// }
// System.out.println(" Hash Map is : " + wordCount);
// for (int i = 0; i < str2.length(); i++) {
// if (wordCount.get(str2.charAt(i)) != null) {
// System.out.println(wordCount.get(str2.charAt(i)));
// int count1 = (int) wordCount.get(str2.charAt(i));
// count1 = count1 - 1;
// wordCount.put(str2.charAt(i), count1);
// }
// }
// System.out.println(" Hash Map after compare : " + wordCount);
// }
// }
