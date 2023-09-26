package corejava_01;

//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 200;
//		if (a == b) {// if(true)
//			System.out.println("A is a Big Number");
//		}
//		System.out.println("After if");
//	}
//}
// ========================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 1001;
//		b = 1001;
//		if (a == b) {// if(true)
//			System.out.println("A is a Big Number");
//		}
//
//		System.out.println("After if first line");
//		System.out.println("After if second line ");
//		System.out.println("After if third line ");
//
//	}
//}
// ==============
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		if (true) {
//			System.out.println("I am in if condition");
//		}
//		System.out.println("After if");
//	}
//}
// ===============
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		if (false) {
//			System.out.println("I am in if condition");
//		}
//		System.out.println("After if");
//	}
//}

// =================================
// // 2) Executing a block of statements when compound condition is true
////
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b, c = 2;
//		a = 100;
//		b = 15;
//		if ((a > b) && (a > c)) {
//			System.out.println("A is a Big Number");
//		}
//		System.out.println("After if");
//	}
//}

// =============================
// Program to check odd even number
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 100;
//		if (a % 2 == 0) {
//			System.out.println("its even Number");
//		}
//		System.out.println("its out side");
//	}
//}
// ========================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 101;
//		if (a % 2 == 0) {
//			System.out.println("its even Number");
//		}
//		System.out.println("its out side");
//	}
//}
// ==================

//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 101;
//		if (a % 2 == 0) {
//			System.out.println("its even Number");
//		} else {
//			System.out.println("its odd Number");
//		}
//		System.out.println("its out side");
//	}
//}

// ====================================
// 3) Executing a block of statements when condition is true. otherwise
// executing another block of statements
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 50;
//		if (a > b) {
//			System.out.println("A is a Big Number");
//		} else {
//			System.out.println("B is a Big Number");
//		}
//
//		System.out.println("I am after the if else");
//	}
//}

// ==========================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 50;
//		if (a < b) {
//			System.out.println("A is a Big Number");
//		} else {
//			System.out.println("B is a Big Number");
//		}
//
//		System.out.println("I am after the if else");
//	}
//}
// =================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 100;
//		if (a < b) {
//			System.out.println("A is a Big Number");
//		} else if (a == b) {
//			System.out.println("A and B are equal");
//		} else {
//			System.out.println("B is a Big Number");
//		}
//		System.out.println("I am after the if else");
//	}
//}
// =================================
// 4) Decide among several Alternates (else if structure)
//
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 50;
//		if ((a >= 1) && (a < 100)) {
//			System.out.println("A is a Small Number");
//		} else if ((a > 100) && (a <= 1000)) {
//			System.out.println("A is a Medium Number");
//		} else if (a > 1000) {
//			System.out.println("A is a Big Number");
//		} else {
//			System.out.println("A is either Zero or negative value");
//		}
//	}
//}
// ===============================================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 100;
//		b = 50;
//		if (a > b) {
//			if (a > 5) {
//				System.out.println("A is a Big Number");
//			}
//		}
//		System.out.println("I am after the if else");
//	}
//}
// =====================================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a, b;
//		a = 10;
//		b = 50;
//		if (a < b) {
//			if (a < 5) {
//				System.out.println("A is a Big Number");
//			}
//		}
//		System.out.println("I am after the if else");
//	}
//}
//// =================

//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int score = 110;
//		if (score > 200)
//			if (score < 400)
//				if (score > 300)
//					System.out.println(1);
//				else
//					System.out.println(2);
//			else
//				System.out.println(3);
//		System.out.println(4);
//
//	}
//
//}

// Start working from the inside out, with the innermost if-else statement,
// matching each else with its nearest unmatched if statement.

// ============================================
// The switch state- ment doesn’t accept arguments of type long, float,
// or double,
//
// or any
// object besides String.
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 10;
//		switch (a) {
//		case 10:
//			System.out.println("Excellent");
//			break;//
//		case 40:
//			System.out.println("Well Done");
//			break;
//		case 'C':
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//
//		}
//		System.out.println("After switch case");
//	}
//}

// =========================================
//
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 40;
//		switch (a) {
//		case 10:
//			System.out.println("Excellent");
//			break;
//		case 40:
//			System.out.println("Well Done");
//			break;
//		case 'C':
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}
//// =======================================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		int a = 10;
//		switch (a) {
//		case 10:
//			System.out.println("Excellent");
//
//		case 40:
//			System.out.println("Well Done");
//
//		case 'C':
//			System.out.println("Better");
//
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}
// =========================================
//
//public class Java_03_IF_Else {
//	//
//	public static void main(String[] args) {
//		String a = "none";
//
//		switch (a) {
//		case "Excellent":
//			System.out.println("Excellent");
//			break;
//		case "Well Done":
//			System.out.println("Well Done");
//			break;
//		case "Better":
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}
// ================

