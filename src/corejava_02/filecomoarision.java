package corejavapackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filecomoarision {
	public static void main(String[] args) throws IOException {
		// BufferedReader reader1 = new BufferedReader(
		// new
		// FileReader("C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\file1.txt"));
		//
		// BufferedReader reader2 = new BufferedReader(
		// new
		// FileReader("C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\file2.txt"));
		//
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\assharma\\Desktop\\file1.txt"));

		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\assharma\\Desktop\\file2.txt"));

		String line1 = reader1.readLine();

		String line2 = reader2.readLine();

		// boolean areEqual = true;

		String s1 = line1.substring(2, 4);
		System.out.println(s1);
		// System.out.println(s2);

		String s2 = line2.substring(2, 4);
		System.out.println(s2);

		if (s1.equals(s2)) {
			System.out.println("Two files have same content.");

		}

		else {
			System.out.println("Not matching.");

		}

		// int lineNum = 1;
		//
		// while (line1 != null || line2 != null) {
		// if (line1 == null || line2 == null) {
		// areEqual = false;
		//
		// break;
		// } else if (!line1.equalsIgnoreCase(line2)) {
		// areEqual = false;
		//
		// break;
		// }
		//
		// String s1 = line1.substring(4, 8);
		// String s2 = line1.substring(4, 8);
		// if (s1 == s2) {
		// System.out.println("Two files have same content.");
		//
		// }
		//
		// else {
		// System.out.println("Not matching.");
		//
		// }
		// line1 = reader1.readLine();
		//
		// line2 = reader2.readLine();
		//
		// lineNum++;
		// }
		//
		// if (areEqual) {
		// System.out.println("Two files have same content.");
		// } else {
		// System.out.println("Two files have different content. They differ at line " +
		// lineNum);
		//
		// System.out.println("File1 has " + line1 + " and File2 has " + line2 + " at
		// line " + lineNum);
		// }
		//
		reader1.close();

		reader2.close();
	}
}