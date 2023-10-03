package corejavapackage;

public class O9JavaIinputOutputOperations {
	public static void main(String[] args) {
		// // print() - prints string inside the quotes.
		// // println() - prints string inside the quotes similar like print() method.
		// // Then the cursor moves to the beginning of the next line.
		// // printf() - it provides string formatting
		// ////
		System.out.print("1. print ");
		System.out.print("2. print ");
		System.out.println("\n ");

		System.out.println("3. println ");
		System.out.println("4. println ");
		//
		System.out.print("5. print ");
		System.out.print("6. print");
		System.out.println("7. println ");
		System.out.println("8. println ");
		//
	}

}

//
//// =======================
//// %αd: integer printed in α spaces (α is optional).
//// %αs: String printed in α spaces (α is optional). If α is omitted, the
//// number of spaces is the length of the string (to fit the string).
//// %α.βf: Floating point number (float and double) printed in α spaces with
// β
//// decimal digits (α and β are optional).
//// %n: a system-specific new line (Windows uses "\r\n", Unix and Mac "\n").
//// Examples:

// public class O9JavaIinputOutputOperations {
// public static void main(String[] args) {
// System.out.printf("Hello %d and %s", 8, "HI");
// System.out.printf("\n");
// //
// System.out.printf("Hello %12d and %6s", 8, "HI");
// System.out.printf("\n");
//
// System.out.printf("%15.8f ", 56.77);
//
// }
// //
// }

//// ======================
//// Taking user inputs
//
//
// public class O9JavaIinputOutputOperations {
// // // // // //
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in); // System.in is an input stream
// // // // // //
// System.out.println("Enter Your Name");
// String name = scan.nextLine();// it will read next line till EOL
// System.out.println("You are Name is " + name);
// // // // // //
// System.out.println("Enter Your City");
// String city = scan.next();// read till spaces
// System.out.println("Your City is " + city);
// // // // //
// System.out.println("Enter a Number");
// int num = scan.nextInt();
// System.out.println("Your Number is " + num);
// // // //
// System.out.println("Enter a Mobile Number");
// long num2 = scan.nextLong();
// System.out.println("Your Mobile Number is " + num2);
// // ////
// System.out.println("Enter a Value");
// double num3 = scan.nextDouble();
// System.out.println("Your Value is " + num3);
//
// System.out.println("Enter a Character");
// char a = scan.next().charAt(1);
// System.out.println("Your Char is " + a);
// //
// System.out.println("Enter boolean Value");
// boolean val = scan.nextBoolean();
// System.out.println("Your Value is " + val);
// //
// scan.close();
// String s="java";
// // System.out.println(s[0]);
// // String output="";
// // int i,j;
// // for(i=s.length()-1;i >=0;i--) {
// //// output= output+ s.charAt(i);
// // }
// ////
// // System.out.println(output);
//
// }
// // //
// }

//// ===============================================
//
//
//
//
// public class Java_19_IinputOutput {
// public static void main(String[] args) throws FileNotFoundException {
// //
// // Scanner in = new Scanner(new
//// File("C:\\My\\P\\Study\\CoreJava\\out1.txt"));
// File file = new File("C:\\My\\P\\Study\\CoreJava\\out1.txt");
// Scanner sc = new Scanner(file);
// // C:\My\P\Study\CoreJava
// //
// while (sc.hasNextLine())
// System.out.println(sc.nextLine());
// //
// }
//
// }
// ====================================
//
