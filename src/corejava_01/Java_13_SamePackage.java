package corejavapackage;

class Java_13_SamePackage {
	Java_13_SamePackage() {
		Java_13_Protection p = new Java_13_Protection();
		System.out.println("same package constructor");
		System.out.println(" default n = " + p.n);
		System.out.println("privat n_pri = " + p.n_pri);
		System.out.println("protected n_pro = " + p.n_pro);// same package so accessible
		System.out.println("public n_pub = " + p.n_pub);
	}
}

// int n = 1;
// private int n_pri = 2;
// protected int n_pro = 3;
// public int n_pub = 4;
