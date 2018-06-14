package me.tang.thread;

/**
 * Runnable测试类
 * 
 * @author Administrator
 *
 */
public class MyRunnableTest {

	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread t1 = new Thread(runnable, "线程1");
		Thread t2 = new Thread(runnable, "线程2");
		t1.start();
		t2.start();
	}

}
