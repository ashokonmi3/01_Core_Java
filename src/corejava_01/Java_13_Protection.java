package corejava_01;

public class Java_13_Protection {
	int n = 1;// default
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;

	public Java_13_Protection() {
		System.out.println("base constructor");
		System.out.println("n = " + n);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);

	}

	public void Protection1() {
		System.out.println("n = " + n);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);

	}
}
