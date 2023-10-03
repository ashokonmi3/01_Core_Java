package corejavapackage;

/*compiling is the process of parsing a program written in some high level language (higher if compared to machine code), 
 * checking it’s syntax, semantics, linking libraries, maybe doing some optimization, then creating a binary executable 
 * program as an output. This executable may be in the form of machine code, or some kind of byte code — that is, 
 * instructions targeting some kind of virtual machine.
 * A compile time error is a problem such as a syntax error or missing file reference that prevents the program from 
 * successfully compiling. The compiler produces compile time errors and usually indicates what line of the source code 
 * is causing the problem.
*/

public class compileRuntimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String helloWorld = 123;// compile time error
		int i = 10;
		int j = i / 0;// run time error

		int[] x = new int[-5];// compile time no error
		System.out.println(x.length);
		System.out.println("hello")


	}

}
