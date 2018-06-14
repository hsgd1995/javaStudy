package me.tang.thread;

/**
 * 线程类，继承Thread
 * 
 * @author Administrator
 *
 */
public class MyThread extends Thread {

	public MyThread() {
		super();
	}

	public MyThread(String name) {
		super(name);
	}

	/**
	 * 重写run方法
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
