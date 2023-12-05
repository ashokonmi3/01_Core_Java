package corejava_01;

public class Java_13_AccessModifier {
	int n_def = 1;// default
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;

	public Java_13_AccessModifier() {
		System.out.println("base constructor");
		System.out.println("n = " + n_def);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);

	}

	public void accessmodifier() {// this is function
		System.out.println("n = " + n_def);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);

	}
}

class Test {
	public static void main(String args[]) {
		Java_13_AccessModifier obj = new Java_13_AccessModifier();
		System.out.println("n = " + obj.n_def);
		System.out.println("n_pri = " + obj.n_pri);
		System.out.println("n_pro = " + obj.n_pro);
		System.out.println("n_pub = " + obj.n_pub);
	}

}
