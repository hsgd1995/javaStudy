package me.tang.thread;

/**
 * �߳��࣬�̳�Thread
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
	 * ��дrun����
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
