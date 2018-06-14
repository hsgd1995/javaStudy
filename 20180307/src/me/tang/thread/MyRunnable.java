package me.tang.thread;

/**
 * 线程类：实现Runnable
 * 
 * @author Administrator
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {

			try {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
