package me.tang.thread;

/**
 * Runnable������
 * 
 * @author Administrator
 *
 */
public class MyRunnableTest {

	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "�߳�1");
		Thread t2 = new Thread(runnable, "�߳�2");
		t1.start();
		t2.start();
	}

}