// =========================================
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		String a = "Excellent";
//		int marks = 50;
//		switch (a) {
//		case "Excellent":
//			switch (marks) {
//			case 60:
//				System.out.println("first division");
//				break;
//			case 50:
//				System.out.println("second division");
//				break;
//			case 40:
//				System.out.println("third division");
//				break;
//			default:
//				System.out.println("Invalid Grade");
//			}
//			System.out.println("Excellent");
//			break;
//		case "Well Done":
//			System.out.println("Well Done");
//			break;
//		case "Better":
//			System.out.println("Better");
//			break;
//		default:
//			System.out.println("Invalid Grade");
//		}
//	}
//}

//// =====================================//
//public class Java_03_IF_Else {
//	public static void main(String[] args) {
//		String Branch = "CSE";
//		int year = 2;
//		double a = 10;
//		switch (year) {
//		case 1:
//			System.out.println("elective courses : Advance english, Algebra");
//			break;
//		case 2:
//			switch (Branch) // nested switch
//			{
//			case "CSE":
//			case "CCE":
//				System.out.println("elective courses : Machine Learning, Big Data" + a);
//				break;
//
//			case "ECE":
//				System.out.println("elective courses : Antenna Engineering");
//				break;
//			default:
//				System.out.println("Elective courses : Optimization");
//			}
//		}
//	}
//}
// ====================
// Variable avg can’t be accessed because it’s local to the if block. Variables
// local to the if block can’t be accessed in the else block.
public class Java_03_IF_Else {
	public static void main(String[] args) {
		double marks1 = 50;
		double marks2 = 60;
		double marks3 = 40;
		double maxMarks = 100;
		// double avg;
		if (maxMarks > 0) {
			double avg;
			avg = (marks1 + marks2 + marks3) / (maxMarks * 3) * 100;
			System.out.println(avg);

			// Variable avg is local to if block

		} else {
			avg = 0;
			System.out.println("in else part");
		}
	}
}
// ======================
/*
 * #Assignment 1 1)The current year and the year in which the employee joined
 * the organization are entered through the keyboard. If the number of years for
 * which the employee has # served the organization is greater than 3 then a
 * bonus of Rs. 2500/- is given to the employee. If the years of service are not
 * greater than 3, then the program should do nothing.
 */

// # 2) The marks obtained by a student in 5 different subjects are input
// through the keyboard. The student gets a
// # division as per the following rules: Percentage above or equal to 60 -
// First division
// # Percentage between 50 and 59 - Second division
// # Percentage between 40 and 49 - Third division
// # Percentage less than 40 - Fail
// # Write a program to calculate the division obtained by the student
//
// # 3) A company insures its drivers in the following cases:
// # If the driver is married.
// # If the driver is unmarried, male & above 30 years of age.(
// martialstatus==unmarid && age>30, sex==male)
// # If the driver is unmarried, female & above 25 years of age.
// # In all other cases the driver is not insured. If the marital status, sex
// and age of the driver are the inputs, write a program to determine
// # whether the driver is to be insured or not.

// # 4) If cost price and selling price of an item is input through the
// keyboard, write a program to determine whether the seller has
// # made profit or incurred loss. Also determine how much profit he made or
// loss he incurred.
// # 5) Any integer is input through the keyboard. Write a program to find out
// whether it is an odd number or even number.
// # 6) Any year is input through the keyboard. Write a program to determine
// whether the year is a leap year or not.
// # (Hint: Use the % (modulus) operator)
// # 8) A five-digit number is entered through the keyboard. Write aprogram to
// obtain the revezl

// ===============================

// public class O3_IF_Else {
// public static void main(String[] args) {
// //
// // int English = 60;
// // int Maths = 50;
// // int computer = 70;
// // int history = 56;
// // int sports = 80;
//
// Scanner input = new Scanner(System.in);
// System.out.print("Enter English Marks: ");
// int English = input.nextInt();
// System.out.print("Enter computer Marks: ");
// int computer = input.nextInt();
// System.out.print("Enter history Marks: ");
// int history = input.nextInt();
// System.out.print("Enter maths Marks: ");
// int Maths = input.nextInt();
// System.out.print("Enter sports Marks: ");
// int sports = input.nextInt();
// int total = English + Maths + computer + history + sports;
// int perecntages = total * 100 / 500;
// if (perecntages >= 60) {
// System.out.println("Percentage is " + perecntages);
//
// System.out.println("First division");
// } else if (perecntages < 60 && perecntages > 50) {
// System.out.println("Second division");
//
// } else if (perecntages < 50 && perecntages > 40) {
// System.out.println("Third division");
//
// } else {
// System.out.println("Failed");
// }
//
// }
// }

// public class O3_IF_Else {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter Martial status: ");
// String martialStatus = input.next();
// // System.out.println("Status is :" + martialStatus == "Married");
// System.out.print("Enter sex: ");
// String sex = input.next();
// System.out.print("Enter age: ");
// int age = input.nextInt();
// if (martialStatus.equals("Married")) {
// System.out.println("You are insured");
// } else if (sex.equals("male") && age > 30) {
// System.out.println("insured");
// } else if (sex.equals("female") && age > 25) {
// System.out.println("insured");
// } else {
// System.out.println("Not insured");
// }
//
// }
// }