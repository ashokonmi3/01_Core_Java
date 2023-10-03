package collectiontutorial;

//class Multithread extends Thread {
//	public void run() {
//		System.out.println("thread is running...");
//	}
//
//	public static void main(String args[]) {
//		Multithread t1 = new Multithread();
//		t1.start();
//	}
//}

// ============

// =================
//class Multithread extends Thread {
//	public void run() {
//		for (int i = 1; i < 5; i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String args[]) {
//		Multithread t1 = new Multithread();
//		Multithread t2 = new Multithread();
//
//		t1.start();
//		t2.start();
//	}
//}
// ==============
// No. After starting a thread, it can never be started again.
// If you does so, an IllegalThreadStateException is thrown.
// In such case, thread will run once but for second time, it will throw
// exception.

//public class Multithread extends Thread {
//	public void run() {
//		System.out.println("running...");
//	}
//
//	public static void main(String args[]) {
//		Multithread t1 = new Multithread();
//		t1.start();
//		t1.start();
//	}
//}
// ==============
// The join() method
// The join() method waits for a thread to die. In other words, it causes the
// currently running threads to stop executing until the thread it joins with
// completes its task.
//class Multithread extends Thread {
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			try {
//				Thread.sleep(3000);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String args[]) {
//		Multithread t1 = new Multithread();
//		Multithread t2 = new Multithread();
//		Multithread t3 = new Multithread();
//		t1.start();
//		try {
//			t1.join();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//		t2.start();
//		t3.start();
//	}
//}

// ============

//class Multithread extends Thread {
//	public void run() {
//		System.out.println("running...");
//	}
//
//	public static void main(String args[]) {
//		Multithread t1 = new Multithread();
//		Multithread t2 = new Multithread();
//		System.out.println("Name of t1:" + t1.getName());
//		System.out.println("Name of t2:" + t2.getName());
//		System.out.println("id of t1:" + t1.getId());
//
//		t1.start();
//		t2.start();
//
//		t1.setName("Java Thread");
//		System.out.println("After changing name of t1:" + t1.getName());
//	}
//}

// ===================

//class Multithread extends Thread {
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//	}
//
//	public static void main(String args[]) {
//		Multithread t1 = new Multithread();
//		Multithread t2 = new Multithread();
//
//		t1.start();
//		t2.start();
//	}
//}
// ==============
// class Multithread extends Thread {
// public void run() {
// System.out.println("running thread name is:" +
// Thread.currentThread().getName());
// System.out.println("running thread priority is:" +
// Thread.currentThread().getPriority());
//
// }
//
// public static void main(String args[]) {
// Multithread m1 = new Multithread();
// Multithread m2 = new Multithread();
// m1.setPriority(Thread.MIN_PRIORITY);
// m2.setPriority(Thread.MAX_PRIORITY);
// m1.start();
// m2.start();
//
// }
// }
// ===============
// Daemon thread in java is a service provider thread that provides services to
// the user thread.Its life depend on the mercy of user threads i.e.when all the
// user threads dies,JVM terminates this thread automatically.

// public class Multithread extends Thread {
// public void run() {
// if (Thread.currentThread().isDaemon()) {// checking for daemon thread
// System.out.println("daemon thread work");
// } else {
// System.out.println("user thread work");
// }
// }
//
// public static void main(String[] args) {
// Multithread t1 = new Multithread();// creating thread
// Multithread t2 = new Multithread();
// Multithread t3 = new Multithread();
//
// t1.setDaemon(true);// now t1 is daemon thread
//
// t1.start();// starting threads
// t2.start();
// t3.start();
// }
// }
//======================
class Multithread implements Runnable {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Multithread m = new Multithread();
		Thread t1 = new Thread(m);
		t1.start();
	}
}
